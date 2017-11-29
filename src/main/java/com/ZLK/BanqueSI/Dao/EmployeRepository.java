package com.ZLK.BanqueSI.Dao;

import com.ZLK.BanqueSI.Entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe , Long> {
}
