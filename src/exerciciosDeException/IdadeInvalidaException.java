package exerciciosDeException;

public class IdadeInvalidaException extends RuntimeException {
    public IdadeInvalidaException (String mensagem){
        super(mensagem);
    }
}
