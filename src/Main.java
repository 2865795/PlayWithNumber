import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");

        int inputted_number = scanner.nextInt();

        if (inputted_number >= 100 && inputted_number <= 999) {
            int units = inputted_number % 10;
            int tens = (inputted_number / 10) % 10;
            int hundreds = inputted_number / 100;
            int sum = units + tens + hundreds;
            System.out.println("Число единиц: " + units);
            System.out.println("Число десятков: " + tens);
            System.out.println("Сумма цифр указанного числа: " + sum);
        } else {
            System.out.println("Ошибка: введено не 3-значное число.");
        }
    }
}