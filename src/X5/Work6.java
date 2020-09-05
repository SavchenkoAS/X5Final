package X5;

import java.util.Scanner;

public class Work6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Input a number:");
        int i = num.nextInt();
        if (i > 0) {
            System.out.println("Положительное число");
        } else if (i < 0) {
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Нулевое число");
        }
        if (i%2 == 0){
            System.out.println("Четное число");
        }
        else {
            System.out.println("Не четное число");
        }
        if (i/10 >= 10 && i/10 < 100){
            System.out.println("Трехзначное число");
        }
        else if (i/10 < 10 && i/10 >=1) {
            System.out.println("Двухзначное число");
        }
        else{
            System.out.println("Однозначное число");
        }
        }
    }


