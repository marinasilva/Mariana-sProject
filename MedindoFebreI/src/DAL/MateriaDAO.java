/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Materia;
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
public class MateriaDAO {

    public int insert(Materia m) {

        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("INSERT INTO [Materia] ([nome],[idDisciplina],[serie]) VALUES  (?, ?, ?)");
            st.setString(1, m.getNome());
            st.setInt(2, m.getIdDisciplina());
            st.setInt(3, m.getSerie());
            return st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public ArrayList<Materia> retrieveAll() {

        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement st = connection.createStatement();
            ArrayList<Materia> materiaList = new ArrayList<>();
            ResultSet result = st.executeQuery("SELECT [nome],[idDisciplina],[serie] FROM [Materia]");
            Materia m = new Materia();
            while (result.next()) {
                m.setNome(result.getString("nome"));
                m.setId(result.getInt("idDisciplina"));
                m.setId(result.getInt("serie"));
                materiaList.add(m);
            }
            return materiaList;
        } catch (SQLException ex) {
            Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<String> retrieveDisciplina() {

        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement st = connection.createStatement();
            ArrayList<String> disciplinasList = new ArrayList<>();
            ResultSet result = st.executeQuery("SELECT nome FROM Disciplina INNER JOIN  Materia ON Disciplina.id = Materia.idDisciplina");
            while (result.next()) {
                disciplinasList.add(result.getString("nome"));
            }
            return disciplinasList;
        } catch (SQLException ex) {
            Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int delete(int id) {

        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("DELETE FROM [Materia] WHERE [id] = " + id);
            return st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public Materia retrieveById(int id) {

        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement st = connection.createStatement();
            ResultSet result = st.executeQuery("SELECT [nome], [idDisciplina], [serie] FROM [Materia] WHERE [id] = " + id);
            Materia m = new Materia();
            m.setId(id);
            m.setNome(result.getString("nome"));
            m.setIdDisciplina(result.getInt("idDisciplina"));
            m.setSerie(result.getInt("serie"));
            return m;
        } catch (SQLException ex) {
            Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int update(Materia m){
    
        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("UPDATE [Materia] SET [nome] = ?, [idDisciplina] = ?, [serie] = ? WHERE [id] = " + m.getId());
            st.setString(1, m.getNome());
            st.setInt(2, m.getIdDisciplina());
            st.setInt(3, m.getSerie());
            return st.executeUpdate();
        } catch (SQLException ex) {
             Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

}
