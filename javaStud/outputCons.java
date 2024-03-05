package javaStud;
/* Консольный ввод/вывод в Java....Спецификаторы
- %d: для целочисленных значений чисел
- %x: для вывода шестнадцатеричных чисел
- %f: для вывода чисел с плавающей точкой
- %e: для вывода чисел в экспоненциальной форме, например, 1.3e+01
- %c: для вывода одиночного символа
- %s: для вывода строковых значений
*/

import java.time.LocalDateTime;

public class ConsIO {
    public static void main(String[] args) {
        System.out.println("Hello !-JAVA");
        System.out.println("Начинаем заново :");
        System.out.println(LocalDateTime.now());

        int x=5;     // объявление переменных и прсваиваем (=) значения
        int y=6;
        int x1=15;
        int y1=21;

        String name = "Tom";  // объявление переменных: строка, целое число и число с плавающей запятой прсваиваем (=) значения
        int age = 30;
        float height = 1.7f;

        System.out.println("вывод присвоеных значений переменных :");
        System.out.println("x=" + x + "; y=" + y);
        System.out.printf("x1=%d; y1=%d \n", x1, y1);
        System.out.println();
        System.out.println("Вывод значений через спецификаторы :"); //спецификатор на %.2f, где .2 указывает, что после запятой будет два знака.
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
        
    }
    
}
