public class Customer {
    private String idCustomer;
    private String email;
    private String phone;
    private String firstName;
    private String lastName;
    private String driverLicense;

    public Customer(String idCustomer, String email, String phone, String firstName, String lastName, String driverLicense) {
        this.idCustomer = idCustomer;
        this.email = email;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.driverLicense = driverLicense;
    }

    public void updateDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer='" + idCustomer + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", driverLicense='" + driverLicense + '\'' +
                '}';
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }
}
