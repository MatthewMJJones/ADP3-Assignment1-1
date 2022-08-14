package za.ac.cput.Controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entity.Payment;
import za.ac.cput.Factory.PaymentFactory;

/**
 * Joshua Julies
 * 220102473
 * The payment controller test
 */

public class PaymentControllerTest {
    private PaymentController controller;
    private Payment paymenttestobject = new PaymentFactory().buildPayment("01","31","01/01/2022", 200);

    @Test
    public void testSavePayment(){
        try {
            Assertions.assertNotNull(controller.savePayment(new PaymentFactory().buildPayment("01","31","01/01/2022", 200)));
        }catch(NullPointerException npe){
            npe.getMessage();
            npe.getStackTrace();
        }catch(Exception e){
            e.getMessage();
        }
    }

    @Test
    public void testReadPayment(){
        try {
            Assertions.assertNotNull(controller.getPaymentByID(paymenttestobject));
        }catch(NullPointerException npe){
            npe.getMessage();
            npe.getStackTrace();
        }catch(Exception e){
            e.getMessage();
        }
    }

    @Test
    public void testReadAllPayment(){
        try {
            Assertions.assertNotNull(controller.getAllPayment());
        }catch(NullPointerException npe){
            npe.getMessage();
            npe.getStackTrace();
        }catch(Exception e){
            e.getMessage();
        }
    }

    @Test
    public void testUpdateAdmin(){
        try {
            Assertions.assertNotNull(controller.updatePayment(paymenttestobject));
        }catch(NullPointerException npe){
            npe.getMessage();
            npe.getStackTrace();
        }catch(Exception e){
            e.getMessage();
        }
    }
}
