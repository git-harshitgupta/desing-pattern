package org.harshit.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ErrorMessageFactory {

    public enum ErrorType{GenericSystemError, PageNotFoundError, ServerError}
    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();
    public static ErrorMessageFactory getInstance(){ return FACTORY;}
    private Map<ErrorType,SystemErrorMessage> errorMessages = new HashMap<>();
    public ErrorMessageFactory(){
        errorMessages.put(ErrorType.GenericSystemError,new SystemErrorMessage("A genetic error of type $errorCode occured. Please refer to:\n","http://google.com"));
        errorMessages.put(ErrorType.PageNotFoundError,new SystemErrorMessage("Page not found error of type $errorCode occured. Please refer to:\n","http://google.com"));
    }
    public SystemErrorMessage getError(ErrorType type){
        return errorMessages.get(type);
    }

    public UserBannedErrorMessage getUserBannedMessage(String caseId){
        return new UserBannedErrorMessage(caseId);
    }
}
