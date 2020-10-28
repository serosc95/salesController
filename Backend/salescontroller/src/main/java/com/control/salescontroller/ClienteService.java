package com.control.salescontroller;

import java.util.List;

public interface ClienteService {
    Cliente add(Cliente p);
    int search(Cliente p);
    List<Cliente>listar();
}
