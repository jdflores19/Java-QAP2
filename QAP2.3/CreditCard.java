// QAP 3.1: CreditCard.java
// Joseph Flores
// May 28, 2024

// The CreditCard class is used to create a CreditCard object, which has an owner, limit, and balance

public class CreditCard {
    private Person owner;
    private Money limit;
    private Money balance;

    public CreditCard(Person owner, Money limit) {
        this.owner = owner;
        this.limit = limit;
        this.balance = new Money(0);
    }

    public Money getBalance() {
        return this.balance;
    }

    public Money getCreditLimit() {
        return this.limit;
    }

    public String getPersonals() {
        return this.owner.toString();
    }

    // Check if the new balance exceeds the credit limit, then charge the amount
    public void charge(Money amount) {
        Money checkNewBalance = new Money(this.balance).add(amount);
        if (checkNewBalance.compareTo(this.limit) > 0) {
            System.out.println("Exceeds credit limit");
        } else {
            System.out.println("Charge: $" + amount);
            this.balance = checkNewBalance;
        }
    }

    // public void charge(Money amount) {
    //     if (this.balance.getAmount() + amount.getAmount() > this.limit.getAmount()) {
    //         System.out.println("Exceeds credit limit");
    //     } else {
    //         System.out.println("Charge: $" + amount);
    //         this.balance.add(amount);
    //     }
    // }

    public void payment(Money amount) {
        if (amount.compareTo(this.balance) > 0) {
            System.out.println("Payment exceeds current balance");
        } else {
            this.balance.subtract(amount);
        }
    }
}