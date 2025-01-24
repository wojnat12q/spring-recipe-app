package guru.springframework.recepiapp.controllers;

import guru.springframework.recepiapp.domain.Category;
import guru.springframework.recepiapp.domain.UnitOfMeasure;
import guru.springframework.recepiapp.repositories.CategoryRepository;
import guru.springframework.recepiapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
        private CategoryRepository categoryRepository;
        private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
        public String getIndexPage() {
            Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
            Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Cup");

        //System.out.println("Cat Id is: " + categoryOptional.get().getId()+"\nUnit Of Measure is: " + unitOfMeasureOptional.get().getId());
            return "index";
        }
}
