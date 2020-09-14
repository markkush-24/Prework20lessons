package lesson7;

public class People {


    //1 переменные(поля класса).Здесь обьявляем только те переменные которые описывают состояние обьекта

    private String name;
    private int age;
    private String gender;
    private String phone;
    private boolean haveAvto;
    private String adress;
    //3 конструкторы.Конструктор - это особый метод , который вызывается в момент рождения объекта после слова new


    public People() {

    }

    public People(int age, String name, String phone, String adress, String gender, boolean haveAvto) {

        this.age = age;
        this.name = name;
        this.phone = phone;
        this.adress = adress;
        this.gender = gender;
        this.haveAvto = haveAvto;

    }

    public People(String gender) {
        this.gender = gender;
    }
//2 методы
        // создаем именно те методы , которыми будет иметь человек

        public int getAge () {
            return this.age;

        }

        public void setAge ( int age){
            this.age = age;
        }
        public void setName (String name){
            this.name = name;
        }



}

