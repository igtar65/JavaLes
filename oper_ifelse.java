
 /*УСЛОВНЫЕ КОНСТРУКЦИИ - conditional operator- позволяют направить работу программы по одному из путей в зависимости от определенных условий.
В языке Java используются следующие условные конструкции: if..else и switch..case
Оператор всегда начинается сос слова if, за которым всегда идут круглые скобки с условием.
После круглых скобок никогда не ставится точка с запятой
Для того, чтобы указать альтернативный вариант (если не выполняется, тогда...) использутся слово else.
Если условий несколько, то каждое из них будет записываться через комбинацию else if,
 после которых в круглых скобках записывается альтернативное условие. Последний вариант
  (если не то, не то и не то, то...) записывается через else без условия.
 */  

 import java.util.Scanner;

 public class oper_ifelse {
    public static void main (String [] args) {
        System.out.print ("Введите число 1, 2 или 3: "); //ввод данных от user
		try (Scanner sc = new Scanner (System.in)) {       // подключаем сканер 
            int i = sc.nextInt (); {                       // в переменную i- присваеваем число которое ввел user ..проверяем
            if ( i==1) { 
            	System.out.println ("Вы ввели число 1");
            }
            else if (i==2) {
            	System.out.println ("Вы ввели число 2");
            }
            else if (i==3) {
            	System.out.println ("Вы ввели число 3");
            }
            else {
            	System.out.println ("Вы ввели число не равное 1, 2 или 3");

             }
            }
        }
    }
}

// public class oper_ifelse {
//     public static void main(String[] args) {
//          int a = 1;        // присваиваем значения переменым (a,b,)
//          int b = 2;
//          int c;
//          if (a > b) {    // проверяем условие и присваеваем значение (с) -где  условие верно
//          c = a;
//         }
//          else {
//             c = b;
//          }
//          System.out.println(c +" - присвоено (с) ");
//         }
// }
            // if (a > b) c = a;     // сокращенная форма блока -без else
            // if (b > a) c = b;
            // System.out.println(c);

            // Управляющие конструкции:- тернарный оператор -(?)-
            
            // public class Program {
            //  public static void main(String[] args) {
            //  int a = 1;
            //  int b = 2;
            //  int min = a < b ? a : b;
            //  System.out.println(min);
            //  }
            // }