import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(8.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));
        // indexOf exibe a posição da nota ou elemento dentro da minha lista

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        // notas.add para adicionar a posição e elemento na lista
        System.out.println(notas.toString());

        System.out.println("Substitua a nota 5 pela nota 6: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);
        /*
         * utilizando o notas.set voce consegue substituir uma nota por outra.
         * Utilizei o notas.indexOf para achar a nota dentro de lista que seria
         * substituida
         */

        System.out.println("COnfira se a nota 5 esta na lista: " + notas.contains(5.0));
        /*
         * Utilizei o "notas.contains" para conferir se o 5 esta na lista, boolean me
         * retorna falso ja que 5 foi subsitituido
         */

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas)
            System.out.println(nota);
        // utilizado o foreach para imprimir um abaixo da outra

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());
        // metodo notas.get mostra o elemento da posição que foi solicitada

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        // collection.min exibe a menor nota dentro da minha lista

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // Exiba a soma dos valores:

        Iterator<Double> iterator = notas.iterator(); // variavel
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        // hasnext sempre vai somando todos os elementos, fazendo um laço com while

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));
        // o comando size retorna um inteiro e a quantidade de elementos do meu list

        System.out.println("Remova a nota 3.6: ");
        notas.remove(3.6);
        System.out.println(notas);
        // remove a nota desejada

        System.out.println("remova a nota na posição 0 ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notas);
        // aqui foi utilizado a mesma logica da soma anterior. No final utilizado o
        // ".remove" para remover os elementos

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.print(notas);
        // cclear apaga toda a lista

        System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());
        // isEmpty mostra se sua lista esta vazia ou nao, false ou true

    }

}
