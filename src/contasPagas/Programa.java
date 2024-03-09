/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasPagas;

/**
 *
 * @author letic
 */
public class Programa {
    public static void main(String[] args){
        Produto p1 = new Produto();
        p1.setDescricao("Notebook");
        p1.setValor(2900);
        
         Produto p2 = new Produto();
        p2.setDescricao("TV LED");
        p2.setValor(3500);
        
        
        Cliente c1 = new Cliente("Ana","111.759.320-78");
        Cliente c2 = new Cliente("Felix","17.379.156-15");
      
        Conta ct1 = new Conta(1,"12/04/2021","10/03/2021",p1,c1);
        Conta ct2 = new Conta(2,"27/08/2015","13/07/2015",p2,c2);
        
        ct1.visualizarConta();
        ct2.visualizarConta();
       
        
    }
   
}
