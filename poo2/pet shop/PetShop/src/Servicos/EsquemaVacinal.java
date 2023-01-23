package Servicos;

import Enums.Vacinas;
import java.time.LocalDate;

public class EsquemaVacinal {
    private LocalDate data;
    private Vacinas vacina;
    private String Observação;
    public EsquemaVacinal(LocalDate data, Vacinas vacina, String observação) {
        this.data = data;
        this.vacina = vacina;
        Observação = observação;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Vacinas getVacina() {
        return vacina;
    }

    public void setVacina(Vacinas vacina) {
        this.vacina = vacina;
    }

    public String getObservação() {
        return Observação;
    }

    public void setObservação(String observação) {
        Observação = observação;
    }
}
