import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Pessoa  {
public static String nome;
public static String endereco;
public static String bairro;
public static String cidade;
public static String uf;
public static String telefone;
public static String celular;


public Pessoa(String nome, String endereco, String bairro, String cidade, String uf, String telefone, String celular) {
this.nome = nome;
this.endereco = endereco;
this.telefone = telefone;	
this.bairro = bairro;
this.cidade = cidade;
this.uf = uf;
this.telefone = telefone;
this.celular = celular;
}



	
	
static Cliente cli = new Cliente(nome, endereco, bairro, cidade, uf, telefone, celular);



public static  void apresentarTelefone() {

	
	JOptionPane.showMessageDialog(null,"Telefone do cliente: "+cli.telefone);
	}	

public static void main( String[] args )
{
	cli.inserirDadosCliente();
	cli.apresentarCliente();
	apresentarTelefone();
}

}