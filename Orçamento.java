package model;


public class Orçamento {

		private AutoAvaliação avaliacao;
		private Cliente dadosCliente;
		private int valorPecas;
		private int maoObra;
		private int valorEletrica;
		private int valorMecanica;
		private int gastosGerais;
		private int material;
		private int garantiaServico;

		
		public Orçamento(AutoAvaliação avaliacao, Cliente dadosCliente, int valorPecas,
				int maoObra, int valorEletrica, int valorMecanica, int gastosGerais,
				int material, int garantiaServico) {	
			
			this.avaliacao = avaliacao;
			this.dadosCliente = dadosCliente;
			this.valorPecas = valorPecas;
			this.maoObra = maoObra;
			this.valorEletrica = valorEletrica;
			this.valorMecanica = valorMecanica;
			this.gastosGerais = gastosGerais;
			this.material = material;
			this.garantiaServico = garantiaServico;
			
			System.out.println("Construtor cheio - objeto Orçamento criado!");

		}
		
		public Orçamento() {
			System.out.println("Construtor vazio - objeto Orçamento criado!");
		};
		
		public AutoAvaliação getAvaliacao() {
			return avaliacao;
		}
		
		public void setAvaliacao (AutoAvaliação avaliacao) {
			this.avaliacao = avaliacao;
		}
		
		public Cliente getDadosCliente() {
			return dadosCliente;
		}
		
		public void setDadosCliente(Cliente dadosCliente) {	
			this.dadosCliente = dadosCliente;
		}
		
		public int getValorPecas() {
			return valorPecas;
		}
		
		public void setValorPecas(int valorPecas) {
			this.valorPecas = valorPecas;
		}
		
		public int getMaoObra() {
			return maoObra;
		}
		
		public void setMaoObra(int maoObra) {
			this.maoObra = maoObra;
		}
		
		public int getValorEletrica() {
			return valorEletrica;
		}
		
		public void setValorEletrica(int valorEletrica) {
			this.valorEletrica = valorEletrica;
		}
		
		public  int getValorMecanica() {
			return valorMecanica;
		}
		
		public void setValorMecanica(int valorMecanica) {
			this.valorMecanica = valorMecanica;
		}
		
		public int getGastosGerais() {
			return gastosGerais;
		}
		
		public void setGastosGeraiso(int gastosGerais) {
			this.gastosGerais = gastosGerais;
		}
		
		public int getMaterial() {
			return material;
		}
		
		public void setMaterial(int material) {
			this.material = material;
		}
		
		public int getGarantiaServico() {
			return garantiaServico;
		}
		
		public void setGarantiaServico (int garantiaServico) {
			this.garantiaServico = garantiaServico;
		}
		
		
		@Override
		public String toString (){
			return "Orçamento[avaliacao=" + avaliacao + ",dadosCliente=" + dadosCliente + "valorPecas="+ 
					valorPecas +",maoObra=" + maoObra + ",valorEletrica=" + valorEletrica + ",valorMecanica="
				+ "" + valorMecanica + ",material=" + material +",garantiaServico=" + garantiaServico + 
				"]";
		}
		
		public String valorTotalOrcamento() {
			String nomeCliente = this.dadosCliente.getNome();
			
			int valorTotalOrcamento = 
			this.valorPecas +
			this.maoObra +
			this.valorEletrica +
			this.valorMecanica +
			this.gastosGerais +
			this.material +
			this.garantiaServico;
			
			String msg = "O valor total do orçamento do cliente " + nomeCliente +" é de: " + valorTotalOrcamento;
			
			return msg;
		}
	
}
