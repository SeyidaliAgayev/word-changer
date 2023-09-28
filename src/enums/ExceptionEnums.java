package enums;

public enum ExceptionEnums {
    WORD_NOT_FOUND("Word not found in sentence!");
    private final String message;

    ExceptionEnums(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
