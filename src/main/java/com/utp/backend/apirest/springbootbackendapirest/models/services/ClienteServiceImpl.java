package com.utp.backend.apirest.springbootbackendapirest.models.services;

import java.util.List;

import javax.transaction.Transactional;

import com.utp.backend.apirest.springbootbackendapirest.models.dao.IClienteDao;
import com.utp.backend.apirest.springbootbackendapirest.models.entity.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements IClienteService{

    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    public Cliente findById(Long id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        clienteDao.deleteById(id);
    }
    
}
