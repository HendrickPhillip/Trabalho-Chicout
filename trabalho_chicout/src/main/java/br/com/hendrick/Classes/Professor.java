package br.com.hendrick.Classes;

import java.time.LocalDate;

public class Professor {
    private int idProf;
    private String nomeProf, rgProf, cpfProf;
    private String sexo, dataProf, telefone;

    public Professor(String nomeProf, String rgProf, String cpfProf, String sexo, String telefone,
            String dataProf, int idProf) {
        this.nomeProf = nomeProf;
        this.rgProf = rgProf;
        this.cpfProf = cpfProf;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataProf = dataProf;
        this.idProf = idProf;
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getRgProf() {
        return rgProf;
    }

    public void setRgProf(String rgProf) {
        this.rgProf = rgProf;
    }

    public String getCpfProf() {
        return cpfProf;
    }

    public void setCpfProf(String cpfProf) {
        this.cpfProf = cpfProf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataProf() {
        return dataProf;
    }

    public void setDataProf(String dataProf) {
        this.dataProf = dataProf;
    }

    String[] nascimentoProf = dataProf.split("/");
    LocalDate nascProf = LocalDate.of(Integer.parseInt(nascimentoProf[2]), Integer.parseInt(nascimentoProf[1]),
            Integer.parseInt(nascimentoProf[0]));

    public int getIdProf() {
        return idProf;
    }

    public void setIdProf(int idProf) {
        this.idProf = idProf;
    }

    public String[] getNascimentoProf() {
        return nascimentoProf;
    }

    public void setNascimentoProf(String[] nascimentoProf) {
        this.nascimentoProf = nascimentoProf;
    }

    public LocalDate getNascProf() {
        return nascProf;
    }

    public void setNascProf(LocalDate nascProf) {
        this.nascProf = nascProf;
    }

}
