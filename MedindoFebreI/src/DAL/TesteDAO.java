/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

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
            st.setInt(1, t.getIdDisciplina());
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
            ResultSet result = st.executeQuery("SELECT [id],[idDisciplina],[dataGeracao],[numeroQuestoes] FROM [Teste]");
            Teste t = new Teste();
            while (result.next()) {
                t.setId(result.getInt("id"));
                t.setIdDisciplina(result.getInt("idDisciplina"));
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
            PreparedStatement st = connection.prepareStatement("DELETE FROM [Teste] WHERE [id] = "+ id);
            return st.executeUpdate();
        } catch (SQLException|UnknownHostException  ex) {
            Logger.getLogger(TesteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
}
