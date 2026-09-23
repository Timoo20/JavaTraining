public class GraduateStudent extends Student {
    String thesisTitle;

    public GraduateStudent(String name, String regNo, String thesisTitle) {
        super(name, regNo);
        this.thesisTitle = thesisTitle;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Reg No: " + regNo);
        System.out.println("Thesis: " + thesisTitle);
    }
}
