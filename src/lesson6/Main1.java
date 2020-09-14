package lesson6;

public class Main1 {
    public static void main(String[] args) {
        char [] firsArray = {'q','w','e','r'};
        char [] secondArray = {'a','s','d','f'};
        char [] thirdArray = new char[firsArray.length + secondArray.length];
        for (int i = 0; i < thirdArray.length; i++) {
            if(i < firsArray.length){
                thirdArray[i]= firsArray[i];
            }
            else{
                thirdArray[i]= secondArray[i - firsArray.length];
            }

        }
    }
}
