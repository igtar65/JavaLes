/* Сортировка заданного массива  - Arrays.sort(myAr,0,5)-myArr
 * проходим по очереди (по индексам) с циклом for (i) - myArr1
 * или Сравнивать каждый элемент со следующим ([0] с [1], [1] с [2], [2] с [3] и т.д.). (i,j )Если текущий элемент массива больше
 *  следующего, меняем их местами и переходим к следующему элементу.
 *  Если нет — оставляем как есть и идем дальше.-myArr2
 */

import java.util.Arrays;
/**
 * Array_Sort
 */
public class Array_Sort {

    public static void main(String[] args) {
        int[]myArr ={-34,-250,10,45,-12,999};{
            System.out.println(Arrays.toString(myArr));
           Arrays.sort(myArr,0,5);
           System.out.println(Arrays.toString(myArr )+ "-сортированный массив");

           int[]myArr1 = {10,32,-5,40,-22,1};
           for (int i = 0; i< myArr1.length; i++);
        System.out.println(Arrays.toString(myArr1));

        int[]myArr2 = {1,3,-5,0,-2,1};
        for (int i = myArr2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) { /*Сравниваем элементы попарно,
                                         если они имеют неправильный порядок,
                                        то меняем местами*/
         if (myArr2[j] > myArr2[j + 1]) {
         int tmp = myArr2[j];           // -tmp -заводим временную переменную-куда 
                                         //складываем результат сравнения
         myArr2[j] = myArr2[j + 1];
         myArr2[j + 1] = tmp;            //-по оканчании цикла (длинна массива)-результат 
                                          //сортировки из tmp - возвращаем а Arr2                
        System.out.println(Arrays.toString(myArr2)+ "cорт.массив");
        }
        }
     } 
    }
  }
}  



