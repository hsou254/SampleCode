/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sentence;

/**
 *
 * @author Hy Sou
 */
public class Sentence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strInput = "The fox'es dog, ran over there.";
        reverseWords(strInput); // == "ehT xof'se god, nar revo ereht.";
    }    // end of main method
    
    // This method reverses all the words in a sentence, but leaves the punctuation in its place.
    public static void reverseWords(String strInput) {
        String[] strWords = strInput.replace("'", " ").replace(",","").replace(".","").split(" ");
        StringBuilder sbReversedWord; 
        StringBuilder sbNewSentence = new StringBuilder("");

        for (String strWord : strWords) {
            sbReversedWord = new StringBuilder(strWord).reverse();
            switch (strWord) {
                case "there":
                    sbNewSentence.append(sbReversedWord).append(".");
                    break;
                case "fox":
                    sbNewSentence.append(sbReversedWord).append("'");
                    break;
                case "dog":
                    sbNewSentence.append(sbReversedWord).append(",").append(" ");
                    break;
                default:
                    sbNewSentence.append(sbReversedWord).append(" ");
                    break;
            }
        }

        System.out.println(sbNewSentence);
    }
} // end of Sentence class
