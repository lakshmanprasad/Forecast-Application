package com.lakshman.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CALENDAR")
public class Calendar {

	@Id
	@Column(name = "year")
	private int year;

	@Column(name = "q1_oct_start_date")
	private String q1OctStartDate;

	@Column(name = "q1_oct_end_date")
	private String q1OctEndDate;

	@Column(name = "q1_oct_no_of_hours")
	private int q1OctNoOfHours;

	@Column(name = "q1_nov_start_date")
	private String q1NovStartDate;

	@Column(name = "q1_nov_end_date")
	private String q1NovEndDate;

	@Column(name = "q1_nov_no_of_hours")
	private int q1NovNoOfHours;

	@Column(name = "q1_dec_start_date")
	private String q1DecStartDate;

	@Column(name = "q1_dec_end_date")
	private String q1DecEndDate;

	@Column(name = "q1_dec_no_of_hours")
	private int q1DecNoOfHours;
	
	
	
	@Column(name = "q2_jan_start_date")
	private String q2JanStartDate;

	@Column(name = "q2_jan_end_date")
	private String q2JanEndDate;

	@Column(name = "q2_jan_no_of_hours")
	private int q2JanNoOfHours;
	
	
	@Column(name = "q2_feb_start_date")
	private String q2FebStartDate;

	@Column(name = "q2_feb_end_date")
	private String q2FebEndDate;

	@Column(name = "q2_feb_no_of_hours")
	private int q2FebNoOfHours;

	
	@Column(name = "q2_mar_start_date")
	private String q2MarStartDate;

	@Column(name = "q2_mar_end_date")
	private String q2MarEndDate;

	@Column(name = "q2_mar_no_of_hours")
	private int q2MarNoOfHours;
	
	// Q3
	
	@Column(name = "q3_apr_start_date")
	private String q3AprStartDate;

	@Column(name = "q3_apr_end_date")
	private String q3AprEndDate;

	@Column(name = "q3_apr_no_of_hours")
	private int q3AprNoOfHours;
	
	
	@Column(name = "q3_may_start_date")
	private String q3MayStartDate;

	@Column(name = "q3_may_end_date")
	private String q3MayEndDate;

	@Column(name = "q3_may_no_of_hours")
	private int q3MayNoOfHours;

	
	@Column(name = "q3_june_start_date")
	private String q3JuneStartDate;

	@Column(name = "q3_june_end_date")
	private String q3JuneEndDate;

	@Column(name = "q3_june_no_of_hours")
	private int q3JuneNoOfHours;
	
	// Q4
	
	@Column(name = "q4_july_start_date")
	private String q4JulyStartDate;

	@Column(name = "q4_july_end_date")
	private String q4JulyEndDate;

	@Column(name = "q4_july_no_of_hours")
	private int q4JulyNoOfHours;
	
	
	@Column(name = "q4_aug_start_date")
	private String q4AugStartDate;

	@Column(name = "q4_aug_end_date")
	private String q4AugEndDate;

	@Column(name = "q4_aug_no_of_hours")
	private int q4AugNoOfHours;

	
	@Column(name = "q4_sep_start_date")
	private String q4SepStartDate;

	@Column(name = "q4_sep_end_date")
	private String q4SepEndDate;

	@Column(name = "q4_sep_no_of_hours")
	private int q4SepNoOfHours;
	
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getQ1OctStartDate() {
		return q1OctStartDate;
	}

	public void setQ1OctStartDate(String q1OctStartDate) {
		this.q1OctStartDate = q1OctStartDate;
	}

	public String getQ1OctEndDate() {
		return q1OctEndDate;
	}

	public void setQ1OctEndDate(String q1OctEndDate) {
		this.q1OctEndDate = q1OctEndDate;
	}

	public int getQ1OctNoOfHours() {
		return q1OctNoOfHours;
	}

	public void setQ1OctNoOfHours(int q1OctNoOfHours) {
		this.q1OctNoOfHours = q1OctNoOfHours;
	}

	public String getQ1NovStartDate() {
		return q1NovStartDate;
	}

	public void setQ1NovStartDate(String q1NovStartDate) {
		this.q1NovStartDate = q1NovStartDate;
	}

	public String getQ1NovEndDate() {
		return q1NovEndDate;
	}

	public void setQ1NovEndDate(String q1NovEndDate) {
		this.q1NovEndDate = q1NovEndDate;
	}

	public int getQ1NovNoOfHours() {
		return q1NovNoOfHours;
	}

	public void setQ1NovNoOfHours(int q1NovNoOfHours) {
		this.q1NovNoOfHours = q1NovNoOfHours;
	}

	public String getQ1DecStartDate() {
		return q1DecStartDate;
	}

	public void setQ1DecStartDate(String q1DecStartDate) {
		this.q1DecStartDate = q1DecStartDate;
	}

	public String getQ1DecEndDate() {
		return q1DecEndDate;
	}

	public void setQ1DecEndDate(String q1DecEndDate) {
		this.q1DecEndDate = q1DecEndDate;
	}

	public int getQ1DecNoOfHours() {
		return q1DecNoOfHours;
	}

	public void setQ1DecNoOfHours(int q1DecNoOfHours) {
		this.q1DecNoOfHours = q1DecNoOfHours;
	}

	public String getQ2JanStartDate() {
		return q2JanStartDate;
	}

	public void setQ2JanStartDate(String q2JanStartDate) {
		this.q2JanStartDate = q2JanStartDate;
	}

	public String getQ2JanEndDate() {
		return q2JanEndDate;
	}

