package model.dao;

import model.dao.impl.SellerDaoJDBC;
import model.entities.SellerDao;

public class DaoFactory {
	public static SellerDao  createSellerDao() {//RETORNA O TIPO DA INTERFACE 
		return new SellerDaoJDBC();//MAIS INTERNAMENTE VAI ESTANCINAR UMA IMPLEMENTA��O
		
		/*macete para n�o expor a implementa��o, deixando s� mente a interface*/
	}

}
