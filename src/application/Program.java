package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
				
		//Esse SellerDao abaixo faz com que eu n�o precise expor a implementa��o de cria��o do Seller. N�o preciso colocar o new aqui pois j� tem na DaoFactory
		//� tbm uma forma de fazer a inje��o de depend�ncia sem explicitar a implementa��o
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
