package com.ZLK.BanqueSI.Dao;

import com.ZLK.BanqueSI.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client , Long> {
}
