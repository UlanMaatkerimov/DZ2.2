package kg.geeks.dz2;


// d)  Написать Main класс где бы создавался счет клиента. Положить 20 000 сом на счет.
//  e)  Затем попытаться снять через бесконечный цикл, каждую итерацию по 6000 сом,
// при этом отлавливать исключение LimitException и при возникновении такого исключения
//снимать только ту сумму, которая осталась на счете и завершать бесконечный цикл

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LimitException{
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        System.out.println("На вашем балансе: " + bankAccount.getAmount() + " сом");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int balance = scanner.nextInt();
            try {
                bankAccount.withDraw(balance);
                System.out.println("Вы сняли " + balance + " сом");

            } catch (LimitException e) {
                System.out.println("Недостаточно средств на вашем счётё! Снято : " + e.getRemainingAmount() + " сом");
                bankAccount.withDraw((int) e.getRemainingAmount());
                break;
            }
            System.out.println(bankAccount.getAmount());



        }

    }
}