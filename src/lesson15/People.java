package lesson15;

public class People {
    private int age;
    private String name;

    public void setAge(int age) throws UncarrentAgeExeption {
        if(age > 150 || age < 150){
            throw new UncarrentAgeExeption("Возраст не может быть меньше 0 или 150");

        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;


    }


}
