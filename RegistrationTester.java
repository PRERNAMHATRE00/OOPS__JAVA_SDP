 class Registration {
    private String customerName;
    private String panCardNo;
    private int voterId;
    private String passportNo;
    private int licenseNo;
    private long[] telephoneNo;

    // Constructor with customerName, passportNo, and telephoneNo
    public Registration(String customerName, String passportNo, long[] telephoneNo) {
        this.customerName = customerName;
        this.passportNo = passportNo;
        this.telephoneNo = telephoneNo;
    }

    // Constructor with customerName, licenseNo, panCardNo, and telephoneNo
    public Registration(String customerName, int licenseNo, String panCardNo, long[] telephoneNo) {
        this.customerName = customerName;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
        this.telephoneNo = telephoneNo;
    }

    // Constructor with customerName, voterId, licenseNo, and telephoneNo
    public Registration(String customerName, int voterId, int licenseNo, long[] telephoneNo) {
        this.customerName = customerName;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
        this.telephoneNo = telephoneNo;
    }

    // Constructor with customerName, panCardNo, voterId, and telephoneNo
    public Registration(String customerName, String panCardNo, int voterId, long[] telephoneNo) {
        this.customerName = customerName;
        this.panCardNo = panCardNo;
        this.voterId = voterId;
        this.telephoneNo = telephoneNo;
    }

    // Getter methods
    public String getCustomerName() {
        return customerName;
    }

    public String getPanCardNo() {
        return panCardNo;
    }

    public int getVoterId() {
        return voterId;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public int getLicenseNo() {
        return licenseNo;
    }

    public long[] getTelephoneNo() {
        return telephoneNo;
    }
}

public class RegistrationTester {
    public static void main(String[] args) {
        // Example registrations
        long[] numbers1 = {9452425421L, 7676765252L};
        Registration reg1 = new Registration("Kevin", "MN989IN", numbers1);

        long[] numbers2 = {2345615451L, 6763562562L};
        Registration reg2 = new Registration("Julias", 123, "PN7878", numbers2);

        long[] numbers3 = {9634524353L, 9887373737L};
        Registration reg3 = new Registration("Jammy", 765, 45453, numbers3);

        long[] numbers4 = {9867456367L, 7645367356L};
        Registration reg4 = new Registration("Rose", "PN8934", 34356, numbers4);

        // Displaying registered details
        displayRegistrationDetails(reg1);
        displayRegistrationDetails(reg2);
        displayRegistrationDetails(reg3);
        displayRegistrationDetails(reg4);
    }

    public static void displayRegistrationDetails(Registration registration) {
        System.out.println("Congratulations " + registration.getCustomerName() + "!!! you have been successfully registered for our services with the following details:");
        if (registration.getPassportNo() != null) {
            System.out.println("Passport number: " + registration.getPassportNo());
        } else if (registration.getPanCardNo() != null && registration.getLicenseNo() != 0) {
            System.out.println("License number: " + registration.getLicenseNo());
            System.out.println("Pan card number: " + registration.getPanCardNo());
        } else if (registration.getVoterId() != 0 && registration.getLicenseNo() != 0) {
            System.out.println("Voter id: " + registration.getVoterId());
            System.out.println("License number: " + registration.getLicenseNo());
        } else if (registration.getPanCardNo() != null && registration.getVoterId() != 0) {
            System.out.println("Pan card number: " + registration.getPanCardNo());
            System.out.println("Voter id: " + registration.getVoterId());
        }
        System.out.println("Phone numbers:");
        for (long number : registration.getTelephoneNo()) {
            System.out.println(number);
        }
        System.out.println();
    }
}
