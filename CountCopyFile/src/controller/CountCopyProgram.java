/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Admin
 */
import model.CountCopyManager;
import view.Menu;

/**
 *
 * @author Thao Chi
 */
public class CountCopyProgram extends Menu<String>{
    private CountCopyManager list= new CountCopyManager();
    public CountCopyProgram (String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                CountCopyManager.countWordsInFile();
                break;
            case 2:
                CountCopyManager.getFilesWithWordInDirectory();
                break;
            case 3:
                System.exit(0);        
        }
    }
}
