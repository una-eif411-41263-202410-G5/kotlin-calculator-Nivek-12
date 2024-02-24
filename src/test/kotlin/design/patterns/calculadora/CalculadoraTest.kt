package design.patterns.calculadora

import design.patterns.design.patterns.calculadora.Calculadora
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculadoraTest {

    private val calculadora = Calculadora()
    @Test
    fun `test suma`() {
        val result = calculadora.suma(10,15)
        assertEquals(25,result)
    }

    @Test
    fun `test resta`() {
        val result = calculadora.resta(15,10)
        assertEquals(5,result)
    }

    @Test
    fun `test multiplicacion`() {
        val result = calculadora.multiplicacion(5,2)
        assertEquals(10,result)
    }

    @Test
    fun `test division`() {
        val result = calculadora.division(10,2)
        assertEquals(5,result)
    }
}