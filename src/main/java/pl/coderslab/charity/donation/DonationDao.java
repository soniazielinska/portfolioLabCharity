package pl.coderslab.charity.donation;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class DonationDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void addDonation(Donation donation) {
        entityManager.persist(donation);
    }

    public void updateDonation(Donation donation) {
        entityManager.merge(donation);
    }

    public void deleteDonation(Donation donation) {
        entityManager.remove(entityManager.contains(donation) ?
                donation : entityManager.merge(donation));
    }

}
