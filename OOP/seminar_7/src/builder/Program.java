package builder;

public class Program {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("AAA");
        String s = stringBuilder
                .append("BB")
                .append("CCC")
                .insert(2, "DDD")
                .append("EEEE")
                .toString();

        System.out.println(s);

        Order order = new OrderBuilder()
                .setProductId(10012)
                .setProductName("AAAAAAA")
                .setPrice(100.15)
                .setQnt(2)
                .setClientName("BBBBB")
                .build();

    }

}
