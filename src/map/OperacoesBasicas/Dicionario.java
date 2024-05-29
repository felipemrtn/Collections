package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributo
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String pesquisaPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            pesquisaPalavra = dicionarioMap.get(palavra);
        }
        return pesquisaPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Teste 1", "teste definido1");
        dicionario.adicionarPalavra("Teste 2", "teste definido2");
        dicionario.adicionarPalavra("Teste 3", "teste definido3");
        dicionario.adicionarPalavra("Teste 4", "teste definido4");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Teste 2");

        dicionario.exibirPalavras();

        dicionario.pesquisarPorPalavra("Teste 4");
    }
}
