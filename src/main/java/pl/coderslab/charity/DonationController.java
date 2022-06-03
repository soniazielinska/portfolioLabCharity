package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DonationController {

    private final CategoryRepository categoryRepository;
    private final InstitutionRepository institutionRepository;

    public DonationController(CategoryRepository categoryRepository, InstitutionRepository institutionRepository) {
        this.categoryRepository = categoryRepository;
        this.institutionRepository = institutionRepository;
    }

    @GetMapping("/donation")
    public String donationForm(Model model, List<Category> categories) {
        model.addAttribute("donation", new Donation());
        List<Category> categoriesList = categoryRepository.findAll();
        model.addAttribute("categoriesList", categoriesList);
        List<Institution> institutions = institutionRepository.findAll();
        model.addAttribute("institutions", institutions);
        return "/donation/form";
    }

    @PostMapping("/donation")
    public String donation(Model model, Donation donation) {
        return "/donation/confirm";
    }
}
