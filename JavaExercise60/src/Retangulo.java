public class Retangulo {

    private double altura, largura;

    public Retangulo(){
        altura = 0; largura = 0;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double alt){
        altura = alt;
    }

    public double getLargura(){
        return largura;
    }

    public void setLargura(double larg){
        largura = larg;
    }

    public double calculaArea(){
        return altura * largura;
    }

    public double calculaPerimetro(){
        return (2 * altura) + (2 * largura);
    }

    public void exibe(){
        System.out.println("Altura: " + getAltura());
        System.out.println("Largura: " + getLargura());
        System.out.println("Área: " + calculaArea());
        System.out.println("Perímetro: " + calculaPerimetro());

    }
}
