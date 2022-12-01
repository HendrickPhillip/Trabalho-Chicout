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

public class TurmaDao implements Dao<Turma> {

    @Override
    public void delete(Turma turma) {
        String sql = "DELETE FROM turma WHERE idTurma = ?";

        Connection con = null;
        PreparedStatement statement = null;
        try {
            con = ConnectionDrive.getConnection();
            statement = con.prepareStatement(sql);
            statement.setInt(1, turma.getIdTurma());
            statement.execute();
        } catch (Exception ex) {
            try {
                throw new SQLException("Erro ao deletar a turma!" + ex.getMessage(), ex);
            } catch (SQLException ex1) {
                Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            ConnectionDrive.closeConnection(con, statement);
        }

    }

    @Override
    public Optional<Turma> get(long id) {
        String sql = "SELECT * FROM turma WHERE idTurma = ?";

        Connection con = null;
        PreparedStatement statement = null;
        Turma turma = new Turma(0, sql, sql, sql, sql, sql, sql, id);
        try {
            con = ConnectionDrive.getConnection();
            statement = con.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet result = statement.executeQuery();
            System.out.println("");
            while (result.next()) {
                int respId = result.getInt("idTurma");
                int respQtd_alunos = result.getInt("qtd_alunos");
               
               

                turma.setIdTurma(respId);
                turma.setQtd_alunos(respQtd_alunos);
               

            }
        } catch (Exception ex) {
            try {
                throw new SQLException("Erro ao selecionar a turma" + ex.getMessage(), ex);
            } catch (SQLException ex1) {
                Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            ConnectionDrive.closeConnection(con, statement);
        }

        return Optional.of(turma);
    }

    @Override
    public List<Turma> getAll() {

        return null;
    }


    @Override
    public void save(Turma t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Turma t, String[] parametro) {
        // TODO Auto-generated method stub
        
    }

}