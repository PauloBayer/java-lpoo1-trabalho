/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import transitions.TransitionsForm;
import classes.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author janaina
 */
public class Tela1 extends TransitionsForm {
    /**
     * Creates new form Form
     */
    public Tela1() {
        initComponents();
        DefaultTableModel modeloTabela = (DefaultTableModel) tableClient.getModel();
        modeloTabela.setRowCount(0);
            Cliente [] arrayClientes = Cliente.getClientes();
            if ((arrayClientes != null)&&(arrayClientes.length > 0)) {
                for (int i = 0; i < arrayClientes.length; i++) {
                    try {
                        modeloTabela.addRow(new Object[]{arrayClientes[i].getName(),
                            arrayClientes[i].getSobrenome(), arrayClientes[i].getRG(),
                            arrayClientes[i].getCPF(), arrayClientes[i].getEndereco()});
                    } catch (Exception e) {
                        // Trate a exceção conforme necessário
                        e.printStackTrace();
                    }
                }
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

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        inputName = new javax.swing.JTextField();
        inputSobreNome = new javax.swing.JTextField();
        inputRG = new javax.swing.JTextField();
        inputCPF = new javax.swing.JTextField();
        inputEndereco = new javax.swing.JTextField();
        bCriar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bExcluir = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableClient = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(734, 471));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(79, 79, 79));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cadastrar Cliente");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 890, -1));

        jPanel1.setBackground(new java.awt.Color(235, 155, 89));

        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        inputSobreNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSobreNomeActionPerformed(evt);
            }
        });

        inputRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRGActionPerformed(evt);
            }
        });

        inputCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCPFActionPerformed(evt);
            }
        });

        inputEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEnderecoActionPerformed(evt);
            }
        });

        bCriar.setText("Criar");
        bCriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCriarMouseClicked(evt);
            }
        });
        bCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCriarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Sobrenome:");

        jLabel3.setText("RG:");

        jLabel4.setText("CPF:");

        jLabel5.setText("Endereço");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(inputName, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(inputSobreNome)
                    .addComponent(inputRG)
                    .addComponent(inputCPF)
                    .addComponent(inputEndereco)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(bCriar)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputSobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bCriar)
                .addGap(27, 27, 27))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 70, -1, 330));

        bExcluir.setText("Excluir");
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });
        add(bExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, -1, -1));

        bEdit.setText("Editar");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });
        add(bEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, -1));

        tableClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Sobrenome", "RG", "CPF", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableClient);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 849, 149));
    }// </editor-fold>//GEN-END:initComponents

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void inputSobreNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSobreNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSobreNomeActionPerformed

    private void inputRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputRGActionPerformed

    private void inputCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCPFActionPerformed

    private void inputEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEnderecoActionPerformed
    //Criar cliente
    private void bCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCriarActionPerformed
        // TODO add your handling code here:
        String nome = inputName.getText();
        String sobrenome = inputSobreNome.getText();
        String S_RG = inputRG.getText();
        String S_CPF = inputCPF.getText();
        String endereco = inputEndereco.getText();
        try {
            int RG = Integer.parseInt(S_RG);
            int CPF = Integer.parseInt(S_CPF);
            
            Cliente novoCliente = new Cliente(nome, sobrenome, RG, CPF, endereco);
            //cria linha na tabela
            DefaultTableModel modeloTabela = (DefaultTableModel) tableClient.getModel();
            modeloTabela.setRowCount(0);
            Cliente [] arrayClientes = Cliente.getClientes();
           for(int i=0;i<arrayClientes.length;i++){
                modeloTabela.addRow(new Object[]{arrayClientes[i].getName(),
                    arrayClientes[i].getSobrenome(),arrayClientes[i].getRG(),arrayClientes[i].getCPF(),arrayClientes[i].getEndereco()});
            }
            
           
            JOptionPane.showMessageDialog(this, "Cliente criado com sucesso!",
                "Sucesso ao criar cliente", JOptionPane.INFORMATION_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Erro ao criar cliente. Certifique-se de que RG e CPF são números válidos.",
                "Erro ao criar cliente", JOptionPane.ERROR_MESSAGE);
    }   
    }//GEN-LAST:event_bCriarActionPerformed

    private void bCriarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCriarMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bCriarMouseClicked

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableClient.getSelectedRow();
        if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Selecione um cliente para editar.",
                "Erro", JOptionPane.ERROR_MESSAGE);
        return;
        }
        String nome = (String)tableClient.getValueAt(selectedRow,0);
        String sobrenome = (String)tableClient.getValueAt(selectedRow,1);
        int RG = Integer.parseInt(tableClient.getValueAt(selectedRow, 2).toString());
        int CPF = Integer.parseInt(tableClient.getValueAt(selectedRow, 3).toString());
        String endereco = (String)tableClient.getValueAt(selectedRow,4);
        Cliente clienteEdit = Cliente.getCliente(selectedRow);
        clienteEdit.ChangeCliente(nome,sobrenome,RG,CPF,endereco);
    }//GEN-LAST:event_bEditActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableClient.getSelectedRow();

    // Verificar se alguma linha está selecionada
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Selecione um cliente para excluir.",
                "Erro ao excluir cliente", JOptionPane.ERROR_MESSAGE);
        return;
    }
    // Remove a linha selecionada na tabela
    DefaultTableModel modeloTabela = (DefaultTableModel) tableClient.getModel();
    modeloTabela.removeRow(selectedRow);
    Cliente ClienteExclud = Cliente.getCliente(selectedRow);
    ClienteExclud.DeleteCliente();
    }//GEN-LAST:event_bExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCriar;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bExcluir;
    private javax.swing.JTextField inputCPF;
    private javax.swing.JTextField inputEndereco;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputRG;
    private javax.swing.JTextField inputSobreNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableClient;
    // End of variables declaration//GEN-END:variables
}
