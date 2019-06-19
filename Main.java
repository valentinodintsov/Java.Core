public class Main {
    private static final int size = 10000000;
    private static final int h = size / 2;

    public static void main(String[] args) {
        calcMass();
        calcThreads();
    }

    // Массив заполняется единицами и пересчитывается по формуле
    // Результат - время выполнения массива
    private static void calcMass(){

        float[] arr = new float[size];
        for(int i=0; i < arr.length; i++) arr[i] = 1;

        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Время выполнения операции пересчета массива: " +
                (System.currentTimeMillis() - a) + " мс.\n");
    }

    // Массив заполняется единицами, делится на два массива, пересчитывается по формуле в два потока
    // Результат - время выполнения массива
    public static void calcThreads(){
        float[] arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];

        for(int i=0; i < arr.length; i++) arr[i] = 1;

        System.out.println("Начало выполнение операции пересчета массива в два потока");
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        new Thread() {
            public void run() {
                for (int y = 0; y < h; y++){
                    arr[y] = (float)(arr1[y] * Math.sin(0.2f + y / 5) * Math.cos(0.2f + y / 5) * Math.cos(0.4f + y / 2));
                }
            }
        }.start();
        System.out.println("Первый поток выполнил пересчет за: " + (System.currentTimeMillis() - a) + " мс.");

        new Thread() {
            public void run() {
                for (int z = 0; z < h; z++){
                    arr[z] = (float)(arr1[z] * Math.sin(0.2f + z / 5) * Math.cos(0.2f + z / 5) * Math.cos(0.4f + z / 2));
                }
            }
        }.start();
        System.out.println("Второй поток выполнил пересчет за: " + (System.currentTimeMillis() - a) + " мс.");

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        System.out.println("Общее время выполнения операции пересчета массива в два потока: " +
                (System.currentTimeMillis() - a) + " мс.");
    }
}
