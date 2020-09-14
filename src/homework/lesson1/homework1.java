package homework.lesson1;

public class homework1 {
    public static void main(String[] args) {
        double pizza = 230;
        double gym = 26;
        double candy = 2.5;
        double money = 1000;

        int bay1 =(int) (money / pizza);
        int bay2 =(int) ((money -bay1*pizza)/gym);
        int bay3 =(int) ((money-(bay1*pizza+bay2*gym))/candy) ;
        int bay4= (int)((money-(bay1*pizza+bay2*gym)));
        System.out.println(bay1);
        System.out.println(bay2);
        System.out.println(bay3);
        System.out.println(bay4);


    }
}
