package model;

public class Oficinas {
	

		private Orçamento orcamento;
		private int numeroOficinas;
		private String endereco;
		private long telefone;
		private int cepOficinas;
		private long cnpjOficina;
		private String nomeFantasia;
		private int inscricaoEstadual;
		private String forencedorPecas;

		
		public Oficinas(Orçamento orcamento, int numeroOficinas, String endereco,
				long telefone, int cepOficinas, long cnpjOficina, String nomeFantasia,
				int inscricaoEstadual, String forencedorPecas) {		
			this.orcamento = orcamento;
			this.numeroOficinas = numeroOficinas;
			this.endereco = endereco;
			this.telefone = telefone;
			this.cepOficinas = cepOficinas;
			this.cnpjOficina = cnpjOficina;
			this.nomeFantasia = nomeFantasia;
			this.inscricaoEstadual = inscricaoEstadual;
			this.forencedorPecas = forencedorPecas;
			
			System.out.println("Construtor cheio - objeto Oficinas criado!");

		}
		
		public Oficinas() {
			System.out.println("Construtor vazio - objeto Oficinas criado!");
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
		
		public String getEndereco() {
			return endereco;
		}
		
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		
		public long getTelefone() {
			return telefone;
		}
		
		public void setTelefone(long telefone) {
			this.telefone = telefone;
		}
		
		public int getCepOficinas() {
			return cepOficinas;
		}
		
		public void setCepOficinas(int cepOficinas) {
			this.cepOficinas = cepOficinas;
		}
		
		public  long getCnpjOficina() {
			return cnpjOficina;
		}
		
		public void setCnpjOficina(long cnpjOficina) {
			this.cnpjOficina = cnpjOficina;
		}
		
		public String getNomeFantasia() {
			return nomeFantasia;
		}
		
		public void setNomeFantasia(String nomeFantasia) {
			this.nomeFantasia = nomeFantasia;
		}
		
		public int getInscricaoEstadual() {
			return inscricaoEstadual;
		}
		
		public void setInscricaoEstadual(int inscricaoEstadual) {
			this.inscricaoEstadual = inscricaoEstadual;
		}
		
		public String getForencedorPecas() {
			return forencedorPecas;
		}
		
		public void setForencedorPecas (String forencedorPecas) {
			this.forencedorPecas = forencedorPecas;
		}
		
		@Override
		public String toString (){
			return "Oficinas[orcamento=" + orcamento + ",numeroOficinas=" + numeroOficinas + 
					",endereco="+ endereco +",telefone=" + telefone + ",cepOficinas=" + cepOficinas + ","
				+ "cnpjOficina=" + cnpjOficina + ",nomeFantasia=" + nomeFantasia +",inscricaoEstadual=" + inscricaoEstadual + ","
						+ "forencedorPecas="+ forencedorPecas +"]";
		}
		


}
