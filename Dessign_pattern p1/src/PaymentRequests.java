import java.util.HashMap;

public class PaymentRequests {

    private  final int amount;
    private  final String currency;
    private final int paymentMethodID;
    private  final int customerId;
    private  final String description ;
    private final String statementDescriptor ;
    private  final HashMap<String, String> metadata ;
    public enum captureMethod{AUTOMATIC,MANUAL} ;
    private final captureMethod capmeth;
    private  final boolean isOffSession ;

    public PaymentRequests(PaymentRequestsBuilder builder){


        this.amount = builder.amount;
        this.currency = builder.currency;
        this.paymentMethodID = builder.paymentMethodID;
        this.customerId = builder.customerId;
        this.description = builder.description;
        this.statementDescriptor = builder.statementDescriptor;
        this.metadata = builder.metadata;
        this.isOffSession = builder.isOffSession;
        this.capmeth = builder.capmeth;

    };

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public int getPaymentMethodID() {
        return paymentMethodID;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getDescription() {
        return description;
    }

    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    public HashMap<String, String> getMetadata() {
        return metadata;
    }

    public captureMethod getCapmeth() {
        return capmeth;
    }

    public boolean isOffSession() {
        return isOffSession;
    }

    public static class PaymentRequestsBuilder {

        private  int amount;
        private String currency;
        private int paymentMethodID;
        private int customerId;
        private String description ;
        private String statementDescriptor ;
        private   HashMap<String, String> metadata = new HashMap<>() ;;
        private PaymentRequests.captureMethod capmeth;
        private boolean isOffSession ;

        public PaymentRequestsBuilder (int amount,String currency) {
            this.amount = amount;
            this.currency = currency;
        }

        public PaymentRequestsBuilder setAmount(int amount) {
            this.amount = amount;
            return this;
        }

        public PaymentRequestsBuilder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public PaymentRequestsBuilder setPaymentMethodID(int paymentMethodID) {
            this.paymentMethodID = paymentMethodID;
            return this;
        }

        public PaymentRequestsBuilder setCustomerId(int customerId) {
            this.customerId = customerId;
            return this;
        }

        public PaymentRequestsBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public PaymentRequestsBuilder setStatementDescriptor(String statementDescriptor) {
            this.statementDescriptor = statementDescriptor;
            return this;
        }

        public PaymentRequestsBuilder setMetadata(String key, String value) {
            this.metadata.put(key, value);
            return this;
        }


        public PaymentRequestsBuilder setCapmeth(PaymentRequests.captureMethod capmeth) {
            this.capmeth = capmeth;
            return this;
        }

        public PaymentRequestsBuilder setOffSession(boolean offSession) {
            isOffSession = offSession;
            return this;
        }

        public PaymentRequests build() {
            return new PaymentRequests(this);

        }

    }



}
