/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author marina.silva
 */
public class Questao {

    int id;
    int bimestre;
    int idMateria;
    String pergunta;
    ArrayList<Resposta> respostas;
    
    public Questao() {
     id = 0;
     bimestre = 0;
     pergunta = "";
     respostas = new ArrayList<>(4);
    }

    public Questao(int id, int bimestre, int idMateria, String pergunta) {
        this.id = id;
        this.bimestre = bimestre;
        this.idMateria = idMateria;
        this.pergunta = pergunta;
        respostas = new ArrayList<>(4);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBimestre() {
        return bimestre;
    }

    public void setBimestre(int bimestre) {
        this.bimestre = bimestre;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public void addAnswer(Resposta resposta) {
        if(respostas.size() >= 4) 
            throw new IndexOutOfBoundsException("Não é permitido mais que 4 respostas.");
        //Demais validações
        respostas.add(resposta);
    }

    public ArrayList<Resposta> getRespostas() {
        return respostas;
    }    
}
