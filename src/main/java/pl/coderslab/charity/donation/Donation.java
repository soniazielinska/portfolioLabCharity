package pl.coderslab.charity.donation;

import lombok.Data;
import pl.coderslab.charity.institution.Institution;
import pl.coderslab.charity.category.Category;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@Table(name = "donations")
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;
    @OneToMany
    private List<Category> categories;
    @OneToOne
    private Institution institution;
    private String street;
    private String city;
    private String zipCode;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private String pickUpComment;
    private String phoneNumber;



}
