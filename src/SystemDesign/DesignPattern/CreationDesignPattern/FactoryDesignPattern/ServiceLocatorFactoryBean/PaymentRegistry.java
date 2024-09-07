package SystemDesign.DesignPattern.FactoryDesignPattern.ServiceLocatorFactoryBean;

public interface PaymentRegistry {
    PaymentService getServiceBean(String paymentMethod);
}
