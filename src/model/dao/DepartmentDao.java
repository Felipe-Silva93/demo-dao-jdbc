package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	void insert(Department obj);// esse metodo � responssavel por inserir no banco de dados esse objeto(Departamente obj) inviado como parametro de entrada
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);//opera��o responsavel por pegar o id e consultar no banco de dados o id se exixrtir vai retornar se n�o vai retornar nulo
	List<Department>findAll();//fidAll para retornat todos os departamentos ent�o por isso sera uma lista

}
