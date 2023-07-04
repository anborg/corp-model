package corp.util;

public class UtilException extends RuntimeException {
    public UtilException(String msg, Throwable e){
        super(msg, e);
    }
}

