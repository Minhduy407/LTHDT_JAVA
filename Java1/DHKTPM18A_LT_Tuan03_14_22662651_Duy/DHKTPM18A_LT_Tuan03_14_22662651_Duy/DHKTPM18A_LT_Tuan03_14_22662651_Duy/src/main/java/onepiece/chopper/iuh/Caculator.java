package onepiece.chopper.iuh;

import java.util.InputMismatchException;

/*
  @#Calcuator.java
  @author: Huynh Le Minh Duy
  @date: 19/05/2021
  @version: 1.0
 */
public class Caculator {
    /**
     * Dung de tinh tong cac so nguyen vua nhap vao
     * @param numbers
     * @return sum
     */
    public static int sum(int... numbers){
        int total = 0;
        for(int number : numbers){
            total += number;
        }
        return total;
    }
    /**
     * Dung de tinh phep chia 2 so nguyen
     *
     * @param a , b
     * @return a / b
     */
    public static float div(int a, int b){
        if(b == 0){
            throw new InputMismatchException("Cannot divide by zero");
        }
        return (float)a/b;
    }
}


