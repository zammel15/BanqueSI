package com.ZLK.BanqueSI.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CodeClient ;

    private String NomClient ;

    @OneToMany(mappedBy = "client" , fetch = FetchType.LAZY) //les compte seront chargen lorsque je le besoin
    private Collection<Compt> compts ; //chaque clinet peut avoir plusieur comptes


    public Client() {
    }

    public Client(String nomClient) {
        NomClient = nomClient;
    }

    public Long getCodeClient() {
        return CodeClient;
    }

    public void setCodeClient(Long codeClient) {
        CodeClient = codeClient;
    }

    public String getNomClient() {
        return NomClient;
    }

    public void setNomClient(String nomClient) {
        NomClient = nomClient;
    }

    public Collection<Compt> getCompts() {
        return compts;
    }

    public void setCompts(Collection<Compt> compts) {
        this.compts = compts;
    }
}
