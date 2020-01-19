package com.register.repository.server.domain.dao;

import com.register.repository.server.domain.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationDao extends JpaRepository<Operation, Long> {
}
