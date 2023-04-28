package com.sincro.dashboard.services;

import com.sincro.dashboard.entities.ManutencaoCorretiva;
import com.sincro.dashboard.dtos.CorretivaDTO;
import com.sincro.dashboard.repositories.CorretivaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CorretivaService {

    @Autowired
    private CorretivaRepository repository;

    public List<CorretivaDTO> buscarTodos(){
        List<ManutencaoCorretiva> list = repository.findAll();
        return list.stream().map(x -> new CorretivaDTO(x)).collect(Collectors.toList());
    }
}
