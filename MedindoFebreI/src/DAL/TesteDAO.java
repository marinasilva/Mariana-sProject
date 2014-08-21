/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Disciplina;
import Model.Materia;
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
            PreparedStatement st = connection.prepareStatement("INSERT INTO [Teste] ([idMateria],[dataGeracao],[numeroQuestoes]) VALUES (?, ?, ?)");
            st.setInt(1, t.getMateria().getId());
            st.setDate(2, t.getDataGeracao());
            st.setInt(3, t.getNumeroQuestoes());
            return st.executeUpdate();
        } catch (SQLException | UnknownHostException ex) {
            Logger.getLogger(TesteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public ArrayList<Teste> retrieveAll() {
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement st = connection.createStatement();
            ArrayList<Teste> testeList = new ArrayList<>();
            ResultSet result = st.executeQuery("SELECT dbo.Teste.id, dbo.Teste.idMateria, dbo.Teste.dataGeracao, dbo.Teste.numeroQuestoes, dbo.Materia.nome, dbo.Materia.idDisciplina, dbo.Materia.serie,  dbo.Disciplina.nome AS Expr1\n"
                    + "FROM dbo.Disciplina INNER JOIN\n"
                    + " dbo.Materia ON dbo.Disciplina.id = dbo.Materia.idDisciplina INNER JOIN\n"
                    + " dbo.Teste ON dbo.Disciplina.id = dbo.Teste.idMateria");
            Teste t = new Teste();
            Disciplina d = new Disciplina();
            Materia m = new Materia();
            while (result.next()) {
                t.setId(result.getInt(1));
                d.setId(result.getInt(6));
                d.setNome(result.getString(8));
                t.setDisciplina(d);
                m.setId(result.getInt(2));
                m.setNome(result.getString(5));
                m.setSerie(result.getInt(7));
                m.setidDisciplina(result.getInt(6));
                t.setMateria(m);
                t.setNumeroQuestoes(result.getInt(4));
                t.setDataGeracao(result.getDate(3));
                testeList.add(t);
            }
            return testeList;
        } catch (SQLException | UnknownHostException ex) {
            Logger.getLogger(TesteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int delete(int id) {

        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("DELETE FROM [Teste] WHERE [id] = " + id);
            return st.executeUpdate();
        } catch (SQLException | UnknownHostException ex) {
            Logger.getLogger(TesteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public Teste retrieveByID(int id) { 
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement st = connection.createStatement();
            ResultSet result = st.executeQuery("SELECT dbo.Teste.id, dbo.Teste.idMateria, dbo.Teste.dataGeracao, dbo.Teste.numeroQuestoes, dbo.Materia.nome, dbo.Materia.idDisciplina, dbo.Materia.serie,  dbo.Disciplina.nome AS Expr1\n"
                    + "FROM dbo.Disciplina INNER JOIN\n"
                    + " dbo.Materia ON dbo.Disciplina.id = dbo.Materia.idDisciplina INNER JOIN\n"
                    + " dbo.Teste ON dbo.Disciplina.id = dbo.Teste.idMateria where dbo.Teste.id = " + id);
            result.next();
            Teste t = new Teste();
            Disciplina d = new Disciplina();
            Materia m = new Materia();
            t.setDisciplina(new Disciplina(result.getInt(6), result.getString(8)));
            t.setMateria(new Materia(result.getInt(2), result.getString(5), result.getInt(6), result.getInt(7)));
            t.setNumeroQuestoes(result.getInt(4));
            t.setDataGeracao(result.getDate(3));
            t.setId(id);
            return t;
        } catch (UnknownHostException | SQLException e) {
            Logger.getLogger(TesteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public int update(Teste t) { 
        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement("UPDATE [Teste] SET [idMateria] = ?,[dataGeracao] = ?,[numeroQuestoes] = ? WHERE [id] = " + t.getId());
            st.setInt(1, t.getMateria().getId());
            st.setDate(2, t.getDataGeracao());
            st.setInt(3, t.getNumeroQuestoes());
            return st.executeUpdate();
        } catch (UnknownHostException | SQLException e) {
            Logger.getLogger(TesteDAO.class.getName()).log(Level.SEVERE, null, e);
            return -1;
        }
    }

}
