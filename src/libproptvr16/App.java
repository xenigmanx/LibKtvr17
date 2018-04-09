/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libproptvr16;

import classes.AddBook;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class App {
    
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Наша библиотека----------");
        String repeat = "r";
        do{
        System.out.println("Выберите нужное действие:");
        System.out.println("0 - для выхода из программы");
        System.out.println("1 - для добавления книги");
        System.out.println("2 - для добавления читателя");
        System.out.println("3 - для выдачи книги пользовтелю");
        String action = scanner.next();
        
        switch (action) {
            case "0":
                repeat = "n";
                break;
            case "1":
                AddBook addBook = new AddBook();
                addBook.add();
                break;
            case "2":
//                AddReader addReader = new AddReader();
//                addReader.add();
                break; 
            case "3":
//                AddHistory addHistory = new AddHistory();
//                addHistory.add();
                break; 
            default:
                System.out.println("Выберите действие из списка!");
                System.out.println("----------------------------");
                repeat="r";
        }
        
        }while("r".equals(repeat));
    }
    
}
