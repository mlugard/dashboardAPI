package com.sincro.dashboard.services;

import com.sincro.dashboard.dtos.PreventivaDTO;
import com.sincro.dashboard.entities.ManutencaoPreventiva;
import com.sincro.dashboard.repositories.PreventivaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PreventivaService {

    @Autowired
    private PreventivaRepository repository;

public List<PreventivaDTO> buscarTodos(){
    List<ManutencaoPreventiva> list = repository.findAll();
    return list.stream().map(x -> new PreventivaDTO(x)).collect(Collectors.toList());
}

}
