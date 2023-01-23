package Servicos;

import java.math.BigDecimal;

public class Remedio extends Pagamento {
    public Remedio(Integer id, String nome, BigDecimal preco) {
        super(id, nome, preco);
    }
    @Override
    public String toString() {
        return "Remedio: id- " + id + ", nome: " + nome + ", preço: " + preco;
    }
}
