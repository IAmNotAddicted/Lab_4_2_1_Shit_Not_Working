Description:
In a distant galaxy, there are messages encrypted in peculiar patterns that require decoding. Your task is to write a Java program that decrypts these messages.

The encrypted message consists of words separated by delimiters, and each word may be encoded using different methods. Your program should identify the encoding method and decode accordingly.

Encoding Methods:
Vowel substitution encoding: all vowels (a, e, i, o, u) are replaced with numbers: a=1, e=2, i=3, o=4, u=5. For example, "t2st3ng" should be decoded as "testing".
Consonant substitution encoding: all consonants are replaced with the next consonant in sequence. For example, "vetviph" should be decoded as "testing".
Requirements:
Create a Java class named Decoder with static methods for each encoding type.
Use regular expressions to determine which encoding method was applied to each word.
Utilize StringBuilder for efficient string manipulations.
Implement a main function to demonstrate your decoder with examples of encrypted messages.
Note:
This solution assumes that encoding methods do not overlap. In the real world, additional methods might be needed for more accurate encoding type determination.
