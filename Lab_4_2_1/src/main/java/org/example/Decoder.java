package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decoder
{
    public static String decodeVowelSubstitution(String input)
    {
        return input.replaceAll("1", "a")
                .replaceAll("2", "e")
                .replaceAll("3", "i")
                .replaceAll("4", "o")
                .replaceAll("5", "u");
    }

    public static String decodeConsonantSubstitution(String input)
    {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray())
        {
            if (isConsonant(c))
            {
                result.append((char) (c - 1));
            }
            else
            {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static boolean isConsonant(char c)
    {
        return "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1;
    }

    static String decodeMessage(String input)
    {
        String[] words = input.split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : words)
        {
            if (isVowelSubstitution(word))
            {
                result.append(decodeVowelSubstitution(word)).append(" ");
            }
            else if (isConsonantSubstitution(word))
            {
                result.append(decodeConsonantSubstitution(word)).append(" ");
            }
            else
            {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }

    private static boolean isVowelSubstitution(String word)
    {
        Pattern pattern = Pattern.compile("[12345]+");

        Matcher matcher = pattern.matcher(word);

        return matcher.find();
    }

    private static boolean isConsonantSubstitution(String word)
    {
        Pattern pattern = Pattern.compile("[bcdfghjklmnpqrstvwxyz]+");

        Matcher matcher = pattern.matcher(word);

        return matcher.matches();
    }
}

