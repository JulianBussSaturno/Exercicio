/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testepoo;

import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class Main {

    public static void main(String[] args) {

        NotaFiscal cliente = new NotaFiscal();

        cliente.nome = JOptionPane.showInputDialog("Digite o nome");
        
        cliente.cnpj = Long.parseLong(JOptionPane.showInputDialog("Digite o CNPJ"));
        
        cliente.data_cadastro = Integer.parseInt(JOptionPane.showInputDialog("A Data Cadastrada"));
        
        cliente.quantidade_total = Integer.parseInt(JOptionPane.showInputDialog(" Quantidade total"));
        
        cliente.valor = Double.parseDouble(JOptionPane.showInputDialog("Valor Total "));

        cliente.peso = Double.parseDouble(JOptionPane.showInputDialog("Peso Total"));
    }
}
