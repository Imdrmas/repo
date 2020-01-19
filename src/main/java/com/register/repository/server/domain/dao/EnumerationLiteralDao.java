package com.register.repository.server.domain.dao;

import com.register.repository.server.domain.model.EnumerationLiteral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnumerationLiteralDao extends JpaRepository<EnumerationLiteral, Long> {
}
