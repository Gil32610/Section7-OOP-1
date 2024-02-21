package RecordProject;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            LPAStudent s = new LPAStudent("S572432" + i, switch (i) {
                case 1 -> "red";
                case 2 -> "carolina";
                case 3 -> "eduarda";
                case 4 -> "cecilia";
                case 5 -> "helena";
                default -> "dunno";
            }, "21/02/2000", "Library");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S42341", "Ann",
                "06/07/98", "JavaMasterClass");
        LPAStudent recordStudent = new LPAStudent("S514134", "Bill",
                "12/04/2001", "JavaMasterClass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        //recordStudent.setClassList();

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

    }
}
