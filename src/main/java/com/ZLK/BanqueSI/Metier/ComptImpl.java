package com.ZLK.BanqueSI.Metier;

import com.ZLK.BanqueSI.Dao.ComptRepository;
import com.ZLK.BanqueSI.Entities.Compt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComptImpl implements ComptMetier {
    @Autowired
    public ComptRepository comptRepository ;

    @Override
    public Compt saveCompt(Compt cp) {
        return  comptRepository.save(cp);
    }

    @Override
    public Compt getCompte(String code) {
        return comptRepository.findOne(Long.valueOf(code));
    }
}
