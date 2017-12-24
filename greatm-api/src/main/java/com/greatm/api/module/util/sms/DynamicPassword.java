package com.greatm.api.module.util.sms;


import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @author great-m
 * @since 2017/12/24, 下午7:52
 */
public class DynamicPassword {
	private DynamicPassword() {
	}

	// These are used to calculate the check-sum digits.
	// 0 1 2 3 4 5 6 7 8 9
	private static final int[] doubleDigits = { 0, 2, 4, 6, 8, 1, 3, 5, 7, 9 };

	public static long getMovingFactor(){
		int secondsUnit = 1000*60;
		long factory = System.currentTimeMillis()/secondsUnit;
		return factory;
	}

	public static int calcChecksum(long num, int digits) {
		boolean doubleDigit = true;
		int total = 0;
		while (0 < digits--) {
			int digit = (int) (num % 10);
			num /= 10;
			if (doubleDigit) {
				digit = doubleDigits[digit];
			}
			total += digit;
			doubleDigit = !doubleDigit;
		}
		int result = total % 10;
		if (result > 0) {
			result = 10 - result;
		}
		return result;
	}


	public static byte[] hmac_sha1(byte[] keyBytes, byte[] text)
			throws NoSuchAlgorithmException, InvalidKeyException {
		// try {
		Mac hmacSha1;
		try {
			hmacSha1 = Mac.getInstance("HmacSHA1");
		} catch (NoSuchAlgorithmException nsae) {
			hmacSha1 = Mac.getInstance("HMAC-SHA-1");
		}
		SecretKeySpec macKey = new SecretKeySpec(keyBytes, "RAW");
		hmacSha1.init(macKey);
		return hmacSha1.doFinal(text);
		// } catch (GeneralSecurityException gse) {
		// throw new UndeclaredThrowableException(gse);
		// }
	}

	private static final int[] DIGITS_POWER
	// 0 1 2 3 4 5 6 7 8
	= { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000 };


	static public String generateOTP(byte[] secret, long movingFactor,
                                     int codeDigits, boolean addChecksum, int truncationOffset)
			throws NoSuchAlgorithmException, InvalidKeyException {
		// put movingFactor value into text byte array
		String result = null;
		int digits = addChecksum ? (codeDigits + 1) : codeDigits;
		byte[] text = new byte[8];
		for (int i = text.length - 1; i >= 0; i--) {
			text[i] = (byte) (movingFactor & 0xff);
			movingFactor >>= 8;
		}
		// compute hmac hash
		byte[] hash = hmac_sha1(secret, text);
		// put selected bytes into result int
		int offset = hash[hash.length - 1] & 0xf;
		if ((0 <= truncationOffset) && (truncationOffset < (hash.length - 4))) {
			offset = truncationOffset;
		}
		int binary = ((hash[offset] & 0x7f) << 24)
				| ((hash[offset + 1] & 0xff) << 16)
				| ((hash[offset + 2] & 0xff) << 8) | (hash[offset + 3] & 0xff);
		int otp = binary % DIGITS_POWER[codeDigits];
		if (addChecksum) {
			otp = (otp * 10) + calcChecksum(otp, codeDigits);
		}
		result = Integer.toString(otp);
		while (result.length() < digits) {
			result = "0" + result;
		}
		return result;
	}
}
