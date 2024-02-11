package SystemDesign.DesignPattern.FactoryDesignPattern.ServiceLocatorFactoryBean;


// Must watch :- https://www.youtube.com/watch?v=dO3jN9CkwWI&t=190s


// Below code won't run, it is just for sample purpose
// to make it runnable use SpringBoot Project
public class ServiceLocatorExample {

   static PaymentRegistry paymentRegistry;
    public static void main(String[] args) {
        String paymentMethodName;
        String amount;
        System.out.println("Please Provide your PaymentMethod name");
        paymentMethodName = "";
        amount = "";

        String paymentStatus = getPaymentFactoryBean(paymentMethodName, amount);
    }

    private static String getPaymentFactoryBean(String paymentMethodName, String amount) {
        return paymentRegistry.getServiceBean(paymentMethodName).pay(amount);
    }
}
