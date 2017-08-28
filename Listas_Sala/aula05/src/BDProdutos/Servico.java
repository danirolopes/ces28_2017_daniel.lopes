package BDProdutos;

public class Servico implements IProdutoServico{

	private String _nome;
	private int _id;
	private float _preco;
	
	Servico(int id, String nome, float preco)
	{
		_nome = nome;
		_id = id;
		_preco = preco;
	}

	public String getNome(){
		return _nome;
	}
	
	public int getId(){
		return _id;
	}
	
	public float getPreco(){
		return _preco;
	}
}
