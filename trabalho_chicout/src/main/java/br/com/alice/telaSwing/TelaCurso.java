package br.com.alice.telaSwing;

import javax.swing.*;
import java.awt.*;

public class TelaCurso {

    public TelaCurso() {
        JFrame tela = new JFrame();
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tela.setBackground(new Color(0, 0 ,0));

        //Nome Aluno
        JLabel nomeAluno = new JLabel();
        nomeAluno.setText("Nome: ");
        nomeAluno.setBounds(0, 10, 40, 20);
        tela.add(nomeAluno);

        JTextField textoNome = new JTextField();
        textoNome.setBounds(50, 10, 200, 20);
        textoNome.setForeground(new Color(97, 248, 3));
        textoNome.setBackground(new Color(0, 0 ,0));
        tela.add(textoNome);

        JButton nomeButton = new JButton("Aplicar");
        nomeButton.setBounds(260, 10, 100, 20);
        nomeButton.setForeground(new Color(97, 248, 3));
        nomeButton.setBackground(new Color(0, 0 ,0));
        tela.add(nomeButton);

        //Area pertencente
        JLabel emailAluno = new JLabel();
        emailAluno.setText("Area: ");
        emailAluno.setBounds(0, 40, 40, 20);
        tela.add(emailAluno);

        JTextField textoEmail = new JTextField();
        textoEmail.setBounds(50, 40, 200, 20);
        textoEmail.setForeground(new Color(97, 248, 3));
        textoEmail.setBackground(new Color(0, 0 ,0));
        tela.add(textoEmail);

        JButton emailButton = new JButton("Aplicar");
        emailButton.setBounds(260, 40, 100, 20);
        emailButton.setForeground(new Color(97, 248, 3));
        emailButton.setBackground(new Color(0, 0 ,0));
        tela.add(emailButton);

        //Turno
        JLabel turnoCurso = new JLabel();
        turnoCurso.setText("Turno: ");
        turnoCurso.setBounds(0, 70, 50, 20);
        tela.add(turnoCurso);

        JCheckBox turnoButton1 = new JCheckBox();
        turnoButton1.setBounds(60, 70, 80, 20);
        turnoButton1.setText("MANHÃ");
        tela.add(turnoButton1);

        JCheckBox turnoButton2 = new JCheckBox();
        turnoButton2.setBounds(145, 70, 80, 20);
        turnoButton2.setText("TARDE");
        tela.add(turnoButton2);

        JCheckBox turnoButton3 = new JCheckBox();
        turnoButton3.setBounds(230, 70, 80, 20);
        turnoButton3.setText("NOITE");
        tela.add(turnoButton3);

        //Valor
        JLabel valorCurso = new JLabel();
        valorCurso.setText("Valor: ");
        valorCurso.setBounds(0, 100, 40, 20);
        tela.add(valorCurso);

        JTextField textoValor = new JTextField();
        textoValor.setBounds(50, 100, 200, 20);
        textoValor.setForeground(new Color(97, 248, 3));
        textoValor.setBackground(new Color(0, 0 ,0));
        tela.add(textoValor);

        JButton valorButton = new JButton("Aplicar");
        valorButton.setBounds(260, 100, 100, 20);
        valorButton.setForeground(new Color(97, 248, 3));
        valorButton.setBackground(new Color(0, 0 ,0));
        tela.add(valorButton);

        //Carga Horária
        JLabel cargaHCurso = new JLabel();
        cargaHCurso.setText("Carga: ");
        cargaHCurso.setBounds(0, 130, 40, 20);
        tela.add(cargaHCurso);

        JTextField textoCarga = new JTextField();
        textoCarga.setBounds(50, 130, 200, 20);
        textoCarga.setForeground(new Color(97, 248, 3));
        textoCarga.setBackground(new Color(0, 0 ,0));
        tela.add(textoCarga);

        JButton cargaButton = new JButton("Aplicar");
        cargaButton.setBounds(260, 130, 100, 20);
        cargaButton.setForeground(new Color(97, 248, 3));
        cargaButton.setBackground(new Color(0, 0 ,0));
        tela.add(cargaButton);
    }
}
