import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] tab = new int[10][3];
        Random random = new Random();

        for (int[] row : tab)
            Arrays.fill(row,random.nextInt(50));

        for(int i=0;i< tab.length;i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    System.out.println("BYE BRO!");

    }
}
