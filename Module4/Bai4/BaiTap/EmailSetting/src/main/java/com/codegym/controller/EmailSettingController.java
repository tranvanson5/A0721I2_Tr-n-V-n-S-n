package com.codegym.controller;

import com.codegym.Service.EmailSettingService;
import com.codegym.Service.IEmailSettingService;
import com.codegym.model.EmailSetting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailSettingController {
    private IEmailSettingService service=new EmailSettingService();
    @GetMapping("")
    public ModelAndView view(){
        ModelAndView modelAndView=new ModelAndView("index");
       modelAndView.addObject("lists",service.findAll());
        return modelAndView;
    }
    @GetMapping("update/{id}")
    public ModelAndView showUpdate(@PathVariable int id){
        ModelAndView modelAndView=new ModelAndView("update");
        modelAndView.addObject("update",service.finById(id));
        return modelAndView;
    }
    @PostMapping("save")
    public ModelAndView update(EmailSetting emailSetting){
        service.save(emailSetting);
        ModelAndView modelAndView= new ModelAndView("redirect:/");
        return modelAndView;
    }
}
