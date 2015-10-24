package codeeval_Decryption;
/*
 * Copyright (C) 2015 hankoor
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * Challenge Description:
 * For this challenge you are given an encrypted message and a key.
 * You have to determine the encryption and encoding technique and then print out
 * the corresponding plaintext message. You can assume that the plaintext
 * corresponding to this message, and all messages you must handle,
 * will be comprised of only the characters A-Z and spaces; no digits
 * or punctuation. 
 * 
 * There is no input for this program. The encrypted message and key is: 
 * message: "012222 1114142503 0313012513 03141418192102 0113
 * 2419182119021713 06131715070119"
 * keyed_alphabet: "BHISOECRTMGWYVALUZDNFJKPQX"
 * 
 * Output sample:
 * Print out the plaintext message. (in CAPS)
 **/

public class Main {

    public static void main(String[] args) {
        String key = "BHISOECRTMGWYVALUZDNFJKPQX";
        String message = "012222 1114142503 0313012513 03141418192102 0113 2419182119021713 06131715070119";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i < message.length();){
            if(message.charAt(i) == ' '){
                System.out.print(" ");
                i++;
            }else{
                int twoDigitVal = Integer.parseInt(message.substring(i, i+2));
                char c1 = alphabet.charAt(twoDigitVal);
                char c2 = alphabet.charAt(key.indexOf((char)c1));
                System.out.print(c2);
                i+=2;
            }
        }
    }
}