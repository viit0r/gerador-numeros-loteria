import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class GeradorDeNumeros {

    private ArrayList<Integer> list = new ArrayList<>();
    private int numeroGerado;

    public GeradorDeNumeros(ArrayList<Integer> list) {
        this.list = list;
    }

    public void adicionaNumeroNaLista() {
        boolean retorno = verificaLista();
        if (retorno == true) {
            list.add(numeroGerado);
        } else {
            adicionaNumeroNaLista();
        }
    }

    public Boolean verificaLista() {
        numeroGerado = geraNumeroAleatorio();
        if (!list.isEmpty()) {
            for (int i : list) {
                if (i == numeroGerado) {
                    return false;
                }
            }
        } else {
            return true;
        }
        return true;
    }

    public int geraNumeroAleatorio() {
        Random random = new Random();
        int numero = random.nextInt(60) + 1;
        System.out.println("numero: " + numero);
        return numero;
    }

    public void ordenarNumeros() {
        list.sort(Comparator.naturalOrder());
    }
}
