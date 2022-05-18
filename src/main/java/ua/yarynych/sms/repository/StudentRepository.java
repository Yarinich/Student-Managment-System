package ua.yarynych.sms.repository;

import org.springframework.stereotype.Repository;
import ua.yarynych.sms.entity.Student;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private final List<Student> students = new ArrayList<>();

    public StudentRepository() {
        if(students.isEmpty()) {
            students.add(new Student(students.size(), "TEF", "TI-92", "Vitalii", "Yarynych ", "yagorinich@ukr.net"));
        }
    }

    public List<Student> findAll() {
        return students;
    }

    public Student save(Student student) {
        student.setId(students.size());
        students.add(student);
        return student;
    }


    public Student findById(Integer id) {
        return students.get(id);
    }


    public void deleteById(Integer id) {
        Student student = findById(id);
        students.remove(student);
    }

    public Student update(Student student) {
        students.add(student);
        return student;
    }
}