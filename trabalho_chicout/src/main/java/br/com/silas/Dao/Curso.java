package br.com.silas.Dao;

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

    public Curso(int i, String sql, String sql2, String sql3, String sql4, String sql5, String sql6, long id) {
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


    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public double getCargaHorariaCurso() {
        return cargaHorariaCurso;
    }

    public void setCargaHorariaCurso(double respCargaHora) {
        this.cargaHorariaCurso = respCargaHora;
    }

    public void save() {
    
    }

    public void setCargaHorariaCurso(String respCargaHora) {
    }

    /**
     * @param respValor
     */
    public void setValor(double respValor) {
    }

}
