package Lesson11;

import lesson10.IMatrix;

public class Main {
    public static void main(String[] args) {
        double [][] num1 = {{1,4,8,2},
                            {3,1,3,1},
                            {5,9,1,9}};
        Matrix matrix1 = new Matrix(num1);

     //   double [][] num2 = {{4, 5, 3},
                  //          {3, 6, 6},
                   //         {5, 6, 5},
                   //         {3 ,4, 2} };


      //  Matrix matrix2 = new Matrix(num2);
       IMatrix resultAdd = matrix1.transpose();
        resultAdd.printToConsole();

        System.out.println(resultAdd);
    }


}
