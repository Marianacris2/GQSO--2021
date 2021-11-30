package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomaTeste{
    @Test
    public void testeSoma_sucess(){
        Soma soma = new Soma();
        assertEquals(2, soma.rotaSoma(2,4));
    }
 
}