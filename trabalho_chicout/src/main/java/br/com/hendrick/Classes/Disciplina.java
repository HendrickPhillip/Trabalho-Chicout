package br.com.hendrick.Classes;

public class Disciplina {
    private int idDisciplina;
    private String nomeDisplina;
    private double cargaHorariaDisciplina;
    private double horario;

    public Disciplina(int idDisciplina, String nomeDisplina, double cargaHorariaDisciplina, double horario) {
        this.idDisciplina = idDisciplina;
        this.nomeDisplina = nomeDisplina;
        this.cargaHorariaDisciplina = cargaHorariaDisciplina;
        this.horario = horario;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNomeDisplina() {
        return nomeDisplina;
    }

    public void setNomeDisplina(String nomeDisplina) {
        this.nomeDisplina = nomeDisplina;
    }

    public double getCargaHorariaDisciplina() {
        return cargaHorariaDisciplina;
    }

    public void setCargaHorariaDisciplina(double cargaHorariaDisciplina) {
        this.cargaHorariaDisciplina = cargaHorariaDisciplina;
    }

}
