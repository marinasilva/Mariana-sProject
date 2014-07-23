/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import Model.Questao;
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
public class QuestaoDAO {
    
    public int insert(Questao q){
    
        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("INSERT INTO [Questao] ([bimestre],[idMateria],[pergunta],[resposta1],[resposta2],[resposta3],[resposta4],[gabarito])\n" +
                    "     VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            st.setInt(1, q.getBimestre());
            st.setInt(2, q.getIdMateria());
            st.setString(3, q.getPergunta());
            st.setString(4, q.getResposta1());
            st.setString(5, q.getResposta2());
            st.setString(6, q.getResposta3());
            st.setString(7, q.getResposta4());
            st.setInt(8, q.getGabarito());
            return st.executeUpdate();
        } catch (SQLException ex) {
             Logger.getLogger(QuestaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
    public ArrayList<Questao> retrieveAll(){
    
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement st = connection.createStatement();
            ArrayList<Questao> questaoList = new ArrayList<>();
            ResultSet result = st.executeQuery("SELECT [bimestre],[idMateria],[pergunta],[resposta1],[resposta2],[resposta3],[resposta4],[gabarito]\n" +
                    "  FROM [Questao]");
            Questao q = new Questao();
            while (result.next()) {                
                q.setBimestre(result.getInt("bimestre"));
                q.setIdMateria(result.getInt("idMateria"));
                q.setPergunta(result.getString("pergunta"));
                q.setResposta1(result.getString("resposta1"));
                q.setResposta2(result.getString("resposta2"));
                q.setResposta3(result.getString("resposta3"));
                q.setResposta4(result.getString("resposta4"));
                q.setGabarito(result.getInt("gabarito"));
                questaoList.add(q);
            }
            return questaoList;
        } catch (SQLException ex) {
            Logger.getLogger(QuestaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
