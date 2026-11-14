package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Etapa extends Preparo {

    private List<Preparo> preparos;

    public Etapa(String descricao) {
        super(descricao);
        this.preparos = new ArrayList<Preparo>();
    }

    public void addPreparo(Preparo preparo) {
        this.preparos.add(preparo);
    }

    @Override
    public String getConteudo() {
        String saida = "Etapa: " + this.getDescricao() + "\n";
        for (Preparo preparo : preparos) {
            saida += preparo.getConteudo();
        }
        return saida;
    }
}