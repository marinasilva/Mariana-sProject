/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Disciplina;
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
public class DisciplinaDAO {

    public int insert(Disciplina d) {

        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("INSERT INTO [Disciplina] ([nome]) VALUES (?)");
            st.setString(1, d.getNome());
            return st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public ArrayList<Disciplina> retrieveAll() {

        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement st = connection.createStatement();
            ArrayList<Disciplina> disciplinaList = new ArrayList<>();
            ResultSet result = st.executeQuery("SELECT [id],[nome] FROM [Disciplina]");
            while (result.next()) {
                Disciplina d = new Disciplina();
                d.setId(result.getInt("id"));
                d.setNome(result.getString("nome"));
                disciplinaList.add(d);
            }
            return disciplinaList;
        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int delete(int id) {

        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("DELETE FROM [Disciplina] WHERE [id] = " + id);
            return st.executeUpdate();            
        } catch (SQLException e) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, e);
            return -1;
        }
    }
    
    public boolean update(Disciplina d){
    
        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("UPDATE [Disciplina] SET [nome] = ? WHERE [id] = " + d.getId());
            st.setString(1, d.getNome());
            return st.execute();
        } catch (SQLException e) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
}
