import java.io.File;
import java.io.IOException;
 

public class CreatF {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            if(file.createNewFile()){
                System.out.println("file- creatid");
            }

        } catch (IOException e){
        System.out.println("file-has already");
        }
    }
}
