package HomeWork3;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        return amount = sum;
    }

    public double withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Запрашиваемая сумма больше чем сумма на счете", amount);
        }
        return getAmount() - sum;
    }
}
