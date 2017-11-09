/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.view;

import br.com.petshop.dao.ClienteDAO;
import br.com.petshop.modelo.entidade.Cliente;
import br.com.petshop.util.ValidaCpf;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.UIManager;
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
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setResizable(false);
        //Pré configuração da tabela
        DefaultTableModel modelo = (DefaultTableModel) jtableClientes.getModel();
        jtableClientes.setRowSorter(new TableRowSorter(modelo));        
        carregarTabela();
        // Pré configuração da combobox
        
        this.jButton4.setEnabled(false);
        this.jButton3.setEnabled(false);
        
    }
    
    public void carregarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) jtableClientes.getModel();
        ClienteDAO cDao = new ClienteDAO();
        
        modelo.setNumRows(0);
        for (Cliente c : cDao.read()) {
            modelo.addRow(new Object[]{c.getId_cliente(), c.getNome_cliente(),
                c.getBairro_cliente(), c.getRua_cliente()});
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
        cep_cliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txFiltro = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableClientes = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jButton5 = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, -1, -1));

        jLabel2.setText("Código:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        id_cliente.setEditable(false);
        getContentPane().add(id_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));
        getContentPane().add(nome_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 220, -1));

        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));
        getContentPane().add(email_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 330, -1));

        jLabel5.setText("Cpf:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        cpf_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpf_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(cpf_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, -1));

        jLabel6.setText("Rua:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));
        getContentPane().add(rua_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 330, -1));

        jLabel7.setText("Bairro");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        getContentPane().add(bairro_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, -1, -1));

        jLabel9.setText("CEP");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));
        getContentPane().add(cep_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 220, -1));

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
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 150, 30));

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 150, 30));

        jButton4.setText("Excluir");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 150, 30));

        jLabel11.setText("Pesquisar:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        txFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txFiltroActionPerformed(evt);
            }
        });
        getContentPane().add(txFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 270, -1));

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
        jtableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableClientesMouseClicked(evt);
            }
        });
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
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Integer id = Integer.parseInt(jtableClientes.getValueAt(jtableClientes.getSelectedRow(), 0).toString());
        ClienteDAO cDao = new ClienteDAO();
        Cliente c = new Cliente();
        c.setId_cliente(id);
        cDao.delete(c);
        carregarTabela();        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableClientesMouseClicked
        this.jButton4.setEnabled(true);        
        this.jButton3.setEnabled(true);        
        

    }//GEN-LAST:event_jtableClientesMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        /*
        Integer id = Integer.parseInt(jtableClientes.getValueAt(jtableClientes.getSelectedRow(), 0).toString());
         ClienteDAO cDao = new ClienteDAO();
         //Cliente c = new Cliente();
         System.out.println(id);
         cDao.findById(id);
         System.out.println(cDao.findById(id).getNome_cliente());
                 
         nome_cliente.setText(cDao.findById(id).getNome_cliente());
         id_cliente.setText(cDao.findById(id).getId_cliente().toString());
         rua_cliente.setText(cDao.findById(id).getRua_cliente());
         bairro_cliente.setText(cDao.findById(id).getBairro_cliente());
         telefone.setText(cDao.findById(id).getTelefone());
         cep_cliente.setText(cDao.findById(id).getCep_cliente());
         */
        Integer id = Integer.parseInt(jtableClientes.getValueAt(jtableClientes.getSelectedRow(), 0).toString());
        ClienteDAO cDao = new ClienteDAO();
        //Cliente c = new Cliente();
        System.out.println(id);
        for (Cliente c : cDao.findById(id)) {
            nome_cliente.setText(c.getNome_cliente());
            id_cliente.setText(c.getId_cliente().toString());
            rua_cliente.setText(c.getRua_cliente());
            bairro_cliente.setText(c.getBairro_cliente());
            telefone.setText(c.getTelefone());
            cep_cliente.setText(c.getCep_cliente());
            cpf_cliente.setText(c.getCpf_cliente());
            email_cliente.setText(c.getEmail_cliente());
        }
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void cpf_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpf_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpf_clienteActionPerformed

    private void txFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txFiltroActionPerformed
        
        String buscaTexto = txFiltro.getText();
        ClienteDAO cDao = new ClienteDAO();        
        cDao.findBy(buscaTexto);        
        carregarTabela();
        
    }//GEN-LAST:event_txFiltroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.nome_cliente.setText("");
        this.id_cliente.setText("");
        this.email_cliente.setText("");
        this.rua_cliente.setText("");
        this.bairro_cliente.setText("");
        this.telefone.setText("");
        this.cpf_cliente.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        ClienteDAO cDao = new ClienteDAO();
        Cliente c = new Cliente();
        c.setNome_cliente(this.nome_cliente.getText());
        c.setBairro_cliente(this.bairro_cliente.getText());
        c.setRua_cliente(this.rua_cliente.getText());
        c.setTelefone(this.telefone.getText());
        c.setCep_cliente(this.cep_cliente.getText());
        c.setEmail_cliente(this.email_cliente.getText());
        //c.setCpf_cliente(this.cpf_cliente.getText());
        ValidaCpf v = new ValidaCpf();
        if (v.isCPF(this.cpf_cliente.getText())) {
            c.setCpf_cliente(this.cpf_cliente.getText());
            if (this.id_cliente.getText().toString().equals("")
                    || this.id_cliente.getText().equals(null)) {
                cDao.insert(c);
            } else {
                c.setId_cliente(Integer.parseInt(this.id_cliente.getText()));
                cDao.update(c);
            }
            carregarTabela();
        } else {
            JOptionPane.showMessageDialog(null, "CPF inválido, tente novamente! ");
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro_cliente;
    private javax.swing.JTextField cep_cliente;
    private javax.swing.JTextField cpf_cliente;
    private javax.swing.JTextField email_cliente;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JTable jtableClientes;
    private javax.swing.JTextField nome_cliente;
    private javax.swing.JTextField rua_cliente;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField txFiltro;
    // End of variables declaration//GEN-END:variables
}
