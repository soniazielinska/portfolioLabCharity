package pl.coderslab.charity.institution;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InstitutionController {

    private final InstitutionRepository institutionRepository;

    public InstitutionController(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }

    @GetMapping("/institution/create")
    public String createInstitutionForm(Model model) {
        model.addAttribute("institution", new Institution());
        return "/institution/create";
    }

    @PostMapping("/institution/create")
    public String createInstitution(Model model, Institution institution) {
        institutionRepository.save(institution);
        return "/institution/list";
    }
}
