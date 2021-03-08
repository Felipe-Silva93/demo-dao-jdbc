package model.entities;

import java.util.List;

public interface SellerDao {
	void insert(Seller obj);// esse metodo é responssavel por inserir no banco de dados esse objeto(SELLER obj) inviado como parametro de entrada
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);//operação responsavel por pegar o id e consultar no banco de dados o id se exixrtir vai retornar se não vai retornar nulo
	List<Seller>findAll();//fidAll para retornat todos os Seller então por isso sera uma lista

}


