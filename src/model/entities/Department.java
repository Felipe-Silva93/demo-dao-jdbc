package model.entities;

import java.io.Serializable;

public class Department implements Serializable {/*implementa essa inter face  para o objeto seja gravado em sequencia de baytes
é preciso fazer isso para que seus dados seja gravados em arquivos, trafegados em rede  e assim por diante
*/
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	
	public Department() {//construtor padrão
		
	}

	public Department(Integer id, String name) {//construtor padrão
		/*super(); esse não está precisando */
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/*hashCode abd equals  para ser comparados os conteudos*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
