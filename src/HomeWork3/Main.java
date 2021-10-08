package HomeWork3;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000.0);
        System.out.println(bankAccount.getAmount());
        while (true) {
            try {
                System.out.println(bankAccount.deposit(bankAccount.withDraw(6000)));
            } catch (LimitException e) {
                System.out.println(e.getMessage());
            }
            if (bankAccount.getAmount() == 2000) {
                System.out.println(bankAccount.deposit(bankAccount.getAmount() - 2000));
                System.out.println("Ваш счет пустой");
                break;
            }
        }
    }
}


