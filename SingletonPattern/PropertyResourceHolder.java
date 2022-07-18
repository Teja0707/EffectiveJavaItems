package SingletonPattern;

public class PropertyResourceHolder {

    public static PropertyResourceHolder instance;

    private PropertyResourceHolder() {
        System.out.println("PRH instance created");
    }

    public static PropertyResourceHolder getInstance(){
        if(instance == null) {
           instance = new PropertyResourceHolder();
        }
        return instance;
    }

}
