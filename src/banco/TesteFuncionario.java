/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author letic
 */
public class TesteFuncionario {
     public static void main(String[] agrs){
        Funcionario f1= new Funcionario();
        f1.nome="Mariana";
        f1.dataAdmissao="25/04/2016";
        f1.salario=1000;
        f1.bonifica(300);
        f1.rg="0000000";
        f1.departamento="financiamento";
        //System.out.println("Salario atual: "+f1.salario);
      
        f1.ativo=true;
        f1.atividadeFuncionario();
        f1.demite();
        f1.atividadeFuncionario();
        
       f1.mostra();
    }
}
