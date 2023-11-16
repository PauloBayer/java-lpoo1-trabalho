/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import interfaces.ClienteI;
/**
 *
 * @author janai
 */
public class Cliente implements ClienteI{
    private String name;
    private String sobreNome;
    private int RG;
    private int CPF;
    private String endereco;
    
    public Cliente(String name,String sobreNome, int RG,int CPF, String endereco){
        this.name=name;
        this.sobreNome=sobreNome;
        this.RG=RG;
        this.CPF=CPF;
        this.endereco=endereco;
    }
    
    @Override
    public  void CreateCliente(){
        System.out.println("criado");
    };
    @Override
    public void ChangeCliente(){
        System.out.println("mudado");
    };
    @Override
    public void DeleteCliente(){
        System.out.println("excluido");
    };
    
}
