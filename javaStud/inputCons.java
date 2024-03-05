package javaStud;
/*  Console input -  Ввод с консоли - через класс Scanner, который, в свою очередь использует объект- System.in.
            Scanner in = new Scanner(System.in);
Класс Scanner имеет еще ряд методов, которые позволяют получить введенные пользователем значения:

- next(): считывает введенную строку до первого пробела
- nextDouble(): считывает введенное число double
- nextBoolean(): считывает значение boolean
- nextByte(): считывает введенное число byte
- nextShort(): считывает введенное число short
!!! - Для ввода значений каждого примитивного типа в классе Scanner определен свой метод.
 * 
 */
import java.util.Scanner;
 /**
  * inputCons
  */
  public class inputCons {
   
    public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);   // класс Scanner

        System.out.print("Input name: ");   
        String name = sc.nextLine();            //-nextLine(): считывает всю введенную строку

        System.out.print("Input age: ");    
        int age = sc.nextInt();                 //-nextInt(): считывает введенное число int

        System.out.print("Input height: "); 
        float height = sc.nextFloat();          //-nextFloat(): считывает введенное число float

        System.out.printf("Name: %s  Age: %d  Height: %.3f \n", name, age, height);

       sc.close();      // !!! - после работы сканер -обязательно - ЗАКРЫТЬ !!!
    }
}
