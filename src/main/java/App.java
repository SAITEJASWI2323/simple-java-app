public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Java CI/CD Application Started...");
        
        for (int i = 0; i < 5; i++) {
            Thread.sleep(5000);
            System.out.println("Hello from Java CI/CD Pipeline!");
        }
    }
}