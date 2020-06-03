package br.com.cursos.dio.ExercicioCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Programa para execu��o dos exerc�cios propostos pelo
 * Curso Implementando Collections e Streams com Java
 * @author Thiago
 */
public class Fila {
    
    //M�todo principal do programa
    public static void main(String[] args) {
        
    /**
     * Processos referentes aos exerc�cios de Queue
     */
        
    //Declarando vari�veis e instanciando objetos
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
        nomes.add("Jo�o");
        
    //Navegando e exibindo os valores da fila
        System.out.println("Exibindo valores da fila:");
        
        //Verificando se fila est� vazia
        if (nomes.isEmpty()) {
            
            //Exibindo mensagem que a fila est� vazia
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
            
            //Retornando que a fila est� vazia
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
            
            //Retornando que a fila est� vazia
            System.out.println("Fila vazia!");
        }
        System.out.println("");
        
    //Adicionando valores na fila
        System.out.println("Adicionando novo valor na fila...");
        System.out.println("");
        nomes.add("Daniel");
        
    //Navegando e exibindo os valores da fila
        System.out.println("Exibindo valores da fila:");
        
        //Verificando se fila est� vazia
        if (nomes.isEmpty()) {
            
            //Exibindo mensagem que a fila est� vazia
            System.out.println("Fila vazia!");
            
        } else{
            
            //Iniciando contador e mensagem
            contador = 1;
            mensagem = null;
            valor = "Daniel";
            
            //Exibindo os valores da fila
            for (String nome : nomes) {
                
                System.out.println("Nome: " + nome);
                
                //Verificando posi��o do valor
                if (nome.equals(valor)) {
                    
                    //Garantindo que a mensagem ser� do primeiro valor encontrado,
                    //caso exista mais de um
                    if (mensagem == null) {
                        
                        mensagem = nome + " est� na " + contador + "� posi��o da fila!";
                    }
                    
                } else{
                    
                    contador++;
                }
            }
            
            //Exibindo mensagem da posi��o do valor
            System.out.println(mensagem);
        }
        System.out.println("");
        
    //Exibindo mensagem do tamanho da fila
        System.out.println("Tamanho da Fila: " + nomes.size());
        System.out.println("");
        
    //Verificando se fila est� vazia
        System.out.println("Verificabdo se a fila est� vazia...");
        if (nomes.isEmpty()) {
            
            //Exibindo mensagem que a fila est� vazia
            System.out.println("Fila vazia!");
            
        }else{
            
            //Exibindo mensagem que a fila n�o est� vazia
            System.out.println("Fila n�o est� vazia!");
        }
        System.out.println("");
        
    //Pesquisando valor na fila
        System.out.println("Pesquisando valor...");
        valor = "Carlos";
        
        //Verificando se o valor existe na fila
        if (nomes.contains(valor)) {
            
            //Exibindo mensagem que foi poss�vel realizar a pesquisa
            System.out.println("Objeto " + valor + " encontrado na fila!");
            
        } else{
            
            //Exibindo mensagem que n�o foi poss�vel realizar a pesquisa
            System.out.println("Falha ao realizar pesquisa: Objeto " + valor + " n�o encontrado!");
        }
    }
}