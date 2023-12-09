package com.gainwell.healthcare.repository;

import com.gainwell.healthcare.model.ClientDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<ClientDefinition, Long> {
    @Query("SELECT cd.clientKey, cd.clientLabel FROM ClientDefinition cd INNER JOIN ExtractionDetails ed ON (cd.clientKey = ed.clientKey) WHERE cd.clientKey = 103")
    List<Object[]> getAllClientData();

}
//select ed.taxonomy_node_key ,ed.taxonomy_node_value  from client_definition cd inner join extraction_details ed on cd.client_key = ed.client_key where cd.client_key = 101;

//@Query("SELECT cd.clientKey, cd.clientLabel FROM ClientDefinition cd, ExtractionDetails ed  WHERE cd.clientKey = ed.clientKey AND cd.clientKey = 101")
//List<Object[]> getAllClientData();