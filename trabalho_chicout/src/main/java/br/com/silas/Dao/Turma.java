package br.com.hendrick.Classes;

public class Turma {
    private int idTurma;
    int qtd_alunos;

    public Turma(int idTurma, int qtd_alunos) {
        this.idTurma = idTurma;
        this.qtd_alunos = qtd_alunos;
    }

    public Turma(int i, String sql, String sql2, String sql3, String sql4, String sql5, String sql6, long id) {
    }

    public int getQtd_alunos() {
        return qtd_alunos;
    }

    public void setQtd_alunos(int respQtd_alunos) {
        this.qtd_alunos = respQtd_alunos;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

}
