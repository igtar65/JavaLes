
/*Содание файла с проверкой-доб библиотеки: import java.io.File; import java.io.IOException;..
try -создаем нов. файл и проверяем (if)-есть файл с таким именем-("example.txt") -если нет -создаем 
-он будет пустой....можем что-либо написать  внем и считать

*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 

public class CreatF {
    public static void main(String[] args) {
        try {
            File myFile = new File("example.txt");
            if(myFile.createNewFile()){     //проверяем есть такой файл
                System.out.println("file- creatid");
            }
		
        } catch (IOException e){                   
        System.out.println("file-has already");
        }
        try {
            FileReader fileReader = new FileReader("example.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);  //класс BufferedReader читает текст из потока 
 
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);                          
            }
 
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
            e.printStackTrace();
    }

    /* -при введении этого блока весь файл- "example.txt"-удаляется */
    // File file = new File("example.txt");     
    //     if (file.delete()) {
    //           System.out.println("Файл удален");
    //         }             
    //          else {
    //              System.out.println("Файл не найден");
        }
    }
