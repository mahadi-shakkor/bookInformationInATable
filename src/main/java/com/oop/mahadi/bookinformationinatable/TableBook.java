package com.oop.mahadi.bookinformationinatable;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class TableBook {


    @javafx.fxml.FXML
    public void initialize() {


//        private String bookName,bookId,publisher,Author,authorPin;
//        private Integer page;

        author.setCellValueFactory (new PropertyValueFactory<BookInfo,String>("Author"));
        authorpin.setCellValueFactory (new PropertyValueFactory<BookInfo,String>("authorPin"));
        bookname.setCellValueFactory (new PropertyValueFactory<BookInfo,String>("bookName"));
        page.setCellValueFactory (new PropertyValueFactory<BookInfo,Integer>("page"));
        publisher.setCellValueFactory (new PropertyValueFactory<BookInfo,String>("publisher"));
        id.setCellValueFactory (new PropertyValueFactory<BookInfo,String>("bookId"));




    }

    @FXML
    private TableColumn<BookInfo, String> author;

    @FXML
    private TextField authorFxid;

    @FXML
    private TableColumn<BookInfo, String> authorpin;

    @FXML
    private TextField authorpinFxid;

    @FXML
    private TextField bookIdfxid;

    @FXML
    private TextField bookNameFxid;

    @FXML
    private TableColumn<BookInfo, String> bookname;

    @FXML
    private TableColumn<BookInfo, String> id;

    @FXML
    private TableColumn<BookInfo, Integer> page;

    @FXML
    private TextField pageFxid;

    @FXML
    private TableColumn<BookInfo, String> publisher;

    @FXML
    private TextField puibFxid;
    @FXML
    private TableView tableviewFxid;

    ArrayList<BookInfo> tabarr=new ArrayList<>();

    @FXML
    void addButtononclick(ActionEvent event) {


        tabarr.add(new BookInfo(bookNameFxid.getText(),bookIdfxid.getText(),
                puibFxid.getText(),authorFxid.getText(),authorpinFxid.getText(),Integer.parseInt(pageFxid.getText())



                ));

//        this.bookName = bookName;
//        this.bookId = bookId;
//        this.publisher = publisher;
//        Author = author;
//        this.authorPin = authorPin;
//        this.page = page;
//


    }

    @FXML
    void loadButtononclick(ActionEvent event) {
        for (BookInfo s : tabarr){
            tableviewFxid.getItems().add(s);

        }

    }





}
