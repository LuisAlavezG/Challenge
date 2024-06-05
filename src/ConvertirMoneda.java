import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La Tasa tasa de convesion es " + monedaBase + "=" + monedas.conversion_rate());
        System.out.println("Ingresa la cantidad de " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase + " = " + cantidadConvertida + " " + monedas.target_code());
    }


}
