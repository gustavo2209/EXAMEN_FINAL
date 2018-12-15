package examen.modulo.domain.repository;

import examen.modulo.domain.entity.Student;
import java.util.List;


public interface StudentRepository {
    List<Student> getAll() throws Exception;
    List<Student> findStudentByType(String typeStudent) throws Exception;
}
