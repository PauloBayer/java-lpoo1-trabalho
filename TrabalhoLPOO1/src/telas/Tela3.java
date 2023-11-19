package telas;

import transitions.TransitionsForm;
import main.Main;
import classes.Cliente;
import javax.swing.JOptionPane;
import enums.Marca;
import enums.Categoria;
import enums.Estado;
import enums.ModeloAutomovel;
import enums.ModeloMotocicleta;
import enums.ModeloVan;
import classes.Automovel;
import classes.Motocicleta;
import classes.Van;
import javax.swing.table.DefaultTableModel;

/**
 * @author RAVEN
 */
public class Tela3 extends TransitionsForm {

    public Tela3() {
        initComponents();
        popularComboBoxes();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        locagemTipos = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bPesquisarCliente = new javax.swing.JButton();
        marcaSelect = new javax.swing.JComboBox<>();
        categoriaSelect = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inputSearchCliente = new javax.swing.JTextField();
        bPesquisarAutomovel = new javax.swing.JButton();
        automovelRB1 = new javax.swing.JRadioButton();
        motocicletaRB2 = new javax.swing.JRadioButton();
        vanRB3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFiltrada = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 79, 79));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Área de Filtro:");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(79, 79, 79));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Locagem de Automóveis");

        bPesquisarCliente.setText("Pequisar");
        bPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarClienteActionPerformed(evt);
            }
        });

        marcaSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        marcaSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaSelectActionPerformed(evt);
            }
        });

        categoriaSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        categoriaSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaSelectActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo:");

        jLabel6.setText("Marca:");

        jLabel7.setText("Categoria:");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(79, 79, 79));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Pesquisar Cliente:");

        inputSearchCliente.setToolTipText("Cliente ou CPF");
        inputSearchCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSearchClienteActionPerformed(evt);
            }
        });

        bPesquisarAutomovel.setText("Pesquisar");
        bPesquisarAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarAutomovelActionPerformed(evt);
            }
        });

        locagemTipos.add(automovelRB1);
        automovelRB1.setText("Automóvel");
        automovelRB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                automovelRB1ActionPerformed(evt);
            }
        });

        locagemTipos.add(motocicletaRB2);
        motocicletaRB2.setText("Motocicleta");
        motocicletaRB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motocicletaRB2ActionPerformed(evt);
            }
        });

        locagemTipos.add(vanRB3);
        vanRB3.setText("Van");
        vanRB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vanRB3ActionPerformed(evt);
            }
        });

        tableFiltrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Placa", "Marca", "Modelo", "Ano", "Preço/D"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableFiltrada);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marcaSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(categoriaSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(automovelRB1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(motocicletaRB2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vanRB3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputSearchCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bPesquisarCliente)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bPesquisarAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(inputSearchCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPesquisarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(automovelRB1)
                    .addComponent(motocicletaRB2)
                    .addComponent(vanRB3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(marcaSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoriaSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bPesquisarAutomovel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel2)
                    .addContainerGap(423, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarClienteActionPerformed
    String infoCliente = inputSearchCliente.getText(); 
    Cliente[] arrayClientes = Main.clienteTeste;
    Cliente[] informacoesEncontradas = new Cliente[1]; // Array para armazenar informações encontradas

    if (arrayClientes != null && arrayClientes.length > 0) {
    for (Cliente cliente : arrayClientes) {
        if (cliente != null &&  (cliente.getName() != null && cliente.getName().equals(infoCliente)) || Integer.toString(cliente.getCPF()).equals(infoCliente)) { 
            // Verifica se o CPF é igual ao pesquisado
            informacoesEncontradas[0] = cliente; // Armazena as informações do cliente encontrado
            JOptionPane.showMessageDialog(this, "Cliente Encontrado!",
                "Ação Validai", JOptionPane.INFORMATION_MESSAGE);
            break; // Se encontrou, sai do loop
        }
    }
     // Verifica se algum dos tipos de locagem está selecionado
    if (!automovelRB1.isSelected() && !motocicletaRB2.isSelected() && !vanRB3.isSelected()) {
        JOptionPane.showMessageDialog(this, "Selecione um tipo de locagem.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Verifica se uma marca ou categoria foi selecionada
    String marcaSelecionada = marcaSelect.getSelectedItem().toString();
    String categoriaSelecionada = categoriaSelect.getSelectedItem().toString();
    if (marcaSelecionada.equals("Selecionar") && categoriaSelecionada.equals("Selecionar")) {
        JOptionPane.showMessageDialog(this, "Selecione uma marca ou categoria.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
        }
  }
    }//GEN-LAST:event_bPesquisarClienteActionPerformed

    private void marcaSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaSelectActionPerformed
        // MARCA
    }//GEN-LAST:event_marcaSelectActionPerformed

    private void inputSearchClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSearchClienteActionPerformed
            //Input que recebe Nome ou CPF
    }//GEN-LAST:event_inputSearchClienteActionPerformed

    private void popularComboBoxes() {
     // Limpa os treco tudo
    marcaSelect.removeAllItems();
    categoriaSelect.removeAllItems();
    
    // Opção "Neutra"
    marcaSelect.addItem("Selecionar");
    categoriaSelect.addItem("Selecionar");
    
    // Obtendo os valores do enum Marca
    Marca[] marcasDisponiveis = Marca.values();

    // Iterando e preenchendo o ComboBox marcaSelect
    for (Marca marca : marcasDisponiveis) {
        marcaSelect.addItem(marca.toString());
    }

    // Obtendo os valores do enum Categoria
    Categoria[] categoriasDisponiveis = Categoria.values();

    // Iterando e preenchendo o ComboBox categoriaSelect
    for (Categoria categoria : categoriasDisponiveis) {
        categoriaSelect.addItem(categoria.toString());
    }
}
    
    private void bPesquisarAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarAutomovelActionPerformed

   
    }//GEN-LAST:event_bPesquisarAutomovelActionPerformed

    private void automovelRB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automovelRB1ActionPerformed
      
    }//GEN-LAST:event_automovelRB1ActionPerformed

    private void categoriaSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaSelectActionPerformed

    }//GEN-LAST:event_categoriaSelectActionPerformed

    private void motocicletaRB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motocicletaRB2ActionPerformed

    }//GEN-LAST:event_motocicletaRB2ActionPerformed

    private void vanRB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vanRB3ActionPerformed

    }//GEN-LAST:event_vanRB3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton automovelRB1;
    private javax.swing.JButton bPesquisarAutomovel;
    private javax.swing.JButton bPesquisarCliente;
    private javax.swing.JComboBox<String> categoriaSelect;
    private javax.swing.JTextField inputSearchCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup locagemTipos;
    private javax.swing.JComboBox<String> marcaSelect;
    private javax.swing.JRadioButton motocicletaRB2;
    private javax.swing.JTable tableFiltrada;
    private javax.swing.JRadioButton vanRB3;
    // End of variables declaration//GEN-END:variables
}
