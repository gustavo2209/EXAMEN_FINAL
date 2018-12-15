package examen.modulo.application;


import examen.common.application.Notification;
import examen.modulo.domain.entity.Student;
import examen.modulo.domain.repository.StudentRepository;
import examen.modulo.domain.service.StudentDomainService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class StudentApplicationService {
    @Autowired
    private StudentDomainService moduloDomainService;
    @Autowired
    private StudentRepository moduloRepository;
    
    public List<Student> findStudentByType(String typeStudent) throws Exception{
        Notification notification = this.validation(typeStudent);
        if (notification.hasErrors()) {
            throw new IllegalArgumentException(notification.errorMessage());
        }
        return moduloRepository.findStudentByType(typeStudent);
    }
   
    private Notification validation(String typeStudent) {
        Notification notification = new Notification();
        if (typeStudent == null) {
            notification.addError("Type not valid");
            return notification;
        }
        return notification;
    }
}
