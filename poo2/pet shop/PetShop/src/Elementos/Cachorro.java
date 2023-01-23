package Elementos;

import Enums.EstadoAnimal;
import Enums.Porte;
import Servicos.EsquemaVacinal;

import java.time.LocalDate;
import java.util.List;

public class Cachorro extends Animal {

    public Cachorro(String nome, String raca, String observações, Double peso, LocalDate nascimento, Porte porte, EstadoAnimal estado, List<EsquemaVacinal> vacinas) {
        super(nome, raca, observações, peso, nascimento, porte, estado, vacinas);
    }
}
