/* Получеие данных  от Пользователя в java
 * - используем "экземпляр"- "classa"типа Scanner (переменная) -
 *  где в качестве азгумента указываем-(System.in)-откуда и что будем забирать
*/

import java.util.Scanner;

public class UserTerm {
    public static void main(String[] args) {
       Scanner iScaner = new Scanner(System.in); // используем "экземпляр"-типа Scanner - где в качестве
        System.out.printf("name: ");
        String name =iScaner.nextLine();          // экземпляр Scannera -определяем как -.nextLine();-получение 
                                                //  следующей СТРОКИ ! - ни числаб ни вещественного числа или что др...) -
        System.out.printf("ПРивет, %s !" , name);
        System.out.println();
            iScaner.close();                        // после работы обязательно сканер закрываем!
        }
            
 }
        
           
        
    

