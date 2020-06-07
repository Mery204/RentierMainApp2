package com.rentier.rentierapp.controller;

import com.rentier.rentierapp.model.Tenant;
import com.rentier.rentierapp.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/tenant")
public class TenantController {
    @Autowired
    private TenantService tenantService;

    @GetMapping("/add")
    public String tenantAdd(Model model) {
        model.addAttribute("newTenant", new Tenant());
        return "tenant_form";
    }

    @PostMapping("/add")
    public String tenantAdd(Tenant tenant) {

        tenantService.add(tenant);
        return "redirect:/tenant/list";
    }
}