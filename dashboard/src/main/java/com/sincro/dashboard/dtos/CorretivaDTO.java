package com.sincro.dashboard.dtos;

import com.sincro.dashboard.entities.ManutencaoCorretiva;

public class CorretivaDTO {
    private Integer id;
    private Integer emAndamento;
    private Integer concluidos;
    private Integer tecnicosCorretiva;
    private Integer iscas;
    private Integer baus;
    private Integer travas;
    private Integer agendadosCorretiva;
    private Integer realizadosCorretiva;
    private Integer pendentesCorretiva;
    private Integer emManutencaoCorretiva;
    private Integer vencidosCorretiva;

    public CorretivaDTO() {
    }

    public CorretivaDTO(Integer id, Integer emAndamento, Integer concluidos, Integer tecnicosCorretiva, Integer iscas, Integer baus, Integer travas, Integer agendadosCorretiva, Integer realizadosCorretiva, Integer pendentesCorretiva, Integer emManutencaoCorretiva, Integer vencidosCorretiva) {
        this.id = id;
        this.emAndamento = emAndamento;
        this.concluidos = concluidos;
        this.tecnicosCorretiva = tecnicosCorretiva;
        this.iscas = iscas;
        this.baus = baus;
        this.travas = travas;
        this.agendadosCorretiva = agendadosCorretiva;
        this.realizadosCorretiva = realizadosCorretiva;
        this.pendentesCorretiva = pendentesCorretiva;
        this.emManutencaoCorretiva = emManutencaoCorretiva;
        this.vencidosCorretiva = vencidosCorretiva;
    }
    public CorretivaDTO(ManutencaoCorretiva manutencaoCorretiva) {
        this.id = manutencaoCorretiva.getId();
        this.emAndamento = manutencaoCorretiva.getEmAndamento();
        this.concluidos = manutencaoCorretiva.getConcluidos();
        this.tecnicosCorretiva = manutencaoCorretiva.getTecnicosCorretiva();
        this.iscas = manutencaoCorretiva.getIscas();
        this.baus = manutencaoCorretiva.getBaus();
        this.travas = manutencaoCorretiva.getTravas();
        this.agendadosCorretiva = manutencaoCorretiva.getAgendadosCorretiva();
        this.realizadosCorretiva = manutencaoCorretiva.getRealizadosCorretiva();
        this.pendentesCorretiva = manutencaoCorretiva.getPendentesCorretiva();
        this.emManutencaoCorretiva = manutencaoCorretiva.getEmManutencaoCorretiva();
        this.vencidosCorretiva = manutencaoCorretiva.getVencidosCorretiva();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getEmAndamento() {
        return emAndamento;
    }

    public void setEmAndamento(Integer emAndamento) {
        this.emAndamento = emAndamento;
    }

    public Integer getConcluidos() {
        return concluidos;
    }

    public void setConcluidos(Integer concluidos) {
        this.concluidos = concluidos;
    }

    public Integer getTecnicosCorretiva() {
        return tecnicosCorretiva;
    }

    public void setTecnicosCorretiva(Integer tecnicosCorretiva) {
        this.tecnicosCorretiva = tecnicosCorretiva;
    }

    public Integer getIscas() {
        return iscas;
    }

    public void setIscas(Integer iscas) {
        this.iscas = iscas;
    }

    public Integer getBaus() {
        return baus;
    }

    public void setBaus(Integer baus) {
        this.baus = baus;
    }

    public Integer getTravas() {
        return travas;
    }

    public void setTravas(Integer travas) {
        this.travas = travas;
    }

    public Integer getAgendadosCorretiva() {
        return agendadosCorretiva;
    }

    public void setAgendadosCorretiva(Integer agendadosCorretiva) {
        this.agendadosCorretiva = agendadosCorretiva;
    }

    public Integer getRealizadosCorretiva() {
        return realizadosCorretiva;
    }

    public void setRealizadosCorretiva(Integer realizadosCorretiva) {
        this.realizadosCorretiva = realizadosCorretiva;
    }

    public Integer getPendentesCorretiva() {
        return pendentesCorretiva;
    }

    public void setPendentesCorretiva(Integer pendentesCorretiva) {
        this.pendentesCorretiva = pendentesCorretiva;
    }

    public Integer getEmManutencaoCorretiva() {
        return emManutencaoCorretiva;
    }

    public void setEmManutencaoCorretiva(Integer emManutencaoCorretiva) {
        this.emManutencaoCorretiva = emManutencaoCorretiva;
    }

    public Integer getVencidosCorretiva() {
        return vencidosCorretiva;
    }

    public void setVencidosCorretiva(Integer vencidosCorretiva) {
        this.vencidosCorretiva = vencidosCorretiva;
    }
}
