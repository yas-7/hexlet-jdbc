package hexlet.code.model;

public class User {
    private Long id;
    private final String username;
    private final String phone;

    @Override
    public String toString() {
        return "User{" +
               "id=" + id +
               ", name='" + username + '\'' +
               ", phone='" + phone + '\'' +
               '}';
    }

    public User(String name, String phone) {
        this.username = name;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getPhone() {
        return phone;
    }
}
