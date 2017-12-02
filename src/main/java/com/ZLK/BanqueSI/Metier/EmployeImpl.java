package com.ZLK.BanqueSI.Metier;

import com.ZLK.BanqueSI.Dao.EmployeRepository;
import com.ZLK.BanqueSI.Entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.soap.Addressing;
import java.util.List;

@Service
public class EmployeImpl implements EmployeMetier {

    @Autowired
    private EmployeRepository employeRepository ;

    @Override
    public Employe saveEmplye(Employe e) {
        return  employeRepository.save(e);
    }

    @Override
    public List<Employe> listEmploye() {
        return employeRepository.findAll();
    }
}
