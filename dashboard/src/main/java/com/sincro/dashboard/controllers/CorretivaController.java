package com.sincro.dashboard.controllers;

import com.sincro.dashboard.dtos.CorretivaDTO;
import com.sincro.dashboard.services.CorretivaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/corretiva")
public class CorretivaController {

    @Autowired
    CorretivaService service;

    @GetMapping
    public List<CorretivaDTO> buscarTodasManutencoes(){
        List<CorretivaDTO> list = service.buscarTodos();
        return list;
    }
}
