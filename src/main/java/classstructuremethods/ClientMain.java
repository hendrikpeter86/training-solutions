package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Peter");
        client.setAddress("Veresegyház");
        client.setYear(1986);

        System.out.println(client.getName() + ", " + client.getAddress() + ", " + client.getYear());

        client.migrate("Budapest");

        System.out.println(client.getAddress());


    }
}
