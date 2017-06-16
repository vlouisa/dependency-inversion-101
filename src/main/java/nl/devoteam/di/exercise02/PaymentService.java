package nl.devoteam.di.exercise02;


public class PaymentService {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.chargeCreditCard(200);
    }

    public void chargeCreditCard(int amount){
        VisaCard visa = new VisaCard();
        visa.charge(amount);
    }

}
