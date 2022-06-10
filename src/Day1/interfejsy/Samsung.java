package Day1.interfejsy;

public class Samsung implements PhoneInterface {

    public void dialNumber(int number) {
        System.out.println("samsung dial " + number);
    }

    public void sendSMS(String sms) {
        System.out.println("samsung sms " + sms);
    }

    public void connectSamsungCloud() {
        System.out.println("samsung cloud");
    }

}
