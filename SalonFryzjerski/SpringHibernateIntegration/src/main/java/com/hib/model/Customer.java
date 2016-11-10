package com.hib.model;



import javafx.scene.chart.PieChart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 *
 */
@Entity
@Table(name="customer")
public class Customer {
 
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
     
    private String firstName;
    private String lastName;
	private String date;
	private String time;
    private int totalAmount;
 
  	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public float getAmount() {
		return totalAmount;
	}
	public void setAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}


	@Override
    public String toString(){
        return "id= "+id+", Name="+firstName+" "+lastName+ " " + date +", Amount="+totalAmount;
    }
}