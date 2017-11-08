package jantalk.kata;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Class for testing KataDictionaryReplacer Class
 *
 * Testcase 1:
 * input : “”, dict empty,
 * output:“”
 *
 * Testcase 2:
 * input : “\$temp\$“, dict [“temp”, “temporary”],
 * output: “temporary” *
 *
 * Testcase 3:
 * input : “\$temp\$ here comes the name \$name\$“, dict [“temp”, “temporary”] [“name”, “John Doe”],
 * output : “temporary here comes the name John Doe”
 */
public class KataDictionaryReplacerTest {

    //Testcase default values
    private KataDictionaryReplacer kata;
    private static final String str1 = "";
    private static final String str2 = "temporary";
    private static final String str3 = "temporary here comes the name John Doe";
    private static final Map<String, String> map1;
    static
    {
        map1 = new HashMap<String, String>();
        map1.put("", "");
    }
    private static final Map<String, String> map2;
    static
    {
        map2 = new HashMap<String, String>();
        map2.put("temp", "temporary");
    }
    private static final Map<String, String> map3;
    static
    {
        map3 = new HashMap<String, String>();
        map3.put("temp", "temporary");
        map3.put("name", "John Doe");
    }

    @Test
    public void testcase1() throws Exception {
        assertEquals(str1, kata.replace("", map1));
    }

    @Test
    public void testcase2() throws Exception {
        assertEquals(str2, kata.replace("$temp$", map2));
    }

    @Test
    public void testcase3() throws Exception {
        assertEquals(str3, kata.replace("$temp$ here comes the name $name$", map3));
    }

    @org.junit.Before
    public void setUp() throws Exception {
        //this.kata = new KataDictionaryReplacer("\\$");
        this.kata = new KataDictionaryReplacer();
    }

}