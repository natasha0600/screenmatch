package exerciciosDeLista;

import java.util.ArrayList;

public class TarefasMain {
    public static void main(String[] args) {
        ArrayList <String> tarefas = new ArrayList<>();
        tarefas.add("Fazer exercicios");
        tarefas.add("Fazer comida");
        tarefas.add("Estudar");
        tarefas.add("Comprar pão");
        tarefas.add("Ir ao cinema");
        // 1. Remova a tarefa "Comprar pão" da lista.
        /*antes de remover */
        System.out.println(tarefas);

        /*depois de remover*/
        tarefas.remove(3);
        System.out.println(tarefas);

        // 2. Remova a tarefa que está na posição de índice 2 (depois da remoção anterior).
        /*antes de remover */
        System.out.println(tarefas);

        /*depois de remover*/
        tarefas.remove(2);
        System.out.println(tarefas);

        // 3. Imprima a lista após as remoções para ver o resultado.
        /*feito acima*/
    }
}
