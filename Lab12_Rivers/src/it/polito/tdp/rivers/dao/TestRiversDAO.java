package it.polito.tdp.rivers.dao;

import it.polito.tdp.rivers.exception.RiversException;

public class TestRiversDAO {

	public static void main(String[] args) {
		RiversDAO rsai = new RiversDAO();
		try{
			rsai.getAllRivers();
		}catch(RiversException re){
			System.out.println("Errore: " + re.getMessage());
		}
	}

}
