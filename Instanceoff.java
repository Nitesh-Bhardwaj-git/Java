public class Instanceoff {
    public static void main(String[] args) {
        String name1 = "Ganga";
        String name2 = "Amazon";
        Object obj = new Object();

        // Check if name1 is an instance of String
        boolean statement1 = name1 instanceof String;
        System.out.println("name1 is an instance of String: " + statement1);

        // Check if name2 is an instance of String
        boolean statement2 = name2 instanceof String;
        System.out.println("name2 is an instance of String: " + statement2);

        // Check if obj is an instance of String
        boolean statement3 = obj instanceof String;
        System.out.println("obj is an instance of String: " + statement3);

        // Check if obj is an instance of Object
        boolean statement4 = obj instanceof Object;
        System.out.println("obj is an instance of Object: " + statement4);
    }
}
