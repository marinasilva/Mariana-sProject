/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author marina.silva
 */
public class Teste {

    int id;
    Disciplina disciplina;
    Date dataGeracao;
    int numeroQuestoes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Date getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public int getNumeroQuestoes() {
        return numeroQuestoes;
    }

    public void setNumeroQuestoes(int numeroQuestoes) {
        this.numeroQuestoes = numeroQuestoes;
    }

    public Teste() {
    }
}
