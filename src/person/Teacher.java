package person;
public class Teacher extends Person {
    private String subject;
    private String school;


    public Teacher(String name, String subject, String school) {
        super(name);
        this.subject = subject;
        this.school = school;
    }

    @Override
    public void describeRole() {
        System.out.println(getName() + " is an teacher teach " + subject+" in "+school);
    }
    public void conductClass() {
        System.out.println(getName() + " is conducting a " + subject + " class.");
    }

}