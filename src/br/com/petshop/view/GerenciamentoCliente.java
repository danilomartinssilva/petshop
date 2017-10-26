/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.view;

import br.com.petshop.dao.ClienteDAO;
import br.com.petshop.modelo.entidade.Cliente;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author danilo
 */
public class GerenciamentoCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Gerenciamento
     */
    public GerenciamentoCliente() {
        initComponents();
        this.setResizable(false);
        
        

     
        
         DefaultTableModel modelo = (DefaultTableModel) jtableClientes.getModel();
        jtableClientes.setRowSorter(new TableRowSorter(modelo));
        carregarTabela();
    }
 
   
  public void carregarTabela(){
    DefaultTableModel modelo = (DefaultTableModel) jtableClientes.getModel();
    ClienteDAO cDao = new ClienteDAO();
    modelo.setNumRows(0);
        for(Cliente c: cDao.read()){
            modelo.addRow(new Object[] {c.getId_cliente(),c.getNome_cliente(),
                c.getBairro_cliente(),c.getRua_cliente()});
        }

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_cliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nome_cliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email_cliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cpf_cliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rua_cliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bairro_cliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cidade_cliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableClientes = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jButton5 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, -1, -1));

        jLabel2.setText("Código:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        getContentPane().add(id_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));
        getContentPane().add(nome_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 220, -1));

        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));
        getContentPane().add(email_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 330, -1));

        jLabel5.setText("Cpf:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        getContentPane().add(cpf_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, -1));

        jLabel6.setText("Rua:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));
        getContentPane().add(rua_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 330, -1));

        jLabel7.setText("Bairro");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        getContentPane().add(bairro_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, -1, -1));

        jLabel9.setText("Cidade");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));
        getContentPane().add(cidade_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 220, -1));

        jLabel10.setText("Telefone");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));
        getContentPane().add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 220, -1));

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 30));

        jButton2.setText("Limpar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 150, 30));

        jButton3.setText("Editar");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 150, 30));

        jButton4.setText("Excluir");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 150, 30));

        jLabel11.setText("Pesquisar:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 190, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        jScrollPane2.setBorder(null);
        jScrollPane2.setToolTipText("");

        jtableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "RUA", "BAIRRO", "CEP", "TELEFONE"
            }
        ));
        jScrollPane2.setViewportView(jtableClientes);
        if (jtableClientes.getColumnModel().getColumnCount() > 0) {
            jtableClientes.getColumnModel().getColumn(0).setMinWidth(50);
            jtableClientes.getColumnModel().getColumn(0).setMaxWidth(70);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 770, 120));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jButton5.setText("Sair");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
           
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        System.out.println("Teste");
    }//GEN-LAST:event_jComboBox1ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt){
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro_cliente;
    private javax.swing.JTextField cidade_cliente;
    private javax.swing.JTextField cpf_cliente;
    private javax.swing.JTextField email_cliente;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable jtableClientes;
    private javax.swing.JTextField nome_cliente;
    private javax.swing.JTextField rua_cliente;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables
}