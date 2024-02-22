package Lecture1;

/* Изучаем работу Scanner
-Scanner(System.in) -предоставляет пользователю возможность ВВодить информацию
-sc.hasNextInt() -проверяет - введено число или нет..
 *  - Метод nextLine() Этот метод читает и воспроизводит данные до конца строки.
 * (в нашем случае — первую) и возвращает ее. 
 
*/

import java.util.Scanner;

public class getNum_2 {
    public static void main(String[] args) {   //-main-основное тело...в котором есть 2 метода':
        getNumber();                           // метод работы с числами...
        getString();                           //метод считывания строк...Вызываем отдельрыми кейсами и передаем в main

    }
    public static void getNumber() {  
        
        Scanner sc = new Scanner(System.in);   // ввод данных
        System.out.print("Работа с числами - Введите число: ");
 
        if (sc.hasNextInt()) {              // проверка -является ли числом 
            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number); // true
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!"); // false
            sc.close();
     
        }
        System.out.println();
    }
       
     public static void getString() { 
        Scanner sc = new Scanner(
             ("Люблю тебя, Петра творенье,\n" +
            "Люблю твой строгий, стройный вид,\n" +
            "Невы державное теченье,\n" +
            "Береговой ее гранит"));
            System.out.println("Работа со строками - Четверостишье: ");
            String s = sc.nextLine();
            System.out.println(s);
        // /* Мы можем использовать метод nextLine() несколько раз
        //  и вывести весь кусок поэмы..иначе  выведет только строку..
        // */
             s = sc.nextLine(); 
            System.out.println(s);
            s = sc.nextLine();
            System.out.println(s);
            s = sc.nextLine();
            System.out.println(s);
            sc.close();            //- внимание — close(). Как и любой объект, работающий с потоками ввода-вывода,  
                                    // сканер должен быть закрыт по завершении своей работы.  
        }
    }

   
