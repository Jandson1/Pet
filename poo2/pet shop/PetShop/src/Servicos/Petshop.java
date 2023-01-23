package Servicos;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.time.LocalDate;

import Elementos.Animal;
import Elementos.Cliente;
import Elementos.Endereco;
import Enums.Vacinas;
import Enums.EstadoAnimal;
import Enums.Servicos;
import Enums.Higiene;
import VO.ResponseVO;

public class Petshop {
    private String cnpj;
    private Endereco endereco;
    private static List<Alimentos> alimentos = ListaAlimentos();
    private static List<Remedio> remedios = ListaRemedios();
    private static List<Vacinas> vacinas = VacinaIndicada();

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public void verAlimentos() {
        this.alimentos.stream().forEach(a -> System.out.println(a.toString()));
    }

    public void verRemedios() {
        this.remedios.stream().forEach(r -> System.out.println(r.toString()));
    }

    public void pagamento(List<ResponseVO> responses) {
        double valorServicos = 0.;


        Cliente cliente = responses.get(0).getCliente();
        for(ResponseVO response : responses) {
            valorServicos += response.getValor().doubleValue();
            System.out.println("Codigo do serviço: " + response.getId());
        }

        int quantidade = responses.get(0).getCliente().getAnimais().size();
        BigDecimal total = getValorProdutos(valorServicos, quantidade);

        System.out.println("Total: " + total);
    }

    private static List<Alimentos> viewAlimentos() {
        alimentos = new ArrayList<>();
        alimentos.add(new Alimentos(1, "Ração P", new BigDecimal(10)));
        alimentos.add(new Alimentos(2, "Ração M", new BigDecimal(20)));
        alimentos.add(new Alimentos(3, "Royal G", new BigDecimal(35)));
        return alimentos;
    }

    private static List<Remedio> viewRemedios() {
        remedios = new ArrayList<>();
        remedios.add(new Remedio(1, "Analgésico", new BigDecimal(50)));
        remedios.add(new Remedio(2, "Antialérgico", new BigDecimal(70)));
        remedios.add(new Remedio(3, "Antiofídico", new BigDecimal(100)));
        //remedios.stream().forEach(r -> System.out.println(r.toString()));
        return remedios;
    }
    private static List<Vacinas> setVacinas() {
        List<Vacinas> vacinas = new ArrayList<>();
        vacinas.add(Vacinas.VACINA_1);
        vacinas.add(Vacinas.VACINA_2);
        vacinas.add(Vacinas.VACINA_3);
        vacinas.add(Vacinas.VACINA_4);
        vacinas.add(Vacinas.VACINA_5);
        return vacinas;
    }

    private EstadoAnimal getEstadoAnimal(Higiene higiene) {
        switch(higiene) {
            case BANHO:
                return EstadoAnimal.LIMPO;
            case TOSA:
                return EstadoAnimal.TOSADO;
            case BANHO_E_TOSA:
                return EstadoAnimal.LIMPO_E_TOSADO;
            default:
                return EstadoAnimal.LIMPO_E_TOSADO;
        }
    }
    private Vacinas getVacina(List<String> vacinasUsadas) {
        Vacinas vacina = setVacinas().get(new Random().nextInt(5));
        for(String v : vacinasUsadas) {
            if(v.equals(vacina.name())) {
                return getVacina(vacinasUsadas);
            }
        }
        return vacina;
    }

    private BigDecimal getValorProdutos(double total, int quantidade) {
        Scanner entrada = new Scanner(System.in);
        List<Pagamento> produtos = new ArrayList<>();


        System.out.print("Selecione o Alimento: ");
        Alimentos alimento = alimentos.get(entrada.nextInt() - 1);

        System.out.print("Selecione o Remedio: ");
        Remedio remedio = remedios.get(entrada.nextInt() - 1);

        preco.add(alimentos);
        preco.add(remedios);

        for(Pagamento pagamento : preco) {
            total += pagamento.getPreco().doubleValue() * quantidade;
        }
        return new BigDecimal(total);
    }

}
