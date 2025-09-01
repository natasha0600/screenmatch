package exerciciosDeGsoneJson;

import com.google.gson.Gson;

public class ConversaoJsonAninhadoParaObjeto {
    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Harry Potter\",\"autor\":\"JK Rowling\",\"editora\":{\"nome\":\"Rocco\",\"cidade\":\"São Leopoldo\"}}";
        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);
        System.out.println("Objeto Livro: "+livro);
    }
}
