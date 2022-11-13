package br.com.hendrick;

public class Disciplina {
    private String nome_displina;
    private double carga_horaria_disciplina;
    private double horario;

    public String getNome_displina() {
        return nome_displina;
    }

    public void setNome_displina(String nome_displina) {
        this.nome_displina = nome_displina;
    }

    public double getCarga_horaria_disciplina() {
        return carga_horaria_disciplina;
    }

    public void setCarga_horaria_disciplina(double carga_horaria_disciplina) {
        this.carga_horaria_disciplina = carga_horaria_disciplina;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

}
