package com.rgfp.scrumdeveloper.complexity;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ResolverTest {

    @Test
    public void shouldReturnNoLoToquesNoHayProblema(){
        Resolver resolver = new Resolver();
        String funciona = resolver.funciona(true, true, true, true, true);
        assertThat(funciona,is("No lo toques, No hay problema"));
    }

}