package it.polito.tdp.borders.model;



import java.util.*;
import org.jgrapht.UndirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import it.polito.tdp.borders.db.BordersDAO;

public class Model {
BordersDAO dao;
UndirectedGraph<Country, DefaultEdge> grafo = new SimpleGraph<Country, DefaultEdge>(DefaultEdge.class);

	public Model() {
	dao=new BordersDAO();
	}

	
	
	
	public List<Country> createGraphs(int year) {
		
	    
	    	for(Border b:dao.getCountryPairs(year)){
	    		Country c1= new Country(b.getCod1());
	    		Country c2=new Country(b.getCod2());
	    		grafo.addVertex(c1);
	    		grafo.addVertex(c2);
	    		grafo.addEdge(c1, c2);
	        }
	    
		return new ArrayList<Country>(grafo.vertexSet());
	}






	public List<Country> getStati() {
		return dao.loadAllCountries();
	}

   public int numeroConfini(Country c){
      return grafo.degreeOf(c);
   }


	
}
