import com.google.gson.Gson;

public class GsonBuild {
    Gson gson;

    public GsonBuild() {
        gson = new Gson();
    }
    public<T> String serial(T object){
        return gson.toJson(object);
    }
    public Person deSerial(String json){
        return gson.fromJson(json, Person.class);
    }
}
