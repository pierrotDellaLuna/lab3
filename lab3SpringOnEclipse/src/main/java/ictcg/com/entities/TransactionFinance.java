package ictcg.com.entities;

import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

//TODO why do you have lombok annotations and also getters and setters also why you need constructor, why you didnt use with the same lombok library?
@Getter
@Setter
@EqualsAndHashCode
public class TransactionFinance {

	@Id
	@JsonIgnore
	private String idTransaction;
	@JsonFormat(pattern = "HH:mm")
	@Getter
	@Setter
	private LocalTime time;
	@JsonIgnore
	//TODO here again 3rd time you have set getters and setters its redundant, read a little bit more about Project Lombok
	@Getter
	@Setter
	private double price;
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Getter
	@Setter
	private Date date;
	@JsonIgnore
	private Societes societe;

	public TransactionFinance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(String idTransaction) {
		this.idTransaction = idTransaction;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Societes getSociete() {
		return societe;
	}

	public void setSociete(Societes societe) {
		this.societe = societe;
	}

}
