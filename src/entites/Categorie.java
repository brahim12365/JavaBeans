/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author brahi
 */
public class Categorie {
    private int idCategorie;
    private String nomCategrie;

    public Categorie(int idCategorie, String nomCategrie) {
        this.idCategorie = idCategorie;
        this.nomCategrie = nomCategrie;
    }

    public Categorie(int aInt, int aInt0, String string) {
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNomCategrie() {
        return nomCategrie;
    }

    public void setNomCategrie(String nomCategrie) {
        this.nomCategrie = nomCategrie;
    }

    @Override
    public String toString() {
        return "Categorie{" + "idCategorie=" + idCategorie + ", nomCategrie=" + nomCategrie + '}';
    }
    
}
