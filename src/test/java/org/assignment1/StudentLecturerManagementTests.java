package org.assignment1;
import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StudentLecturerManagementTests {

    private Student student;
    private Lecturer lecturer;

    @BeforeEach
    public void SetUp() {
        student = new Student("Conor Naughton", 21, 1);
        lecturer = new Lecturer("Conor Naughton", 21, 1);
    }

    @Test
    public void getUsername_ValidNameAndAge_ReturnsCorrectUsername() {
        String result = student.getUsername();
        assertEquals("Conor Naughton21", result);

        String result2 = lecturer.getUsername();
        assertEquals("Conor Naughton21", result2);
    }



    @Test
    public void getSetId_PassedAValidId_ReturnsId() {
        student.setId(10);
        long result = student.getId();
        assertEquals(10, result);
    }
}