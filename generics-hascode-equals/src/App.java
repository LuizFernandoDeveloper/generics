import model.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("Maria", "maria@gamil.com");
        Cliente c2 = new Cliente("Alex", "alex@gamil.com");

        System.out.println(c1.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c2.hashCode());
        System.out.println(c2.equals(c1));
    }
}
