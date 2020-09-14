package lesson7;

public class Main {
    public static void main(String[] args) {
        People vasya = new People();
        People petya = new People();


    //   vasya.gender = "Мужчина";
     //  petya.gender = "Мужчина";
      //  vasya.age = 25;
          vasya.setAge(15);
           vasya.setName("vasya");
        System.out.println(vasya.getAge());
       // System.out.println(vasya.gender);
      //  System.out.println(petya.age);
    }
}
