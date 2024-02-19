
/*Сопирование массива-метод Arrays.copyOf()
 * целиком Arr1...или часть -Arr2 и Arr3(по заданным индексам)-Arrays.copyOfRange(arr1, 3,6)
 */ 

import java.util.Arrays;

public class Arr_Copy {
    public static void main(String[] args) {

        int[]arr1 = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
 
        int []arr1Copy = Arrays.copyOf(arr1,arr1.length);
        System.out.println(Arrays.toString(arr1Copy));
      
        int [] arr2Copy = Arrays.copyOf(arr1, 4); // от 0 до 4 элемента
        System.out.println(Arrays.toString(arr2Copy) + " -copyOf");

         int [] arr3Copy = Arrays.copyOfRange(arr1,3,6); // от 3 до 6 элемента
        System.out.println(Arrays.toString(arr3Copy) + " -copyOfRange");
    }
 }
   

