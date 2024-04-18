package af.gov.graphQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import af.gov.graphQL.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

    
}
