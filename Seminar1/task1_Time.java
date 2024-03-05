/* В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
*/
package Seminar1;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * task1
 */
public class task1_Time {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now()); // вывод даты и времени

        Scanner sc = new Scanner(System.in);    //  Заводим сканер для-ввода данных
        System.out.print("What is your name? : "); // вод userName через консоль

        String userName = sc.next(); // вводим 2 сканер c cпеременной стринг-userName
        sc.close();

        String phrase = " "; // вводим вторую переменную -фраза

        int hour = LocalDateTime.now().getHour(); // вводим переменную час- hour -и hour вычленяем из LocalDateTime.now() + .getHour()

        if (hour >= 5 && hour <= 11.59){        // начинаем перебор фразы- в зависимомости от времени
            
        phrase = ("Good Moning! - ");
        }
        else if (hour >= 12 && hour <= 17.59){
            
        phrase = ("Good Day! - ");
        }
        else if (hour >= 18 && hour <= 22.59){
            
        phrase = ("Good Evening! - ");
        }
        else if (hour >= 23 && hour <= 4.59);
        phrase = ("Good Night! - ");

        System.out.println(LocalDateTime.now().getHour());   //вывод времени

        System.out.println(phrase + userName);               // вывод фразы + userName
    }

}