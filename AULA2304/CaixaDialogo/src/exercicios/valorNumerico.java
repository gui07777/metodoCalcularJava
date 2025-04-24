package exercicios;

import javax.swing.JOptionPane;


public class valorNumerico {
    public static void main(String[] args){

        int idade = Integer.parseInt(JOptionPane.showInputDialog(message:"Digite a sua idade:"));
        JOptionPane.showMessageDialog(null, args, null, idade);
}
}