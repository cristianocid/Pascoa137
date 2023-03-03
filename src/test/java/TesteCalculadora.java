//Bibliotecas

import br.com.iterasys.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Classe
public class TesteCalculadora {
    // Atributos

    // Funções e Métodos

    @Test
    public void testeSomarDoisNumeros(){
        // Configura
        // Valores de entrada
        double num1 = 7;
        double num2 = 5;
        // Valores de saida
        double resultadoEsperado = 12;

        // Executa
        double resultadoAtual = Calculadora.somarDoisNumeros( num1, num2);

        // Valida
        assertEquals(resultadoEsperado, resultadoAtual);
        System.out.println("Teste Soma: "+num1 +"+"+ num2 +" = "+ resultadoAtual);
    }
    @Test
    public void testeSubtrairDoisNumeros(){
        // Configura
        // Valores de entrada
        double num1 = 7;
        double num2 = 5;
        // Valores de saida
        double resultadoEsperado = 2;

        // Executa
        double resultadoAtual = Calculadora.subtrairDoisNumeros( num1, num2);

        // Valida
        assertEquals(resultadoEsperado, resultadoAtual);
        System.out.println("Teste Subtrair: "+num1 +"-"+ num2 +" = "+ resultadoAtual);
    }
    @Test
    public void testeMultiplicarDoisNumeros(){
        // Configura
        // Valores de entrada
        double num1 = 7;
        double num2 = 5;
        // Valores de saida
        double resultadoEsperado = 35;

        // Executa
        double resultadoAtual = Calculadora.multiplicarDoisNumeros( num1, num2);

        // Valida
        assertEquals(resultadoEsperado, resultadoAtual);
        System.out.println("Teste Multiplicar: "+num1 +"*"+ num2 +" = "+ resultadoAtual);
    }
    @Test
    public void testeDividirDoisNumeros(){
        // Configura
        // Valores de entrada
        double num1 = 8;
        double num2 = 4;
        // Valores de saida
        double resultadoEsperado = 2;

        // Executa
        double resultadoAtual = Calculadora.dividirDoisNumeros( num1, num2);

        // Valida
        assertEquals(resultadoEsperado, resultadoAtual);
        System.out.println("Teste Dividir: "+num1 +"/"+ num2 +" = "+ resultadoAtual);
    }
    @Test
    public void testeDividirDoisNumerosInteiros(){
        // Configura
        // Valores de entrada
        int numA = 8;
        int numB = 0;
        // Valores de saida
        String resultadoEsperado = "Não é possivel dividir por zero";

        // Executa
        String resultadoAtual = Calculadora.dividirDoisNumerosInteiros( numA, numB);

        // Valida
        assertEquals(resultadoEsperado, (resultadoAtual));
        System.out.println("Teste Dividir: "+numA +"/"+ numB +" = "+ resultadoAtual);
    }
}
