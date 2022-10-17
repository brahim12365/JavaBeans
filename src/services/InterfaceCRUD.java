/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entites.Categorie;
import entites.Reclamation;
import java.util.List;

/**
 *
 * @author brahi
 */
public interface InterfaceCRUD {
      public void ajouterReclamation (Reclamation R) ;
    public void modifierReclamation(Reclamation R) ;
    public void supprimerReclamation(int idReclamation) ;
    public List<Reclamation> Afficher() ; 
     public void ajouterCategorie(Categorie C) ;
    public void modifierCategorie(Categorie C) ;
    public void supprimerCategorie(int C) ;
    public List<Categorie> AfficherCat() ;
    
    
}
