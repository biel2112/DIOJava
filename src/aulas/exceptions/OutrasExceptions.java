package aulas.exceptions;

import java.text.NumberFormat;
import java.text.ParseException;

public class OutrasExceptions {
    public static void main(String[] args) {
        try{
//            Estudo de NumberFormatException

//            Number valor = Integer.valueOf("ss12");
//            System.out.println(valor);

            Number valor = NumberFormat.getInstance().parse("ss12");
            System.out.println(valor);
        }
        catch (NumberFormatException e){
            System.out.println("O valor de uma variável numérica nunca deve conter valores não-numéricos!");
        }
        catch (ParseException e){
            e.printStackTrace();
            System.out.println("O valor de uma variável numérica nunca deve conter valores não-numéricos!");
        }

    }
}
