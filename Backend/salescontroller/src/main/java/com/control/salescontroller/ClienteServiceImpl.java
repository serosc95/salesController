package com.control.salescontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository clientRepository;

    @Override
    public Cliente add(Cliente p) {
        if(clientRepository.findAllByIdentificacion(p.getIdentificacion()).isEmpty()) {
            return clientRepository.save(p);
        } else {
            return null;
        }
    }

    @Override
    public List<Cliente> listar() {
        return clientRepository.findAll();
    }

    @Override
    public int search(Cliente p) {
        if(clientRepository.findAllByIdentificacion(p.getIdentificacion()).isEmpty()) {
            return 0;
        } else {
            return p.getIdentificacion();
        }
    }
    
}
