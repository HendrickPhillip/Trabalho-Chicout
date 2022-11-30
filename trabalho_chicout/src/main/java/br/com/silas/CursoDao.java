package br.com.silas;

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

public class CursoDao implements Dao<Curso> {

    @Override
    public void delete(Curso curso) {
        String sql = "DELETE FROM curso WHERE idCurso = ?";

        Connection con = null;
        PreparedStatement statement = null;
        try {
            con = ConnectionDrive.getConnection();
            statement = con.prepareStatement(sql);
            statement.setInt(1, curso.getIdCurso());
            statement.execute();
        } catch (Exception ex) {
            try {
                throw new SQLException("Erro ao deletar o curso!" + ex.getMessage(), ex);
            } catch (SQLException ex1) {
                Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            ConnectionDrive.closeConnection(con, statement);
        }

    }

    @Override
    public Optional<Curso> get(long id) {
        String sql = "SELECT * FROM curso WHERE idAluno = ?";

        Connection con = null;
        PreparedStatement statement = null;
        Curso curso = new Curso(0, sql, sql, sql, sql, sql, sql, id);
        try {
            con = ConnectionDrive.getConnection();
            statement = con.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet result = statement.executeQuery();
            System.out.println("");
            while (result.next()) {
                int respId = result.getInt("idCurso");
                String respArea = result.getString("area");
                String respNomeCurso = result.getString("nome_curso");
                String respTurno = result.getString("turno");
                String respValor = result.getString("valor");
                String respCargaHora = result.getString("cargaHorariaCurso");
               

                curso.setIdCurso(respId);
                curso.setArea(respArea);
                curso.setNome_curso(respNomeCurso);
                curso.setTurno(respTurno);
                curso.setValor(respValor);
                curso.setCargaHorariaCurso(respCargaHora);
                

            }
        } catch (Exception ex) {
            try {
                throw new SQLException("Erro ao selecionar o curso" + ex.getMessage(), ex);
            } catch (SQLException ex1) {
                Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            ConnectionDrive.closeConnection(con, statement);
        }

        return Optional.of(curso);
    }

    @Override
    public List<Curso> getAll() {

        return null;
    }


    @Override
    public void save(Curso t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Curso t, String[] parametro) {
        // TODO Auto-generated method stub
        
    }

}