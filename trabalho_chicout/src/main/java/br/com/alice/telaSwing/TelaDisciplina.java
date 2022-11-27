package br.com.alice.telaSwing;

import javax.swing.*;
import java.awt.*;

public class TelaDisciplina {

    public TelaDisciplina() {

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

        //Carga Horária
        JLabel cargaHCurso = new JLabel();
        cargaHCurso.setText("Carga: ");
        cargaHCurso.setBounds(0, 40, 40, 20);
        tela.add(cargaHCurso);

        JTextField textoCarga = new JTextField();
        textoCarga.setBounds(50, 40, 200, 20);
        textoCarga.setForeground(new Color(97, 248, 3));
        textoCarga.setBackground(new Color(0, 0 ,0));
        tela.add(textoCarga);

        JButton cargaButton = new JButton("Aplicar");
        cargaButton.setBounds(260, 40, 100, 20);
        cargaButton.setForeground(new Color(97, 248, 3));
        cargaButton.setBackground(new Color(0, 0 ,0));
        tela.add(cargaButton);

        //Horário
        JLabel horaDis = new JLabel();
        horaDis.setText("Horário: ");
        horaDis.setBounds(0, 70, 80, 20);
        tela.add(horaDis);

        JTextField textoHora = new JTextField();
        textoHora.setBounds(50, 70, 200, 20);
        textoHora.setForeground(new Color(97, 248, 3));
        textoHora.setBackground(new Color(0, 0 ,0));
        tela.add(textoHora);

        JButton horaButton = new JButton("Aplicar");
        horaButton.setBounds(260, 70, 100, 20);
        horaButton.setForeground(new Color(97, 248, 3));
        horaButton.setBackground(new Color(0, 0 ,0));
        tela.add(horaButton);
    }
}
