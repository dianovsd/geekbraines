package adapter;

public class Main {

    public static void main(String[] args) {
        MeteoStore meteoStore = new MeteoStore();
        MS200 ms200 = new MS200(3445);

        meteoStore.save(ms200);

        ST500 st500 = new ST500(4111);
        meteoStore.save(new AdapterST500(st500));


    }

}
