package af.gov.graphQL.web;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import af.gov.graphQL.exception.SaveException;
import af.gov.graphQL.model.Student;
import af.gov.graphQL.repository.StudentRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class StudentResource {
   private final StudentRepository studentRepository;
//    @PostMapping("save")
//     public ResponseEntity<String> save(@Valid @RequestBody Student student){
//         try {
//             studentRepository.save(student); 
//         } catch (Exception e) {
//             throw new SaveException("data not saved please try again");
//         }
          
//            return new ResponseEntity<String>("successfully saved", HttpStatus.CREATED);
//     }

    @QueryMapping
    public Iterable<Student> findAllStudent(){
        return studentRepository.findAll();
    }

    
    
}
