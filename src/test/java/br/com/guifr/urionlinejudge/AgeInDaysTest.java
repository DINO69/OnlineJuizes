package br.com.guifr.urionlinejudge;

import br.com.guifr.urionlinejudge.ageindays.Client;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AgeInDaysTest {

    private Client.AgeInDays ageInDays;

    @Before
    public void seUp(){
        ageInDays = new Client.AgeInDays(365, "ano", "(s)",
                        new Client.AgeInDays(30, "mes", "(es)",
                                new Client.AgeInDays(1,"dia","(s)",null)));
    }

    @Test
    public void deveRetornar1AnoE1mesE5diaQuandoInputFor400(){

        int input = 400;
        String expected = "1 ano(s)\n1 mes(es)\n5 dia(s)";

        String actual = ageInDays.execute(input);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void deveRetornar2AnoE2mesE10diaQuandoInputFor800(){

        int input = 800;
        String expected = "2 ano(s)\n2 mes(es)\n10 dia(s)";

        String actual = ageInDays.execute(input);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void deveRetornar0AnoE1mesE0diaQuandoInputFor30(){

        int input = 30;
        String expected = "0 ano(s)\n1 mes(es)\n0 dia(s)";

        String actual = ageInDays.execute(input);

        Assert.assertEquals(expected,actual);

    }

}