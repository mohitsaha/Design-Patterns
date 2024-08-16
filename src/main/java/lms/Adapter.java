package lms;

public class Adapter {
    //to allow existing interface to work with other interface
    //where we need to adapt new interface with old one
    // my learning the old interface doesn't have same matching function so we create a class extending
    //old interface and have reference of new Class we want to call when same time of function is call;
}
interface OldPaymentGateway {
    boolean payThroughPaypal(double amount);
}

class PayPalGatway implements OldPaymentGateway {
    @Override
    public boolean payThroughPaypal(double amount) {
        System.out.println("payed via paypal");
        return true;
    }
}

class PaymentGatewayAdapter implements OldPaymentGateway {
    StripePaymentGateway stripePaymentGateway;
    PaymentGatewayAdapter(StripePaymentGateway stripePaymentGateway){
        this.stripePaymentGateway = stripePaymentGateway;
    }

    @Override
    public boolean payThroughPaypal(double amount) {
        return stripePaymentGateway.payThroughStripe(amount);
    }
}

class StripePaymentGateway{
    public boolean payThroughStripe(double amount){
        System.out.println("Payed thorugh Stripe");
        return true;
    }
}