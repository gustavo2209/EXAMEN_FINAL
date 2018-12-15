package examen.modulo.api.controller;

import examen.common.api.controller.ResponseHandler;
import examen.modulo.application.StudentApplicationService;
import examen.modulo.domain.entity.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student/")
public class StudentController {
    @Autowired
    StudentApplicationService moduloApplicationService;
    
    @Autowired
    ResponseHandler responseHandler;
    
   @CrossOrigin(origins = "*")				
    @RequestMapping(method = RequestMethod.GET, value = "/searchStudent/{typeStudent}")
    public ResponseEntity<Object> findStudentByType(@PathVariable(value="typeStudent") String typeStudent){
        try {
            List<Student> abc = moduloApplicationService.findStudentByType(typeStudent);
            return ResponseEntity.ok().body(abc);
        } catch(IllegalArgumentException ex) {
            return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
        } catch(Exception ex) {
            return this.responseHandler.getAppExceptionResponse();
        }
    }
}
