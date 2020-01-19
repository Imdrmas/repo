package com.register.repository.server.domain.dao;

import com.register.repository.server.domain.model.Enumeration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnumerationDao extends JpaRepository<Enumeration, Long> {
}
