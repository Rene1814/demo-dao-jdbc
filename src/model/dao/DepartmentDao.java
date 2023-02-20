package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);//esse m�todo vai inserir no banco um objeto q eu passar no par�metro
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);//vai procurar no banco um objeto com o id do par�metro
	List<Department> findAll();
}
