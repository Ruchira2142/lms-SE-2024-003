package lms.model;

public class Student extends Member {
    public Student(String memberId, String name) {
        super(memberId, name, 3); // Students have a borrow limit of 3
    }
}