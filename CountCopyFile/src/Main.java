/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import controller.CountCopyProgram;
import view.Menu;

public class Main {
    public static void main(String[] args) {
        String title = "FILE MANAGERMENT";
        String[] s = new String[]{"Count Word in File ", "Find File by word", "Exit"};
        Menu<String> menu = new CountCopyProgram(title, s);
        menu.run();
        // 1:D:\PRO192\CountCopyFile\text.txt
    }
}
