package jantalk.kata;

import java.util.Map;

/**
 * DictionaryReplacer
 * This kata is about making a simple string replacer
 * Task details: http://codingdojo.org/kata/DictionaryReplacer/
 */
public class KataDictionaryReplacer {

    // default delimiter (dictionary pre and suffixed with a dollar sign)
    private String delimiter = "\\$";

    /**
     * Class constructor
     */
    public KataDictionaryReplacer(){
    }

    /**
     * Class constructor with given delimiter value
     * @param delimiter
     */
    public KataDictionaryReplacer(String delimiter){
        this.delimiter = delimiter;
    }

    /**
     * A method that takes a string and a dictionary, and replaces every key
     * in the dictionary pre and suffixed with a dollar sign, with the corresponding
     * value from the Dictionary.
     * @param input
     * @param dict
     * @return output - corresponding value from the Dictionary
     */
    public String replace(String input, Map<String, String> dict) {
        String output = input;
        for (Map.Entry<String, String> entry : dict.entrySet()) {
            output = output.replaceAll(delimiter+entry.getKey()+delimiter, entry.getValue());
        }
        return output;
    }

}
