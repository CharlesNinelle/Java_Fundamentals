public class Array555 {
    public static void main(String[] args) {
        int[][][] threeDArray = new int[5][5][5];

        // Заполняем трехмерный массив значениями
        //// Vul de driedimensionale array met waarden
        int value = 1;
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                for (int z = 0; z < 5; z++) {
                    threeDArray[x][y][z] = value;
                    value++;
                }
            }
        }

        // Печать значений элементов трехмерного массива
        // Druk de waarden van de elementen van een driedimensionale array af
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                for (int z = 0; z < 5; z++) {
                    System.out.println("threeDArray[" + x + "][" + y + "][" + z + "] = " + threeDArray[x][y][z]);
                }
            }
        }
    }
}
