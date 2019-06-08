package ArrayException;

public class MyArraySizeException extends Exception{

    public MyArraySizeException() {
        super("Массив не обладает размерностью 4х4!");
    }
}

