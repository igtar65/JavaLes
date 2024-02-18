/*Одномерные массивы -инициализация и вывод элементов[] */

import java.util.Arrays;

public class Array2 {
   
        public static void main(String[] args) {
            int[]mAr = {1, 2, 3, 4};               // инициализация
            for (int element :mAr) {
                System.out.print(element + " ");    //вывод эл.
            }
            System.out.println();
           mAr = new int[]{4,1,2,3};                  // или так и сортировка
           Arrays.sort(mAr, 0, 3);      
            for (int element :mAr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
