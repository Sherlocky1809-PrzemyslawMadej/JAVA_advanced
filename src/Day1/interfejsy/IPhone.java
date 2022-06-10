package Day1.interfejsy;

public class IPhone implements PhoneInterface {

    public void dialNumber(int number) {
        System.out.println("i phone dial " + number);
    }

    public void sendSMS(String sms) {
        System.out.println("i phone sms " + sms);
    }

    public void startNavigationApp() {
        System.out.println("iphone gps");
    }

}
