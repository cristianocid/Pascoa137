//Bibliotecas

import br.com.iterasys.Calculadora;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import static org.junit.jupiter.api.Assertions.assertEquals;


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

    // Teste usando Lista
    @ParameterizedTest
    @CsvFileSource(resources = "src/teste/resources/csv/massaSomar.csv")
    public void testeSomarDoisNumerosLendoLista(String txtNum1, String txtNum2, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da Lista


        // Executa
        double resultadoAtual = Calculadora.somarDoisNumeros( Integer.valueOf(txtNum1), Integer.valueOf(txtNum2));

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Soma: "+txtNum1 +"+"+ txtNum2 +" = "+ resultadoAtual);
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
