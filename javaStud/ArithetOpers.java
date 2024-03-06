package javaStud;
/* Arithmetic operations
 * примеры
*/

public class ArithetOpers {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

       double c = 2.0 - 1;    //Чтобы результат представлял число с плавающей точкой, 
                             //один из операндов также должен представлять число с плавающей точкой:

       int x = (a + 5) * ++b;    // -Префиксный инкремент - сначалa b+1 = 13 (приоритетное действие)
       int x1 = (a + 5 )* --b;   //  -Префиксный декремент - сначалa b-1 = 11 (приоритетное действие)
                                 /* b ++ (постфиксный инкремент), b-- (постфиксный декремент)   */

        System.out.println(a+b );
        System.out.println(b/a) ;
        System.out.println(a*b );
        System.out.println(a-b);
        System.out.println(c);
        System.out.println(x); 
        System.out.println(x1); 
        
    }
    
}
