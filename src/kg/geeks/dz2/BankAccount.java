package kg.geeks.dz2;

// b)  Написать класс BankAccount с 1 полем double amount - остаток на счете и методами
//  getAmount() - возвращает текущий остаток на счете, deposit(double sum)
//  - положить деньги на счет, withDraw(int sum) - снимает указанную сумму со счета.
// c)  Также метод withDraw() может сгенерировать исключение в том случае если запрашиваемая
// сумма на снятие больше чем остаток денег на счете.

import java.util.Scanner;

public class BankAccount extends Exception {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Недостаточно средств на вашем счете", amount );
            }else{
                amount -= sum;
            }
        }
    }
