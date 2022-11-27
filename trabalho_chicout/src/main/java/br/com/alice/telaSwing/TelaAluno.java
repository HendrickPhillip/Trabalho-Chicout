package br.com.alice.telaSwing;

import javax.swing.*;
import java.awt.*;

public class TelaAluno {

    public TelaAluno() {

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

        //Email Aluno
        JLabel emailAluno = new JLabel();
        emailAluno.setText("Email: ");
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

        //CPF
        JLabel cpfAluno = new JLabel();
        cpfAluno.setText("CPF: ");
        cpfAluno.setBounds(0, 70, 40, 20);
        tela.add(cpfAluno);

        JTextField textoCpf = new JTextField();
        textoCpf.setBounds(50, 70, 200, 20);
        textoCpf.setForeground(new Color(97, 248, 3));
        textoCpf.setBackground(new Color(0, 0 ,0));
        tela.add(textoCpf);

        JButton cpfButton = new JButton("Aplicar");
        cpfButton.setBounds(260, 70, 100, 20);
        cpfButton.setForeground(new Color(97, 248, 3));
        cpfButton.setBackground(new Color(0, 0 ,0));
        tela.add(cpfButton);

        //RG
        JLabel rgAluno = new JLabel();
        rgAluno.setText("RG: ");
        rgAluno.setBounds(0, 100, 40, 20);
        tela.add(rgAluno);

        JTextField textoRg = new JTextField();
        textoRg.setBounds(50, 100, 200, 20);
        textoRg.setForeground(new Color(97, 248, 3));
        textoRg.setBackground(new Color(0, 0 ,0));
        tela.add(textoRg);

        JButton rgButton = new JButton("Aplicar");
        rgButton.setBounds(260, 100, 100, 20);
        rgButton.setForeground(new Color(97, 248, 3));
        rgButton.setBackground(new Color(0, 0 ,0));
        tela.add(rgButton);

        //Gênero Aluno(Sexo)
        JLabel generoAluno = new JLabel();
        generoAluno.setText("Sexo: ");
        generoAluno.setBounds(0, 130, 40, 20);
        tela.add(generoAluno);

        JCheckBox sexoButton1 = new JCheckBox();
        sexoButton1.setBounds(50, 130, 90, 20);
        sexoButton1.setText("Masculino");
        tela.add(sexoButton1);

        JCheckBox sexoButton2 = new JCheckBox();
        sexoButton2.setBounds(145, 130, 90, 20);
        sexoButton2.setText("Feminino");
        tela.add(sexoButton2);

        //Bolsa Escolar
        JLabel bolsAluno = new JLabel();
        bolsAluno.setText("Bolsa Escolar: ");
        bolsAluno.setBounds(0, 160, 90, 20);
        tela.add(bolsAluno);

        JCheckBox bolsaButton1 = new JCheckBox();
        bolsaButton1.setBounds(100, 160, 60, 20);
        bolsaButton1.setText("Sim");
        tela.add(bolsaButton1);

        JCheckBox bolsaButton2 = new JCheckBox();
        bolsaButton2.setBounds(170, 160, 60, 20);
        bolsaButton2.setText("Não");
        tela.add(bolsaButton2);
    }
}
