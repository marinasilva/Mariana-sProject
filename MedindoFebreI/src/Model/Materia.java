/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author marina.silva
 */
public class Materia {

  int id;
  String nome;
  int idDisciplina;
  int serie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getidDisciplina() {
        return idDisciplina;
    }

    public void setidDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Materia() {
    }    
}
