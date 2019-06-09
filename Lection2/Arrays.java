package ArrayException;

public class Arrays {
    String[][] matrix;
    int sum;

    public Arrays(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        this.matrix = matrix;

        // Проверяем размерность массива
        try {
            if (this.matrix.length != 4) throw new MyArraySizeException();

            for (int i=0; i < this.matrix.length; ++i){
                if (this.matrix[i].length != 4) throw new MyArraySizeException();
            }

            System.out.println("Размерность массива 4х4 соблюдена.");
        }catch (MyArraySizeException mase){
            System.out.println("Ошибка!\n" +  mase.getMessage());
        }

        // Преобразовываем данные в чило и суммируем
        for (int i=0; i < this.matrix.length; ++i){
            for (int y=0; y < this.matrix.length; ++y){
                try {
                    this.sum += Integer.parseInt(matrix[i][y]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, y);
                }
            }
        }

        System.out.println("Сумма всех чисел равна " + this.sum);
    }
}

