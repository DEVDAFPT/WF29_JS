/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit04_HW;

/**
 *
 * @author Admin
 */
public class HW_4_5 {

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7; j++) {
                if ((j == 1) || (j == 7) || (i == 1) || (i == 6)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }
}
