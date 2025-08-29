package com.commit.release.plan.commit_release;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @GetMapping("/company")
    public String getDetails() {
        return "Welcome to Acme Corporation ";
    }
}
