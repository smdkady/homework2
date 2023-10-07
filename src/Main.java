import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int startingBalance = 1000;
        int refill = 2100;
        int bonus = 0;

        if (refill > 1000) {
            bonus = refill / 100;
        }
        int finalBalance = startingBalance + refill + bonus;
        System.out.println("Баланс " + finalBalance);
        System.out.println("Получен(о) бонус(ов) " + bonus);

    }
}
