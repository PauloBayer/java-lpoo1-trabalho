/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.Categoria;
import enums.Marca;
import enums.ModeloAutomovel;

/**
 *
 * @author paulo
 */
public class Automavel extends Veiculo {
    
    private final ModeloAutomovel modelo;
    
    public Automavel(Marca marca, Categoria categoria, double valorDeCompra, ModeloAutomovel modelo) {
        super(marca, categoria, valorDeCompra);
        this.modelo = modelo;
    };
    
    public ModeloAutomovel getModelo() {
        return this.modelo;
    };
    
    @Override
    public double getValorDiariaLocacao() {
        switch(this.getCategoria()) {
            case POPULAR -> {
                return 100;
            }
            case INTERMEDIÁRIO -> {
                return 300;
            }
            case LUXO -> {
                return 450;
            }
            default -> {
                 return 0;
            }
        }
    };
    
}
