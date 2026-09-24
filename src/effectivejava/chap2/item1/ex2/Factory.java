package effectivejava.chap2.item1.ex2;

 interface Payment {
    void pay();
}

class CryptoPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Paid with Crypto");
    }
}

class PaypalPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Paid with Paypal");
    }
}

class PaymentFactory {
    public static Payment getPayment(String className) throws Exception {
        Class<?> klasse = Class.forName(className);
        return (Payment) klasse
                .getDeclaredConstructor()
                .newInstance();
    }
}

class FakeFactory extends PaymentFactory {
    public static Payment getPayment(String className) {
        System.out.println(className);
        return null;
    }
}
public class Factory{
    static void main(String[] args) {
        try {
            Payment p1 = PaymentFactory.getPayment("PaypalPayment");
            Payment p2 = PaymentFactory.getPayment("CryptoPayment");
            p1.pay();
            p2.pay();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
