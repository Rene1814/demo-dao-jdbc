package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);//esse método vai inserir no banco um objeto q eu passar no parâmetro
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);//vai procurar no banco um objeto com o id do parâmetro
	List<Seller> findAll();

}
