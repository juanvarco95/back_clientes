package com.utp.backend.apirest.springbootbackendapirest.models.services;

import java.util.List;

import com.utp.backend.apirest.springbootbackendapirest.models.entity.Cliente;

public interface IClienteService {
    
    public List<Cliente> findAll();

    public Cliente findById(Long id);
    
    public Cliente save(Cliente cliente);

    public void delete(Long id);


}
