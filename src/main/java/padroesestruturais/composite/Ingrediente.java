package padroesestruturais.composite;

public class Ingrediente extends Preparo {

    private double quantidadeGramas;

    public Ingrediente(String descricao, double quantidadeGramas) {
        super(descricao);
        this.quantidadeGramas = quantidadeGramas;
    }

    public double getQuantidadeGramas() {
        return quantidadeGramas;
    }

    public void setQuantidadeGramas(double quantidadeGramas) {
        this.quantidadeGramas = quantidadeGramas;
    }

    @Override
    public String getConteudo() {
        return "Ingrediente: " + this.getDescricao() + " - quantidade: " + this.quantidadeGramas + " g\n";
    }
}
