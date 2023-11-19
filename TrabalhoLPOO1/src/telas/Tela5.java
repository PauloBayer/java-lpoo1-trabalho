package telas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import classes.Automovel;
import classes.Motocicleta;
import classes.Van;
import classes.Veiculo;
import enums.Estado;
import enums.ModeloAutomovel;
import enums.ModeloMotocicleta;
import enums.ModeloVan;
import main.Main;
import transitions.TransitionsForm;

public class Tela5 extends TransitionsForm {

    private JLabel labelTipo, labelMarca, labelCategoria, labelTitle;
    private JComboBox<String> comboBoxTipo, comboBoxMarca, comboBoxCategoria;
    private JTable tabelaVeiculos;
    private JButton botaoVender;
    private JScrollPane scrollPaneTabela;
    private DefaultTableModel tableModel;
    private JButton botaoAtualizar;

    public Tela5() {
        initComponents();
        fillTable(); //se tu estiver lendo, bayer, essse aqui ele vai preencher a tabela inicialmente
        botaoVender.addActionListener(new VenderVeiculoListener());
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        JPanel panelFiltros = new JPanel(new GridLayout(3, 2, 5, 5));
        labelTipo = new JLabel("Tipo:");
        comboBoxTipo = new JComboBox<>(new String[]{"Automóvel", "Van", "Motocicleta"});
        labelMarca = new JLabel("Marca:");
        comboBoxMarca = new JComboBox<>(new String[]{"Marca 1", "Marca 2", "Marca 3"});
        labelCategoria = new JLabel("Categoria:");
        comboBoxCategoria = new JComboBox<>(new String[]{"Categoria 1", "Categoria 2", "Categoria 3"});
        botaoVender = new JButton("Vender");
        botaoAtualizar = new JButton("Atualizar Tabela");
        labelTitle = new JLabel();
        JPanel panelTitle = new JPanel();
        JPanel panelNorth = new JPanel(new GridLayout(2, 1, 5, 5));

        labelTitle.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(79, 79, 79));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Vender Veículos");
        panelTitle.add(labelTitle);
        
        panelFiltros.add(labelTipo);
        panelFiltros.add(comboBoxTipo);
        panelFiltros.add(labelMarca);
        panelFiltros.add(comboBoxMarca);
        
        panelFiltros.add(labelCategoria);
        panelFiltros.add(comboBoxCategoria);
        
        panelNorth.add(panelTitle);
        panelNorth.add(panelFiltros);

        add(panelNorth, BorderLayout.NORTH);

        tabelaVeiculos = new JTable();
        scrollPaneTabela = new JScrollPane(tabelaVeiculos);
        add(scrollPaneTabela, BorderLayout.CENTER);

        JPanel panelBotoes = new JPanel(new GridLayout(2, 1, 5, 5));
        botaoVender.setPreferredSize(new Dimension(100, 30));
        panelBotoes.add(botaoVender);
        panelBotoes.add(botaoAtualizar);
        add(panelBotoes, BorderLayout.SOUTH);
    }

    public void fillTable() {
        tableModel = new DefaultTableModel(new String[]{"Placa", "Marca", "Modelo", "Ano", "Preço para venda"}, 0);
        String tipoSelecionado = comboBoxTipo.getSelectedItem().toString();
        String marcaSelecionada = comboBoxMarca.getSelectedItem().toString();
        String categoriaSelecionada = comboBoxCategoria.getSelectedItem().toString();

        if (Main.getVeiculosDisponiveis() != null) {
            
            for (Veiculo veiculo : Main.getVeiculosDisponiveis()) {

                String modelo = "";
                double precoVenda = 0;

                if (veiculo instanceof Automovel) {
                    modelo = ((Automovel) veiculo).getModelo().toString();
                    precoVenda = veiculo.getValorParaVenda();
                } else if (veiculo instanceof Van) {
                    modelo = ((Van) veiculo).getModelo().toString();
                    precoVenda = veiculo.getValorParaVenda();
                } else if (veiculo instanceof Motocicleta) {
                    modelo = ((Motocicleta) veiculo).getModelo().toString();
                    precoVenda = veiculo.getValorParaVenda();
                }
                
                if (veiculo.getEstado() == Estado.DISPONÍVEL &&
                    (tipoSelecionado.equals("Automóvel") && veiculo instanceof Automovel ||
                    tipoSelecionado.equals("Van") && veiculo instanceof Van ||
                    tipoSelecionado.equals("Motocicleta") && veiculo instanceof Motocicleta)) {

                    boolean atendeMarca = marcaSelecionada.equals("Todas as Marcas") || veiculo.getMarca().equals(marcaSelecionada);

                    boolean atendeCategoria = categoriaSelecionada.equals("Todas as Categorias") || veiculo.getCategoria().equals(categoriaSelecionada);

                    if (atendeMarca && atendeCategoria) {
                        String[] rowData = {veiculo.getPlaca(), veiculo.getMarca().toString(), modelo, String.valueOf(veiculo.getAno()), String.format("R$%.2f", precoVenda)};
                        tableModel.addRow(rowData);
                    }
                }
            }
            tabelaVeiculos.setModel(tableModel);
        }
    }

    private class AtualizarTabelaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            fillTable();
        }
    }
    
    private class VenderVeiculoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedRow = tabelaVeiculos.getSelectedRow();
            if (selectedRow != -1) {
                String placa = (String) tabelaVeiculos.getValueAt(selectedRow, 0);
                // Aqui vai ser a lógica de encontrar e realizar a venda do veículo, não esqueça Fellipe
                for (Veiculo veiculo : Main.getVeiculosDisponiveis()) {
                    if (veiculo.getPlaca().equals(placa)) {
                        veiculo.vender();
                        break;
                    }
                }
                //E depois ele vai atualizar a tabela após a venda
                fillTable();
            } else {
                JOptionPane.showMessageDialog(Tela5.this, "Selecione um veículo para vender.",
                        "Nenhum veículo selecionado", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
