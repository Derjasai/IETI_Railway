package edu.escuelaing.ieti.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {
    @GetMapping("/")
    public String getStatus(){
        return "Daniel Esteban Ramos Jiemenez";
    }
}
