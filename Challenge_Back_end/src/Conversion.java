public class Conversion {

    public void convertir(Moneda moneda,String divisa, String codigoISO, double cantidad )
    {
        double valorConvertido = moneda.conversion_rates().get(codigoISO);
        System.out.println("La conversion es equivalente de 1 "+divisa+" = " + valorConvertido+ " " + codigoISO);
        System.out.println("El valor de " + cantidad+
                            "["+ divisa + "]" + " corresponde el valor final de ==> "
                            +(cantidad * valorConvertido)+ " ["+ codigoISO + "]" );
    }
}
