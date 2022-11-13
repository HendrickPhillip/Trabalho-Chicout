package br.com.hendrick;

public class Curso {
    private String area;
    private String nome_curso;
    private String turno;
    private double valor;
    private double carga_horaria_curso;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCarga_horaria_curso() {
        return carga_horaria_curso;
    }

    public void setCarga_horaria_curso(double carga_horaria_curso) {
        this.carga_horaria_curso = carga_horaria_curso;
    }

}
