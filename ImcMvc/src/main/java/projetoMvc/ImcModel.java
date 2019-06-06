package projetoMvc;

public class ImcModel {
    
    private double kilos;
    private double altura;

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public String retorneImc() {
            Double alturaEmCm = (altura) / 100;

            Double imc = kilos / (alturaEmCm * alturaEmCm);

            return String.format("%.2f", imc);
    }
}
