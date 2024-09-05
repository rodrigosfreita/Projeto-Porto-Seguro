package model;



public class Funilaria {


		private Veiculo veiculo;
		private boolean ferrugem;
		private boolean martelimhoOuro;
		private boolean relevos ;
		private boolean rachaduras;
		private boolean renovacaoPintura;
		private boolean polimento;
		private boolean critalizacao;
		private boolean carenagem;

		
		public Funilaria(Veiculo veiculo, boolean ferrugem, boolean martelimhoOuro,
				boolean relevos, boolean rachaduras, boolean renovacaoPintura, boolean polimento,
				boolean critalizacao, boolean carenagem) {	
			
			this.veiculo = veiculo;
			this.ferrugem = ferrugem;
			this.martelimhoOuro = martelimhoOuro;
			this.relevos = relevos;
			this.rachaduras = rachaduras;
			this.renovacaoPintura = renovacaoPintura;
			this.polimento = polimento;
			this.critalizacao = critalizacao;
			this.carenagem = carenagem;
			
			System.out.println("Construtor cheio - objeto Historico criado!");

		}
		
		public Funilaria() {
			System.out.println("Construtor vazio - objeto Historico criado!");
		};
		
		public Veiculo getVeiculo() {
			return veiculo;
		}
		
		public void setVeiculo (Veiculo veiculo) {
			this.veiculo = veiculo;
		}
		
		public boolean getFerrugem() {
			return ferrugem;
		}
		
		public void setFerrugem(boolean ferrugem) {	
			this.ferrugem = ferrugem;
		}
		
		public boolean getMartelimhoOuro() {
			return martelimhoOuro;
		}
		
		public void setetMartelimhoOuro(boolean martelimhoOuro) {
			this.martelimhoOuro = martelimhoOuro;
		}
		
		public boolean getRelevos() {
			return relevos;
		}
		
		public void setRelevos(boolean relevos) {
			this.relevos = relevos;
		}
		
		public boolean getRachaduras() {
			return rachaduras;
		}
		
		public void setRachaduras(boolean rachaduras) {
			this.rachaduras = rachaduras;
		}
		
		public  boolean getRenovacaoPintura() {
			return renovacaoPintura;
		}
		
		public void setRenovacaoPintura(boolean renovacaoPintura) {
			this.renovacaoPintura = renovacaoPintura;
		}
		
		public boolean getPolimento() {
			return polimento;
		}
		
		public void setPolimento(boolean polimento) {
			this.polimento = polimento;
		}
		
		public boolean getCritalizacao() {
			return critalizacao;
		}
		
		public void setCritalizacao(boolean critalizacao) {
			this.critalizacao = critalizacao;
		}
		
		public boolean getCarenagem() {
			return carenagem;
		}
		
		public void setCarenagem (boolean carenagem) {
			this.carenagem = carenagem;
		}
		
			
		@Override
		public String toString (){
			return "Funilaria[veiculo=" + veiculo + ",ferrugem=" + ferrugem + "martelimhoOuro="+ 
					martelimhoOuro +",relevos=" + relevos + ",rachaduras=" + rachaduras + ",renovacaoPintura="
				+ "" + renovacaoPintura + ",polimento=" + polimento +",critalizacao=" + critalizacao + 
				",carenagem="+ carenagem +"]";
		}
		
	
}
