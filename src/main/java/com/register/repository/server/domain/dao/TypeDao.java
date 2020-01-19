package com.register.repository.server.domain.dao;

import com.register.repository.server.domain.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeDao extends JpaRepository<Type, Long> {
}
