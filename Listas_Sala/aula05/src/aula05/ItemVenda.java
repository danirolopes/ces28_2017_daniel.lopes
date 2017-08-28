package aula05;

import BDProdutos.BDProduto;
import BDProdutos.IProdutoServico;

public class ItemVenda {
	
	private BDProduto _db;
	private IProdutoServico _produtoServico;
	private int _quant;
	
	public ItemVenda(int itemID, BDProduto db, int quant)
	{
		_db = db;
	}
	
	private void verificaItem(int itemID)
	{
		_produtoServico = _db.getProdutoServico(itemID);
	}

	public int getQuant()
	{
		return _quant;
	}
	
	public void setQuant( int quant)
	{
		_quant = quant;
	}
	
	public IProdutoServico getProdutoServico()
	{
		return _produtoServico;
	}
}
