import java.util.ArrayList;

public class Module {

    private String modulename;
    private String moduleID;
    private ArrayList students;

    public Module(String modulename, String moduleID){
        this.modulename = modulename;
        this.moduleID = moduleID;
    }

    public ArrayList getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
