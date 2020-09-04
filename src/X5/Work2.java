package X5;

import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Input a number:");
        int i = num.nextInt();
        System.out.println((i % 10) + (i / 10) % 10 + (i /100) % 10 + (i / 1000));
    }

}
