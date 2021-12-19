package com.one.demo.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Vaga implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome; //Nome da vaga, ex: A1, B3, C2, etc...
	private String bloco; 
	private Boolean ocupada;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "car_id", referencedColumnName = "id")
	private CarReg carreg;

	public Vaga() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public Boolean getOcupada() {
		return ocupada;
	}

	public void setOcupada(Boolean ocupada) {
		this.ocupada = ocupada;
	}

	public CarReg getCarreg() {
		return carreg;
	}

	public void setCarreg(CarReg carreg) {
		this.carreg = carreg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bloco == null) ? 0 : bloco.hashCode());
		result = prime * result + ((carreg == null) ? 0 : carreg.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((ocupada == null) ? 0 : ocupada.hashCode());
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
		Vaga other = (Vaga) obj;
		if (bloco == null) {
			if (other.bloco != null)
				return false;
		} else if (!bloco.equals(other.bloco))
			return false;
		if (carreg == null) {
			if (other.carreg != null)
				return false;
		} else if (!carreg.equals(other.carreg))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (ocupada == null) {
			if (other.ocupada != null)
				return false;
		} else if (!ocupada.equals(other.ocupada))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vaga [id=" + id + ", nome=" + nome + ", bloco=" + bloco + ", ocupada=" + ocupada + ", carreg=" + carreg
				+ "]";
	}
	
	
	
	

}
