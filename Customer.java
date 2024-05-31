public class Customer extends User {
    private String contacinfo;

    public Customer(String username, String userID, String contacinfo) {
        super(username, userID);
        this.contacinfo = contacinfo;
    }

    @Override
    public void displayDetails() {
        System.out.println("Customer ID: " + getUserID());
        System.out.println("Customer Name: " + getUsername());
        System.out.println("Contact Info: " + contacinfo);
    }

    // getters
    public String getContactInfo() {
        return contacinfo;
    }

    public void setContactInfo(String contacinfo) {
        this.contacinfo = contacinfo;
    }

}
