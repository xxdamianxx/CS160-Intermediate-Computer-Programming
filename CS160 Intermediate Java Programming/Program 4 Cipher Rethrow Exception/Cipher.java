// package cipher;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.lang.String;

public class Cipher {

    public static final int NUM_LETTERS = 26;
    public static final int ENCODE = 1;
    public static final int DECODE = 2;

    public static void main(String[] args) throws FileNotFoundException {

        // letters
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        // Check args length, if error, print usage message and exit
        if (args.length != 3) {
            System.out.println("Usage: java Cipher messageFile secretword action");
            System.exit(1);
        }
        if (args.length == 3) {
            int test = Integer.parseInt(args[2]);
            if (test <= 0 || test > 2) {
                System.out.println("Option " + args[2] + " is not valid");
                System.exit(1);
            }
        }
        // Extract input args to variables

        String inputFilename = args[0];
        String key = args[1];
        int action = Integer.parseInt(args[2]);
        String outputFilename = getOutputFilename(inputFilename, action);
        Scanner input = openInput(inputFilename);
        PrintWriter output = openOutput(outputFilename);

        // Read in data and output to file
        String message = "";
        while (input.hasNextLine()) {
            message += input.nextLine();
        }
        // Convert all letters to lowercase for output
        String lowerCaseMessage = message.toLowerCase();
        int keyLength = key.length();
        String codedMessage = "";
        String decodedMessage = "";
        if (action == 1) {
            int j = 0;
            int distance = 0;
            int a = (int) ('a');
            char o;
            for (int i = 0; i < message.length(); ++i) {
                char c = lowerCaseMessage.charAt(i);
                char k = key.charAt(j);
                distance = (int) k - a;
                o = shiftUpByK(c, distance);
                codedMessage += o;
                j++;
                if (j == keyLength) {
                    j = 0;
                }
            }
            output.print(codedMessage);
        }

        if (action == 2) {
            int j = 0;
            int distance = 0;
            int a = (int) ('a');
            char o;
            for (int i = 0; i < message.length(); ++i) {
                char c = lowerCaseMessage.charAt(i);
                char k = key.charAt(j);
                distance = (int) k - a;
                o = shiftDownByK(c, distance);
                decodedMessage += o;
                j++;
                if (j == keyLength) {
                    j = 0;
                }
            }
            output.print(decodedMessage);
        }

        // Close streams
        input.close();
        output.close();

    }

    /**
     * Changes file extension to ".coded" or ".decoded"
     *
     * @param filename
     * @return String new filename or null if action is illegal
     */
    public static String getOutputFilename(String inputFilename, int action) {
        String filename = "";
        if (action == 1) {
            filename += inputFilename + ".coded";
        } else if (action == 2) {
            filename += inputFilename + ".decoded";
        }else{
			filename = null;
		}
        return filename;
    }

    /**
     * Open input for reading
     *
     * @param filename
     * @return Scanner
     * @throws FileNotFoundException
     */
    public static Scanner openInput(String filename) throws FileNotFoundException {
        File input = new File(filename);
        Scanner scan = new Scanner(input);
        return scan;
    }

    /**
     * Open output for writing
     *
     * @param filename
     * @return PrintWriter
     * @throws FileNotFoundException
     */
    public static PrintWriter openOutput(String filename) throws FileNotFoundException {
        PrintWriter output = new PrintWriter(filename);
        return output;
    }

    /**
     * Encode letter by some offset d
     *
     * @param c input character
     * @param offset amount to shift character value
     * @return char encoded character
     */
    public static char shiftUpByK(char c, int distance) {
        if ('a' <= c && c <= 'z') {
            return (char) ('a' + (c - 'a' + distance) % NUM_LETTERS);
        }
        if ('A' <= c && c <= 'Z') {
            return (char) ('A' + (c - 'A' + distance) % NUM_LETTERS);
        }
        return c; // don't encrypt if not an ic character
    }

    /**
     * Decode letter by some offset d
     *
     * @param c input character
     * @param offset amount to shift character value
     * @return char decoded character
     */
    public static char shiftDownByK(char c, int distance) {
        if ('a' <= c && c <= 'z') {
            return (char) ('a' + (c - 'a' + NUM_LETTERS - distance) % NUM_LETTERS);
        }
        if ('A' <= c && c <= 'Z') {
            return (char) ('A' + (c - 'A' + NUM_LETTERS - distance) % NUM_LETTERS);
        }
        return c; // don't encrypt if not an ic character
    }

    public String getInfo() {
        return "Program 3, Student's name here";
    }

}