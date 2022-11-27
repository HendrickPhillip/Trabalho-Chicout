package br.com.hendrick.Classes;

import java.time.LocalDate;

public class Aluno {
    private int idAluno;
    private String nomeAluno, emailAluno;
    private String cpfAluno, rgAluno;
    private String sexo, dataAluno;
    private double bolsa;

    public Aluno(int idAluno, String nomeAluno, String emailAluno, String cpfAluno, String rgAluno, String sexo,
            String dataAluno, double bolsa) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.emailAluno = emailAluno;
        this.cpfAluno = cpfAluno;
        this.rgAluno = rgAluno;
        this.sexo = sexo;
        this.dataAluno = dataAluno;
        this.bolsa = bolsa;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public String getRgAluno() {
        return rgAluno;
    }

    public void setRgAluno(String rgAluno) {
        this.rgAluno = rgAluno;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataAluno() {
        return dataAluno;
    }

    public void setDataAluno(String dataAluno) {
        this.dataAluno = dataAluno;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    String[] nascimentoAluno = dataAluno.split("/");
    LocalDate nascAluno = LocalDate.of(Integer.parseInt(nascimentoAluno[2]), Integer.parseInt(nascimentoAluno[1]),
            Integer.parseInt(nascimentoAluno[0]));

}
