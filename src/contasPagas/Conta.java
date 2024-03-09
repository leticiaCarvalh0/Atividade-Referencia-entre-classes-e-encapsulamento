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
public class Conta {
    private int idConta;
    private String dataVencimento, dataPagamento;
    private Produto produto;
    private Cliente cliente;

    public Conta(int idConta, String dataVencimento, String dataPagamento, Produto produto, Cliente cliente){
        this.idConta=idConta;
        this.dataVencimento=dataVencimento;
        this.dataPagamento=dataPagamento;
        this.produto=produto;
        this.cliente=cliente;
    }

    
    public void visualizarConta(){
        System.out.println("IDENTIFICADOR: "+this.idConta);
        System.out.println("PRODUTO: "+this.produto.getDescricao());
        System.out.println("CLIENTE: "+this.cliente.getNomeCliente() + "    CPF: "+this.cliente.getCpf());
        System.out.println("VALOR: "+this.produto.getValor());
        System.out.println("DATA VENCIMENTO: "+this.dataVencimento);
        System.out.println("DATA PAGAMENTO: "+this.dataPagamento);
        System.out.println("---------------------------------------");
    }

   
}
