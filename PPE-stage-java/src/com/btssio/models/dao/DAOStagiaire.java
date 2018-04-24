package com.btssio.models.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.btssio.models.DaoClass;
import com.btssio.models.dto.DTOStagiaire;
//Inserer fichier acces bd

public class DAOStagiaire extends DaoClass<DTOStagiaire>{

	@Override
	public DTOStagiaire find(long id) {
		// TODO Auto-generated method stub
		DTOStagiaire stagiaire = new DTOStagiaire();
		try {
            ResultSet result = this .connect
                                    .createStatement(
                                            	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                                ResultSet.CONCUR_UPDATABLE
                                             ).executeQuery(
                                                "SELECT * FROM stagiaire WHERE idstagiaire = " + id
                                             );
//            if(result.first())
//            		stagiaire = new DTOStagiaire(
//                                        id, 
//                                        result.getString("lan_nom") 
//                                    );
            
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		   return stagiaire;
	}

	@Override
	public DTOStagiaire create(DTOStagiaire obj) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement prepare = this	.connect
                                                .prepareStatement(
                                                	"INSERT INTO stagiaire(nomstagiaire,prenomstagiaire) VALUES(?, ?)"
                                                );
			prepare.setString(1, obj.getNom());
			prepare.setString(2, obj.getPrenom());
			
			prepare.executeUpdate();
			obj = this.find(obj.getId());
				
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	    return obj;
	}

	@Override
	public DTOStagiaire update(DTOStagiaire obj) {
		// TODO Auto-generated method stub
		try {
			
            this .connect	
                 .createStatement(
                	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                    ResultSet.CONCUR_UPDATABLE
                 ).executeUpdate(
                	"UPDATE stagiaire SET nomstagiaire = '" + obj.getNom() + 
                					"', prenomstagiaire = '"+ obj.getPrenom() +"'"+
                	" WHERE idstagiaire = " + obj.getId()
                 );
		
		obj = this.find(obj.getId());
    } catch (SQLException e) {
            e.printStackTrace();
    }
    
    return obj;
	}

	@Override
	public void delete(DTOStagiaire obj) {
		// TODO Auto-generated method stub
		try {
            this    .connect
                	.createStatement(
                         ResultSet.TYPE_SCROLL_INSENSITIVE, 
                         ResultSet.CONCUR_UPDATABLE
                    ).executeUpdate(
                         "DELETE FROM Stagiaire WHERE idstagiaire = " + obj.getId()
                    );
		
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
		
	}
	
}
