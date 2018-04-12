/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libproptvr16;


import classes.AddBook;
import classes.AddHistory;
import classes.AddReader;
import entity.Book;
import entity.History;
import entity.Reader;
import interfaces.Insertable;

/**
 *
 * @author Melnikov
 */
public class ConsoleInsert implements Insertable{

    @Override
    public Book addBook() {
        AddBook addBook = new AddBook();
        return addBook.add();
    }

    @Override
    public Reader addReader() {
        AddReader addReader = new AddReader();
        return addReader.add();
    }

    @Override
    public History addHistory() {
        AddHistory addHistory = new AddHistory();
        return addHistory.add(books, readers);
    }

    
    
}
