package ua.yarynych.sms.service.impl;

import org.springframework.stereotype.Service;
import ua.yarynych.sms.entity.Student;
import ua.yarynych.sms.repository.StudentRepository;
import ua.yarynych.sms.service.StudentService;

import java.util.List;

@Service
class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.update(student);
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentRepository.deleteById(id);
    }

}
