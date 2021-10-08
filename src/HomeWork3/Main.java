package HomeWork3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        while (true) {
            System.out.println("Введите сумму на вашем счете");
            double amount = scanner.nextDouble();
            bankAccount.deposit(amount);
            if (amount == 0) {
                break;
            }
            System.out.println("Сколько денег вы хотите снять со счета?");
            int sum = scanner.nextInt();
            try {
                System.out.println("Ваш счет " + bankAccount.withDraw(sum));
            } catch (LimitException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

