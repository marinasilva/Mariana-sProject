/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import Model.Resposta;
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
public class RespostaDAO {
    
    public int insert(Resposta r){
        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("INSERT INTO [Resposta]  ([idQuestao],[Texto],[Correta]) VALUES (?,?,?)");
            st.setInt(1, r.getIdQuestão());
            st.setString(2, r.getResposta());
            st.setBoolean(3, r.isCorreta());
            return st.executeUpdate();
        } catch (UnknownHostException | SQLException e) {
            Logger.getLogger(RespostaDAO.class.getName()).log(Level.SEVERE, null, e);
            return -1;
        }
    }
    
    public ArrayList<Resposta> retrieveAll(){
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement st = connection.createStatement();
            ArrayList<Resposta> respostaList = new ArrayList<>();
            ResultSet result = st.executeQuery("SELECT [id],[idQuestao],[Texto],[Correta] FROM [Resposta]");
            while (result.next()) {                
                Resposta r = new Resposta();
                r.setId(result.getInt("id"));
                r.setIdQuestão(result.getInt("idQuestao"));
                r.setResposta(result.getString("Texto"));
                r.setCorreta(result.getBoolean("Correta"));
                
                respostaList.add(r);
            }
            return respostaList;
        } catch (UnknownHostException | SQLException e) {
            Logger.getLogger(RespostaDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public int delete(int id){
        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("DELETE FROM [Resposta] WHERE [id] = " + id);
            return st.executeUpdate();
        } catch (UnknownHostException | SQLException e) {
            Logger.getLogger(RespostaDAO.class.getName()).log(Level.SEVERE, null, e);
            return -1;
        }
    }

    
}
