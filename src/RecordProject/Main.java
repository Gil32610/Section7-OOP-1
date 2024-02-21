package RecordProject;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            Student s = new Student("S572432" + i,
                    switch (i) {
                        case 1 -> "red";
                        case 2 -> "carolina";
                        case 3 -> "eduarda";
                        case 4 -> "cecilia";
                        case 5 -> "helena";
                        default -> "dunno";
                    },
                    "21/02/2000",
                    "Library");
            System.out.println(s);
        }
    }
}
