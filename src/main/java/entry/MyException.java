package entry;

public class MyException extends Exception {
    private String msg;

    public MyException(){
    }

    public MyException(String msg){
        super(msg);
        this.msg = msg;
    }

}
