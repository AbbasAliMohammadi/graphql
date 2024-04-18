package af.gov.graphQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import af.gov.graphQL.model.StudentClass;

public interface StudentClassRepository extends JpaRepository<StudentClass,Long>{
    
}
