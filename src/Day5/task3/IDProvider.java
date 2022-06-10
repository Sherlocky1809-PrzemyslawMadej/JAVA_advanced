package Day5.task3;

public class IDProvider {

    private static IDProvider instance;

    private int id;

    private IDProvider() {
    }

    public static IDProvider getInstance() {
        if (instance == null) {
            instance = new IDProvider();
        }
        return instance;
    }

    public int getId() {
        return id;
    }
}
