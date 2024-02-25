package AllAboutStrings;

public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t    \n");


        //String inspection methods
        String helloWorld ="Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));

        //String comparison methods
        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)){
            System.out.println("Values match exactly");
        }
        if(helloWorldLower.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match ignoring case exactly");
        }
        if(helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }

        if(helloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }

        if(helloWorld.contains("World")){
            System.out.println("String contains World");
        }
        // Can compare StringBuilder values
        if(helloWorld.contentEquals("Hello World")){
            System.out.println("Values match exactly");
        }
    }
    //String Inspection methods
    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length is %d %n", length);
        if(string.isEmpty()){
            System.out.println("String is empty");
            return;
        }
        if(string.isBlank()){
            System.out.println("String is blank!");
        }
        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length-1));
    }


}
