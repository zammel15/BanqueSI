package com.ZLK.BanqueSI.Service;

import com.ZLK.BanqueSI.Entities.Client;
import com.ZLK.BanqueSI.Metier.ClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientRestService {

    @Autowired
    private ClientMetier clientMetier ;

    @RequestMapping(value = "/clients" , method = RequestMethod.POST)
    public Client saveClient(Client c) {
        return clientMetier.saveClient(c);
    }

    @RequestMapping(value = "/clients" , method = RequestMethod.GET)
    public List<Client> listClient() { return clientMetier.listClient(); }

}
