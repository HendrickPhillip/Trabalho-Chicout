package br.com.alice.telaSwing;

import javax.swing.*;
import java.awt.*;

public class TelaProfessor {

    public TelaProfessor() {
        JFrame tela = new JFrame();
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tela.setBackground(new Color(0, 0 ,0));

        //Nome Professor
        JLabel nomeProfessor = new JLabel();
        nomeProfessor.setText("Nome: ");
        nomeProfessor.setBounds(0, 10, 40, 20);
        tela.add(nomeProfessor);

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

        //CPF
        JLabel cpfProfessor = new JLabel();
        cpfProfessor.setText("CPF: ");
        cpfProfessor.setBounds(0, 40, 40, 20);
        tela.add(cpfProfessor);

        JTextField textoCpf = new JTextField();
        textoCpf.setBounds(50, 40, 200, 20);
        textoCpf.setForeground(new Color(97, 248, 3));
        textoCpf.setBackground(new Color(0, 0 ,0));
        tela.add(textoCpf);

        JButton cpfButton = new JButton("Aplicar");
        cpfButton.setBounds(260, 40, 100, 20);
        cpfButton.setForeground(new Color(97, 248, 3));
        cpfButton.setBackground(new Color(0, 0 ,0));
        tela.add(cpfButton);

        //RG
        JLabel rgProfessor = new JLabel();
        rgProfessor.setText("RG: ");
        rgProfessor.setBounds(0, 70, 40, 20);
        tela.add(rgProfessor);

        JTextField textoRg = new JTextField();
        textoRg.setBounds(50, 70, 200, 20);
        textoRg.setForeground(new Color(97, 248, 3));
        textoRg.setBackground(new Color(0, 0 ,0));
        tela.add(textoRg);

        JButton rgButton = new JButton("Aplicar");
        rgButton.setBounds(260, 70, 100, 20);
        rgButton.setForeground(new Color(97, 248, 3));
        rgButton.setBackground(new Color(0, 0 ,0));
        tela.add(rgButton);

        //Gênero Professor(Sexo)
        JLabel generoProfessor = new JLabel();
        generoProfessor.setText("Sexo: ");
        generoProfessor.setBounds(0, 100, 40, 20);
        tela.add(generoProfessor);

        JCheckBox sexoButton1 = new JCheckBox();
        sexoButton1.setBounds(50, 100, 90, 20);
        sexoButton1.setText("Masculino");
        tela.add(sexoButton1);

        JCheckBox sexoButton2 = new JCheckBox();
        sexoButton2.setBounds(145, 100, 90, 20);
        sexoButton2.setText("Feminino");
        tela.add(sexoButton2);

        //Telefone
        JLabel telefoneProfessor = new JLabel();
        telefoneProfessor.setText("Telefone: ");
        telefoneProfessor.setBounds(0, 130, 60, 20);
        tela.add(telefoneProfessor);

        JTextField textoTelefone = new JTextField();
        textoTelefone.setBounds(70, 130, 200, 20);
        textoTelefone.setForeground(new Color(97, 248, 3));
        textoTelefone.setBackground(new Color(0, 0 ,0));
        tela.add(textoTelefone);

        JButton telefoneButton = new JButton("Aplicar");
        telefoneButton.setBounds(280, 130, 100, 20);
        telefoneButton.setForeground(new Color(97, 248, 3));
        telefoneButton.setBackground(new Color(0, 0 ,0));
        tela.add(telefoneButton);
    }
}
