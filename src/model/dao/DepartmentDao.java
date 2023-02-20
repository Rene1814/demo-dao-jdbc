package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);//esse método vai inserir no banco um objeto q eu passar no parâmetro
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);//vai procurar no banco um objeto com o id do parâmetro
	List<Department> findAll();
}
