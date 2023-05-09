/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Automovel;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Loja {
    public static void main(String[] args) throws CloneNotSupportedException {
        Automovel a = new Automovel();
        a.setMarca("Chevrolet");
        a.setModelo("Celta");
        a.setTipo("Passeio");
        System.out.println("Marca " + a.getMarca() + " Modelo: " + a.getModelo() + "Tipo " + a.getTipo());
         Automovel b = a.clone();
         System.out.println("Marca " + b.getMarca() + " Modelo: "+ b.getModelo() + "Tipo: " +b.getTipo());
    }  
    
}
