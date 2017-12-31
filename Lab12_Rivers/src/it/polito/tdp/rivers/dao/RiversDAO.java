package it.polito.tdp.rivers.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.rivers.exception.RiversException;
import it.polito.tdp.rivers.model.River;

public class RiversDAO {

	public List<River> getAllRivers() throws RiversException{
		List<River> riversList = new ArrayList<River>();
		
		Connection c = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String query = "select r.id as id, r.name as name, min(day) as firstMeasure, max(day) as lastMeasure, count(*) as numberOfMeasures, avg(flow) as averageFlow from flow f, river r where f.river = r.id group by river";
		
		try{
			c = DBConnect.getInstance().getConnection();
			ps = c.prepareStatement(query);
			
			rs = ps.executeQuery();
			
			while (rs.next()){
				River r = new River(rs.getInt("id"), rs.getString("name"), rs.getDate("firstMeasure").toLocalDate(), 
						rs.getDate("lastMeasure").toLocalDate(),rs.getInt("numberOfMeasures"), rs.getFloat("averageFlow"));
				System.out.println(r);
				riversList.add(r);			}
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			throw new RiversException("Errore DB.", sqle);
		}finally {
			DBConnect.getInstance().closeResources(c, ps, rs);
		}
		
		
		
		return riversList;
		
		
	}
	
}
