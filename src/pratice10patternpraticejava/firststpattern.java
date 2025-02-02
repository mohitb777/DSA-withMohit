package pratice10patternpraticejava;
public class firststpattern {
    public static void main(String[] args) {
        pattern9(3);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");

            }
            System.out.println();
        }
    }
    static void pattern5(int n) {
        for(int row =1; row < 2*n; row++){
            int totalcol = row > n ? 2 * n - row : row;
            for (int col = 1; col < totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for(int row =0; row < 2*n; row++){
            int totalcolinrow = row > n ? 2 * n - row : row;

            int noofspaces = n - totalcolinrow;
            for (int s = 0; s < noofspaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalcolinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <=n ; row++) {
            for (int space = 0; space < n - row ; space++) {
                System.out.print(" ");

            }
            for (int col = row; col >= 1 ; col--){
                System.out.print(col);
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int row = 1; row <= 2 * n ; row++) {
            int c = row > n ? 2 * n - row: row;
            for(int space = 0; space < n-c; space++){
                System.out.print("  ");
            }
            for (int col = c; col >= 1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n) {
        int on =n;
        n= 2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEI = on - Math.min(Math.min(row, col), Math.min(n-row,n-col));
                System.out.print( atEI + " ");
            }
            System.out.println();
        }
    }
}