package Lesson11;

import lesson10.IMatrix;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Matrix implements IMatrix {
    private double[][] numbers;

    public Matrix() {
    }

    public Matrix(double[][] numbers) {
        this.numbers = numbers;
    }

    public Matrix(int row, int column) {
        numbers = new double[row][column];
    }


    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex >= this.getRows()) {
            System.out.println("Задан не подходящий индекс строки!!!");
            return 0.0;
        }

        if (colIndex >= this.getColumns()) {
            System.out.println("Задан не подходящий индекс колонки!!!");
            return 0.0;
        }


        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex >= this.getRows()) {
            System.out.println("Задан не подходящий индекс строки!!!");
            return;
        }

        if (colIndex >= this.getColumns()) {
            System.out.println("Задан не подходящий индекс колонки!!!");
            return;
        }

        numbers[rowIndex][colIndex] = value;
    }


    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows() ){
            System.out.println("Мы можем складывать только матрицы с одинаковым кол-вом строк!!!");
            return null;
        }

        if (this.getColumns() != otherMatrix.getColumns() ) {
            System.out.println("Мы можем складывать только матрицы с одинаковым кол-вом колонок!!!");
            return null;
        }
        Matrix result = new Matrix(this.getRows(),this.getColumns());
        for (int i = 0; i < result.getRows() ; i++) {
            for (int j = 0; j < result.getColumns() ; j++) {
                result.setValueAt(i ,j, this.getValueAt(i,j) + otherMatrix.getValueAt(i,j));
            }
        }

        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows() ){
            System.out.println("Мы можем вычитать только матрицы с одинаковым кол-во строк!!!");
            return null;
        }
        if(this.getColumns() != otherMatrix.getColumns()){
            System.out.println("Мы можем вычетать только матрицы с одинаковым кол-вом колонок!!!");
            return null;
        }
        Matrix difference = new Matrix(otherMatrix.getRows (),otherMatrix.getColumns());
        for (int i = 0; i < difference.getRows() ; i++) {
            for (int j = 0; j < difference.getColumns(); j++) {
                difference.setValueAt(i,j,this.getValueAt(i,j) - otherMatrix.getValueAt(i,j));

            }
        }
        return difference;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
       if(this.getColumns() != otherMatrix.getRows() ) {
           System.out.println("Кол-во строк первой матрицы должно ровняться кол-ву столбцов второй матрицы!!!");
           return null;
       }
       Matrix mult1 = new Matrix(this.getRows(),otherMatrix.getColumns());
        for (int i = 0; i < this.getRows() ; i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                double value = 0;
                for (int k = 0; k < this.getColumns() ; k++) {
                    value += this.getValueAt(i, k) * otherMatrix.getValueAt(k,j);
                   mult1.setValueAt(i,j, value);
                }


            }
        }
        return mult1;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix matrix2 = new Matrix(this.getRows(),this.getColumns());
        for (int i = 0; i < matrix2.getRows() ; i++) {
            for (int j = 0; j < matrix2.getColumns(); j++) {

                matrix2.setValueAt(i,j,this.getValueAt(i,j)*value);
    }


            }
        return matrix2;
    }

    @Override
    public IMatrix transpose() {
     Matrix matrixTrans = new Matrix(this.getColumns(),this.getRows());
        for (int i = 0; i <matrixTrans.getRows() ; i++) {
            for (int j = 0; j < matrixTrans.getColumns(); j++) {
   matrixTrans.setValueAt(i,j,this.getValueAt(j,i));


            }

        }
        return matrixTrans;
    }

    @Override
    public void fillMatrix(double value) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = value;
            }
        }
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override // не верно работает
    public boolean isNullMatrix() {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (numbers[i][j] != 0) {
                   return false;
                }
            }
        }
        return true;
    }


    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (i == j && numbers[i][j] != 1 || i != j && numbers[i][j] != 0) {

                    return false;
                }
                }
                }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        if (this.getRows() == this.getColumns()) {
            return true;
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(" " + numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
