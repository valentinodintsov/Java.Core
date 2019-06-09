package ArrayException;

import ArrayException.Arrays;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        // Массив 4х4
        try {
            Arrays arr1 = new Arrays(new String[][]{{"1","5","9","13"},{"2","6","10","14"},{"3","7","11","15"},{"4","8","12","16"}});
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        // Массив 3х4
        try {
            Arrays arr2 = new Arrays(new String[][]{{"1","5","9","13"},{"2","6","10","14"},{"3","7","11","15"}});
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        // Массив с символами вместо цифр
        try {
            Arrays arr3 = new Arrays(new String[][]{{"1","5","9","13"},{"2","Упс!","10","14"},{"3","7","11","15"},{"4","8","12","16"}});
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

