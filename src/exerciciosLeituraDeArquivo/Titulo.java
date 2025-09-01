package exerciciosLeituraDeArquivo;

public class Titulo {
    private String nomeAutor;
    private String anoLancamento;
    private String numeroDeSerie;
    private String nomeLivro;

    public Titulo (String nomeLivro, String nomeAutor, String anoLancamento, String numeroDeSerie) {
        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
        this.anoLancamento = anoLancamento;
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }
}
