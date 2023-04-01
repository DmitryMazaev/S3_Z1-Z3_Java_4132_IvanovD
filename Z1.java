/* Задача 1. Реализовать алгоритм сортировки слиянием */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Z1 
{
    public void sortNumbers()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов первого массива: ");
        int n = in.nextInt();
        System.out.print("Введите количество элементов второго массива: ");
        int m = in.nextInt();

        in.close();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        for (int i = 0; i<n; i++)
        {
            int randomInt = new Random().ints(1, 1, 11).findFirst().getAsInt();
            numbers.add(randomInt);
        }
        System.out.printf("Массив 1: %s\n", numbers);
        for (int i = 0; i < numbers.size()-1; i ++)
        {
            for (int j = 0; j < numbers.size()-1; j++)
            {
                if (numbers.get(j) > numbers.get(j+1))
                {
                    numbers.add(numbers.get(j));
                    numbers.remove(j);
                    j=0;
                }
            } 
        }
        System.out.printf("Отсортированный массив 1: %s \n", numbers);
        for (int i = 0; i<m; i++)
        {
            int randomInt = new Random().ints(1, 1, 11).findFirst().getAsInt();
            numbers2.add(randomInt);
        }
        System.out.printf("Массив 2: %s \n", numbers2);
        for (int i = 0; i < numbers2.size()-1; i ++)
        {
            for (int j = 0; j < numbers2.size()-1; j++)
            {
                if (numbers2.get(j) > numbers2.get(j+1))
                {
                    numbers2.add(numbers2.get(j));
                    numbers2.remove(j);
                    j=0;
                }
            } 
        }
        System.out.printf("Отсортированный массив 2: %s \n", numbers2);
        for (int i = 0; i < numbers2.size(); i ++)
        {
            numbers.add(numbers2.get(i));
            numbers.sort(null);
        }
        System.out.printf("Объединенный отсортированный массив: %s", numbers);
                
    }
}
