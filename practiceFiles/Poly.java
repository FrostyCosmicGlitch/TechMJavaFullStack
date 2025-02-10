class Payment{
    void pay(){
        System.out.println("This is a payment");
    }
}

class CreditCardPayment extends Payment{
    void pay(){
        System.out.println("This is a Credit card payment");
    }
}

class PayPalPayment extends Payment{
    void pay(){
        System.out.println("This is a PayPal payment");
    }
}

class UPIPayment extends Payment{
    void pay(){
        System.out.println("This is a UPI payment");
    }
}

public class Poly{
    public static void main(String[] args){
        Payment [] cont={

            new CreditCardPayment(),
            new PayPalPayment(),
            new UPIPayment()
        };
        for (Payment a:cont ){
            a.pay();
        }

    }
}
