package com.sincro.dashboard.controllers;

import com.sincro.dashboard.dtos.PreventivaDTO;
import com.sincro.dashboard.services.PreventivaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/preventiva")
public class PreventivaController {

    @Autowired
    PreventivaService service;

    @GetMapping
    public List<PreventivaDTO> buscarTodasManutencoes(){
        List<PreventivaDTO> list = service.buscarTodos();
        return list;
    }

}
