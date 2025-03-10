package task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;

    public Customer(String firstName, String username) {
        this.firstName = firstName;
        this.username = username;
        counter++;
        this.id = counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Customer.counter = counter;
    }

    @Override
    public String toString() {
        return "Customer \n" +
                "First name: " + firstName + '\n' +
                "Last name:" + lastName + '\n' +
                "Username: " + username + '\n' +
                "ID: " + id +
                '\n';
    }
}
