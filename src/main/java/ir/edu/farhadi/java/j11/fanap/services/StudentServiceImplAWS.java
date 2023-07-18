package ir.edu.farhadi.java.j11.fanap.services;

import ir.edu.farhadi.java.j11.fanap.model.Student;
import ir.edu.farhadi.java.j11.fanap.repository.StudentRepository;

import java.util.List;

public class StudentServiceImplAWS implements StudentService{
    private final StudentRepository studentRepository ;


    public StudentServiceImplAWS(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void save(Student student){
        if (student!=null){
            studentRepository.save(student);
        }
    }

    public Student update(Student student){
        if (student!=null){
            return studentRepository.update(student);
        }else{
            return null;
        }
    }
    public Student getById(Student student){
        if (student!=null){
            return studentRepository.findByID(student);
        }else{
            return null;
        }
    }

    public void delete(Student student){
        if (student!=null){
            studentRepository.delete(student);
        }
    }
    public List<Student> getAll(){
        return studentRepository.getAll();
    }

}
