package SingletonPattern;

public class Singleton {

    public static void main(String[] args) {
        PropertyResourceHolder propertyResourceHolder = PropertyResourceHolder.getInstance();
        PropertyResourceHolder propertyResourceHolder1 = PropertyResourceHolder.getInstance();
        
        DateUtil dateUtil = DateUtil.INSTANCE;
        System.out.println(dateUtil.getValue());
        dateUtil.setValue(5);
        System.out.println(dateUtil.getValue());
        
    }
}
