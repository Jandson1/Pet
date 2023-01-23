package Elementos;

import Enums.EstadoAnimal;
import Enums.Porte;
import Servicos.EsquemaVacinal;

import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    protected String nome;
    protected String raca;
    protected String observações;
    protected Double peso;
    protected LocalDate nascimento;
    protected Porte porte;
    protected EstadoAnimal estado;
    protected List<EsquemaVacinal> vacinas;

    public Animal(String nome, String raca, String observações, Double peso, LocalDate nascimento, Porte porte, EstadoAnimal estado, List<EsquemaVacinal> vacinas) {
        this.nome = nome;
        this.raca = raca;
        this.observações = observações;
        this.peso = peso;
        this.nascimento = nascimento;
        this.porte = porte;
        this.estado = estado;
        this.vacinas = vacinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getObservações() {
        return observações;
    }

    public void setObservações(String observações) {
        this.observações = observações;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    public List<EsquemaVacinal> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<EsquemaVacinal> vacinas) {
        this.vacinas = vacinas;
    }
}
