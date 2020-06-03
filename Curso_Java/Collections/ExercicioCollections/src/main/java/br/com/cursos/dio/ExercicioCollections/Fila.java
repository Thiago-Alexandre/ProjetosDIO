package br.com.cursos.dio.ExercicioCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Programa para execução dos exercícios propostos pelo
 * Curso Implementando Collections e Streams com Java
 * @author Thiago
 */
public class Fila {
    
    //Método principal do programa
    public static void main(String[] args) {
        
    /**
     * Processos referentes aos exercícios de Queue
     */
        
    //Declarando variáveis e instanciando objetos
        Queue<String> nomes = new LinkedList<>();
        Iterator<String> iterador;
        int contador;
        String mensagem, valor;
        
    //Adicionando valores na fila
        System.out.println("Adicionando valores na fila...");
        System.out.println("");
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        
    //Navegando e exibindo os valores da fila
        System.out.println("Exibindo valores da fila:");
        
        //Verificando se fila está vazia
        if (nomes.isEmpty()) {
            
            //Exibindo mensagem que a fila está vazia
            System.out.println("Fila vazia!");
            
        } else{
        
            //Transformando Queue em Iteretor
            iterador = nomes.iterator();
            
            //Exibindo os valores da fila
            while(iterador.hasNext()){
                System.out.println("Nome: " + iterador.next());
            }
        }
        System.out.println("");
        
    //Exibindo primeiro valor da fila sem remover
        System.out.println("Pesquisando primeiro valor da fila...");
        
        //Verificando se a fila esta vazia
        if (!nomes.isEmpty()) {
            
            //Retornando o primeiro valor encontrado
            System.out.println("Primeiro da Fila: " + nomes.peek());
            
        } else{
            
            //Retornando que a fila está vazia
            System.out.println("Fila vazia!");
        }
        System.out.println("");    
        
    //Exibindo primeiro valor da fila e removendo
        System.out.println("Pesquisando primeiro valor da fila...");
        
        //Verificando se a fila esta vazia
        if (!nomes.isEmpty()) {
            
            //Retornando o primeiro valor encontrado
            System.out.println("Primeiro da Fila: " + nomes.poll());
            
        } else{
            
            //Retornando que a fila está vazia
            System.out.println("Fila vazia!");
        }
        System.out.println("");
        
    //Adicionando valores na fila
        System.out.println("Adicionando novo valor na fila...");
        System.out.println("");
        nomes.add("Daniel");
        
    //Navegando e exibindo os valores da fila
        System.out.println("Exibindo valores da fila:");
        
        //Verificando se fila está vazia
        if (nomes.isEmpty()) {
            
            //Exibindo mensagem que a fila está vazia
            System.out.println("Fila vazia!");
            
        } else{
            
            //Iniciando contador e mensagem
            contador = 1;
            mensagem = null;
            valor = "Daniel";
            
            //Exibindo os valores da fila
            for (String nome : nomes) {
                
                System.out.println("Nome: " + nome);
                
                //Verificando posição do valor
                if (nome.equals(valor)) {
                    
                    //Garantindo que a mensagem será do primeiro valor encontrado,
                    //caso exista mais de um
                    if (mensagem == null) {
                        
                        mensagem = nome + " está na " + contador + "° posição da fila!";
                    }
                    
                } else{
                    
                    contador++;
                }
            }
            
            //Exibindo mensagem da posição do valor
            System.out.println(mensagem);
        }
        System.out.println("");
        
    //Exibindo mensagem do tamanho da fila
        System.out.println("Tamanho da Fila: " + nomes.size());
        System.out.println("");
        
    //Verificando se fila está vazia
        System.out.println("Verificabdo se a fila está vazia...");
        if (nomes.isEmpty()) {
            
            //Exibindo mensagem que a fila está vazia
            System.out.println("Fila vazia!");
            
        }else{
            
            //Exibindo mensagem que a fila não está vazia
            System.out.println("Fila não está vazia!");
        }
        System.out.println("");
        
    //Pesquisando valor na fila
        System.out.println("Pesquisando valor...");
        valor = "Carlos";
        
        //Verificando se o valor existe na fila
        if (nomes.contains(valor)) {
            
            //Exibindo mensagem que foi possível realizar a pesquisa
            System.out.println("Objeto " + valor + " encontrado na fila!");
            
        } else{
            
            //Exibindo mensagem que não foi possível realizar a pesquisa
            System.out.println("Falha ao realizar pesquisa: Objeto " + valor + " não encontrado!");
        }
    }
}