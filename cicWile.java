/* Цикл while - цикл "пока" или "до тех пор пока"
 * т.е -он повторяет действие(-я) до тех пор, пока условие истинно. 
*/

public class cicWile {
//     public static void main(String args[]){
//         int i = 1;
//         while (i < 8) {                //выводит числа ПОКА i < 8...стало > 8-цикл завершился
//            System.out.print(i + " ");
//            i++;
//         }
//    }

// public static void main(String args[]) {
//     int i = 100;
//     while (i >= 10) {

//         System.out.println("обратный отчет :\n" + i);
//         i -= 10;
//     }
// }
// }

//     public static void main(String[] args) {
//     int value = 321;
//     int count = 0;
//     while (value != 0) {
//     value /= 10;
//     count++;
//     }
//     System.out.println(count);
//     }
//    }

public static void main(String[] args) {
    int value = 21;
    int count = 0;
    do {
    value /= 10;
    count++;
    } while (value != 0);
    System.out.println(count);
    }
   }
// public static void main(String args[]){
//     int i = 1;
//     do {
//         i++;
//         System.out.print(i + " ");
//     } while(i < 0);
// }
// }