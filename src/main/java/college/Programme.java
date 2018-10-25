package college;

import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Programme {

    private String courseName;
    private ArrayList modules;
    private ArrayList students;
    private LocalDate startDate;
    private  LocalDate endDate;

    public Programme(String courseName, LocalDate startDate, LocalDate endDate){
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public ArrayList getStudent(){
        return students;
    }

    public void addModules(Module module){
        modules.add(module);
    }

    public ArrayList getModules(){
        return students;
    }
}
