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
public class Reclamation {
    private int idReclamation;
    private int idCategorieRec;
    private int idUserSRec;
    private int idUserRec;
    private String objet;
    private String textRec;
    private String statusRec;

    public Reclamation(int idReclamation, int idCategorieRec, int idUserSRec, int idUserRec, String objet, String textRec, String statusRec) {
        this.idReclamation = idReclamation;
        this.idCategorieRec = idCategorieRec;
        this.idUserSRec = idUserSRec;
        this.idUserRec = idUserRec;
        this.objet = objet;
        this.textRec = textRec;
        this.statusRec = statusRec;
        
    }

    public Reclamation(int i, int i0, int i1, String bbbbb, String zzzz, String aaaa) {
    }

    public Reclamation(int aInt, int aInt0, int aInt1, int aInt2, int aInt3, String string, String string0, String string1) {
    }

    public int getIdReclamation() {
        return idReclamation;
    }

    public void setIdReclamation(int idReclamation) {
        this.idReclamation = idReclamation;
    }

    public int getIdCategorieRec() {
        return idCategorieRec;
    }

    public void setIdCategorieRec(int idCategorieRec) {
        this.idCategorieRec = idCategorieRec;
    }

    public int getIdUserSRec() {
        return idUserSRec;
    }

    public void setIdUserSRec(int idUserSRec) {
        this.idUserSRec = idUserSRec;
    }

    public int getIdUserRec() {
        return idUserRec;
    }

    public void setIdUserRec(int idUserRec) {
        this.idUserRec = idUserRec;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getTextRec() {
        return textRec;
    }

    public void setTextRec(String textRec) {
        this.textRec = textRec;
    }

    public String getStatusRec() {
        return statusRec;
    }

    public void setStatusRec(String statusRec) {
        this.statusRec = statusRec;
    }

    @Override
    public String toString() {
        return "Reclamation{" + "idReclamation=" + idReclamation + ", idCategorieRec=" + idCategorieRec + ", idUserSRec=" + idUserSRec + ", idUserRec=" + idUserRec + ", objet=" + objet + ", textRec=" + textRec + ", statusRec=" + statusRec + '}';
    }
    
    
}
