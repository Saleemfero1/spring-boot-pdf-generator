package com.gainwell.healthcare.service;

import com.gainwell.healthcare.model.ClientDefinition;
import com.gainwell.healthcare.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientDefinition> getAllClientDefinition() {
        List<ClientDefinition> clientDefinitions = new ArrayList<>();
        clientDefinitions = clientRepository.findAll();

        return clientDefinitions;
    }

    public String saveClientDefinition(ClientDefinition clientDefinition) {
        ClientDefinition savedClientDefinition = clientRepository.save(clientDefinition);
        if (savedClientDefinition == null) {
            throw new RuntimeException("ClientDefinition is not saved ");
        }
        return "Client Definition saved in DB";
    }

    public ClientDefinition getClientDefinitionById(Long clientId) {
        ClientDefinition clientDefinition = clientRepository.findById(clientId).get();
        if (clientDefinition == null) {
            throw new RuntimeException("Client definition is not found for clientId: " + clientId);
        }
        return clientDefinition;
    }

}
