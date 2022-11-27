package br.com.hendrick.Classes;

public class Curso {
    private int idCurso;
    private String area, nome_curso, turno;
    private double valor, cargaHorariaCurso;

    public Curso(int idCurso, String area, String nome_curso, String turno, double valor, double cargaHorariaCurso) {
        this.idCurso = idCurso;
        this.area = area;
        this.nome_curso = nome_curso;
        this.turno = turno;
        this.valor = valor;
        this.cargaHorariaCurso = cargaHorariaCurso;
    }

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

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public double getCargaHorariaCurso() {
        return cargaHorariaCurso;
    }

    public void setCargaHorariaCurso(double cargaHorariaCurso) {
        this.cargaHorariaCurso = cargaHorariaCurso;
    }

}
