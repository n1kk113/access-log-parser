import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("Введите первое число и нажмите <Enter>: ");
       int num1 = new Scanner(System.in).nextInt();
       System.out.println("Введите второе число и нажмите <Enter>: ");
       int num2 = new Scanner(System.in).nextInt();

       int sum = num1 + num2;
       int difference = num1 - num2;
       int product = num1 * num2;
       double quotient = (double) num1 / num2;

       System.out.println("Сумма: " + sum);
       System.out.println("Разность: " + difference);
       System.out.println("Произведение: " + product);
       System.out.println("Частное: " + quotient);
    }
}