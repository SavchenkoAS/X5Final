package X5;
import java.util.Arrays;
public class WorkFinal {
    public static void main(String[] args) {
    int[] numbers = new int[] {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
       // int[] arrey1 = new int [numbers.length];
        int i;
        int temp;
        int count = 0;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                temp = numbers[count];
                numbers[count] = numbers[i];
                numbers[i] = temp;
                count = count + 1;
            }
        }

                System.out.print(Arrays.toString(numbers));
            }
        }
