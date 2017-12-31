package it.polito.tdp.rivers.model;

import java.util.List;

import it.polito.tdp.rivers.dao.RiversDAO;
import it.polito.tdp.rivers.exception.RiversException;

public class Model {
	private final static RiversDAO rdao = new RiversDAO();
	private List<River> riversList;


	public List<River> getAllRivers() throws RiversException {
		if (this.riversList == null) {
			this.riversList = rdao.getAllRivers();
		}
		return this.riversList;
	}
}
