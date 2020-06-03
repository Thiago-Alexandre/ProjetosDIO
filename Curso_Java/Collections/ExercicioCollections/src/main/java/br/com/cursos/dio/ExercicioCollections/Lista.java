package br.com.cursos.dio.ExercicioCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * Programa para execução dos exercícios propostos pelo
 * Curso Implementando Collections e Streams com Java
 * @author Thiago
 */
public class Lista {
    
    //Método principal do programa
    public static void main(String[] args) {
        
    /**
     * Processos referentes aos exercícios de List
     */
        
    //Declarando variáveis e instanciando objetos
        List<String> nomes = new ArrayList<>();
        List<String> novosNomes = new Vector<>();
        int indice;
        Iterator<String> iterador;
        String nome;
        
    //Adicionando valores na lista
        System.out.println("Adicionando valores na lista...");
        System.out.println("");
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        
    //Navegando e exibindo os valores da lista
        System.out.println("Exibindo valores da lista:");
        
        //Verificando se lista está vazia
        if (nomes.isEmpty()) {
            
            //Exibindo mensagem que a lista está vazia
            System.out.println("Lista vazia!");
            
        } else{
        
            //Transformando List em Iteretor
            iterador = nomes.iterator();
            
            //Exibindo os valores da lista
            while(iterador.hasNext()){
                System.out.println("Nome: " + iterador.next());
            }
        }
        System.out.println("");
        
    //Alterando valores Carlos para Roberto
        System.out.println("Alterando valores Carlos para Roberto...");
        
        //Pesquisando indice
        indice = nomes.indexOf("Carlos");
        
        //Verificando se valor foi encontrado
        if (indice >= 0) {
            
            //Alterando valores
            nomes.set(indice, "Roberto");
            
            //Exibindo mensagem que foi possível realizar a alteração
            System.out.println("Alteração realizada com sucesso!");
        } else{
            
            //Exibindo mensagem que não foi possível realizar a alteração
            System.out.println("Falha ao realizar alteração: Objeto Carlos não encontrado!");
        }
        System.out.println("");
        
    //Exibindo valor
        System.out.println("Pesquisando valor...");
        indice = 1;
        
        //Verificando se o indice é válido, ou seja, se existe dentro da lista
        if (indice >= 0 && indice < nomes.size()) {
            
            //Retornando o valor encontrado
            System.out.println("Nome encontrado: " + nomes.get(indice));
            
        } else{
            
            //Retornando que não foi possível encontrar o indice
            System.out.println("Falha ao exibir valor: Indice " + indice + " não existe na lista!");
        }
        System.out.println("");
        
    //Removendo valor por indice
        System.out.println("Removendo valor de indice 4...");
        indice = 4;
        
        //Verificando se o indice é válido, ou seja, se existe dentro da lista
        if (indice >= 0 && indice < nomes.size()) {
            
            //Removendo o valor desejado
            nomes.remove(indice);
            
            //Exibindo mensagem que foi possível remover o valor
            System.out.println("Excluído com sucesso! ");
            
        } else{
            
            //Exibindo mensagem que não foi possível remover o valor
            System.out.println("Falha ao remover valor: Indice " + indice + " não existe na lista!");
        }
        System.out.println("");
        
    //Removendo valor por objeto
        System.out.println("Removendo valor João...");
        nome = "João";
        
        //Verificando se o valor é válido, ou seja, se existe dentro da lista
        if (nomes.contains(nome)) {
            
            //Removendo o valor desejado
            nomes.remove(nome);
            
            //Exibindo mensagem que foi possível remover o valor
            System.out.println("Excluído com sucesso! ");
            
        } else{
            
            //Exibindo mensagem que não foi possível remover o valor
            System.out.println("Falha ao remover valor: Objeto " + nome + " não existe na lista!");
        }
        System.out.println("");
        
    //Exibindo mensagem do tamanho da lista
        System.out.println("Total de valores na lista: " + nomes.size());
        System.out.println("");
        
    //Pesquisando valor na lista
        System.out.println("Pesquisando valor...");
        nome = "Juliano";
        
        //Verificando se o valor existe na lista
        if (nomes.contains(nome)) {
            
            //Exibindo mensagem que foi possível realizar a pesquisa
            System.out.println("Objeto " + nome + " encontrado na lista!");
            
        } else{
            
            //Exibindo mensagem que não foi possível realizar a pesquisa
            System.out.println("Falha ao realizar pesquisa: Objeto " + nome + " não encontrado!");
        }
        System.out.println("");
        
    //Adicionando valores na lista 2
        System.out.println("Adicionando valores no vetor...");
        novosNomes.add("Ismael");
        novosNomes.add("Rodrigo");
        System.out.println("");
        
    //Adicionando valores de uma lista para outra
        System.out.println("Adicionando valores entre listas...");
        
        //Navegando na lista origem
        for (String novoNome : novosNomes){
            
            //Adicionando valor da lista origem para a destino
            nomes.add(novoNome);
        }
        System.out.println("");
        
    //Ordenando a lista
        System.out.println("Ordenando lista...");
        Collections.sort(nomes);
        System.out.println("");
        
    //Verificando se lista está vazia
        System.out.println("Verificabdo se a lista está vazia...");
        if (nomes.isEmpty()) {
            
            //Exibindo mensagem que a lista está vazia
            System.out.println("Lista vazia!");
            
        }else{
            
            //Exibindo mensagem que a lista não está vazia
            System.out.println("Lista não está vazia!");
        }
        System.out.println("");
        
    //Navegando e exibindo os valores da lista
        System.out.println("Exibindo valores da lista:");
        System.out.println("");
        
        //Verificando se lista está vazia
        if (nomes.isEmpty()) {
            
            //Exibindo mensagem que a lista está vazia
            System.out.println("Lista vazia!");
            
        } else{
        
            //Transformando List em Iteretor
            iterador = nomes.iterator();
            
            //Exibindo os valores da lista
            while(iterador.hasNext()){
                System.out.println("Nome: " + iterador.next());
            }
        }
        System.out.println("");
        
    //Limpando a lista
        System.out.println("Limpando a lista...");
        nomes.clear();
        System.out.println("");
        
    //Verificando se lista está vazia
        System.out.println("Verificabdo se a lista está vazia...");
        if (nomes.isEmpty()) {
            
            //Exibindo mensagem que a lista está vazia
            System.out.println("Lista vazia!");
            
        }else{
            
            //Exibindo mensagem que a lista não está vazia
            System.out.println("Lista não está vazia!");
        }
        
    }
}