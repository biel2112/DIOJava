package aulas.exceptions;

public class CpfFormatador {

    static String formatarCpf(String cpf) throws CpfInvalidoException{
        if (cpf.length() != 11){
            throw new CpfInvalidoException();
        }
        return cpf;
    }

    public static void main(String[] args) {
        try {
            String cpfFormatado = formatarCpf("1234567891");
            System.out.println(cpfFormatado);
        }
        catch (CpfInvalidoException e){
            e.printStackTrace();
            System.out.println("O CPF não corresponde às regras de negócios!");
        }
    }
}
