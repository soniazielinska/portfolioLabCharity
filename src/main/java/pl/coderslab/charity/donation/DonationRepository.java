package pl.coderslab.charity.donation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface DonationRepository extends JpaRepository<Donation, Long> {
    Donation findDonationById(Long id);
    @Query("select sum(d.quantity) from Donation d")
    Integer sumOfDonationQuantities();
    @Query("select count(d) from Donation d where d.quantity is not null")
    Integer donationsNumber();

}
