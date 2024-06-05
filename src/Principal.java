import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;

        while(opcion != 7 ) {

              System.out.println( " ************************************** \n" +
                      " Conversor de monedas      \n\n " +
                      "Ingresa la opcion a elegir \n\n " +
                      "1. Dollar a Peso Argentino.  \n " +
                      "2. Peso Argentino a Dollar   \n " +
                      "3. Dollar a Real Brasileño   \n " +
                      "4. Real Brasileño a Dollar   \n " +
                      "5. Dollar a Peso Colombiano  \n " +
                      "6. Peso Colombiano a Dollar  \n " +
                      "7. Salir                     \n "
                      );
              opcion = lectura.nextInt();
              lectura.nextLine();

              switch (opcion) {

                  case 1:
                      ConvertirMoneda.convertir("USD", "ARS", consulta, lectura );
                     break;

                  case 2:
                      ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                      break;
                  case 3:
                      ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                      break;
                  case 4:
                      ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                     break;
                  case 5:
                      ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                      break;
                  case 6:
                      ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                      break;
                  case 7:
                      System.out.println("Saliendo ...... ");
                      break;

                  default:
                      System.out.println("Opcion no  valida ");
                      break;

              }
        }
    }
}
