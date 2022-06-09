package pl.coderslab.charity.institution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {

    Institution findInstitutionById(Long id);
    Institution findInstitutionByName(String name);

}
