package com.register.repository.server.domain.dao;

import com.register.repository.server.domain.model.ApplicationComponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationComponentDao extends JpaRepository<ApplicationComponent, Long>  {
}
