public class App {
    public static void main(String[] args) {
        // Create an instance of the Lab class
        LoginLab lab = new LoginLab();

        // Test the login method with different usernames and passwords
        System.out.println("Login attempt with 'admin' and 'qwerty': " + lab.login("admin", "qwerty"));
        System.out.println("Login attempt with 'user' and 'password': " + lab.login("user", "password"));
        System.out.println("Login attempt with 'admin' and 'wrongPassword': " + lab.login("admin", "wrongPassword"));
        System.out.println("Login attempt with 'user' and 'wrongPassword': " + lab.login("user", "wrongPassword"));
        System.out.println("Login attempt with 'guest' and 'password': " + lab.login("guest", "password"));
    }
}