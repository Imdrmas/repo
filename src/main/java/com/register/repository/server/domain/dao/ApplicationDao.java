package com.register.repository.server.domain.dao;

import com.register.repository.server.domain.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationDao extends JpaRepository<Application, Long> {
    public Application findByName(String name);
}
