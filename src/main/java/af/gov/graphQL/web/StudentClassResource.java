package af.gov.graphQL.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import af.gov.graphQL.model.StudentClass;
import af.gov.graphQL.repository.StudentClassRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/studentClass/")
@AllArgsConstructor
public class StudentClassResource {
    private final StudentClassRepository studentClassRepository;

    @PostMapping("save")
 public ResponseEntity<StudentClass> save(@Valid @RequestBody StudentClass studentClass){
    
    return new ResponseEntity<StudentClass>(studentClassRepository.save(studentClass), HttpStatus.CREATED);
 }

 @GetMapping("viewAll")
 public List<StudentClass> viewAll(){
    return studentClassRepository.findAll();
 }


}
