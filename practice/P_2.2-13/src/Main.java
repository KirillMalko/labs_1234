import java.sql.Array;
import java.util.Arrays;

//        Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на
//        экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и
//        сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние
//        арифметические равны).
public class Main {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        double count1 = 0;
        double count2 = 0;
        int arr2[] = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 6);
            count1 += arr1[i];
            arr2[i] = (int) (Math.random() * 6);
            count2 += arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        if (count1 > count2) {
            System.out.println("значение оказалось больше Array1 и составило: " + (count1/arr1.length));
        } else if (count2 > count1) {
            System.out.println("значение оказалось больше Array2 и составило: " + count2/arr2.length);
        }else {
            System.out.println("их средние арифметические равныи составило: " + count2/arr2.length);
        }


    }
}