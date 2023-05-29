package it.extrared.bookstorev2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    
    @GetMapping("/book")
    public String bookForm(Model model){
        model.addAttribute("book", new BookModel());
        return "bookview";
    }

    @PostMapping("/book")
    public String bookSubmit(@ModelAttribute BookModel book, Model model){
        model.addAttribute("book", book);
        return "bookresult";
    }
    
}