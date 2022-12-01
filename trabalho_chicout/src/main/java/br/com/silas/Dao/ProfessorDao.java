package br.com.silas.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.hendrick.Classes.Dao;
import br.com.hendrick.Conector.ConnectionDrive;

public class ProfessorDao implements Dao<Professor> {

    @Override
    public void delete(Professor professor) {
        String sql = "DELETE FROM curso WHERE idCurso = ?";

        Connection con = null;
        PreparedStatement statement = null;
        try {
            con = ConnectionDrive.getConnection();
            statement = con.prepareStatement(sql);
            statement.setInt(1, professor.getIdProf());
            statement.execute();
        } catch (Exception ex) {
            try {
                throw new SQLException("Erro ao deletar o Professor!" + ex.getMessage(), ex);
            } catch (SQLException ex1) {
                Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            ConnectionDrive.closeConnection(con, statement);
        }

    }

    @Override
    public Optional<Professor> get(long id) {
        String sql = "SELECT * FROM Professor WHERE idProf = ?";

        Connection con = null;
        PreparedStatement statement = null;
        Professor professor = new Professor(0, sql, sql, sql, sql, sql, sql, id);
        try {
            con = ConnectionDrive.getConnection();
            statement = con.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet result = statement.executeQuery();
            System.out.println("");
            while (result.next()) {
                int respId = result.getInt("idProf");
                String respNomeProf = result.getString("nomeProf");
                String respRgProf = result.getString("rgProf");
                String respCpfProf = result.getString("cpfProf");
                String respSexo = result.getString("sexo");
                String respTelefone = result.getString("telefone");
                String respDataProf = result.getString("dataProf");
               

                professor.setIdProf(respId);
                professor.setNomeProf(respNomeProf);
                professor.setRgProf(respRgProf);
                professor.setCpfProf(respCpfProf);
                professor.setSexo(respSexo);
                professor.setTelefone(respTelefone);
                professor.setDataProf(respDataProf);
                

            }
        } catch (Exception ex) {
            try {
                throw new SQLException("Erro ao selecionar o professor!" + ex.getMessage(), ex);
            } catch (SQLException ex1) {
                Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            ConnectionDrive.closeConnection(con, statement);
        }

        return Optional.of(professor);
    }

    @Override
    public List<Professor> getAll() {

        return null;
    }


    @Override
    public void save(Professor t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Professor t, String[] parametro) {
        // TODO Auto-generated method stub
        
    }

}