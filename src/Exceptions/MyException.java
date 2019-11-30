package Exceptions;

public class MyException extends Exception {

    Long timeMillis;

    public MyException(Long timeMillis) {
        this.timeMillis = timeMillis;
    }

    public Long getTimeMillis() {
        return timeMillis;
    }
}
