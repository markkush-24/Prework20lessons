package lesson6;

public class Main {
    public static void main(String[] args) {
        char [] [] simbols = new char [5][5];
        for(int i = 0; i < simbols.length;i++){
            for(int j = 0; i < simbols[i].length;j++) {
                if (i == j) {
                    System.out.println(simbols[i][j] + "");

                }else {
                    System.out.println("" + "");
                }
            }
            System.out.println();
        }
    }
}
