package br.com.hendrick.Classes;

public class Turma {
    private int idTurma, qtd_alunos;

    public Turma(int idTurma, int qtd_alunos) {
        this.idTurma = idTurma;
        this.qtd_alunos = qtd_alunos;
    }

    public int getQtd_alunos() {
        return qtd_alunos;
    }

    public void setQtd_alunos(int qtd_alunos) {
        this.qtd_alunos = qtd_alunos;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

}
