package com.ZLK.BanqueSI.Metier;

import com.ZLK.BanqueSI.Entities.Compt;

import java.util.List;

public interface ComptMetier {

    public Compt saveCompt(Compt cp) ;
    public Compt  getCompte(String code);


}
