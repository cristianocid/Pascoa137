package unitTest;

import br.com.iterasys.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testeCalculadoraSimples {

    @Test
    public void testeAreaQuadrado(){
        // Configura
        // Valores de entrada
        double aresta = 2;
        // Valores de saida
        double resultadoEsperado = 4;

        // Executa
        double resultadoAtual = Calculadora.areaQuadrado(aresta);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Area do Quadrado: "+aresta +" * "+ aresta +" = "+ resultadoAtual);
    }

    @Test
    public void testeVolumeCubo(){
        // Configura
        // Valores de entrada
        double aresta = 2;
        // Valores de saida
        double resultadoEsperado = 8;

        // Executa
        double resultadoAtual = Calculadora.volumeCubo(aresta);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Volume do Cubo: "+aresta +" * "+ aresta +" * "+ aresta +" = "+ resultadoAtual);
    }

    @Test
    public void testeAreaRetangulo(){
        // Configura
        // Valores de entrada
        double base = 2;
        double altura = 5;
        // Valores de saida
        double resultadoEsperado = 10;

        // Executa
        double resultadoAtual = Calculadora.areaRetangulo(base, altura);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Area do Retangulo: "+base +" * "+ altura +" = "+ resultadoAtual);
    }

    @Test
    public void testeVolumeParalelepipedo(){
        // Configura
        // Valores de entrada
        double base = 2;
        double altura = 5;
        double comprimento = 3;
        // Valores de saida
        double resultadoEsperado = 30;

        // Executa
        double resultadoAtual = Calculadora.volumeParalelepipedo(base, altura, comprimento);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Volume Paralelepipedo: "+base +" * "+ altura +" * "+ comprimento +" = "+ resultadoAtual);
    }

    @Test
    public void testeAreaTriangulo(){
        // Configura
        // Valores de entrada
        double base = 2;
        double altura = 5;
        // Valores de saida
        double resultadoEsperado = 5;

        // Executa
        double resultadoAtual = Calculadora.areaTriangulo(base, altura);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Area do Triangulo: "+base +" * "+ altura +" /2 "+ " = "+ resultadoAtual);
    }

    @Test
    public void testeVolumePiramideTriangular(){
        // Configura
        // Valores de entrada
        double base = 4;
        double altura = 6;
        double comprimento = 8;
        // Valores de saida
        double resultadoEsperado = 64;

        // Executa
        double resultadoAtual = Calculadora.volumePiramideTriangular(base, altura, comprimento);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Volume Piramide Triangular: "+base +" * "+ altura +" * "+ comprimento +" /3 " +" = "+ resultadoAtual);
    }

    @Test
    public void testeVolumePiramideQuadrada(){
        // Configura
        // Valores de entrada
        double base = 4;
        double comprimento = 6;
        // Valores de saida
        double resultadoEsperado = 32;

        // Executa
        double resultadoAtual = Calculadora.volumePiramideQuadrada(base, comprimento);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Volume Piramide Quadrada: "+base +" * "+ base +" * " + comprimento +" /3 " +" = "+ resultadoAtual);
    }

    @Test
    public void testeVolumePiramideRetangular(){
        // Configura
        // Valores de entrada
        double base = 4;
        double altura = 6;
        double comprimento = 8;
        // Valores de saida
        double resultadoEsperado = 64;

        // Executa
        double resultadoAtual = Calculadora.volumePiramideRetangular(base, altura, comprimento);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Volume Piramide Retangular: "+base +" * "+ altura +" * " + comprimento +" /3 " +" = "+ resultadoAtual);
    }

    @Test
    public void testeAreaCirculo(){
        // Configura
        // Valores de entrada
        double raio = 2;
        // Valores de saida
        double resultadoEsperado = 12.56;

        // Executa
        double resultadoAtual = Calculadora.areaCirculo(raio);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Area do Circulo: "+raio +" * "+ raio +" * "+ "3,14" +" = "+ resultadoAtual);
    }

    @Test
    public void testeVolumeCilindro(){
        // Configura
        // Valores de entrada
        double raio = 2;
        double altura = 6;
        // Valores de saida
        double resultadoEsperado = 75.36;

        // Executa
        double resultadoAtual = Calculadora.volumeCilindro(raio, altura);

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), resultadoAtual);
        System.out.println("Teste Volume do Cilindro: "+raio +" * "+ raio +" * "+ "3,14" +" * "+ altura +" = "+ resultadoAtual);
    }
}
