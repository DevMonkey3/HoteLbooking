public abstract class User {

    protected String username;
    protected String userID;

    public User(String username, String userID) {
        this.username = username;
        this.userID = userID;
    }

    // abstract method
    public abstract void displayDetails();

    // headers and getters
    public String getUsername() {
        return username;
    }

    public String getUserID() {
        return userID;

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
