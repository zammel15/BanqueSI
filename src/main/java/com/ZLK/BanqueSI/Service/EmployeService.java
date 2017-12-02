package com.ZLK.BanqueSI.Service;


import com.ZLK.BanqueSI.Entities.Employe;
import com.ZLK.BanqueSI.Metier.EmployeMetier;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeService {


    @Autowired
    private EmployeMetier employeMetier ;

    @RequestMapping(value = "/employes" , method = RequestMethod.POST )
    public Employe saveEmplye( @RequestBody Employe e) {
        return employeMetier.saveEmplye(e);
    }

    @RequestMapping(value = "/employes" , method = RequestMethod.GET)
    public List<Employe> listEmploye() {
        return employeMetier.listEmploye();
    }



}
