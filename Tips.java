import java.util.Scanner;
public class Tips {
    public static void main(String[] args)
    {
        System.out.println("Welocome user type a money value.");
        Scanner input = new Scanner(System.in);

        double money = input.nextDouble();
        System.out.println(money);
        int dollars = (int) (money/1.0):
        int money = (money / 1.0);
        int quarters = (int) (money / 0.25);
        money = (money % 0.25);
        // System.out.println("Quarters = " + quarters);
        // System.out.println(money);
        int dimes = (int) (money / 0.10);
        money = (money % 0.10);
        // System.out.println("Quarters = " + quarters);
        // System.out.println("Dimes = " + dimes);
        // System.out.println(money);
        int nickles = (int) (money / 0.05);
        money = (money % 0.05);
        // System.out.println("Quarters = " + quarters);
        // System.out.println("Dimes = " + dimes);
        // System.out.println("nickles = " + nickles);
        // System.out.println(money);
        money = money + 0.001;
        int pennies = (int) (money / 0.01);
        money = (money % 0.01);

        int coins = quarters + dimes + nickles + pennies;

        System.out.println("The min amount of coins are = " + coins);

        System.out.println("Dollars = " + dollars);

        System.out.println("Quarters = " + quarters);

        System.out.println("Dimes = " + dimes);

        System.out.println("nickles = " + nickles);

        System.out.println("pennies = " + pennies);
        // System.out.println(money);

    }
}
