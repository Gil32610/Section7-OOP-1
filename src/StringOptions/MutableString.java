package StringOptions;

public class MutableString {
    public static void main(String[] args) {


        //concat() returns a completely new String
        //new Strings are created in memory for every call and literals
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        //append() changes the object in memory
        //no need to assign the values after method calls
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorldBuilder);
        printInformation(helloWorld);

        //initial capacity of StringBuilder is 16
        StringBuilder emptyStart = new StringBuilder();
        //capacity will be increased
        emptyStart.append("a".repeat(57));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart32);
        printInformation(emptyStart);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        //chaining delete and insert
        builderPlus.deleteCharAt(16).insert(16,'g');
        printInformation(builderPlus);

        builderPlus.replace(16, 17, "G");
        printInformation(builderPlus);

        //Truncates to specific length
        builderPlus.reverse().setLength(7);
        printInformation(builderPlus);



    }
    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("String = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
