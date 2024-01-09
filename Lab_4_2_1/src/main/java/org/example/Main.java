package org.example;

import static org.example.Decoder.decodeMessage;

public class Main
{
    public static void main(String[] args)
    {
        String encryptedMessage1 = "t2st3ng";
        String encryptedMessage2 = "vetviph";

        String decodedMessage1 = decodeMessage(encryptedMessage1);
        String decodedMessage2 = decodeMessage(encryptedMessage2);

        System.out.println("Зашифроване повідомлення 1: " + encryptedMessage1);
        System.out.println("Декодоване повідомлення 1: " + decodedMessage1);

        System.out.println();

        System.out.println("Зашифроване повідомлення 2: " + encryptedMessage2);
        System.out.println("Декодоване повідомлення 2: " + decodedMessage2);
    }
}