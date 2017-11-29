package com.ZLK.BanqueSI.Dao;

import com.ZLK.BanqueSI.Entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation , Long> {
}
