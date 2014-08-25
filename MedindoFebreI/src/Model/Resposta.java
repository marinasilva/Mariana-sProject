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
public class Resposta {

    int id;
    int idQuestão;
    String Resposta;
    Boolean correta;

    public Resposta() {
        this.id = 0;
        this.idQuestão = 0;
        this.Resposta = "";
        this.correta = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdQuestão() {
        return idQuestão;
    }

    public void setIdQuestão(int idQuestão) {
        this.idQuestão = idQuestão;
    }

    public String getResposta() {
        return Resposta;
    }

    public void setResposta(String Resposta) {
        this.Resposta = Resposta;
    }

    public Boolean isCorreta() {
        return correta;
    }

    public void setCorreta(Boolean correta) {
        this.correta = correta;
    }

}
