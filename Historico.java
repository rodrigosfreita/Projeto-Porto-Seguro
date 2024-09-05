package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Historico {

		private Apolice apolice;
		private Cliente cliente;
		private List<Veiculo> veiculos;
		private String irregularidades;
		private String localSinistro;
		private String tempoHabilitacao;
		private String multas;
		private String coberturaSinistro;
		private String descricaoDano;

		
		public Historico(Apolice apolice, Cliente cliente, List<Veiculo> veiculos, String irregularidades, String localSinistro, String tempoHabilitação,
				String multas, String coberturaSinistro, String descricaoDano) {	
			
			this.apolice = apolice;
			this.cliente = cliente;
			this.veiculos = veiculos;
			this.irregularidades = irregularidades;
			this.localSinistro = localSinistro;
			this.tempoHabilitacao = tempoHabilitação;
			this.multas = multas;
			this.coberturaSinistro = coberturaSinistro;
			this.descricaoDano = descricaoDano;
			
			System.out.println("Construtor cheio - objeto Historico criado!");

		}
		
		public Historico() {
			System.out.println("Construtor vazio - objeto Historico criado!");
		};
		
		public Apolice getVeiculo() {
			return apolice;
		}
		
		public void setVeiculo (Apolice veiculo) {
			this.apolice = veiculo;
		}
		
		public Cliente getVeiculoCliente() {
			return cliente;
		}
		
		public void setVeiculoCliente(Cliente veiculoCliente) {	
			this.cliente = veiculoCliente;
		}
		
		public List<Veiculo> getVeiculos() {
			return veiculos;
		}
		
		public void setVeiculos(List<Veiculo> veiculos) {
			this.veiculos = veiculos;
		}
		
		
		
		public String getIrregularidades() {
			return irregularidades;
		}
		
		public void setIrregularidades(String irregularidades) {
			this.irregularidades = irregularidades;
		}
		
		public  String getLocalSinistro() {
			return localSinistro;
		}
		
		public void setlocalSinistro(String localSinistro) {
			this.localSinistro = localSinistro;
		}
		
		public String getTempoHabilitação() {
			return tempoHabilitacao;
		}
		
		public void setTempoHabilitação(String tempoHabilitação) {
			this.tempoHabilitacao = tempoHabilitação;
		}
		
		public String getMultas() {
			return multas;
		}
		
		public void setMultas(String multas) {
			this.multas = multas;
		}
		
		public String getCoberturaSinistro() {
			return coberturaSinistro;
		}
		
		public void setCoberturaSinistro (String coberturaSinistro) {
			this.coberturaSinistro = coberturaSinistro;
		}
		
		public String getDescricaoDano() {
			return descricaoDano;
		}
		
		public void setDescricaoDano (String descricaoDano) {
			this.descricaoDano = descricaoDano;
		}
		
		
		@Override
		public String toString (){
			return "Historico[veiculo=" + apolice + ",veiculoCliente=" + cliente + "veiculos="+ 
					veiculos + ",irregularidades=" + irregularidades + ",localSinistro="
				+ "" + localSinistro + ",tempoHabilitação=" + tempoHabilitacao +",multas=" + multas + 
				",coberturaSinistro="+ coberturaSinistro +",descricaoDano=" + descricaoDano +"]";
		}
		
	
}
