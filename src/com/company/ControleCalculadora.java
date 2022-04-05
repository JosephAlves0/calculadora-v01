package com.company;

import javax.swing.*;

public class ControleCalculadora {

    public static void main(String[] args) {
	// write your code here
        JFrame tela = new JFrame();
        tela.setContentPane(new TelaCalculadora().getPainelCalculadora());
        tela.setSize(400,400);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setVisible(true);

    }
}
