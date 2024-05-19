import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ConsultaMoneda consulta = new ConsultaMoneda();

        int option = 0;
        double cantidad = 0;
        String codigoISO = "";
        String convertirISO = "";
        String menu = """
                ***********************************************************
                {\\__/}                                           {\\__/}
                ( ·.·) Sea bienvenido/a el Conversor de mondedas (·.· )
                / >< \\                                           / >< \\
                                
                		1) Dolar ==> Peso argentino
                		2) Peso argentino ==> Dolar	
                		3) Dolar ==> Real brasileño
                		4) Real brasileño ==> Dolar
                		5) Dolar ==> Peso Colombiano
                		6) Peso colombiano ==> Dalor
                		7) Salir\s
                                
                Elija una opcion valida:
                ***********************************************************
                """;

        while (true) {
            try {
                System.out.println(menu);
                option = Integer.valueOf(sc.nextLine());

            if(option==7){
                System.out.println("Gracias por usar nuestro sistema, vuelva pronto");
                break;
            }

            switch (option) {
                case 1:
                    codigoISO = "USD";
                    convertirISO = "ARS";
                    break;
                case 2:
                    codigoISO = "ARS";
                    convertirISO = "USD";
                    break;
                case 3:
                    codigoISO = "USD";
                    convertirISO = "BRL";
                    break;
                case 4:
                    codigoISO = "BRL";
                    convertirISO = "USD";
                    break;
                case 5:
                    codigoISO = "USD";
                    convertirISO = "COP";
                    break;
                case 6:
                    codigoISO = "COP";
                    convertirISO = "USD";
                    break;
                default:
            }
            System.out.println("Ingrese la cantidad de "+codigoISO + " para convertir en " + convertirISO);
            cantidad= Double.valueOf(sc.nextLine());

            Moneda moneda = consulta.busquedaMoneda(codigoISO);
            Conversion con = new Conversion();
            con.convertir(moneda,codigoISO, convertirISO, cantidad);

            }catch (Exception e){
                System.out.println("Ingrese un valor numerico porfis");
                System.out.println("Tipo de error: " +e.getMessage());
                System.out.println();
            }

        }

    }




}
