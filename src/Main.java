public class Main {
    public static void main(String[] args) {
        double balance = 500;
        double refill = 1500;
        int oneBonusRuble = 100;
        int minRefillForBonus = 1000;
        int totalBonus;
        double newBalance;

        if (refill <= minRefillForBonus) {
            totalBonus = 0;
        } else {
            totalBonus = (int) (refill / oneBonusRuble);
        }

        newBalance = balance + refill + totalBonus;

        System.out.println("Ваш баланс после пополнения счета составляет " + newBalance + " рублей. Вам начислено " + totalBonus + " бонусных рублей.");
    }
}
