/* ОПЕРАТОР ВЫБОРА - switch - 
-Используйте оператор case при числе ветвлений более двух, чтобы не загромождать if-структурами код.
-завершать логический блок  (блок case) вызовом break.
Оператор switch  типы Enum-(перечисление) и String.
- блок default – употребляйте его для обработки незапланированных значений выбора.
*/
public class operSwich {
    public static void main(String[] args) {
        // оператор выбора switch
// int n;
// String s;

// // ввод значения n
// n = 6;

// switch (n)
// {
//     case 1:
//         s = "Понедельник";
//     break;
//     case 2:
//         s = "Вторник";
//     break;
//     case 3:
//         s = "Среда";
//     break;
//     case 4:
//         s = "Четверг";
//     break;
//     case 5:
//         s = "Пятница";
//     break;
//     case 6:
//         s = "Суббота";
//     break;
//     case 7:
//         s = "Воскресенье";
//     break;
//     default:
//         s = "Неправильно введен день";
// }

// System.out.println(s);
//     }
// }

        /* . Вложенные инструкции switch. Пример
Инструкция switch может содержать другую, вложенную инструкцию switch. В каждом операторе switch определяется свой блок кода. 
Блоки кода есть независимыми друг от друга.

Пример. В данном примере на основании номера года (year) и месяца (month) вычисляется количество дней в месяце (переменная days).
 Задача решена с использованием вложенных операторов if и switch*/
    int f;
    int year;
    int month;
    int days;

// заданы месяц и год
    year = 2404;
    month = 1;

    switch(month) {
    case 4: case 6: case 9: case 11:
        days = 30;
        break;
    case 2: // месяц февраль
        f = 0; 

        // вложенный оператор if
        if (year%400==0) f=1;
        else
        if (year%100==0) f=0;
        else
        if (year%4==0) f=1;

        // вложенный оператор switch
        switch (f) {
            case 0:
                days=28;
                break;
            default:
                days=29;
        }
        break;
    default:
        days = 31; 
} 
    System.out.println("Days = " + days);
    }
}