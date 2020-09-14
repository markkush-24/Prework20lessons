package lesson10;

public class Main {
    public static void main(String[] args) {
        Krug krug = new Krug();
        Krug krug1 = new Krug();
        Krug krug2 = new Krug();

        Kvadrat kvadrat = new Kvadrat();
        Kvadrat kvadrat1 = new Kvadrat();
        Kvadrat kvadrat2 = new Kvadrat();

       Figura [] figuras = new Figura[6];
        figuras[0] = kvadrat1;
        figuras[1] = kvadrat2;
        figuras[2] = krug1;
        figuras[3] = krug;
        figuras[4] = kvadrat;
        figuras[5] = krug2;

        for(Figura f: figuras){
            f.by();
        }
    }
}
