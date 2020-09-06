package X5;

public class Work8 {
    public static void main(String[] args) {
        int positive_result = 0;
        int negative_result = 0;
        int count = 0;
        int count_negative = 0;
        int aref = 0;
        int[] numbers = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = numbers[0];
        for (int number : numbers)
            if (number > 0)
                positive_result += number;
        {
            for (int number : numbers)
                if (number % 2 < 0)
                    negative_result += number;
            {
                for (int number : numbers)
                    if (number < 0)
                        aref += number;

                {
                    for (int number : numbers)
                        if (number > 0)
                            count++;

                    {
                        for (int number : numbers)
                            if (number < 0)
                                count_negative++;
                        {
                            for (int number : numbers)
                                if (max < number)
                                    max = number;
                        }
                        {
                            System.out.println("-" + "Максимальное значение элемента из массива" + " " + "=" + " " + (double) max);
                            System.out.println("-" + "Сумма положительных элементов" + " " + "=" + " " + (double) positive_result);
                            System.out.println("-" + "Сумма четных отрицательных элементов" + " " + "=" + " " + (double) negative_result);
                            System.out.println("-" + "Количество положительных элементов" + " " + "=" + " " + count);
                            System.out.println("-" + "Среднее арифметическое отрицательных элементов" + " " + "=" + " " + (double) aref / count_negative);
                        }

                    }
                }
            }
        }
    }
}