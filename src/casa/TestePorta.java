/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author letic
 */
public class TestePorta {
    public static void main(String[] args){
        Porta pr1 = new Porta();
        
        pr1.dimensaoX=100;
        pr1.dimensaoY=50;
        pr1.dimensaoZ=13;
        pr1.cor="branco";
        pr1.pinta("azul");
        pr1.pinta("amarelo");
        
        Porta pr2 = new Porta();
        pr2.dimensaoX=50;
        pr2.dimensaoY=20;
        pr2.dimensaoZ=15;
        pr2.cor="Laranja";
        pr2.pinta("Branco");
        pr2.pinta("verde");
        
        Porta pr3 = new Porta();
        pr3.dimensaoX=50;
        pr3.dimensaoY=20;
        pr3.dimensaoZ=15;
        pr3.cor="roxo";
        pr3.pinta("preto");
        pr3.pinta("branco");
        
       
        pr1.fecha();
        pr2.abre();
        pr3.abre();
        
      
        
    }
}
