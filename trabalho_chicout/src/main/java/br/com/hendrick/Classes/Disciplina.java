package br.com.hendrick.Classes;

public class Disciplina {
    private int idDisciplina;
    private String nomeDisplina;
    private double cargaHorariaDisciplina;
    private String horario;

    public Disciplina(int idDisciplina, String nomeDisplina, double cargaHorariaDisciplina, String horario) {
        this.idDisciplina = idDisciplina;
        this.nomeDisplina = nomeDisplina;
        this.cargaHorariaDisciplina = cargaHorariaDisciplina;
        this.horario = horario;
    }

    public Disciplina(int i, String sql, String sql2, String sql3, String sql4, String sql5, String sql6, long id) {
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String respHorario) {
        this.horario = respHorario;
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

    public void setCargaHora(int respId) {
    }

}
