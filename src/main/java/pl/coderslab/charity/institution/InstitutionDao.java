package pl.coderslab.charity.institution;

import org.springframework.stereotype.Repository;
import pl.coderslab.charity.category.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class InstitutionDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void addInstitution(Institution institution) {
        entityManager.persist(institution);
    }

    public void updateInstitution(Institution institution) {
        entityManager.merge(institution);
    }

    public void deleteInstitution(Institution institution) {
        entityManager.remove(entityManager.contains(institution) ?
                institution : entityManager.merge(institution));
    }

    public List<Category> findAllCategories() {
        return entityManager
                .createQuery("select i from Institution i")
                .getResultList();
    }
}
