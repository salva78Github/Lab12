package it.polito.tdp.rivers.model;

import java.time.LocalDate;

public class River {

	private final int id;
	private final String name;
	private final LocalDate firstMeasure;
	private final LocalDate lastMeasure;
	private final int numberOfMeasures;
	private final float averageFlow;

	/**
	 * @param id
	 * @param name
	 * @param firstMeasure
	 * @param lastMeasure
	 * @param numberOfMeasures
	 * @param averageFlow
	 */
	public River(int id, String name, LocalDate firstMeasure, LocalDate lastMeasure, int numberOfMeasures,
			float averageFlow) {
		this.id = id;
		this.name = name;
		this.firstMeasure = firstMeasure;
		this.lastMeasure = lastMeasure;
		this.numberOfMeasures = numberOfMeasures;
		this.averageFlow = averageFlow;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the firstMeasure
	 */
	public LocalDate getFirstMeasure() {
		return firstMeasure;
	}

	/**
	 * @return the lastMeasure
	 */
	public LocalDate getLastMeasure() {
		return lastMeasure;
	}

	/**
	 * @return the numberOfMeasures
	 */
	public int getNumberOfMeasures() {
		return numberOfMeasures;
	}

	/**
	 * @return the averageFlow
	 */
	public float getAverageFlow() {
		return averageFlow;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		River other = (River) obj;
		if (id != other.id)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.name;
	}

}
