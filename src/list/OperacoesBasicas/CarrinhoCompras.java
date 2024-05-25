package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    //Lista de carrinho
    private List<Item> carrinho;

    //construtor
    public CarrinhoCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.carrinho.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item i: carrinho) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        carrinho.removeAll(itensParaRemover);
    }

    public int calcularValorTotal() {
        double valorTotal = 0d;
        if (!carrinho.isEmpty()) {
            for (Item item: carrinho) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return (int) valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public void exibirItens() {
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        //System.out.println("A quantidade de items no carrinho é: " + carrinhoCompras.calcularValorTotal());

        carrinhoCompras.adicionarItem("Camisa", 40.30, 3);
        carrinhoCompras.adicionarItem("Calça", 80.50, 4);
        carrinhoCompras.adicionarItem("Meia", 10.30, 2);

        carrinhoCompras.exibirItens();

        carrinhoCompras.removerItem("Calça");

        carrinhoCompras.exibirItens();

        System.out.println("O valor da compra é: R$ " + carrinhoCompras.calcularValorTotal());



    }
}
