package com.greatm.biz;

import com.greatm.biz.accountdao.TAccountInfoMapper;
import com.greatm.biz.entity.TAccountInfoEntity;
import com.greatm.biz.entity.TAccountInfoExample;
import com.greatm.client.IAccountService;
import com.greatm.client.model.account.BaseResponseModel;
import com.greatm.client.model.account.LoginUserModel;
import com.greatm.client.model.account.RegisterUserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author great-m
 * @since 2017/12/24, 下午9:03
 */
@Component("accountService")
public class AccountServiceImpl implements IAccountService {

    static final Logger logger = LoggerFactory.getLogger("accountService");

    @Resource
    private TAccountInfoMapper tAccountInfoMapper;

    @Override
    public boolean mobileIsExist(String mobile) {

        TAccountInfoExample accountInfoExample = new TAccountInfoExample();
        accountInfoExample.createCriteria().andMobileEqualTo(mobile);
        long resultCount = tAccountInfoMapper.countByExample(accountInfoExample);
        return resultCount > 0;
    }

    @Override
    public LoginUserModel login(String mobile, String password, String registerId, String deviceId) {

        // find entity
        TAccountInfoExample accountInfoExample = new TAccountInfoExample();
        accountInfoExample.createCriteria().andMobileEqualTo(mobile).andPasswordEqualTo(password);
        List<TAccountInfoEntity> entityList = tAccountInfoMapper.selectByExample(accountInfoExample);

        // check entity
        if (CollectionUtils.isEmpty(entityList)) {
            logger.warn(String.format("[login] 用户 %s 登录失败.", mobile));
            return null;
        }

        // check role
        TAccountInfoEntity targetEntity = entityList.get(0);

        if (targetEntity.getUserRole() == 0) {
            logger.warn(String.format(
                    "[login] 用户未开通身份登录. mobile: %s, accoId: %s",
                    mobile,
                    targetEntity.getAccoId()));
            return null;
        }

        if (targetEntity.getUserRole() == 2) {
            logger.warn(String.format(
                    "[login] 已被禁用用户 %s 尝试登录。",
                    mobile));
            return new LoginUserModel(null, "此账号已被禁用。");
        }

        // update data and return
        Date curDate = new Date();
        targetEntity.setLastLog(curDate);
        targetEntity.setUpdateTime(curDate);
        tAccountInfoMapper.updateByPrimaryKey(targetEntity);

        // TODO:fetch from other table
        LoginUserModel userModel = new LoginUserModel();

        userModel.setAccoid(targetEntity.getAccoId());
        userModel.setName("name");
        userModel.setImgCode("imgcode");
        userModel.setDeviceId(registerId);
        userModel.setRegisterId(deviceId);

        return userModel;
    }

    @Override
    public BaseResponseModel register(RegisterUserModel registerUserModel) {

        Date curDate = new Date();

        TAccountInfoEntity newEntity = new TAccountInfoEntity();
        newEntity.setBizRole((byte) 0);
        newEntity.setStarRole((byte) 0);
        newEntity.setUserRole((byte) 0);
        newEntity.setFirstLog(curDate);
        newEntity.setMobile(registerUserModel.getMobile());
        newEntity.setPassword(registerUserModel.getPassword());
        newEntity.setStatus((byte) 1);
        newEntity.setCreateTime(curDate);
        newEntity.setUpdateTime(curDate);

        //TODO save registerId and deviceId in other table;

        int result = tAccountInfoMapper.insertSelectiveKey(newEntity);
        if (result <= 0) {
            return new BaseResponseModel(null, "存储失败，请稍后再试");
        }

        return new BaseResponseModel(newEntity.getAccoId());
    }

    @Override
    public void logout(long accoId) {
        // off notification sending flag in db
    }
}
