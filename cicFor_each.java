/* Цикл for each :-это разновидность цикла for
используется для перебора элементов массива или коллекции...дословно -“для каждого”
-те -позволяет выполнять итерации по двум типам объектов:
T[] //массивы любого типа
Объекты, реализующие интерфейс Iterable.
*/

import java.util.Iterator;

/**
 * cicFor_each
 */
public class cicFor_each {
     public static void main(String[] args) {
        int arr[] = new int[] {22,3,8,0,34};
        for (int item : arr) {
    
        System.out.print( item +" ");
        }
       
        }
    }  
       
