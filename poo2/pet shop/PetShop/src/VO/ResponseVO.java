package VO;
import java.math.BigDecimal;

import Elementos.Cliente;
import Enums.Servicos;

public class ResponseVO {
   Integer id;
   Servicos servico;
   BigDecimal valor;
   Cliente cliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Servicos getServico() {
        return servico;
    }

    public void setServico(Servicos servico) {
        this.servico = servico;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ResponseVO: id - " + id + ", serviço -  " + servico + ", valor -  " + valor + ", cliente - " + cliente + ".";
    }
}
