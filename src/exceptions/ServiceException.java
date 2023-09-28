package exceptions;

import enums.ExceptionEnums;

public class ServiceException extends RuntimeException{
    public ServiceException(ExceptionEnums exceptionEnum) {
        super(exceptionEnum.getMessage());
    }
}
