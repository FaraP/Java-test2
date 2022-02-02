/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.Papousek;
import java.util.Scanner;
/**
 *
 * @author pfa
 */
public class Papousek {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Jsem virtuální papušek Lóra a rád opakuji slova");
        System.out.println("Napiš něco:");
        String vstup;
        vstup = sc.nextLine();
        String vystup;
        vystup = vstup + "," + vstup + "!";
        System.out.println(vystup);
        
        
    }
}
