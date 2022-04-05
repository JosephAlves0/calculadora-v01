package com.company;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaCalculadora {
    private JTextField txtV1;
    private JTextField txtV2;
    private JButton cmdSomar;
    private JButton cmdSubtrair;
    private JButton cmdDividir;
    private JButton cmdMultiplicar;
    private JTextField txtResult;
    private JLabel lblV1;
    private JLabel lblV2;
    private JLabel lblResult;
    private JPanel painelCalculadora;
    private Calculadora calculadora;

    public JPanel getPainelCalculadora() {
        return painelCalculadora;
    }

    public TelaCalculadora() {
        calculadora = new Calculadora();
        cmdSomar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor1 = Double.parseDouble(txtV1.getText());
                double valor2 = Double.parseDouble(txtV2.getText());
                txtResult.setText(Double.toString(calculadora.soma(valor1, valor2)));

            }
        });
        cmdSubtrair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor1 = Double.parseDouble(txtV1.getText());
                double valor2 = Double.parseDouble(txtV2.getText());
                txtResult.setText(Double.toString(calculadora.subtracao(valor1, valor2)));
            }
        });
        cmdMultiplicar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor1 = Double.parseDouble(txtV1.getText());
                double valor2 = Double.parseDouble(txtV2.getText());
                txtResult.setText(Double.toString(calculadora.multiplicacao(valor1, valor2)));
            }
        });
        cmdDividir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    double valor1 = Double.parseDouble(txtV1.getText());
                    double valor2 = Double.parseDouble(txtV2.getText());
                    txtResult.setText(Double.toString(calculadora.divisao(valor1, valor2)));
                }catch (Exception ex){
                    txtResult.setText(ex.getMessage().toString());
                }

            }
        });
    }
}
