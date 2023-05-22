package fr.wildcodeschool.unittesting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testVowelsOnly() {
        // Cas de test : la méthode renvoie correctement la chaîne de voyelles pour une entrée qui ne contient que des voyelles
    
        String result = StringUtils.vowels("aeiouy");
        Assert.assertEquals("aeiouy", result);
    }

    @Test
    public void testVowels() {
        // Cas non passant : la méthode ne renvoie pas les voyelles correctement

        String result = StringUtils.vowels("Hello World");
        Assert.assertEquals("eo", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVowelsException() {
        // Cas d'exception : la méthode devrait lever une exception lorsque le paramètre
        // n'est pas défini

        StringUtils.vowels(null);
    }



    @Test
    public void testNoVowels() {
        // Cas de test : la méthode renvoie une chaîne vide lorsque la chaîne ne contient aucune voyelle
    
        String result = StringUtils.vowels("BCDFGHJKLMNPQRSTVWXZ123456789");
        Assert.assertEquals("", result);
    }
}
