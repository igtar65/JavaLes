package Lecture1;


    /*  Изучаем работу Scanner
-Scanner(System.in) -предоставляет пользователю возможность ВВодить информацию c кавиатуры
 и проверка истины-- hasNextInt()
 метод(функция) -Scanner - Ввод данных с клавиатуры -int (число)
- hasNextInt() — метод проверяет, является ли введенные данные числом, 
    или нет (возвращает, соответственно, true или false)...
hasNextByte(), hasNextShort(), hasNextLong(), hasNextFloat(), hasNextDouble() — все эти методы делают то же для остальных типов данных.*/

import java.util.Scanner;

public class getNumber {

    public static void main(String[] args) {  
        
        Scanner sc = new Scanner(System.in);   // ввод данных
        System.out.println("Введите число:");
 
        if (sc.hasNextInt()) {              // проверка -является ли числом 
            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number); // true
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!"); // false
            sc.close();
        }
 
    }
 }
    

