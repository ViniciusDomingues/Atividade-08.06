import javax.swing.JOptionPane;

public class Cliente extends Pessoa  {

	public Cliente(String nome, String endereco, String bairro, String cidade, String uf, String telefone,
			String celular) {
		super(nome, endereco, bairro, cidade, uf, telefone, celular);
	}


	private static String limiteCredito;
	private static String rendaMensal;
	private static String rg;
	private static String cpf;
	

	public static  void inserirDadosCliente() {
		nome =  JOptionPane.showInputDialog(null,"Digite o nome do cliente:");
		endereco =  JOptionPane.showInputDialog(null,"Digite o endereço do cliente:");
		bairro =  JOptionPane.showInputDialog(null,"Digite o bairro do cliente:");
		cidade =  JOptionPane.showInputDialog(null,"Digite a cidade do cliente:");
		uf =  JOptionPane.showInputDialog(null,"Digite o UF do cliente:");
		telefone =  JOptionPane.showInputDialog(null,"Digite o telefone do cliente:");
		celular =  JOptionPane.showInputDialog(null,"Digite o celular do cliente:");
		limiteCredito =  JOptionPane.showInputDialog(null,"Digite o limite de crédito do cliente:");
		rendaMensal =  JOptionPane.showInputDialog(null,"Digite a renda mensal do cliente:");
		rg =  JOptionPane.showInputDialog(null,"Digite o RG do cliente:");
		cpf =  JOptionPane.showInputDialog(null,"Digite o CPF do cliente:");
		}	
	
	public static  void apresentarCliente() {
		JOptionPane.showMessageDialog(null,"*Informações do Cliente* "+"\n"+"Nome: "+nome+"\n"+"Endereço: "+endereco+"\n"+"Bairro: "+bairro+"\n"+"Cidade: "+cidade+"\n"+"UF: "+uf+"\n"+"Telefone: "+telefone+"\n"+"Celular:"+celular+"\n"+"Limite de Crédito: "+limiteCredito+"\n"+"Renda Mensal: "+rendaMensal+"\n"+"RG: "+rg+"\n"+"CPF: "+cpf+"\n");
		}	
	
}