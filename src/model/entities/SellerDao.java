package model.entities;

import java.util.List;

public interface SellerDao {
	void insert(Seller obj);// esse metodo � responssavel por inserir no banco de dados esse objeto(SELLER obj) inviado como parametro de entrada
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);//opera��o responsavel por pegar o id e consultar no banco de dados o id se exixrtir vai retornar se n�o vai retornar nulo
	List<Seller>findAll();//fidAll para retornat todos os Seller ent�o por isso sera uma lista

}


