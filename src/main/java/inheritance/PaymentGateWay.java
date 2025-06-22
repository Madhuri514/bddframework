package inheritance;

class PaymentGateWayDemo {
    public static void main(String[] args) {
        CCAvenue b1 = new ICICI();
        b1.payMoney(100);
    }
}

class CCAvenue{
    public void payMoney(int n){

    }
}
class HDFC extends CCAvenue{
    public void payMoney(int n){
        System.out.println("deal is 1 %");
        double totalCCAvenueAmount = ((double)n * 1)/100;
        System.out.println("Paying ccavaneue - " + totalCCAvenueAmount);
    }
}

class ICICI extends CCAvenue{
    public void payMoney(int n){
        System.out.println("deal is 2 %");
        double totalCCAvenueAmount = ((double)n * 2)/100;
        System.out.println("Paying ccavaneue - " + totalCCAvenueAmount);
    }

    public void homeloan(){

    }
}
