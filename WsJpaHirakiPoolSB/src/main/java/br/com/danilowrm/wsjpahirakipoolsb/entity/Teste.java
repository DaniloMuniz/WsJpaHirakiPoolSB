package br.com.danilowrm.wsjpahirakipoolsb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teste {

	@Id
	private Integer codigo;

	@Column()
	private Integer nome;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Teste [codigo=" + codigo + ", nome=" + nome + "]";
	}

}
