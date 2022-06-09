package pl.coderslab.charity.category;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CategoryDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void addCategory(Category category) {
        entityManager.persist(category);
    }

    public void updateCategory(Category category) {
        entityManager.merge(category);
    }

    public void deleteCategory(Category category) {
        entityManager.remove(entityManager.contains(category) ?
                category : entityManager.merge(category));
    }

    public List<Category> findAllCategories() {
        return entityManager
                .createQuery("select c from Category c")
                .getResultList();
    }
}
