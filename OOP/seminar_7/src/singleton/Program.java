package singleton;

public class Program {

    public static void main(String[] args) {

        Settings settings1 = Settings.getInstance();

        Settings settings2 = Settings.getInstance();

        //Settings settings3 = new Settings("AAA", 12, false);

    }

}
