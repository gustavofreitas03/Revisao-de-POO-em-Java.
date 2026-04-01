public class SavingsTest {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(0.04);

        for (int i = 1; i <= 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.println("Mês " + i);
            System.out.println("Saver1: " + saver1.getBalance());
            System.out.println("Saver2: " + saver2.getBalance());
        }

        SavingsAccount.modifyInterestRate(0.05);

        for (int i = 1; i <= 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.println("Mês " + i);
            System.out.println("Saver1: " + saver1.getBalance());
            System.out.println("Saver2: " + saver2.getBalance());
        }
    }
}