	public void setQ2JanEndDate(String q2JanEndDate) {
		this.q2JanEndDate = q2JanEndDate;
	}

	public int getQ2JanNoOfHours() {
		return q2JanNoOfHours;
	}

	public void setQ2JanNoOfHours(int q2JanNoOfHours) {
		this.q2JanNoOfHours = q2JanNoOfHours;
	}

	public String getQ2FebStartDate() {
		return q2FebStartDate;
	}

	public void setQ2FebStartDate(String q2FebStartDate) {
		this.q2FebStartDate = q2FebStartDate;
	}

	public String getQ2FebEndDate() {
		return q2FebEndDate;
	}

	public void setQ2FebEndDate(String q2FebEndDate) {
		this.q2FebEndDate = q2FebEndDate;
	}

	public int getQ2FebNoOfHours() {
		return q2FebNoOfHours;
	}

	public void setQ2FebNoOfHours(int q2FebNoOfHours) {
		this.q2FebNoOfHours = q2FebNoOfHours;
	}

	public String getQ2MarStartDate() {
		return q2MarStartDate;
	}

	public void setQ2MarStartDate(String q2MarStartDate) {
		this.q2MarStartDate = q2MarStartDate;
	}

	public String getQ2MarEndDate() {
		return q2MarEndDate;
	}

	public void setQ2MarEndDate(String q2MarEndDate) {
		this.q2MarEndDate = q2MarEndDate;
	}

	public int getQ2MarNoOfHours() {
		return q2MarNoOfHours;
	}

	public void setQ2MarNoOfHours(int q2MarNoOfHours) {
		this.q2MarNoOfHours = q2MarNoOfHours;
	}

	public String getQ3AprStartDate() {
		return q3AprStartDate;
	}

	public void setQ3AprStartDate(String q3AprStartDate) {
		this.q3AprStartDate = q3AprStartDate;
	}

	public String getQ3AprEndDate() {
		return q3AprEndDate;
	}

	public void setQ3AprEndDate(String q3AprEndDate) {
		this.q3AprEndDate = q3AprEndDate;
	}

	public int getQ3AprNoOfHours() {
		return q3AprNoOfHours;
	}

	public void setQ3AprNoOfHours(int q3AprNoOfHours) {
		this.q3AprNoOfHours = q3AprNoOfHours;
	}

	public String getQ3MayStartDate() {
		return q3MayStartDate;
	}

	public void setQ3MayStartDate(String q3MayStartDate) {
		this.q3MayStartDate = q3MayStartDate;
	}

	public String getQ3MayEndDate() {
		return q3MayEndDate;
	}

	public void setQ3MayEndDate(String q3MayEndDate) {
		this.q3MayEndDate = q3MayEndDate;
	}

	public int getQ3MayNoOfHours() {
		return q3MayNoOfHours;
	}

	public void setQ3MayNoOfHours(int q3MayNoOfHours) {
		this.q3MayNoOfHours = q3MayNoOfHours;
	}

	public String getQ3JuneStartDate() {
		return q3JuneStartDate;
	}

	public void setQ3JuneStartDate(String q3JuneStartDate) {
		this.q3JuneStartDate = q3JuneStartDate;
	}

	public String getQ3JuneEndDate() {
		return q3JuneEndDate;
	}

	public void setQ3JuneEndDate(String q3JuneEndDate) {
		this.q3JuneEndDate = q3JuneEndDate;
	}

	public int getQ3JuneNoOfHours() {
		return q3JuneNoOfHours;
	}

	public void setQ3JuneNoOfHours(int q3JuneNoOfHours) {
		this.q3JuneNoOfHours = q3JuneNoOfHours;
	}

	public String getQ4JulyStartDate() {
		return q4JulyStartDate;
	}

	public void setQ4JulyStartDate(String q4JulyStartDate) {
		this.q4JulyStartDate = q4JulyStartDate;
	}

	public String getQ4JulyEndDate() {
		return q4JulyEndDate;
	}

	public void setQ4JulyEndDate(String q4JulyEndDate) {
		this.q4JulyEndDate = q4JulyEndDate;
	}

	public int getQ4JulyNoOfHours() {
		return q4JulyNoOfHours;
	}

	public void setQ4JulyNoOfHours(int q4JulyNoOfHours) {
		this.q4JulyNoOfHours = q4JulyNoOfHours;
	}

	public String getQ4AugStartDate() {
		return q4AugStartDate;
	}

	public void setQ4AugStartDate(String q4AugStartDate) {
		this.q4AugStartDate = q4AugStartDate;
	}

	public String getQ4AugEndDate() {
		return q4AugEndDate;
	}

	public void setQ4AugEndDate(String q4AugEndDate) {
		this.q4AugEndDate = q4AugEndDate;
	}

	public int getQ4AugNoOfHours() {
		return q4AugNoOfHours;
	}

	public void setQ4AugNoOfHours(int q4AugNoOfHours) {
		this.q4AugNoOfHours = q4AugNoOfHours;
	}

	public String getQ4SepStartDate() {
		return q4SepStartDate;
	}

	public void setQ4SepStartDate(String q4SepStartDate) {
		this.q4SepStartDate = q4SepStartDate;
	}

	public String getQ4SepEndDate() {
		return q4SepEndDate;
	}

	public void setQ4SepEndDate(String q4SepEndDate) {
		this.q4SepEndDate = q4SepEndDate;
	}

	public int getQ4SepNoOfHours() {
		return q4SepNoOfHours;
	}

	public void setQ4SepNoOfHours(int q4SepNoOfHours) {
		this.q4SepNoOfHours = q4SepNoOfHours;
	}


}
