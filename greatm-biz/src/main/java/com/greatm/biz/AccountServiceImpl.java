package com.greatm.biz;

import com.greatm.biz.accountdao.TAccountInfoMapper;
import com.greatm.client.IAccountService;
import com.greatm.client.model.account.BaseResponseModel;
import com.greatm.client.model.account.LoginUserModel;
import com.greatm.client.model.account.RegisterUserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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
        return false;
    }

    @Override
    public LoginUserModel login(String mobile, String password, String registerId, String deviceId) {
        return null;
    }

    @Override
    public BaseResponseModel register(RegisterUserModel registerUserModel) {
        return null;
    }

    @Override
    public void logout(long accoId) {

    }
}
