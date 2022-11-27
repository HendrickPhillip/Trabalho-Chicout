package br.com.hendrick.Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.hendrick.Conector.ConnectionDrive;

public class AlunoDao implements Dao<Aluno> {

    @Override
    public void delete(Aluno aluno) {
        String sql = "DELETE FROM alunos WHERE idAluno = ?";

        Connection con = null;
        PreparedStatement statement = null;
        try {
            con = ConnectionDrive.getConnection();
            statement = con.prepareStatement(sql);
            statement.setInt(1, aluno.getIdAluno());
            statement.execute();
        } catch (Exception ex) {
            try {
                throw new SQLException("Erro ao deletar o aluno!" + ex.getMessage(), ex);
            } catch (SQLException ex1) {
                Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            ConnectionDrive.closeConnection(con, statement);
        }

    }

    @Override
    public Optional<Aluno> get(long id) {
        String sql = "SELECT * FROM alunos WHERE idAluno = ?";

        Connection con = null;
        PreparedStatement statement = null;
        Aluno aluno = new Aluno(0, sql, sql, sql, sql, sql, sql, id);
        try {
            con = ConnectionDrive.getConnection();
            statement = con.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet result = statement.executeQuery();
            System.out.println("");
            while (result.next()) {
                int respId = result.getInt("idAluno");
                String respNome = result.getString("nomeAluno");
                String respEmail = result.getString("emailAluno");
                String respCpf = result.getString("cpfAluno");
                String respRg = result.getString("rgAluno");
                String respSexo = result.getString("sexo");
                String respData = result.getString("dataAluno");
                double respBolsa = result.getDouble("bolsa");

                aluno.setIdAluno(respId);
                aluno.setNomeAluno(respNome);
                aluno.setEmailAluno(respEmail);
                aluno.setCpfAluno(respCpf);
                aluno.setRgAluno(respRg);
                aluno.setSexo(respSexo);
                aluno.setDataAluno(respData);
                aluno.setBolsa(respBolsa);

            }
        } catch (Exception ex) {
            try {
                throw new SQLException("Erro ao selecionar o aluno!" + ex.getMessage(), ex);
            } catch (SQLException ex1) {
                Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            ConnectionDrive.closeConnection(con, statement);
        }

        return Optional.of(aluno);
    }

    @Override
    public List<Aluno> getAll() {

        return null;
    }

    @Override
    public void save(Aluno t) {

    }

    @Override
    public void update(Aluno t, String[] parametro) {

    }

}
