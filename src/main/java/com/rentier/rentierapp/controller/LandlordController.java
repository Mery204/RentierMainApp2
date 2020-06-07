package com.rentier.rentierapp.controller;

import com.rentier.rentierapp.model.Landlord;
import com.rentier.rentierapp.service.LandlordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/landlord")
public class LandlordController {
    @Autowired
    private LandlordService landlordService;

    @GetMapping("/add")
    public String landlordAdd(Model model) {
        model.addAttribute("newLandlord", new Landlord());
        return "landlord_form";
    }

    @PostMapping("/add")
    public String landlordAdd(Landlord landlord) {

        landlordService.add(landlord);
        return "redirect:/landlord/list";
    }


}
