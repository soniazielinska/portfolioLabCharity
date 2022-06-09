package pl.coderslab.charity.donation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.charity.institution.Institution;
import pl.coderslab.charity.institution.InstitutionRepository;
import pl.coderslab.charity.category.Category;
import pl.coderslab.charity.category.CategoryRepository;

import java.util.List;

@Controller
public class DonationController {

    private final CategoryRepository categoryRepository;
    private final InstitutionRepository institutionRepository;
    private final DonationDao donationDao;

    public DonationController(CategoryRepository categoryRepository, InstitutionRepository institutionRepository, DonationDao donationDao) {
        this.categoryRepository = categoryRepository;
        this.institutionRepository = institutionRepository;
        this.donationDao = donationDao;
    }

    @GetMapping("/donation")
    public String donationForm(Model model) {
        model.addAttribute("donation", new Donation());
        List<Category> categoriesList = categoryRepository.findAll();
        model.addAttribute("categoriesList", categoriesList);
        List<Institution> institutionsList = institutionRepository.findAll();
        model.addAttribute("institutionsList", institutionsList);
        return "/donation/form";
    }

    @PostMapping("/donation")
    public String donation(Donation donation) {
        donationDao.addDonation(donation);
        return "/donation/confirm";
    }
}
