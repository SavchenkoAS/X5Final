package X5;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Input a number:");
        int i = num.nextInt();
        if (i > 0)
        {
            System.out.print(++i);
        }
        else
        {
            System.out.print(i);
        }
            }
        }