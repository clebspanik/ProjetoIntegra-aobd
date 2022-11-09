package com.example.projetoweb_m.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
	@Table(name="Vendas", uniqueConstraints = {@UniqueConstraint(columnNames= {"idvenda"})})
	
	public class cadastroVendas {
	
	private int idvenda;
	@NotNull
	private int idPessoa;
	@NotNull
	private int nroItens;
	@NotNull
	private Float vlrTotalVenda;
	
	
	public cadastroVendas () {
		
	}
	
	public cadastroVendas (int idPessoa, int nroItens, Float vlrTotalVenda) {
		this.idPessoa = idPessoa;
		this.nroItens = nroItens;
		this.vlrTotalVenda = vlrTotalVenda;
	}
	
	@ Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdvenda() {
	return idvenda;
	
	}

	public void setIdvenda(int idvenda) {
		this.idvenda = idvenda;
	}
	
	@Column (name = "idPessoa", nullable = false)
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	
	@Column (name = "nroItens", nullable = false)
	public int getNroItens() {
		return nroItens;
	}
	public void setNroItens(int nroItens) {
		this.nroItens = nroItens;
	}
	
	@Column (name = "vlrTotalVenda", nullable = false)
	public Float getVlrTotalVenda() {
		return vlrTotalVenda;
	}
	public void setVlrTotalVenda(Float vlrTotalVenda) {
		this.vlrTotalVenda = vlrTotalVenda;
	}
	
	
	
}
