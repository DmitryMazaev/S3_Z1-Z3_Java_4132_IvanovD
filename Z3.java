//Задача 3. Задан целочисленный список ArrayList. 
//Найти минимальное, максимальное и среднее из этого списка.
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Z3 
{
    public void arrayList()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = in.nextInt();
        int sum = 0;
        in.close();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            int randomInt = new Random().ints(1, 1, 11).findFirst().getAsInt();
            arrayList.add(randomInt);
        }
        System.out.printf("Массив: %s \n", arrayList);
        arrayList.sort(null);
        //System.out.println(arrayList);
        System.out.printf("Минимальное значение элементов массива: %d \n", arrayList.get(0));
        System.out.printf("Максимальное значение элементов массива: %d \n", arrayList.get(arrayList.size()-1));
        for (int i = 0; i < n; i++)
        {
            sum += arrayList.get(i);
        }
        System.out.printf("Среднее значение: %d \n", sum/n);
    }
}
