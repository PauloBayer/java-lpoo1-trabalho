/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.Categoria;
import enums.Marca;
import enums.ModeloVan;

/**
 *
 * @author janai
 */
public class Van extends Veiculo {
    private final ModeloVan modelo;
    public Van(Marca marca, Categoria categoria, double valorDeCompra, ModeloVan modelo){
        super(marca, categoria, valorDeCompra);
        this.modelo = modelo;
    }
    public ModeloVan getModelo(){
        return this.modelo;
    }
    @Override
    public double getValorDiariaLocacao(){
    switch(this.getCategoria()) {
            case POPULAR -> {
                return 200;
            }
            case INTERMEDIÁRIO -> {
                return 400;
            }
            case LUXO -> {
                return 600;
            }
            default -> {
                return 0;
            }
    }
    }
}
