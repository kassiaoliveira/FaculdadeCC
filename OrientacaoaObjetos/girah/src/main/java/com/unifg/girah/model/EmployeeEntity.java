package com.unifg.girah.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name="FUNCIONARIO")
public class EmployeeEntity {

	@Id
	@Column(name="MATRICULA")
	private Integer matricula;

	@Column(name="CPF", nullable=false, length=12)
	private String cpf;

	@Column(name="NOMECOMPLETO")
	private String nome;

	@Column(name="DATANASCIMENTO")
	private Date dataNascimento;

	@Column(name="DATACONTRATACAO")
	private Date dataContratacao;

	@ManyToOne
	private TeamEntity equipe;

	@ManyToOne
	private RoleEntity cargo;

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public TeamEntity getEquipe() {
		return equipe;
	}

	public void setEquipe(TeamEntity equipe) {
		this.equipe = equipe;
	}

	public RoleEntity getCargo() {
		return cargo;
	}

	public void setCargo(RoleEntity cargo) {
		this.cargo = cargo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof EmployeeEntity)) return false;
		EmployeeEntity that = (EmployeeEntity) o;
		return getMatricula().equals(that.getMatricula()) &&
				getCpf().equals(that.getCpf()) &&
				getNome().equals(that.getNome()) &&
				getDataNascimento().equals(that.getDataNascimento()) &&
				getDataContratacao().equals(that.getDataContratacao());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getMatricula(), getCpf(), getNome(), getDataNascimento(), getDataContratacao());
	}
}