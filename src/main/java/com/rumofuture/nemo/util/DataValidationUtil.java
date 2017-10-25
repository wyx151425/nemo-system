package com.rumofuture.nemo.util;

import com.rumofuture.nemo.exception.NemoException;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.support.RequestContext;

import java.util.regex.Pattern;

public class DataValidationUtil {

    private final static Pattern mobilePhoneNumberPattern = Pattern.compile("^(1[0-9])\\d{9}$");

    public static boolean isMobilePhoneNumber(String mobilePhoneNumber) {
        if (null == mobilePhoneNumber || mobilePhoneNumber.equals("")
                || 11 != mobilePhoneNumber.length()) {
            return false;
        }
        return mobilePhoneNumberPattern.matcher(mobilePhoneNumber).matches();
    }

    public static boolean isPassword(String password) {
        if (password.length() < 6) {
            return false;
        }
        return true;
    }

    public static void execute(BindingResult bindingResult, RequestContext requestContext) throws NemoException {
        if (bindingResult.hasErrors()) {
            String code = bindingResult.getAllErrors().get(0).getCodes()[0];
            throw new NemoException(requestContext.getMessage(code));
        }
    }
}
