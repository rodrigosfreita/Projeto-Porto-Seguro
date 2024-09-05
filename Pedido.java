package model;

import java.time.LocalDate;
import java.util.Date;

public class Pedido {
	
	private Orçamento orcamento;
	private Oficinas oficina;
	private int numeroFunilaria;
	private int numeroOficinas;
	private Cliente cpfCliente;
	private int valorConcerto;
	private int valorRevisao;
	private int notaFiscal;
	private int codigoCompra;

	
	public Pedido(Orçamento orcamento, Oficinas oficina, int numeroFunilaria,
			int numeroOficinas, Cliente cpfCliente, int valorConcerto, int valorRevisao,
			int notaFiscal, int codigoCompra) {
		
		
		this.orcamento = orcamento;
		this.oficina = oficina;
		this.numeroFunilaria = numeroFunilaria;
		this.numeroOficinas = numeroOficinas;
		this.cpfCliente = cpfCliente;
		this.valorConcerto = valorConcerto;
		this.valorRevisao = valorRevisao;
		this.notaFiscal = notaFiscal;
		this.codigoCompra = codigoCompra;
		
		
		System.out.println("Construtor cheio - objeto Pedido criado!");

	}
	
	public Pedido() {
		System.out.println("Construtor vazio - objeto Pedido criado!");
	};
	
	public Orçamento getOrcamento() {
		return orcamento;
	}
	
	public void setOrçamento (Orçamento orcamento) {
		this.orcamento = orcamento;
	}
	
	public int getNumeroOficinas() {
		return numeroOficinas;
	}
	
	public void setNumeroOficinas(int numeroOficinas) {	
		this.numeroOficinas = numeroOficinas;
	}
	
	public Oficinas getOficina() {
		return oficina;
	}
	
	public void setOficina(Oficinas oficina) {
		this.oficina = oficina;
	}
	
	public int getNumeroFunilaria() {
		return numeroFunilaria;
	}
	
	public void setNumeroFunilaria(int numeroFunilaria) {
		this.numeroFunilaria = numeroFunilaria;
	}
	
	public Cliente getCpfCliente() {
		return cpfCliente;
	}
	
	public void setCpfCliente(Cliente cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
	public  int getValorConcerto() {
		return valorConcerto;
	}
	
	public void setValorConcerto(int valorConcerto) {
		this.valorConcerto = valorConcerto;
	}
	
	public int getValorRevisao() {
		return valorRevisao;
	}
	
	public void setValorRevisao(int valorRevisao) {
		this.valorRevisao = valorRevisao;
	}
	
	public int getNotaFiscal() {
		return notaFiscal;
	}
	
	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	
	public int getCodigoCompra() {
		return codigoCompra;
	}
	
	public void setCodigoCompra (int codigoCompra) {
		this.codigoCompra = codigoCompra;
	}
	

	
	
	public String gerarPedido (){
		return "Pedido[orcamento=" + orcamento + ",oficina=" + oficina + 
				",numeroFunilaria="+ numeroFunilaria +",numeroOficinas=" + numeroOficinas + ",cpfCliente=" + cpfCliente + ","
			+ "valorConcerto=" + valorConcerto + ",valorRevisao=" + valorRevisao +",notaFiscal=" + notaFiscal + ","
					+ "codigoCompra="+ codigoCompra + "dataCompra]";
	}

	

}

