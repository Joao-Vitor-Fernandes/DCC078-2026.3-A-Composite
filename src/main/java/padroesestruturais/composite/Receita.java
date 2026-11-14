package padroesestruturais.composite;

public class Receita {

    private Preparo modoPreparo;

    public void setModoPreparo(Preparo modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public String getModoPreparo() {
        if (this.modoPreparo == null) {
            throw new NullPointerException("Receita sem modo de preparo");
        }
        return this.modoPreparo.getConteudo();
    }
}