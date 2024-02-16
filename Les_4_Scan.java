
/* Изучаем работу Scanner 


 *  - Метод nextLine() обращается к источнику данных (нашему тексту с четверостишием), находит там следующую строку,
 *  которую он еще не считывал (в нашем случае — первую) и возвращает ее. 
 
*/

import java.util.Scanner;

public class Les_4_Scan {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner("Люблю тебя, Петра творенье,\n" +
        "Люблю твой строгий, стройный вид,\n" +
        "Невы державное теченье,\n" +
        "Береговой ее гранит");
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println();
        /* Мы можем использовать метод nextLine() несколько раз
         и вывести весь кусок поэмы..иначе  выведет только строку..
        */
        s = sc.nextLine(); 
        System.out.println(s);
        s = sc.nextLine();
        System.out.println(s);
        s = sc.nextLine();
        System.out.println(s);
    sc.close();            //- внимание — close(). Как и любой объект, работающий с потоками ввода-вывода,  
                               // сканер должен быть закрыт по завершении своей работы, 
                                //чтобы больше не потреблять ресурсы нашего компьютера
        }
    } 

   
