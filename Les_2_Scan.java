

import java.util.Scanner;
/**
 *  -Scanner - Ввод данных с клавиатуры
 */
public class Les_2_Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.println("Введите число:");
            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number);
            sc.close();
        }
    }
}