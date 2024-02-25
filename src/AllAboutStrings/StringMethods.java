package AllAboutStrings;

public class StringMethods {
    public static void main(String[] args) {

        //String manipulation methods
        String birthDate = "05/06/2002";
        int startingIndex = birthDate.indexOf("2002");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "05", "06", "2002");
        System.out.println("newDate = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("06");
        newDate = newDate.concat("/");
        newDate = newDate.concat("2002");
        System.out.println("newDate = " + newDate);

        newDate = "05" + "/" + "06" + "/" + "2002";
        System.out.println("newDate = " + newDate);

        //method chaining
        newDate = "05".concat("/").concat("06").concat("/").concat("2002");
        System.out.println("newDate = " + newDate);

        System.out.println("newDate = " + newDate.replace('/','-'));
        System.out.println("newDate = " + newDate.replace("2","00"));

        System.out.println("newDate = " + newDate.replaceFirst("/","-"));
        System.out.println("newDate = " + newDate.replaceAll("/","---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
