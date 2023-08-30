package validate_phone_number;

public class PhoneNumberExampleTest {
    private static PhoneNumberExample phoneNumberExample;
    public static final String[] validPhoneNumber = new String[]{"(85)-(0954789658)", "(84)-(0925486987)", "(84)-(0658965748)"};
    public static final String[] invalidPhoneNumber = new String[]{"(8b)-(0965874587)", "(84)-(2589647895)", "(84)-(12345678912)"};

    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        for (String phone : validPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(phone);
            System.out.println("Phone number is " + phone + " is valid: " + isvalid);
        }

        for (String phone : invalidPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(phone);
            System.out.println("Phone number is " + phone + " is valid: " + isvalid);
        }
    }
}
