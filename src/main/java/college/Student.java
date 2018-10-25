package college;

import org.joda.time.*;

import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private LocalDate dOB;
    private long iD;
    private String username;
    private ArrayList courses;
    private ArrayList modules;

    public Student(String name, LocalDate dOB, long iD) {
        this.name = name;
        this.dOB = dOB;
        this.iD = iD;
    }

    public String getUsername() {
        getAge();
        username = name + age;
        return username;
    }

    private void getAge() {
        LocalDate currentDate = new LocalDate();
        Years agejd = Years.yearsBetween(dOB, currentDate);
        age = agejd.getYears();
    }

    public void addCourse(Programme course) {
        courses.add(course);
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public ArrayList getCourses() {
        return courses;
    }

    public ArrayList getModules() {
        return modules;
    }
}

