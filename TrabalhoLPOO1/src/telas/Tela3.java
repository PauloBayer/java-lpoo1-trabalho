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
import classes.Veiculo;
import javax.swing.table.DefaultTableModel;

/**
 * @author RAVEN
 */
public class Tela3 extends TransitionsForm {

    public Tela3() {
        initComponents();
        popularComboBoxes();
        fillTable();
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
        inputNomeCliente = new javax.swing.JTextField();
        automovelRB1 = new javax.swing.JRadioButton();
        motocicletaRB2 = new javax.swing.JRadioButton();
        vanRB3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFiltrada = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ClientesLocarTable = new javax.swing.JTable();
        PesquisarClienteButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        inputSobrenomeCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputCPFCliente = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 79, 79));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Área de Filtro:");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(79, 79, 79));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Locar Veículos");

        bPesquisarCliente.setText("Pequisar Veículo");
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
        jLabel9.setText("Nome");

        inputNomeCliente.setToolTipText("Cliente ou CPF");
        inputNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeClienteActionPerformed(evt);
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

        ClientesLocarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Nome", "Sobrenome", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ClientesLocarTable);

        PesquisarClienteButton.setText("Pesquisar Cliente");
        PesquisarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarClienteButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Sobrenome");

        jLabel5.setText("CPF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputSobrenomeCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputCPFCliente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(marcaSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(categoriaSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(3, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bPesquisarCliente)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(automovelRB1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(motocicletaRB2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vanRB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PesquisarClienteButton)
                        .addGap(262, 262, 262))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(inputNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(inputSobrenomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(inputCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(automovelRB1)
                    .addComponent(motocicletaRB2)
                    .addComponent(vanRB3)
                    .addComponent(PesquisarClienteButton))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(marcaSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(categoriaSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bPesquisarCliente)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel2)
                    .addContainerGap(443, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarClienteActionPerformed
            
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
        fillTable();
 
    }//GEN-LAST:event_bPesquisarClienteActionPerformed

    private void fillTableCliente(Cliente[] clientes) {
        DefaultTableModel model = (DefaultTableModel) ClientesLocarTable.getModel();
           model.setRowCount(0);
           
            if (clientes != null) {
            
                for (Cliente cliente : clientes) {

                    Object[] rowData = {
                        cliente.getName(),
                        cliente.getSobrenome(),
                        cliente.getCPF()
                    };

                    model.addRow(rowData);
                }
            }
    }
    
        private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tableFiltrada.getModel();
           model.setRowCount(0);
           Veiculo[] veiculos = Main.veiculos;
           
            if (veiculos != null) {
            
                for (Veiculo veiculo : veiculos) {
                    String modelo = "";
                    double precoDiaria = 0;

                    if (veiculo instanceof Automovel) {
                        modelo = ((Automovel) veiculo).getModelo().toString();
                        precoDiaria = veiculo.getValorDiariaLocacao();
                    } else if (veiculo instanceof Van) {
                        modelo = ((Van) veiculo).getModelo().toString();
                        precoDiaria = veiculo.getValorDiariaLocacao();
                    } else if (veiculo instanceof Motocicleta) {
                        modelo = ((Motocicleta) veiculo).getModelo().toString();
                        precoDiaria = veiculo.getValorDiariaLocacao();
                    }

                    Object[] rowData = {
                        veiculo.getPlaca(),
                        veiculo.getMarca(),
                        modelo,
                        veiculo.getAno(),
                        precoDiaria
                    };

                    model.addRow(rowData);
                }
            }
    }
    
    private void marcaSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaSelectActionPerformed
        // MARCA
    }//GEN-LAST:event_marcaSelectActionPerformed

    private void inputNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeClienteActionPerformed
            //Input que recebe Nome ou CPF
    }//GEN-LAST:event_inputNomeClienteActionPerformed

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
    
    private void automovelRB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automovelRB1ActionPerformed
      
    }//GEN-LAST:event_automovelRB1ActionPerformed

    private void categoriaSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaSelectActionPerformed

    }//GEN-LAST:event_categoriaSelectActionPerformed

    private void motocicletaRB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motocicletaRB2ActionPerformed

    }//GEN-LAST:event_motocicletaRB2ActionPerformed

    private void vanRB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vanRB3ActionPerformed

    }//GEN-LAST:event_vanRB3ActionPerformed

    private void PesquisarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarClienteButtonActionPerformed
        String nomeCliente = inputNomeCliente.getText(); 
        String sobrenomeCliente = inputSobrenomeCliente.getText();
        String cpfClienteString = inputCPFCliente.getText();
        int cpfCliente;
        if (cpfClienteString == null || cpfClienteString == "") {
            cpfCliente = 0;
        } else {   
            cpfCliente = Integer.parseInt(cpfClienteString);
        }
        Cliente[] arrayClientes = Cliente.getAllClientes();
        Cliente[] informacoesEncontradas = null; // Array para armazenar informações encontradas

        if (arrayClientes != null && arrayClientes.length > 0) {
            for (Cliente cliente : arrayClientes) {
                if (cliente != null && (cliente.getName() != null && cliente.getName().equals(nomeCliente))
                    || cliente.getSobrenome().equals(sobrenomeCliente)
                    || cliente.getCPF() == cpfCliente) {

                    if (informacoesEncontradas == null) {
                        informacoesEncontradas = new Cliente[1];
                    } else {
                        informacoesEncontradas = new Cliente[informacoesEncontradas.length + 1];
                    }

                    informacoesEncontradas[informacoesEncontradas.length - 1] = cliente;
                    JOptionPane.showMessageDialog(this, "Cliente Encontrado!",
                        "Ação Valida", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            fillTableCliente(informacoesEncontradas);
        }
    }//GEN-LAST:event_PesquisarClienteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ClientesLocarTable;
    private javax.swing.JButton PesquisarClienteButton;
    private javax.swing.JRadioButton automovelRB1;
    private javax.swing.JButton bPesquisarCliente;
    private javax.swing.JComboBox<String> categoriaSelect;
    private javax.swing.JTextField inputCPFCliente;
    private javax.swing.JTextField inputNomeCliente;
    private javax.swing.JTextField inputSobrenomeCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup locagemTipos;
    private javax.swing.JComboBox<String> marcaSelect;
    private javax.swing.JRadioButton motocicletaRB2;
    private javax.swing.JTable tableFiltrada;
    private javax.swing.JRadioButton vanRB3;
    // End of variables declaration//GEN-END:variables
}
