/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos
 */
public class Teste {

    public Teste() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inicializa");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finaliza classe");
    }

    @Before
    public void setUp() {
        System.out.println("Instancia a classe");
        Calculadora c = new Calculadora();
    }

    @After
    public void tearDown() {
        System.out.println("Finalizador");
    }

    @Test
    public void DeveriaSomarDoisValores() {
        int a = 1;
        int b = 2;
        Calculadora c = new Calculadora();
        int soma = c.Soma(a, b);
        assertEquals(3, soma);
    }

    @Test
    public void DeveriaSubtrairDoisValores() {
        int a = 10;
        int b = 2;
        Calculadora c = new Calculadora();
        int subtrai = c.Subtrai(a, b);
        assertEquals(8, subtrai);
    }

    @Test
    public void DeveriaMultiplicarDoisValores() {
        int a = 10;
        int b = 2;
        Calculadora c = new Calculadora();
        int multiplica = c.Multiplica(a, b);
        assertEquals(20, multiplica);
    }

    @Test
    public void DeveriaDividirDoisValores() {
        int a = 10;
        int b = 2;
        Calculadora c = new Calculadora();
        int divide = c.Divide(a, b);
        assertEquals(5, divide);
    }
}