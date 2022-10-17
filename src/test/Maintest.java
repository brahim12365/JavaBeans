/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entites.Categorie;
import entites.Reclamation;
import java.util.List;
import services.CRUD;
import utils.MyDB;

/**
 *
 * @author brahi
 */
public class Maintest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyDB c=MyDB.getInstance();
        CRUD aa= new CRUD();
      aa.Afficher();
        
    }
    
}
