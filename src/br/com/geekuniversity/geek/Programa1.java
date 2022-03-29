package br.com.geekuniversity.geek;

import javax.swing.*;                                                         // biblioteca
import java.awt.*;                                                           // biblioteca

public class Programa1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Geek University");                   // criar tela

        JPanel panel = new JPanel();                                        // agrupar elementos na tela

        JButton btn1 = new JButton("Seja bem-vindo(a)");               // inserindo elementos
        JButton btn2 = new JButton("Programação para leigos");
        JButton btn3 = new JButton("Introdução a linguagem Java");

        panel.setLayout(new BorderLayout(1,0));                  // definindo layout do painel

        panel.add(btn1, BorderLayout.NORTH);                               // adicionar os elementos no painel
        panel.add(btn2, BorderLayout.CENTER);
        panel.add(btn3, BorderLayout.SOUTH);

        frame.setContentPane(panel);                                       // adicionar painel dentro da tela
        frame.pack();                                                      // empacota todos os componentes dentro do frame(tela)
        frame.setSize(640, 480);                               // definir o tamanho da tela
        frame.setVisible(true);                                           // definir visibilidade ******
    }
}
