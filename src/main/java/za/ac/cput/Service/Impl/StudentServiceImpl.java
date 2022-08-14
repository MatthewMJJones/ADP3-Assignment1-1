package za.ac.cput.Service.Impl;
/**
 *
 * Keziah Robinson
 * 219113149
 * Student Service Implementation
 *
 *
 */
import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Entity.Student;
import za.ac.cput.Repository.StudentAccountRepository;
import za.ac.cput.Repository.StudentRepository;
import za.ac.cput.Service.StudentService;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
private static StudentRepository studentRepository;
private static StudentAccountRepository studentAccountRepository;
private List<Student> studentList;
private static StudentService studentService;

public StudentServiceImpl(){
    this.studentRepository = StudentServiceImpl.studentRepository;
}
    public static StudentService getService(){
        if(studentService == null){
            studentService = new StudentServiceImpl();
        }
        return studentService;
    }

    @Override
    public Student save(Student student) {
        if(student.equals(null)) {
            studentRepository.save(student);
        }else{
            System.out.println("Student added");
        }
        this.studentList.add(student);
        return student;
    }


    @Override
    public Optional<Student> read(Student student) {
        return this.studentList
                .stream()
                .filter(a -> a.getStudentID().equals(student))
                .findFirst();
    }

    @Override
    public Student update(Student student) {
        if (student != null){
            studentRepository.delete(student);
            studentRepository.save(student);
        }
        return student;
    }

    @Override
    public void delete(Student student) {
        if(student.equals(student)) {
            studentRepository.delete(student);
        }else{
            System.out.println("Student does not exist ");
        }


    }

    @Override
    public List<Student> readAll() {
        return this.studentRepository.readAll();
    }
}
