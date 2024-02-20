/* В двумерном массиве -используете две квадратные скобки вместо одной.
в первой вы пишите количество строк
во второй вы пишите количество столбцов
*/

public class ToDim {
    public static void main(String[] args) {
		
			System.out.println();
        int[][]arr = new int[3][4];                       // объявление массива -инициализация (по умолчанию всe: 0)
        for (int i = 0; i < arr.length; i++){            //идём по строкам
            for (int j = 0; j < arr[i].length; j++){     //идём по столбцам
               // System.out.print(" " + arr[i][j] + " "); //вывод элемента

                System.out.printf("% d ",arr[i][j] ); // или так
             }
     System.out.println();  //- этот sys-перенос строки ради визуального сохранения табличной формы !!!
    
          }
        System.out.println("Заполним массив с консоли");  
      

             int [][] arr2= {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};    
             for (int i = 0; i < arr2.length; i++){
                for (int j = 0; j < arr2[i].length; j++){
          
               System.out.printf("% ,d", + arr2[i][j] );
              // System.out.print(arr1[i][j] + "\t"); // или так
            }
             System.out.println();  
        }
        System.out.println(arr2.length + " -коллиичество строк в массиве");
        System.out.println(arr2[0].length +" -коллиичество стобцов в массиве");
    }  
        }