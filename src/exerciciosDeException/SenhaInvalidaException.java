package exerciciosDeException;

public class SenhaInvalidaException extends RuntimeException {

    public SenhaInvalidaException(String mensagem){
        super (mensagem);
    }

}
