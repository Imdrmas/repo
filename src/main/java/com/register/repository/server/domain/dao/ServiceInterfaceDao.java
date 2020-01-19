package com.register.repository.server.domain.dao;

import com.register.repository.server.domain.model.ServiceInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceInterfaceDao extends JpaRepository<ServiceInterface, Long> {
}
