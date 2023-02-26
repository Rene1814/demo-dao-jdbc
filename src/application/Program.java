package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
				
		//Esse SellerDao abaixo faz com que eu não precise expor a implementação de criação do Seller. Não preciso colocar o new aqui pois já tem na DaoFactory
		//É tbm uma forma de fazer a injeção de dependência sem explicitar a implementação
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
