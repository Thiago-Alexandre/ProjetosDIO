package br.com.cursos.dio.ExercicioCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * Programa para execu��o dos exerc�cios propostos pelo
 * Curso Implementando Collections e Streams com Java
 * @author Thiago
 */
public class Main {
    
    //M�todo principal do programa
    public static void main(String[] args) {
        
        /**
         * Processos referentes aos exerc�cios de List
         */
        
        //Declarando vari�veis e instanciando objetos
        List<String> nomes = new ArrayList<>();
        List<String> novosNomes = new Vector<>();
        
        //Adicionando valores na lista
        System.out.println("Adicionando valores na lista...");
        System.out.println("");
        adicionarValor("Juliana", nomes);
        adicionarValor("Pedro", nomes);
        adicionarValor("Carlos", nomes);
        adicionarValor("Larissa", nomes);
        adicionarValor("Jo�o", nomes);
        
        //Navegando e exibindo os valores da lista
        System.out.println("Exibindo valores da lista:");
        System.out.println("");
        exibirLista(nomes);
        System.out.println("");
        
        //Alterando valores Carlos para Roberto
        System.out.println("Alterando valores Carlos para Roberto...");
        alterarValor("Carlos","Roberto", nomes);
        System.out.println("");
        
        //Exibindo valor
        System.out.println("Pesquisando valor...");
        mostrarValor(1, nomes);
        System.out.println("");
        
        //Removendo valor por indice
        System.out.println("Removendo valor...");
        remover(4, nomes);
        System.out.println("");
        
        //Removendo valor por objeto
        System.out.println("Removendo valor...");
        remover("Jo�o", nomes);
        System.out.println("");
        
        //Exibindo mensagem do tamanho da lista
        System.out.println("Total de valores na lista: " + nomes.size());
        System.out.println("");
        
        //Pesquisando valor na lista
        System.out.println("Pesquisando valor...");
        pesquisarValor("Juliano", nomes);
        System.out.println("");
        
        //Adicionando valores na lista 2
        System.out.println("Adicionando valores no vetor...");
        adicionarValor("Ismael", novosNomes);
        adicionarValor("Rodrigo", novosNomes);
        System.out.println("");
        
        //Adicionando valores de uma lista para outra
        System.out.println("Adicionando valores entre listas...");
        adicionarValor(novosNomes, nomes);
        System.out.println("");
        
        //Ordenando a lista
        System.out.println("Ordenando lista...");
        ordenarLista(nomes);
        System.out.println("");
        
        //Verificando se lista est� vazia
        System.out.println("Verificabdo se a lista est� vazia...");
        if (nomes.isEmpty()) {
            
            //Exibindo mensagem que a lista est� vazia
            System.out.println("Lista vazia!");
            
        }else{
            
            //Exibindo mensagem que a lista n�o est� vazia
            System.out.println("Lista n�o est� vazia!");
        }
        System.out.println("");
        
        //Navegando e exibindo os valores da lista
        System.out.println("Exibindo valores da lista:");
        System.out.println("");
        exibirLista(nomes);
        System.out.println("");
        
        //Limpando a lista
        System.out.println("Limpando a lista...");
        nomes.clear();
        System.out.println("");
        
        //Verificando se lista est� vazia
        System.out.println("Verificabdo se a lista est� vazia...");
        if (nomes.isEmpty()) {
            
            //Exibindo mensagem que a lista est� vazia
            System.out.println("Lista vazia!");
            
        }else{
            
            //Exibindo mensagem que a lista n�o est� vazia
            System.out.println("Lista n�o est� vazia!");
        }
        
    }
    
    public static void adicionarValor(String nome, Collection colecao){
    
        //Adicionando valor na lista
        colecao.add(nome);
    }
    
    public static void exibirLista(Collection<String> colecao){
    
        //Verificando se lista est� vazia
        if (colecao.isEmpty()) {
            
            //Exibindo mensagem que a lista est� vazia
            System.out.println("Lista vazia!");
            
        } else{
        
            //Transformando List em Iteretor
            Iterator<String> interador = colecao.iterator();
            
            //Exibindo os valores da lista
            while(interador.hasNext()){
                System.out.println("Nome: " + interador.next());
            }
        }
    }
    
    public static void alterarValor(String nomeAntigo, String nomeNovo, List lista){
        
        //Pesquisando indice
        int indice = lista.indexOf(nomeAntigo);
        
        //Verificando se valor foi encontrado
        if (indice >= 0) {
            
            //Alterando valores
            lista.set(indice, nomeNovo);
            
            //Exibindo mensagem que foi poss�vel realizar a altera��o
            System.out.println("Altera��o realizada com sucesso!");
        } else{
            
            //Exibindo mensagem que n�o foi poss�vel realizar a altera��o
            System.out.println("Falha ao realizar altera��o: Objeto " + nomeAntigo + " n�o encontrado!");
        }
    }
    
    public static void mostrarValor(int indice, List lista){
        
        //Verificando se o indice � v�lido, ou seja, se existe dentro da lista
        if (indice >= 0 && indice < lista.size()) {
            
            //Retornando o valor encontrado
            System.out.println("Nome encontrado: " + lista.get(indice));
        } else{
            
            //Retornando que n�o foi poss�vel encontrar o indice
            System.out.println("Falha ao exibir valor: Indice " + indice + " n�o existe na lista!");
        }
    }
    
    public static void remover(int indice, Collection colecao){
        
        //Verificando se o indice � v�lido, ou seja, se existe dentro da lista
        if (indice >= 0 && indice < colecao.size()) {
            
            //Removendo o valor desejado
            colecao.remove(indice);
            
            //Exibindo mensagem que foi poss�vel remover o valor
            System.out.println("Exclu�do com sucesso! ");
            
        } else{
            
            //Exibindo mensagem que n�o foi poss�vel remover o valor
            System.out.println("Falha ao remover valor: Indice " + indice + " n�o existe na lista!");
        }
    }
    
    public static void remover(String nome, Collection colecao){
    
        //Verificando se o valor � v�lido, ou seja, se existe dentro da lista
        if (colecao.contains(nome)) {
            
            //Removendo o valor desejado
            colecao.remove(nome);
            
            //Exibindo mensagem que foi poss�vel remover o valor
            System.out.println("Exclu�do com sucesso! ");
            
        } else{
            
            //Exibindo mensagem que n�o foi poss�vel remover o valor
            System.out.println("Falha ao remover valor: Objeto " + nome + " n�o existe na lista!");
        }
    }
    
    public static void pesquisarValor(String nome, Collection colecao){
    
        //Verificando se o valor existe na lista
        if (colecao.contains(nome)) {
            
            //Exibindo mensagem que foi poss�vel realizar a pesquisa
            System.out.println("Objeto " + nome + " encontrado na lista!");
            
        } else{
            
            //Exibindo mensagem que n�o foi poss�vel realizar a pesquisa
            System.out.println("Falha ao realizar pesquisa: Objeto " + nome + " n�o encontrado!");
        }
    }
    
    public static void adicionarValor(Collection<String> origem, Collection<String> destino){
    
        //Navegando na lista origem
        for (String nome : origem){
            
            //Adicionando valor da lista origem para a destino
            adicionarValor(nome,destino);
        }
    }
    
    public static void ordenarLista(List<String> lista){
    
        //Ordenando a lista
        Collections.sort(lista);
    }
}