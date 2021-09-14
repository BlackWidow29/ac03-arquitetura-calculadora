package br.com.impacta.accalculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp(){
        calculadora = new Calculadora();
    }

    @Test
    void naoDeveriaCalcularComOperadorInvalido(){

    }
}