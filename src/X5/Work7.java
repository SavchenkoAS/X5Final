package X5;

import java.util.Scanner;
public class Work7 {
    public static void main(String[] args) {
        System.out.println("(491)Krasnodar 1min = 2.69 RUB");
        System.out.println("(905)Moscow    1min = 4.15 RUB");
        System.out.println("(194)Rostov    1min = 1.98 RUB");
        System.out.println("(800)Kirov     1min = 5.00 RUB");
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the area code to calculate the cost of 10 minutes of conversation:");
        double krasnodar_tax = 2.69, moscow_tax = 4.15, rostov_tax = 1.98, kirov_tax = 5.00,tax;
        int i = num.nextInt();
        int minutes_count = 10;
        String s;

        switch (i) {
            case 905:
                s = "Moscow";
                tax = moscow_tax;
                break;
            case 491:
                s = "Krasnodar";
                tax = krasnodar_tax;
                break;
            case 800:
                s = "Kirov";
               tax = kirov_tax;
                break;
            case 194:
                s = "Rostov";
                tax = rostov_tax;
                break;
            default:
                System.out.println("Не верный код города!");
                return;
        }
        System.out.println( s + " " + "=" + " " + tax * minutes_count + " " + "RUB");
    }
    }
