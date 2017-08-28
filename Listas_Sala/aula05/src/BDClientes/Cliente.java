package BDClientes;

public class Cliente {
	private String _nome;
	private int _cpf;
	
	Cliente (String nome, int cpf)
	{
		_nome = nome;
		_cpf = cpf;
	}
	
	public int getCPF()
	{
		return _cpf;
	}
	
	public String getNome()
	{
		return _nome;
	}
}
