package com.sincro.dashboard.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ManutencaoPreventiva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer manutencao;
    private Integer espera;
    private Integer agendado;
    private Integer tecnicosPreventiva;
    private Integer realizados;
    private Integer pendentes;

    public ManutencaoPreventiva() {
    }

    public ManutencaoPreventiva(Integer id, Integer manutencao, Integer espera, Integer agendado, Integer tecnicosPreventiva, Integer realizados, Integer pendentes) {
        this.id = id;
        this.manutencao = manutencao;
        this.espera = espera;
        this.agendado = agendado;
        this.tecnicosPreventiva = tecnicosPreventiva;
        this.realizados = realizados;
        this.pendentes = pendentes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getManutencao() {
        return manutencao;
    }

    public void setManutencao(Integer manutencao) {
        this.manutencao = manutencao;
    }

    public Integer getEspera() {
        return espera;
    }

    public void setEspera(Integer espera) {
        this.espera = espera;
    }

    public Integer getAgendado() {
        return agendado;
    }

    public void setAgendado(Integer agendado) {
        this.agendado = agendado;
    }

    public Integer getTecnicosPreventiva() {
        return tecnicosPreventiva;
    }

    public void setTecnicosPreventiva(Integer tecnicosPreventiva) {
        this.tecnicosPreventiva = tecnicosPreventiva;
    }

    public Integer getRealizados() {
        return realizados;
    }

    public void setRealizados(Integer realizados) {
        this.realizados = realizados;
    }

    public Integer getPendentes() {
        return pendentes;
    }

    public void setPendentes(Integer pendentes) {
        this.pendentes = pendentes;
    }
}
