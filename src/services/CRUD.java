/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entites.Categorie;
import entites.Reclamation;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utils.MyDB;

/**
 *
 * @author brahi
 */
public class CRUD implements InterfaceCRUD {
    Connection conx = MyDB.getInstance().getConnection();

    @Override
    public void ajouterReclamation(Reclamation R) {
        String req = "INSERT INTO `reclamation`( `idCategorieRec`,`idUserSRec`,`idUserRec`,`objet`,`textRec`,`statusRec`) VALUES (" +R.getIdCategorieRec()+ "," +R.getIdUserSRec()+ "," +R.getIdUserRec()+ ",'" +R.getObjet()+ "','" +R.getTextRec()+ "','" +R.getStatusRec()+ "')" ;
        Statement st  ;
        try {
        st = conx.createStatement() ;
        st.executeUpdate(req) ;}
        catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
    }

   

    @Override
    public void modifierReclamation(Reclamation R) {
        String req = "UPDATE `reclamation` SET `idCategorieRec`="+R.getIdCategorieRec()+",`IdUserSRec`="+R.getIdUserSRec()+",`idUSerRec`="+R.getIdUserRec()+",`objet`='"+R.getObjet()+"',`textRec`='"+R.getTextRec()+"',`statusRec`='"+R.getStatusRec()+"' WHERE idReclamation="+R.getIdReclamation();
        Statement st;
        try {
        st = conx.createStatement() ;
        st.executeUpdate(req) ;
        System.out.println("reclamation est ajouté");}
        catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    /**
     *
     * @param idReclamation
     */
    @Override
    public void supprimerReclamation(int idReclamation) {
            try {
        String req=" DELETE FROM `reclamation` WHERE idReclamation="+ idReclamation ;

        Statement st ;
        st= conx.prepareStatement(req);
        st.executeUpdate(req);
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
        }

    @Override
    public List<Reclamation> Afficher() {
   List <Reclamation> list = new ArrayList<>();
        try {
    String req = "SELECT * FROM  `reclamation`";        
    Statement st;
    st =conx.createStatement();
    ResultSet rs = st.executeQuery(req);
    while(rs.next()){
    Reclamation R = new Reclamation(rs.getInt(1), rs.getInt("idReclamation"),rs.getInt("idCategorieRec"),rs.getInt("idUserSRec"),rs.getInt("idUserRec"),rs.getString("objet"),rs.getString("TextRec"),rs.getString("StatusRec"));
    list.add(R);
              }
        }
        catch (SQLException ex){
    System.err.println(ex.getMessage());
}
    return list; 
 }

    @Override
    public void ajouterCategorie(Categorie C) {
 String req = "INSERT INTO `categorie`( `idCategorie`,`nomCategrie`) VALUES (" +C.getIdCategorie()+ ",'" +C.getNomCategrie()+"')" ;
        Statement st;
        try {
        st = conx.createStatement() ;
        st.executeUpdate(req) ;}
        catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }    }

    @Override
    public void modifierCategorie(Categorie C) {
 String req = "UPDATE `categorie` SET `nomcategrie`='"+C.getNomCategrie()+"' WHERE idCategorie="+C.getIdCategorie();
        Statement st;
        try {
        st = conx.createStatement() ;
        st.executeUpdate(req) ;
        System.out.println("reclamation est ajouté");}
        catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }    }

    @Override
    public void supprimerCategorie(int idCategorie) {
        try {
        String req=" DELETE FROM `categorie` WHERE idCategorie="+ idCategorie ;

        Statement st ;
        st= conx.prepareStatement(req);
        st.executeUpdate(req);
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }    }

    @Override
    public List<Categorie> AfficherCat() {
 List <Categorie> list = new ArrayList<>();
        try {
    String req = "SELECT * FROM  categorie";        
    Statement st;
    st =conx.createStatement();
    ResultSet rs = st.executeQuery(req);
    while(rs.next()){
      Categorie C = new Categorie(rs.getInt(1), rs.getInt("idCategorie"),rs.getString("nomCategrie"));

    list.add(C);
              }
        }
        catch (SQLException ex){
    System.err.println(ex.getMessage());
}
    return list;     }
 }

   