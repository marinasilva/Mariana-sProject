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
public class Disciplina{

    int id;
    String nome;
    ArrayList<Materia> materiaList;

    public Disciplina(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Disciplina() {
        this.id = 0;
        this.nome = "";
        this.materiaList = new ArrayList<>();
    }
      
    public ArrayList<Materia> getMateriaList() {
        return materiaList;
    }

    public void setMateriaList(ArrayList<Materia> materiaList) {
        this.materiaList = materiaList;
    }
   
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
    
    @Override
    public String toString() {
        return nome;
    }
    
    
}
