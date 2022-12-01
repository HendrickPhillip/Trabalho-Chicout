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
import br.com.hendrick.Classes.Disciplina;
import br.com.hendrick.Conector.ConnectionDrive;

public class DisciplinaDao implements Dao<Disciplina> {

    private int cargaHorariaDisciplina;

    private int getIdDisciplina() {
        return 0;
    }

    @Override
    public Optional<Disciplina> get(long id) {
        String sql = "SELECT * FROM disciplina WHERE idDisciplina = ?";

        Connection con = null;
        PreparedStatement statement = null;
        Disciplina disciplina = new Disciplina(0, sql, sql, sql, sql, sql, sql, id);
        try {
            con = ConnectionDrive.getConnection();
            statement = con.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet result = statement.executeQuery();
            System.out.println("");
            while (result.next()) {
                int respId = result.getInt("idDisciplina");
                String respNomeDisciplina = result.getString("nomeDisplina");
                double respCargaHora = result.getDouble("cargaHorariaDisciplina");
                String respHorario = result.getString("horario");
                
               

                disciplina.setIdDisciplina(respId);
                disciplina.setNomeDisplina(respNomeDisciplina);
                disciplina.setCargaHora(cargaHorariaDisciplina);
                disciplina.setHorario(respHorario);
               
                

            }
        } catch (Exception ex) {
            try {
                throw new SQLException("Erro ao selecionar A disciplina" + ex.getMessage(), ex);
            } catch (SQLException ex1) {
                Logger.getLogger(DisciplinaDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            ConnectionDrive.closeConnection(con, statement);
        }

        return Optional.of(disciplina);
    }

    @Override
    public List<Disciplina> getAll() {

        return null;
    }


    @Override
    public void save(Disciplina t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Disciplina t, String[] parametro) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(Disciplina t) {
        // TODO Auto-generated method stub
        
    }

    public void delete() {
        String sql = "DELETE FROM curso WHERE idDisciplina = ?";
    
        Connection con = null;
        PreparedStatement statement = null;
        try {
            con = ConnectionDrive.getConnection();
            statement = con.prepareStatement(sql);
            statement.setInt(1, getIdDisciplina());
            statement.execute();
        } catch (Exception ex) {
            try {
                throw new SQLException("Erro ao deletar a disciplina!" + ex.getMessage(), ex);
            } catch (SQLException ex1) {
                Logger.getLogger(DisciplinaDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            ConnectionDrive.closeConnection(con, statement);
        }
    
    }

}
