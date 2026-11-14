package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReceitaTest {

    @Test
    void deveRetornarModoPreparoDoBoloDeCenoura() {
        Etapa baseLiquida = new Etapa("Base líquida");
        baseLiquida.addPreparo(new Ingrediente("Cenoura", 300.0));
        baseLiquida.addPreparo(new Ingrediente("Ovos", 150.0));
        baseLiquida.addPreparo(new Ingrediente("Óleo", 120.0));

        Etapa massa = new Etapa("Massa");
        massa.addPreparo(baseLiquida);
        massa.addPreparo(new Ingrediente("Farinha de trigo", 360.0));
        massa.addPreparo(new Ingrediente("Açúcar", 300.0));

        Etapa cobertura = new Etapa("Cobertura");
        cobertura.addPreparo(new Ingrediente("Chocolate em pó", 50.0));
        cobertura.addPreparo(new Ingrediente("Leite", 100.0));

        Etapa decoracao = new Etapa("Decoração");

        Etapa boloDeCenoura = new Etapa("Bolo de Cenoura");
        boloDeCenoura.addPreparo(massa);
        boloDeCenoura.addPreparo(cobertura);
        boloDeCenoura.addPreparo(decoracao);

        Receita receita = new Receita();
        receita.setModoPreparo(boloDeCenoura);

        assertEquals("Etapa: Bolo de Cenoura\n" +
                "Etapa: Massa\n" +
                "Etapa: Base líquida\n" +
                "Ingrediente: Cenoura - quantidade: 300.0 g\n" +
                "Ingrediente: Ovos - quantidade: 150.0 g\n" +
                "Ingrediente: Óleo - quantidade: 120.0 g\n" +
                "Ingrediente: Farinha de trigo - quantidade: 360.0 g\n" +
                "Ingrediente: Açúcar - quantidade: 300.0 g\n" +
                "Etapa: Cobertura\n" +
                "Ingrediente: Chocolate em pó - quantidade: 50.0 g\n" +
                "Ingrediente: Leite - quantidade: 100.0 g\n" +
                "Etapa: Decoração\n", receita.getModoPreparo());
    }

    @Test
    void deveLancarExcecaoQuandoReceitaNaoTemModoPreparo() {
        try {
            Receita receita = new Receita();
            receita.getModoPreparo();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Receita sem modo de preparo", e.getMessage());
        }
    }
}
