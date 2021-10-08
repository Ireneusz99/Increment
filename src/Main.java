public class Main {
    public static void main(String[] args) {
        int[][] tab = new int[10][3];

        for(int i=0;i<tab.length;i++) {
            for(int j=0;j<tab[i].length;j++) {
                tab[i][j] = i+1;
            }
        }

        for(int i=0;i< tab.length;i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }



    }
}
