import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        GeradorDeNumeros gerador = new GeradorDeNumeros(listaNumeros);

        while (listaNumeros.size() < 6) {
            gerador.adicionaNumeroNaLista();
        }
        gerador.ordenarNumeros();
        System.out.println(listaNumeros);

    }
}
