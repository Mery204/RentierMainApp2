package com.rentier.rentierapp.controller;

import com.rentier.rentierapp.model.Premises;
import com.rentier.rentierapp.service.PremisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/premises")
public class PremisesController {
    @Autowired
    private PremisesService premisesService;

    @GetMapping("/add")
    public String premisesAdd(Model model) {
        model.addAttribute("newPremises", new Premises());
        return "premises_form";
    }

    @PostMapping("/add")
    public String premisesAdd(Premises premises) {

        premisesService.add(premises);
        return "redirect:/landlord/list";
    }
}
