package com.btssio.models.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.btssio.models.DaoClass;
import com.btssio.models.dto.DTOEntreprise;

public class DAOEntreprise extends DaoClass<DTOEntreprise>{

	@Override
	public DTOEntreprise find(long id) {
		// TODO Auto-generated method stub
		DTOEntreprise entreprise = new DTOEntreprise();
		try {
            ResultSet result = this .connect
                                    .createStatement(
                                            	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                                ResultSet.CONCUR_UPDATABLE
                                             ).executeQuery(
                                                "SELECT * FROM lieu WHERE idstagiaire = " + id
                                             );
            if(result.first())
            		entreprise = new DTOEntreprise(
                                        id, 
                                        result.getString("nomlieu") 
                                    );
            
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		   return entreprise;
	}

	@Override
	public DTOEntreprise create(DTOEntreprise obj) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement prepare = this	.connect
                                                .prepareStatement(
                                                	"INSERT INTO lieu(nomlieu) VALUES(?)"
                                                );
			prepare.setString(2, obj.getNomlieu());
			
			prepare.executeUpdate();
			obj = this.find(obj.getId());
				
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	    return obj;
	}

	@Override
	public DTOEntreprise update(DTOEntreprise obj) {
		// TODO Auto-generated method stub
		try {
			
            this .connect	
                 .createStatement(
                	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                    ResultSet.CONCUR_UPDATABLE
                 ).executeUpdate(
                	"UPDATE stagiaire SET nomlieu = '" + obj.getNomlieu() +"'"+
                	" WHERE idstagiaire = " + obj.getId()
                 );
		
		obj = this.find(obj.getId());
    } catch (SQLException e) {
            e.printStackTrace();
    }
    
    return obj;
	}

	@Override
	public void delete(DTOEntreprise obj) {
		// TODO Auto-generated method stub
		try {
            this    .connect
                	.createStatement(
                         ResultSet.TYPE_SCROLL_INSENSITIVE, 
                         ResultSet.CONCUR_UPDATABLE
                    ).executeUpdate(
                         "DELETE FROM lieu WHERE idstagiaire = " + obj.getId()
                    );
		
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
		
	}
	
}
