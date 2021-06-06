package ictcg.com.model;

import org.springframework.data.annotation.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

  @Getter @Setter @EqualsAndHashCode
public class Societes {
	
	@Id
	private String  idSociete ;
	private String  nameSociete ;
	private double  marketValueBeurs ;
	private String chimieBohr4version ;
	private String chimieNiels23version ;
	
	
	
	
	public Societes(String nameSociete, double marketValueBeurs) {
		super();
		this.nameSociete = nameSociete;
		this.marketValueBeurs = marketValueBeurs;
	}
	
	@Override
	public String toString() {
		return "Societes [name=" + nameSociete + ",Value Beurs=" + marketValueBeurs + "]";
	}
	
	
	

	

}
