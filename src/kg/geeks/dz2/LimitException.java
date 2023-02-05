package kg.geeks.dz2;

//a)Написать класс проверяемого исключения LimitException, с конструктором LimitException(String message,
//   double remainingAmount) и методом getRemainingAmount().

public class LimitException extends Exception {

    private double remainingAmount;
    private String message;

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public LimitException( String message, double remainingAmount) {
        this.message = message;
        this.remainingAmount = remainingAmount;

    }
}
