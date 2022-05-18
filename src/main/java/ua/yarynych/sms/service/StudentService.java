package ua.yarynych.sms.service;

import ua.yarynych.sms.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Integer id);

    Student updateStudent(Student student);

    void deleteStudentById(Integer id);
}

