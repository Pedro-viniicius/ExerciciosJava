
public class SistemaTransporte {

    public static void main(String[] args) {
        
        Transporte transporteRodoviario = new TransporteRodoviario("Caminhão", 10.0, 200);
        Transporte transporteAereo = new TransporteAereo("Avião", 5, 500);
        Transporte transporteMaritimo = new TransporteMaritimo("Navio", 20, 1000);

       
        System.out.println("Custo do transporte rodoviário: " + transporteRodoviario.CalcularCusto(10, 200));
        System.out.println("Custo do transporte aéreo: " + transporteAereo.CalcularCusto( 5, 500));
        System.out.println("Custo do transporte marítimo: " + transporteMaritimo.CalcularCusto(20, 1000));
    }
}
