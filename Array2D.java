
import java.util.Arrays;
    public class Array2D {

        public static void main(String[] args) {
            int[][] Numbers = {{1, 2, 3}, {4, 5, 6}};

            // Преобразуем двумерный массив в строку с использованием метода toString()
            // Converteer een tweedimensionale array naar een string met behulp van de methode toString().
            String arrayString = Arrays.deepToString(Numbers);

            System.out.println(arrayString);
        }
    }
