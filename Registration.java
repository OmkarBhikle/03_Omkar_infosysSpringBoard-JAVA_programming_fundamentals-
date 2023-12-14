public class Registration {
    String customerName;
    String panCardNo;
    int voterId;
    String passportNo;
    int license;
    long[] telephoneNo;

    Registration(String customerName, String passportNo, long[] telephoneNo) {
        this.customerName = customerName;
        this.passportNo = passportNo;
        this.telephoneNo = telephoneNo;
    }

    Registration(String customerName, int license, String panCardNo, long[] telephoneNo) {
        this.customerName = customerName;
        this.license = license;
        this.panCardNo = panCardNo;
        this.telephoneNo = telephoneNo;
    }

    Registration(String customerName, int voterId, int license, long[] telephoneNo) {
        this.customerName = customerName;
        this.voterId = voterId;
        this.license = license;
        this.telephoneNo = telephoneNo;
    }

    Registration(String customerName, String panCardNo, int voterId, long[] telephoneNo) {
        this.customerName = customerName;
        this.panCardNo = panCardNo;
        this.voterId = voterId;
        this.telephoneNo = telephoneNo;
    }

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

    public int getLicense() {
        return license;
    }

    public long[] getTelephoneNo() {
        return telephoneNo;
    }

    public void display() {
        this.customerName = getCustomerName();
        this.panCardNo = getPanCardNo();
        this.voterId = getVoterId();
        this.passportNo = getPassportNo();
        this.license = getLicense();
        this.telephoneNo = getTelephoneNo();
        System.out.println("Congratulations " + customerName + "!!! you have been successfully registered for our services with the following details:");
        if(panCardNo != null) {
            System.out.println("Pancard No. : " + panCardNo);
        }
        if(voterId != 0) {
            System.out.println("Voter Id : " + voterId);
        }
        if(passportNo != null) {
            System.out.println("Passport No. : " + passportNo);
        }
        if(license != 0) {
            System.out.println("License No. : " + license);
        }
        if(telephoneNo != null) {
            System.out.println("Telephone No. : " + telephoneNo);
        }
    }

    public static void main(String[] args) {
        long[] phone = {9452425421L, 7676765252L};
        Registration x = new Registration("Kevin", "MN9891N", phone);
        x.display();

        long[] phone2 = {2345615451L, 6763562562L};
        Registration y = new Registration("Julias", 123, "PN7878", phone2);
        y.display();
    }
}
