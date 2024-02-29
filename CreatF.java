
/*Содание файла с проверкой-доб библиотеки: import java.io.File; import java.io.IOException;..
try -создаем нов. файл и проверяем (if)-есть файл с таким именем-("example.txt") -если нет -создаем */

import java.io.File;
import java.io.IOException;
 

public class CreatF {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            if(file.createNewFile()){     //проверяем есть такой файл
                System.out.println("file- creatid");
            }

        } catch (IOException e){                   
        System.out.println("file-has already");
        }
    }
}
