package com.ZLK.BanqueSI.Metier;

import com.ZLK.BanqueSI.Entities.Client;

import java.util.List;

public interface ClientMetier {


    public Client saveClient(Client c ) ;
    public List<Client> listClient() ;
}
