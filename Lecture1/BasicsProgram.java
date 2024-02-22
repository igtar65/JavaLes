package Lecture1;

/*
*  основы - программирования
- LocalDateTime.now() -вывод текущей даты и времени на консоль
 */

 import java.time.LocalDateTime;

 /**
  * BasicsPr
  */
 public class BasicsProgram {                     //-объявление класса Pr.
     public static void main(String[] args) {   // -объявление метода main
             System.out.println();         
             System.out.println("  Hello World ! ");  // - вывод строки 
             System.out.println("-Igor, Welcom to Java : " + LocalDateTime.now() );  //и текущей даты на консоль
                 
     }
 }