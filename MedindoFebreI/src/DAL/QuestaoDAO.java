/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Questao;
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
public class QuestaoDAO {

    public int insert(Questao q) {

        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("INSERT INTO [Questao] ([bimestre],[idMateria],[pergunta]) VALUES (?, ?, ?)");
            st.setInt(1, q.getBimestre());
            st.setInt(2, q.getIdMateria());
            st.setString(3, q.getPergunta());
            return st.executeUpdate();
        } catch (SQLException | UnknownHostException ex) {
            Logger.getLogger(QuestaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public ArrayList<Questao> retrieveAll() {

        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement st = connection.createStatement();
            ArrayList<Questao> questaoList = new ArrayList<>();
            ResultSet result = st.executeQuery("SELECT [bimestre],[idMateria],[pergunta] FROM [Questao]");
            while (result.next()) {
                Questao q = new Questao();
                q.setBimestre(result.getInt("bimestre"));
                q.setIdMateria(result.getInt("idMateria"));
                q.setPergunta(result.getString("pergunta"));
                questaoList.add(q);
            }
            return questaoList;
        } catch (SQLException | UnknownHostException ex) {
            Logger.getLogger(QuestaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
