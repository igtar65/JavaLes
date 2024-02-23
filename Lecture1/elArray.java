package Lecture1;

/*Одномерные массивы -инициализация и вывод элементов[] */

import java.util.Arrays;

public class elArray {
   
        public static void main(String[] args) {
            int[]myAr = {14,0,22,1};               // инициализация
            for (int element :myAr) {
                System.out.print(element + " ");    //вывод эл.
            }
            System.out.println();
           myAr = new int[]{14,0,22,1};                  // или так и сортировка
           Arrays.sort(myAr, 0, 3);      
            for (int element :myAr) {
                System.out.print(element + " ");
                
            }
            System.out.println();
        }
    }