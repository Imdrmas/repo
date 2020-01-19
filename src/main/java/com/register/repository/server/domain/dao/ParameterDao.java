package com.register.repository.server.domain.dao;

import com.register.repository.server.domain.model.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterDao extends JpaRepository<Parameter, Long> {
}
