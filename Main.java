import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random randomNumber = new Random();

        Scanner scanner = new Scanner(System.in);
        int userAnswer = 0;
        int correctNumber3 = 1;

        while (!(userAnswer == correctNumber3)) {
            int randomNumber1 = randomNumber.nextInt(0, 101);
            int randomNumber2 = randomNumber.nextInt(0, 101);
            correctNumber3 = randomNumber1 + randomNumber2;
            System.out.println("Введите сумму чисел: " + randomNumber1 + " + " + randomNumber2);
         userAnswer = scanner.nextInt();
            System.out.println("Ваш ответ: " + userAnswer + " " + "Верный ответ:" + " " + correctNumber3);
        }
        System.out.println("Ура, вы ответили верно! <3");


   }
}