package unitTest;

import br.com.iterasys.Calculadora;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testeCalculadoraLista {

    @ParameterizedTest
    @CsvSource(value = {
            "2, 4",
            "5, 25",
            "10, 100",
            "8, 64"
    }, delimiter = ',')
    public void testeAreaQuadrado(String txtAresta, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da lista

        // Executa
        double resultadoAtual = Calculadora.areaQuadrado(Integer.valueOf(txtAresta));

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), Double.valueOf(resultadoAtual));
        System.out.println("Teste Area do Quadrado: "+txtAresta +" * "+ txtAresta +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "2, 8",
            "5, 125",
            "10, 1000",
            "8, 512"
    }, delimiter = ',')
    public void testeVolumeCubo(String txtAresta, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da lista

        // Executa
        double resultadoAtual = Calculadora.volumeCubo(Integer.valueOf(txtAresta));

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), Double.valueOf(resultadoAtual));
        System.out.println("Teste Volume do Cubo: "+txtAresta +" * "+ txtAresta +" * "+ txtAresta +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "2, 5, 10",
            "3, 8, 24",
            "10, 12, 120",
            "7, 9, 63"
    }, delimiter = ',')
    public void testeAreaRetangulo(String txtBase, String txtAltura, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da lista

        // Executa
        double resultadoAtual = Calculadora.areaRetangulo(Integer.valueOf(txtBase),Integer.valueOf(txtAltura));

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), Double.valueOf(resultadoAtual));
        System.out.println("Teste Area do Retangulo: "+txtBase +" * "+ txtAltura +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "2, 5, 3, 30",
            "3, 8, 4, 96",
            "10, 12, 8, 960"
    }, delimiter = ',')
    public void testeVolumeParalelepipedo(String txtBase, String txtAltura, String txtComprimento, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da lista

        // Executa
        double resultadoAtual = Calculadora.volumeParalelepipedo(Integer.valueOf(txtBase),Integer.valueOf(txtAltura),Integer.valueOf(txtComprimento));

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), Double.valueOf(resultadoAtual));
        System.out.println("Teste Volume Paralelepipedo: "+txtBase +" * "+ txtAltura +" * "+ txtComprimento +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "2, 5, 5",
            "3, 8, 12",
            "10, 12, 60"
    }, delimiter = ',')
    public void testeAreaTriangulo(String txtBase, String txtAltura, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da lista

        // Executa
        double resultadoAtual = Calculadora.areaTriangulo(Integer.valueOf(txtBase),Integer.valueOf(txtAltura));

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), Double.valueOf(resultadoAtual));
        System.out.println("Teste Area do Triangulo: "+ txtBase +" * "+ txtAltura +" /2 "+ " = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "4, 6, 8, 64",
            "8, 12, 15, 480",
            "12, 15, 20, 1200",
            "3, 4, 5, 20",
            "5, 7, 9, 105"
    }, delimiter = ',')
    public void testeVolumePiramideTriangular(String txtBase, String txtAltura, String txtComprimento, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da lista

        // Executa
        double resultadoAtual = Calculadora.volumePiramideTriangular(Integer.valueOf(txtBase),Integer.valueOf(txtAltura),Integer.valueOf(txtComprimento));

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), Double.valueOf(resultadoAtual));
        System.out.println("Teste Volume Piramide Triangular: "+ txtBase +" * "+ txtAltura +" * "+ txtComprimento +" /3 " +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "4, 6, 32",
            "8, 12, 256",
            "12, 15, 720",
            "3, 4, 12",
            "5, 6, 50"
    }, delimiter = ',')
    public void testeVolumePiramideQuadrada(String txtBase, String txtComprimento, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da lista

        // Executa
        double resultadoAtual = Calculadora.volumePiramideQuadrada(Integer.valueOf(txtBase),Integer.valueOf(txtComprimento));

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), Double.valueOf(resultadoAtual));
        System.out.println("Teste Volume Piramide Quadrada: "+ txtBase +" * "+ txtBase +" * " + txtComprimento +" /3 " +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "4, 6, 8, 64",
            "8, 12, 15, 480",
            "12, 15, 20, 1200",
            "3, 4, 5, 20",
            "6, 8, 10, 160"
    }, delimiter = ',')
    public void testeVolumePiramideRetangular(String txtBase, String txtAltura, String txtComprimento, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da lista

        // Executa
        double resultadoAtual = Calculadora.volumePiramideRetangular(Integer.valueOf(txtBase),Integer.valueOf(txtAltura),Integer.valueOf(txtComprimento));

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), Double.valueOf(resultadoAtual));
        System.out.println("Teste Volume Piramide Retangular: "+ txtBase +" * "+ txtAltura +" * " + txtComprimento +" /3 " +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1,3.14",
            "2,12.56",
            "3,28.26",
            "4,50.24",
            "5,78.5"
    }, delimiter = ',')
    public void testeAreaCirculo(String txtRaio, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da lista

        // Executa
        double resultadoAtual = Calculadora.areaCirculo(Integer.valueOf(txtRaio));

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), Double.valueOf(resultadoAtual));
        System.out.println("Teste Area do Circulo: "+ txtRaio +" * "+ txtRaio +" * "+ "3,14" +" = "+ resultadoAtual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "2,6,75.36",
            "3,6,169.56",
            "4,7,351.68",
            "5,8,628",
            "6,9,1017.36"
    }, delimiter = ',')
    public void testeVolumeCilindro(String txtRaio, String txtAltura, String resultadoEsperado){
        // Configura
        // Os dados de entrada e o resultado esperado vem da lista

        // Executa
        double resultadoAtual = Calculadora.volumeCilindro(Integer.valueOf(txtRaio),Integer.valueOf(txtAltura));

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado), Double.valueOf(resultadoAtual));
        System.out.println("Teste Volume do Cilindro: "+ txtRaio +" * "+ txtRaio +" * "+ "3,14" +" * "+ txtAltura +" = "+ resultadoAtual);
    }
}
