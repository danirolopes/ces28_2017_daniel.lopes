package aula05;

import java.util.ArrayList;
import java.util.List;

import BDClientes.BDClientes;
import BDClientes.Cliente;
import BDProdutos.BDProduto;

public class NF {
	private List<ItemVenda> _listaItens;
	private Cliente _cliente;
	private BDClientes _dbCli;
	private BDProduto _dbProd;
	
	public NF(int cpf, int produtoID, int quantProduto, BDClientes dbCli, BDProduto dbProd)
	{
		_dbCli = dbCli;
		_dbProd = dbProd;
		_listaItens = new ArrayList<ItemVenda>();
		try{
			this.verificaCliente(cpf);
		}
		catch (Exception e)
		{
			throw e;
		}
		try
		{
			this.addItem(produtoID, quantProduto);
		}
		catch(Exception e)
		{
			throw e;
		}
		
	}
	
	public void addItem(int produtoID, int quant)
	{
		try
		{
			ItemVenda item = new ItemVenda(produtoID, _dbProd, quant);
			_listaItens.add(item);
		}
		catch (Exception e)
		{
			throw e;
		}
	}
	
	
	private void verificaCliente(int cpf)
	{
		try
		{
			_cliente = _dbCli.getCliente(cpf);
		}
		catch (Exception e)
		{
			throw e;
		}
	}
	
	public Cliente getCliente()
	{
		return _cliente;
	}
	
	public List<ItemVenda> getElements()
	{
		return _listaItens;
	}
	

}
