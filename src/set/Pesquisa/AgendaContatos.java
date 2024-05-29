package set.Pesquisa;

import set.OperacoesBasicas.Convidado;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c: contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Felipe 1", 123456);
        agendaContatos.adicionarContato("Felipe 2", 123457);
        agendaContatos.adicionarContato("Felipe 3", 123457);
        agendaContatos.adicionarContato("Felipe 4", 123458);
        agendaContatos.adicionarContato("Felipe 4", 123459);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Felipe 4"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Felipe 4", 54321));

        agendaContatos.exibirContato();
    }
}
