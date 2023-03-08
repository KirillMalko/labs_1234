//. Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались
//        после всех остальных

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int[][] array = {{1,2,0}, {0,4,0} , {3,0,4}};
        for (int i = 0; i < array.length; i++){
            int letter;
            Arrays.sort(array[i]);
if (array[i][0] == 0){
   letter =  array[i][array[i].length-1];
    array[i][array[i].length-1] = 0;
    array[i][0] = letter;
}
        }
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println(Arrays.toString(array[2]));
    }
}