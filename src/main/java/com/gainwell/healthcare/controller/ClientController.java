package com.gainwell.healthcare.controller;

import com.gainwell.healthcare.model.ClientDefinition;
import com.gainwell.healthcare.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<List<ClientDefinition>> getAllClientDefinition(){
        return new ResponseEntity<>(clientService.getAllClientDefinitions(), HttpStatus.OK);
    }
    @GetMapping("/data")
    public ResponseEntity<List<Object[]>> getAllClientData(){
        return new ResponseEntity<>(clientService.getAllClientData(), HttpStatus.OK);
    }
    @GetMapping("/{clientId}")
    public ResponseEntity<ClientDefinition> getClientDefinitionById(@PathVariable("clientId") Long clientId){
        return new ResponseEntity<>(clientService.getClientDefinitionById(clientId), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<String> saveClientDefinition(@RequestBody ClientDefinition clientDefinition){
        return new ResponseEntity<>(clientService.saveClientDefinition(clientDefinition), HttpStatus.OK);
    }
}
