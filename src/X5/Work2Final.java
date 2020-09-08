package X5;

import java.util.Scanner;

public class Work2Final {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Input a number:");
        String s = num.nextLine();
        String[] d = s.split("");
        int t = 0;
        for (String value : d) {
            t += Integer.parseInt(value);

        }
        System.out.println(t);
    }
}