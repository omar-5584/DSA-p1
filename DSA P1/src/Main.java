//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    PaymentRequests p1=new PaymentRequests.PaymentRequestsBuilder(50,"LE").build();

    PaymentRequests p2=new PaymentRequests.PaymentRequestsBuilder(60,"USD")
            .setCustomerId(40)
            .setPaymentMethodID(30)
            .build();

PaymentRequests p3=new PaymentRequests.PaymentRequestsBuilder(21,"UE")
        .setMetadata("omar","ibrahim")
        .setDescription("like it")
        .setCapmeth(PaymentRequests.captureMethod.AUTOMATIC)
        .build();


   

}
