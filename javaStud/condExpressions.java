package javaStud;

/* Conditional Expressions  - Условные выражения -возвращают значение типа boolean, 
то есть значение true (если условие истинно),или значение false (если условие ложно).
* Logical operations - Логические опервциb
== ; != ; < > ; <= =>; |; &; &&; ||;
*/
public class condExpressions {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        boolean c = a == b; // false
        boolean d = a == 10; // true

        boolean c1 = a != b;         // true
        boolean d1 = a != 10;       // false

        System.out.println(c);
        System.out.println(d);
        System.out.println(c1);
        System.out.println(d1);
        
    /* boolean a1 = (5 > 6) || (4 < 6); // 5 > 6 - false, 4 < 6 - true, поэтому возвращается true
boolean a2 = (5 > 6) || (4 > 6); // 5 > 6 - false, 4 > 6 - false, поэтому возвращается false
boolean a3 = (5 > 6) && (4 < 6); // 5 > 6 - false, поэтому возвращается false (4 < 6 - true, но не вычисляется)
boolean a4 = (50 > 6) && (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается true
boolean a5 = (5 < 6) ^ (4 > 6); // 5 < 6 - true, поэтому возвращается true (4 > 6 - false)
boolean a6 = (50 > 6) ^ (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается false*/
    }
}
