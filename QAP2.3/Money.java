// QAP 3.1: Money.java
// Joseph Flores
// May 28, 2024

// The Money class is used to create a Money object, which has an amount
// The Money object is used in the CreditCard class

public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = (long) ((amount - this.dollars) * 100);
    }

    public Money(Money money) {
        this.dollars = money.getDollars();
        this.cents = money.getCents();
    }

    public long getDollars() {
        return this.dollars;
    }

    public long getCents() {
        return this.cents;
    }

    public double getAmount() {
        return this.dollars + this.cents / 100.0;
    }

    public Money add(Money money) {
        this.dollars += money.getDollars();
        this.cents += money.getCents();
        if (this.cents >= 100) {
            this.dollars++;
            this.cents -= 100;
        }
        return this;
    }
    
    public Money subtract(Money money) {
        this.dollars -= money.getDollars();
        this.cents -= money.getCents();
        if (this.cents < 0) {
            this.dollars--;
            this.cents += 100;
        }
        return this;
    }

    public int compareTo(Money money) {
        if (this.dollars > money.getDollars() || (this.dollars == money.getDollars() && this.cents > money.getCents())) {
            return 1;
        } else if (this.dollars < money.getDollars() || (this.dollars == money.getDollars() && this.cents < money.getCents())) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public boolean equals(Money money) {
        return this.dollars == money.getDollars() && this.cents == money.getCents();
    }

    // public void add(Money money) {
    //     this.dollars += money.getDollars();
    //     this.cents += money.getCents();
    //     if (this.cents >= 100) {
    //         this.dollars++;
    //         this.cents -= 100;
    //     }
    // }

    // public void subtract(Money money) {
    //     this.dollars -= money.getDollars();
    //     this.cents -= money.getCents();
    //     if (this.cents < 0) {
    //         this.dollars--;
    //         this.cents += 100;
    //     }
    // }

    @Override
    public String toString() {
        return String.format("%d.%02d", this.dollars, this.cents);
    }
}

// public class Money {
//     private double amount;

//     public Money(double amount) {
//         this.amount = amount;
//     }

//     public double getAmount() {
//         return this.amount;
//     }

//     public void add(Money money) {
//         this.amount += money.getAmount();
//     }

//     public void subtract(Money money) {
//         this.amount -= money.getAmount();
//     }

//     @Override
//     public String toString() {
//         return String.format("%.2f", this.amount);
//     }
// }