package comparable;
import java.lang.Comparable;
public class Customer implements Comparable<Customer> {
    private String name;
    private String email;
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(Customer other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }
}
