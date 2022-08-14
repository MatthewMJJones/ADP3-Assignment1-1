package za.ac.cput.Service;

/**
 *
 * Keziah Robinson
 * 219113149
 * Student Service
 *
 *
 */

import za.ac.cput.Domain.Entity.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService extends IService<Student, String>{
    public Student save(Student student);
    public Optional<Student> read(Student student);
    public void delete(Student student);
    public Student update(Student student);
    public List<Student> readAll();
}
