/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soblab
 */
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) throws FileNotFoundException {

        Utils ut = new Utils();
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello. Please Enter A Number");
        int number = sc.nextInt();
        System.out.println("The Sum Of This Number Is: " + ut.getCube(number));

        System.out.println("Prime Number Check. T for Prime F for Composite. " + Utils.getPrime(number));

        System.out.println("The From File M.TXT Value Of " + ut.getFile("C://here//new.txt"));

    }
}
