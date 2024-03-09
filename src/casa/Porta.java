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
public class Porta {
    private boolean aberta;
    String cor;
    int dimensaoX;
    int dimensaoY;
    int dimensaoZ;
    
    
    public void abre(){
        this.aberta=true;
    }
    
    public void fecha(){
        this.aberta=false;
    }
    
   public void pinta(String s){
       this.cor=s;
   }
   
   public boolean estaAberta(){
       if(this.aberta==true){
           System.out.println("Está aberta");
           return true;
       }else{
           System.out.println("Está fechada");
           return false;
       }
       
   }
   
    
}
