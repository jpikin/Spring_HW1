import com.google.gson.Gson;


public class App {
    public static void main(String[] args) {
        Person person = new Person("Ivan", "Ivanov", 34);


        GsonBuild gson = new GsonBuild();

        String serial = gson.serial(person);

        Person deSerialPerson = gson.deSerial(serial);

        System.out.println(deSerialPerson);






    }
}
