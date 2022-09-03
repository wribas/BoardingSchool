package application;

public class Application {
    private String name;
    private String email;

    public Application(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return " " +
                name +
                ", email: " +
                email;
    }
}
