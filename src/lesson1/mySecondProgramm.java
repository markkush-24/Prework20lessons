package lesson1;

public class mySecondProgramm {


    public static void main(String[] args) {
        double roomWight = 4.5;
        double roomLength = 3;
        double tableWight =5;
        double tableLength = 2;

        double  bereichRoom = roomLength*roomWight;
        double  bereichTable = tableLength*tableWight;

        int countTable = (int)(bereichRoom/bereichTable);
        System.out.println(countTable);

    }
}
