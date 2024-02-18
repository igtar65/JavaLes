/* Массивы 
 *  myArr -Объявление одномерного массива длиной [10]
 * arr2 - Объявление одномерного массива длиной [5]-заполненного произвольно с консоли
 * Метод String -Arrays.toString(arr2) преобразовывает массив к строке.(без цикла - for)
 * Метод void -  Arrays.sort(arr2, int fromIndex, int toIndex) сортирует массив целых чисел или его подмассив по возрастанию.
 * .......Arrays.binarySearch
 * arr3- ..-без -Arrays.toString -.длинной 5..с выводом чисел по индексу с использованием цикла -for -по индексу
 */

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] myArr =new int[10];
    System.out.println(myArr.length);// 10
    System.out.println();

       int[] arr2 = {1, 5, 4, 3, 7};                //объявляем и инициализируем массив
        System.out.println(arr2);                   //пытаемся вывести наш массив на экран без метода toString - получаем 16-ричное число
        System.out.println(Arrays.toString(arr2));  //печатаем массив "правильно" -(метод (Arrays.toString)
       
        Arrays.sort(arr2, 0, 5);  //  Arrays.sort-сортируем весь массив от нулевого до пятого члена
       
        System.out.println(Arrays.toString(arr2));  //выводим отсортированный массив на экран
       
        int key = Arrays.binarySearch(arr2, 5); // ищем key - число 5 в отсортированном массиве.-это индекс[3]
        //метод binarySearch выдаст индекс элемента остортированного массива, в котором "спрятано" искомое число
       
        System.out.println(key);                   //распечатываем индекс искомого числа

        System.out.println(Arrays.binarySearch( arr2, 0)); //а теперь попробуем найти число, которого в массиве нет (0),
                                                       // и сразу же выведем результат на экран - обозначается как (-1)
        int[] arr3 = {1, 5, 4, 3, 7};     //-без сортировки 
        //Arrays.sort(arr3, 0, 5);        // с сортировкой
        for (int i = 0; i < 5; i++) {        // цикл for -числа выстраиваются столбиком
            System.out.println(arr3[i]);

          
           

            }
      
    }
}
