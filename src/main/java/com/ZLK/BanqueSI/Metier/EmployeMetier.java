package com.ZLK.BanqueSI.Metier;


import com.ZLK.BanqueSI.Entities.Employe;

import java.util.List;

public interface EmployeMetier {

    public Employe saveEmplye(Employe e) ;
    public List<Employe> listEmploye() ;

}
