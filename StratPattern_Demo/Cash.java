package StratPattern_Demo;
public class Cash implements PaymentType{

    @Override
    public String calculatePayment() {
        String output = new String();
        output += "Payment is Cash\n";
        output += "No incentives";
        
        return output;
    }
    
}
