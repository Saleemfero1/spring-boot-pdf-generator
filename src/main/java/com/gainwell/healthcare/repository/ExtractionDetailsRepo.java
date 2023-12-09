package com.gainwell.healthcare.repository;

import com.gainwell.healthcare.model.ClientDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExtractionDetailsRepo extends JpaRepository<ClientDefinition, Long>{
}

