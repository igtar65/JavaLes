/*  
- Дополнительно - пользователь вводит не числа(строку..)
hasNextInt() — метод проверяет, является ли следующая порция введенных данных числом, или нет (возвращает, соответственно, true или false).

hasNextByte(), hasNextShort(), hasNextLong(), hasNextFloat(), hasNextDouble() — все эти методы делают то же для остальных типов данных.*/

import java.util.Scanner;

public class les_3_Scan {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
 
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number);
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
            sc.close();
        }
 
    }
 }