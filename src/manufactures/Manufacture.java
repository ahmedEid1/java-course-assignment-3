package manufactures;

// Create class manufactures.Manufacture, with all setters and getters
public class Manufacture {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Manufacture() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        // sample validation
        if (address.isEmpty()) {
            throw new IllegalArgumentException("Invalid address!");
        }
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        // sample validation
        if (phoneNumber.length() < 10) {
            throw new IllegalArgumentException("Invalid phone number!");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // sample validation
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address!");
        }
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" + "name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + '}';
    }
}
