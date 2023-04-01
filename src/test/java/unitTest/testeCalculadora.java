package unitTest;//Bibliotecas

import br.com.iterasys.Calculadora;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import static org.junit.jupiter.api.Assertions.assertEquals;


// Classe
public class testeCalculadora {
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
    @CsvFileSource(files = "src/test/resources/csv/massaSomar.csv")
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

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/csv/massaSubtrair.csv")
    public void testeSubtrairDoisNumerosLendoLista(String txtNum1, String txtNum2, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da Lista


        // Executa
        double resultadoAtual = Calculadora.subtrairDoisNumeros( Integer.valueOf(txtNum1), Integer.valueOf(txtNum2));

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Subtrair: "+txtNum1 +"-"+ txtNum2 +" = "+ resultadoAtual);
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

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/csv/massaMultiplicar.csv")
    public void testeMultiplicarDoisNumerosLendoLista(String txtNum1, String txtNum2, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da Lista


        // Executa
        double resultadoAtual = Calculadora.multiplicarDoisNumeros( Integer.valueOf(txtNum1), Integer.valueOf(txtNum2));

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Multiplicar: "+txtNum1 +"*"+ txtNum2 +" = "+ resultadoAtual);
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

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/csv/massaDividir.csv")
    public void testeDividirDoisNumerosLendoLista(String txtNum1, String txtNum2, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da Lista


        // Executa
        double resultadoAtual = Calculadora.dividirDoisNumeros( Integer.valueOf(txtNum1), Integer.valueOf(txtNum2));

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Dividir: "+txtNum1 +"/"+ txtNum2 +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/csv/massaAreaQuadrado.csv")
    public void testeAreaQuadradoLendoLista(Double aresta, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da Lista


        // Executa
        double resultadoAtual = Calculadora.areaQuadrado(aresta);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Area do Quadrado: "+aresta +" * "+ aresta +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/csv/massaVolumeCubo.csv")
    public void testeVolumeCuboLendoLista(Double aresta, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da Lista


        // Executa
        double resultadoAtual = Calculadora.volumeCubo(aresta);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Volume do Cubo: "+aresta +" * "+ aresta +" * "+ aresta +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/csv/massaAreaRetangulo.csv")
    public void testeAreaRetanguloLendoLista(Double base, Double altura, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da Lista


        // Executa
        double resultadoAtual = Calculadora.areaRetangulo(base, altura);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Area do Retangulo: "+base +" * "+ altura +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/csv/massaVolumeParalelepipedo.csv")
    public void testeVolumeParalelepipedoLendoLista(Double base, Double altura, Double comprimento, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da Lista


        // Executa
        double resultadoAtual = Calculadora.volumeParalelepipedo(base, altura, comprimento);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Volume Paralelepipedo: "+base +" * "+ altura +" * "+ comprimento +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/csv/massaAreaTriangulo.csv")
    public void testeAreaTrianguloLendoLista(Double base, Double altura, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da Lista


        // Executa
        double resultadoAtual = Calculadora.areaTriangulo(base, altura);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Area do Triangulo: "+base +" * "+ altura +" /2 "+ " = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/csv/massaVolumePiramideTriangular.csv")
    public void testeVolumePiramideTriangularLendoLista(Double base, Double altura, Double comprimento, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da Lista


        // Executa
        double resultadoAtual = Calculadora.volumePiramideTriangular(base, altura, comprimento);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Volume Piramide Triangular: "+base +" * "+ altura +" * "+ comprimento +" /3 " +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/csv/massaVolumePiramideQuadrada.csv")
    public void testeVolumePiramideQuadradaLendoLista(Double base, Double comprimento, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da Lista


        // Executa
        double resultadoAtual = Calculadora.volumePiramideQuadrada(base, comprimento);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Volume Piramide Quadrada: "+base +" * "+ base +" * " + comprimento +" /3 " +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/csv/massaVolumePiramideRetangular.csv")
    public void testeVolumePiramideRetangularLendoLista(Double base, Double altura, Double comprimento, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da Lista


        // Executa
        double resultadoAtual = Calculadora.volumePiramideRetangular(base, altura, comprimento);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Volume Piramide Retangular: "+base +" * "+ altura +" * " + comprimento +" /3 " +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/csv/massaAreaCirculo.csv")
    public void testeAreaCirculoLendoLista(Double raio, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da Lista


        // Executa
        double resultadoAtual = Calculadora.areaCirculo(raio);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Area do Circulo: "+raio +" * "+ raio +" * "+ "3,14" +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/csv/massaVolumeCilindro.csv")
    public void testeVolumeCilindroLendoLista(Double raio,Double altura, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da Lista


        // Executa
        double resultadoAtual = Calculadora.volumeCilindro(raio, altura);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Volume do Cilindro: "+raio +" * "+ raio +" * "+ "3,14" +" * "+ altura +" = "+ resultadoAtual);
    }
}
