import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Задача 2. Пусть дан произвольный список целых чисел, удалить из него все четные числа

public class Z2 
{
    public void delList()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = in.nextInt();
        in.close();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i<n; i++)
        {
            int randomInt = new Random().ints(1, 1, 11).findFirst().getAsInt();
            arrayList.add(randomInt);
        }
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++)
        {
            if (arrayList.get(i) % 2 == 0)
            {
                arrayList.remove(i);
                i--;
            }      
        }
        System.out.println(arrayList);

    }   
}
