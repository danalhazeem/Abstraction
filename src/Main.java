import person.*;
public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("danah", "Mathematics", "aljazaer High School");
        teacher.describeRole();
        teacher.conductClass(); // Now accessible
    }
}
