package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);//esse m�todo vai inserir no banco um vendedor q eu passar no par�metro
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);//vai procurar no banco um objeto com o id do par�metro
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);

}
