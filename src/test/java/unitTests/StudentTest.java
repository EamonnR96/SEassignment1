package unitTests;

import college.Student;
import org.joda.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    private final Student jim = new Student("Jim Bob",
            new LocalDate("1990-1-1"),
            15480402);

    @Test
    public void getUsername() throws Exception {
        assertEquals(jim.getUsername(), "Jim Bob28");
    }
}