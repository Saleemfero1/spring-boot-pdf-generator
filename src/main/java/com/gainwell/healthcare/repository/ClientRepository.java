package com.gainwell.healthcare.repository;

import com.gainwell.healthcare.model.ClientDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientDefinition, Long> {
}
