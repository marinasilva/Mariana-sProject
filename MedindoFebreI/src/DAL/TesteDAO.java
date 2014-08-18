/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Disciplina;
import Model.Teste;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marina.silva
 */
public class TesteDAO {

    public int insert(Teste t) {

        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("INSERT INTO [Teste] ([idDisciplina],[dataGeracao],[numeroQuestoes]) VALUES (?, ?, ?)");
            st.setInt(1, t.getDisciplina().getId());
            st.setDate(2, t.getDataGeracao());
            st.setInt(3, t.getNumeroQuestoes());
            return st.executeUpdate();
        } catch (SQLException|UnknownHostException  ex) {
            Logger.getLogger(TesteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public ArrayList<Teste> retrieveAll() {
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement st = connection.createStatement();
            ArrayList<Teste> testeList = new ArrayList<>();
            ResultSet result = st.executeQuery("SELECT Disciplina.nome, Teste.id, Teste.dataGeracao, Teste.idDisciplina, Teste.numeroQuestoes FROM Disciplina INNER JOIN\n" +
"                      Teste ON Disciplina.id = Teste.idDisciplina");
            Teste t = new Teste();
            Disciplina d = new Disciplina();
            while (result.next()) {
                t.setId(result.getInt("id"));
                d.setId(result.getInt("idDisciplina"));
                d.setNome(result.getString("nome"));                
                t.setDisciplina(d);
                t.setNumeroQuestoes(result.getInt("numeroQuestoes"));
                t.setDataGeracao(result.getDate("dataGeracao"));
                testeList.add(t);
            }
            return testeList;

        } catch (SQLException|UnknownHostException ex) {
            Logger.getLogger(TesteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }    
    
    public int delete(int id){
    
        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("DELETE FROM [Teste] WHERE [id] = " + id);
            return st.executeUpdate();
        } catch (SQLException|UnknownHostException  ex) {
            Logger.getLogger(TesteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
    public Teste retrieveByID(int id){
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement st = connection.createStatement();
            ResultSet result = st.executeQuery("SELECT dbo.Teste.idDisciplina, dbo.Teste.dataGeracao, dbo.Teste.numeroQuestoes, dbo.Disciplina.nome\n" +
                "FROM dbo.Disciplina INNER JOIN\n" +
                " dbo.Teste ON dbo.Disciplina.id = dbo.Teste.idDisciplina where dbo.Teste.id = " + id);
            Teste t = new Teste();
            Disciplina d = new Disciplina();
            t.setDisciplina(new Disciplina(result.getInt("idDisciplina"), result.getString("nome")));
            t.setNumeroQuestoes(result.getInt("numeroQuestoes"));
            t.setDataGeracao(result.getDate("dataGeracao"));  
            return t;
        } catch (UnknownHostException | SQLException e) {
            Logger.getLogger(TesteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
}
