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
public class Funcionario {
    String nome;
    String departamento, dataAdmissao, rg;
    double salario;
    boolean ativo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    
   
    void bonifica(double aumento){
        this.salario = salario+aumento;
    }
    
    void demite(){
      this.ativo=false;
    }
    void atividadeFuncionario(){
        if(ativo==false){
            System.out.println("Funcionario desligado");
        }else{
            System.out.println("Funcionario ativo");
        }
    }
    
    void mostra(){
        System.out.println("Nome: "+this.nome);
        System.out.println("RG: "+this.rg);
        System.out.println("Departamento: "+this.departamento);
        System.out.println("Data de admissao: "+this.dataAdmissao);;
        System.out.println("Salario: "+this.salario);
    }
}
