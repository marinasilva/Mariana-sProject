/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Disciplina;
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
public class DisciplinaDAO {
    MateriaDAO materiaDAO;

    public int insert(Disciplina d) {

        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("INSERT INTO [Disciplina] ([nome]) VALUES (?)");
            st.setString(1, d.getNome());
            return st.executeUpdate();
        } catch (SQLException | UnknownHostException ex) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public ArrayList<Disciplina> retrieveAll() {

        try {
            materiaDAO = new MateriaDAO();
            Connection connection = ConnectionFactory.getConnection();
            Statement st = connection.createStatement();
            ArrayList<Disciplina> disciplinaList = new ArrayList<>();
            ResultSet result = st.executeQuery("SELECT [id],[nome] FROM [Disciplina]");
            while (result.next()) {
                Disciplina d = new Disciplina();
                
                d.setId(result.getInt("id"));
                d.setNome(result.getString("nome"));
                d.getMateriaList().addAll(materiaDAO.retrieveAllByDisciplina(d.getId()));
                disciplinaList.add(d);
            }
            return disciplinaList;
        } catch (SQLException | UnknownHostException ex) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int delete(int id) {

        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("DELETE FROM [Disciplina] WHERE [id] = " + id);
            return st.executeUpdate();
        } catch (SQLException | UnknownHostException e) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, e);
            return -1;
        }
    }

    public boolean update(Disciplina d) {

        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("UPDATE [Disciplina] SET [nome] = ? WHERE [id] = " + d.getId());
            st.setString(1, d.getNome());
            return st.execute();
        } catch (SQLException | UnknownHostException e) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public Disciplina retrieveByID(int id) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement st = connection.createStatement();
            Disciplina disciplina = new Disciplina();
            ResultSet result = st.executeQuery("SELECT [id],[nome] FROM [Disciplina] where id =" + id);
            result.next();
            disciplina.setId(result.getInt("id"));
            disciplina.setNome(result.getString("nome"));

            return disciplina;
        } catch (SQLException | UnknownHostException ex) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
