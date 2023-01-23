import java.util.List;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.ArrayList;

import Enums.EstadoAnimal;
import Enums.Vacinas;
import Enums.Porte;
import Enums.Higiene;
import VO.ResponseVO;
import Elementos.Animal;
import Elementos.Cliente;
import Elementos.Endereco;
import Elementos.Cachorro;
import Elementos.Gato;
import Servicos.Petshop;
import Servicos.EsquemaVacinal;


public class Teste {
    public static void main(String[] args) {
        Petshop petShop = new Petshop();

        List<EsquemaVacinal> vacinas = new ArrayList<>();

        Animal Apolo = new Cachorro("Apolo", LocalDate.of(2017, 10, 20), "Dalmata", Porte.MEDIO, 40.0,
                EstadoAnimal.SUJO, esquemasVacinais);

        List<Animal> cachorros = new ArrayList<>();
        cachorros.add(Apolo);
        Cliente jandson = new Cliente(1, cachorros, "Jandson", "00000000000000", "jandson@gmail.com", new Endereco("Maracanã", "Centro", "Casa", 10, "60000000", "Fortaleza", "CE", "Não tem"), "8501010101");
        List<EsquemaVacinal> vacinas2 = new ArrayList<>();

    private static String getServico(Higiene higiene) {
        switch(higiene) {
            case BANHO:
                return Higiene.BANHO.name().toLowerCase();
            case TOSA:
                return Higiene.TOSA.name().toLowerCase();
            case BANHO_E_TOSA:
                return Higiene.BANHO_E_TOSA.name().toLowerCase();
            default:
                return Higiene.BANHO_E_TOSA.name().toLowerCase();
        }
    }
}