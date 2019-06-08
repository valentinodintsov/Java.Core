package ArrayException;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int i, int y) {
        super(String.format("Данные в ячейке [%d, %d] не являются числом!", i, y));
    }
}
