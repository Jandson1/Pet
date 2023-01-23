package Elementos;
import java.math.BigDecimal;
import java.time.LocalDate;

import Enums.Cargo;

public class Funcionario {
    private Integer id;
    private Cargo cargo;
    private BigDecimal salario;
    private LocalDate admissao;
    private LocalDate desligamento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getAdmissao() {
        return admissao;
    }

    public void setAdmissao(LocalDate admissao) {
        this.admissao = admissao;
    }

    public LocalDate getDesligamento() {
        return desligamento;
    }

    public void setDesligamento(LocalDate desligamento) {
        this.desligamento = desligamento;
    }
}
