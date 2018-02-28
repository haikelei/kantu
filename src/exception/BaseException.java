package exception;

public class BaseException extends RuntimeException {
    int errorCode;
    String errorMessage;

    public BaseException(int errorCode) {
        this.errorCode = errorCode;
        this.errorMessage = ExceptionMap.getMsg(errorCode);
    }


    public BaseException(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
