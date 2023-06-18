package com.gestion.service.api.dataaccess.dao;

import com.gestion.service.api.dataaccess.entities.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AdherentDao extends JpaRepository<Adherent, Long> {
    @Query(value = "select a from Adherent a where a.Id = :id")
    Adherent getAdherentById(@Param("id") Long id);
}
