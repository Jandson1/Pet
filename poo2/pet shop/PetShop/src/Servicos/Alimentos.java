package Servicos;
import java.math.BigDecimal;

public class Alimentos extends Pagamento {
    public Alimentos(Integer id, String nome, BigDecimal preco) {
        super(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Alimento: id - " + id + ", nome -  " + nome + ", preço -  " + preco + ".";
    }
}
