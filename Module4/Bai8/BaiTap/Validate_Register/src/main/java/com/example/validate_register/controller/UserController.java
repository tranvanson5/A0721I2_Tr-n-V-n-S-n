package com.example.validate_register.controller;

import com.example.validate_register.model.User;
import com.example.validate_register.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("")
    public String showView(@RequestParam("search") Optional<String> search,
                           @PageableDefault(5) Pageable pageable, Model model) throws Exception{
        Page<User> users;
        if(search.isPresent()){
            users= userRepository.searchAllByOrFistnameContainingOrLastnameContainingOrNumberphoneContainsOrEmailContainingOrAge(
                    search.get().trim(),
                    search.get().trim(),
                    search.get().trim(),
                    search.get().trim(),
                    Integer.parseInt(search.get().trim()),
                    pageable);
        } else{
            users=userRepository.findAll(pageable);
        }
        model.addAttribute("lists",users);
        return "views/list";
    }

   @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("user",new User());
        return "views/create";
    }
    @PostMapping("/save")
    public String create(@Validated @ModelAttribute("user") User user,
                         BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "views/create";
        }
        userRepository.save(user);
        return "redirect:/";
    }

}
