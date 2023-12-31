/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

import classes.Automovel;
import classes.Motocicleta;
import classes.Van;
import enums.Categoria;
import enums.Estado;
import enums.Marca;
import enums.ModeloAutomovel;
import enums.ModeloMotocicleta;
import enums.ModeloVan;
import main.Main;

import java.awt.event.ItemEvent;
import java.text.ParseException;
import javax.swing.JOptionPane;

import transitions.TransitionsForm;

/**
 *
 * @author RAVEN
 */
public class Tela2 extends TransitionsForm {

    private String[] marca, estado, categoria, modeloAutomovel, modeloMotocicleta, modeloVan;
    
    /**
     * Creates new form Form
     */
    public Tela2() {
        createOptions();
        initComponents();
        addRadioButtonsToGroup();
        addRadioButtonListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        MarcaComboBox = new javax.swing.JComboBox<>();
        CategoriaComboBox = new javax.swing.JComboBox<>();
        EstadoComboBox = new javax.swing.JComboBox<>();
        CadastrarVeiculoButton = new javax.swing.JButton();
        AutomovelRadioButton = new javax.swing.JRadioButton();
        MotocicletaRadioButton = new javax.swing.JRadioButton();
        VanRadioButton = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        ModeloAutomovelComboBox = new javax.swing.JComboBox<>();
        ModeloMotocicletaComboBox = new javax.swing.JComboBox<>();
        ModeloVanComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        try {
            MaskFormatter mascaraPlaca = new MaskFormatter("UUU-####");
            mascaraPlaca.setValidCharacters("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
            PlacaTextField = new javax.swing.JFormattedTextField(mascaraPlaca);
            try {
                MaskFormatter mascaraValor = new MaskFormatter("R$ ###.###,00");
                mascaraValor.setPlaceholderCharacter('0');
                ValorTextField = new javax.swing.JFormattedTextField(mascaraValor);
                try {
                    MaskFormatter mascaraAno = new MaskFormatter("####");
                    mascaraAno.setValidCharacters("0123456789");
                    AnoTextField = new javax.swing.JFormattedTextField(mascaraAno);

                    jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
                    jLabel1.setForeground(new java.awt.Color(79, 79, 79));
                    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel1.setText("Cadastrar Veículos");

                    MarcaComboBox.setModel(new DefaultComboBoxModel<>(marca));

                    CategoriaComboBox.setModel(new DefaultComboBoxModel<>(categoria));

                    EstadoComboBox.setModel(new DefaultComboBoxModel<>(estado));

                    CadastrarVeiculoButton.setText("Cadastrar Veículo");
                    CadastrarVeiculoButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            CadastrarVeiculoButtonActionPerformed(evt);
                        }
                    });

                    AutomovelRadioButton.setText("Automóvel");

                    MotocicletaRadioButton.setText("Motocicleta");

                    VanRadioButton.setText("Van");

                    jPanel1.setOpaque(false);

                    ModeloAutomovelComboBox.setModel(new DefaultComboBoxModel<>(modeloAutomovel));

                    ModeloMotocicletaComboBox.setModel(new DefaultComboBoxModel<>(modeloMotocicleta));

                    ModeloVanComboBox.setModel(new DefaultComboBoxModel<>(modeloVan));

                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                    jPanel1.setLayout(jPanel1Layout);
                    jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ModeloAutomovelComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ModeloMotocicletaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ModeloVanComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap())
                    );
                    jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(ModeloAutomovelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ModeloMotocicletaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ModeloVanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(22, Short.MAX_VALUE))
                    );

                    jLabel2.setText("Qual tipo de veículo você gostaria de cadastrar?");

                    jLabel3.setText("Escolha a marca do seu veículo:");

                    jLabel4.setText("Escolha o modelo do seu veículo:");

                    jLabel5.setText("Qual o ano do veículo?");

                    jLabel6.setText("Qual a categoria do veículo?");

                    jLabel7.setText("Em qual estado o veículo se encontra no momento?");

                    jLabel8.setText("Placa do veículo:");

                    jLabel9.setText("Valor de compra do veículo:");

                } catch (ParseException ex) {
                    ex.printStackTrace();
                }

            } catch (ParseException ex) {
                ex.printStackTrace();
            }

        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AutomovelRadioButton)
                                        .addGap(36, 36, 36)
                                        .addComponent(MotocicletaRadioButton))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(MarcaComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(CadastrarVeiculoButton))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(CategoriaComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(160, 160, 160))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8)
                                                    .addComponent(EstadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(ValorTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(PlacaTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGap(35, 35, 35))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(VanRadioButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(AnoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(160, 160, 160)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AutomovelRadioButton)
                    .addComponent(MotocicletaRadioButton)
                    .addComponent(VanRadioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarcaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CategoriaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EstadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CadastrarVeiculoButton)
                            .addComponent(PlacaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(ValorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarVeiculoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarVeiculoButtonActionPerformed
        try {
            
            Marca marca = Marca.valueOf(MarcaComboBox.getSelectedItem().toString());
            Estado estado = Estado.valueOf(EstadoComboBox.getSelectedItem().toString());
            Categoria categoria = Categoria.valueOf(CategoriaComboBox.getSelectedItem().toString());
            ModeloAutomovel modeloAutomovel = ModeloAutomovel.valueOf(ModeloAutomovelComboBox.getSelectedItem().toString());
            ModeloMotocicleta modeloMotocicleta = ModeloMotocicleta.valueOf(ModeloMotocicletaComboBox.getSelectedItem().toString());
            ModeloVan modeloVan = ModeloVan.valueOf(ModeloVanComboBox.getSelectedItem().toString());
            double valor = Double.parseDouble(getRawValue(ValorTextField)) / 100;
            String placa = PlacaTextField.getText();
            int ano = Integer.parseInt(AnoTextField.getText());

            if (AutomovelRadioButton.isSelected()) {

                Automovel automovel = new Automovel(marca, categoria, estado, valor, placa, ano, modeloAutomovel);
                Main.addVeiculo(automovel);
                JOptionPane.showMessageDialog(this, "Automóvel criado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE); 

            } else if (MotocicletaRadioButton.isSelected()) {

                Motocicleta motocicleta = new Motocicleta(marca, categoria, estado, valor, placa, ano, modeloMotocicleta);
                Main.addVeiculo(motocicleta);
                JOptionPane.showMessageDialog(this, "Motocicleta criada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE); 

            } else if (VanRadioButton.isSelected()) {

                Van van = new Van(marca, categoria, estado, valor, placa, ano, modeloVan);
                Main.addVeiculo(van);
                JOptionPane.showMessageDialog(this, "Van criada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE); 
                
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro ao criar veículo. Cerfique-se que todas as informações estão inseridas corretamente.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CadastrarVeiculoButtonActionPerformed
    
    private String getRawValue(JFormattedTextField textField) {
        String formattedText = textField.getText();
        return formattedText.replaceAll("[^0-9]", "");
    }
    
    private void addRadioButtonsToGroup() {
        buttonGroup1.add(AutomovelRadioButton);
        buttonGroup1.add(MotocicletaRadioButton);
        buttonGroup1.add(VanRadioButton);
        
        ModeloAutomovelComboBox.setVisible(false);
        ModeloMotocicletaComboBox.setVisible(false);
        ModeloVanComboBox.setVisible(false);
    }
    
    private void addRadioButtonListeners() {
        AutomovelRadioButton.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioButtonStateChanged(evt);
            }
        });

        MotocicletaRadioButton.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioButtonStateChanged(evt);
            }
        });

        VanRadioButton.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioButtonStateChanged(evt);
            }
        });
    }
    
    public void radioButtonStateChanged(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            
            if (AutomovelRadioButton.isSelected()) {
                ModeloAutomovelComboBox.setVisible(true);
                ModeloMotocicletaComboBox.setVisible(false);
                ModeloVanComboBox.setVisible(false);

            } else if (MotocicletaRadioButton.isSelected()) {
                ModeloAutomovelComboBox.setVisible(false);
                ModeloMotocicletaComboBox.setVisible(true);
                ModeloVanComboBox.setVisible(false);

            } else if (VanRadioButton.isSelected()) {
                ModeloAutomovelComboBox.setVisible(false);
                ModeloMotocicletaComboBox.setVisible(false);
                ModeloVanComboBox.setVisible(true);
            
            }
        }
    }

    public void createOptions() {
        marca = new String[Marca.values().length];
        for (int i = 0; i < Marca.values().length; i++) {
            marca[i] = Marca.values()[i].toString();
        }
        
        categoria = new String[Categoria.values().length];
        for (int i = 0; i < Categoria.values().length; i++) {
            categoria[i] = Categoria.values()[i].toString();
        }
        
        estado = new String[Estado.values().length];
        for (int i = 0; i < Estado.values().length; i++) {
            estado[i] = Estado.values()[i].toString();
        }
        
        modeloAutomovel = new String[ModeloAutomovel.values().length];
        for (int i = 0; i < ModeloAutomovel.values().length; i++) {
            modeloAutomovel[i] = ModeloAutomovel.values()[i].toString();
        }
        
        modeloMotocicleta = new String[ModeloMotocicleta.values().length];
        for (int i = 0; i < ModeloMotocicleta.values().length; i++) {
            modeloMotocicleta[i] = ModeloMotocicleta.values()[i].toString();
        }
        
        modeloVan = new String[ModeloVan.values().length];
        for (int i = 0; i < ModeloVan.values().length; i++) {
            modeloVan[i] = ModeloVan.values()[i].toString();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField AnoTextField;
    private javax.swing.JRadioButton AutomovelRadioButton;
    private javax.swing.JButton CadastrarVeiculoButton;
    private javax.swing.JComboBox<String> CategoriaComboBox;
    private javax.swing.JComboBox<String> EstadoComboBox;
    private javax.swing.JComboBox<String> MarcaComboBox;
    private javax.swing.JComboBox<String> ModeloAutomovelComboBox;
    private javax.swing.JComboBox<String> ModeloMotocicletaComboBox;
    private javax.swing.JComboBox<String> ModeloVanComboBox;
    private javax.swing.JRadioButton MotocicletaRadioButton;
    private javax.swing.JFormattedTextField PlacaTextField;
    private javax.swing.JFormattedTextField ValorTextField;
    private javax.swing.JRadioButton VanRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
