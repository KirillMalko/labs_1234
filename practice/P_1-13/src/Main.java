//Составить программу, которая требует ввести два числа. Если первое число
//        больше второго, то программа печатает слово больше. Если первое число меньше
//        второго, то программа печатает слово меньше. А если числа равны, программа
//        напечатает сообщение Эти числа равны.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("First number.");
            int firstNumber = scanner.nextInt();
            System.out.println("Second number.");
            int secondNumber = scanner.nextInt();
            if (firstNumber > secondNumber) {
                System.out.println("Больше.");
            } else if (firstNumber < secondNumber) {
                System.out.println("Mеньше.");
            } else if (firstNumber == secondNumber) {
                System.out.println("Эти числа равны.");
            }
        }

    }

}