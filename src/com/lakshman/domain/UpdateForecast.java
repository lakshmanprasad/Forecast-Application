package com.lakshman.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UPDATEFORECAST")
public class UpdateForecast implements Serializable {

	@Id
	@Column(name = "psa_id")
	private int psaId;

	@Id
	@Column(name = "year")
	private String year;
	
	@Column(name = "q1_oct_vacation_hours")
	private int q1OctVacationHours;
	
	@Column(name = "q1_oct_admin_hours")
	private int q1OctAdminHours;
	
	@Column(name = "q1_nov_vacation_hours")
	private int q1NovVacationHours;
	
	@Column(name = "q1_nov_admin_hours")
	private int q1NovAdminHours;

	@Column(name = "q1_dec_vacation_hours")
	private int q1DecVacationHours;
	
	@Column(name = "q1_dec_admin_hours")
	private int q1DecAdminHours;

	@Column(name = "q2_jan_vacation_hours")
	private int q1JanVacationHours;
	
	@Column(name = "q2_jan_admin_hours")
	private int q1JanAdminHours;

	@Column(name = "q2_feb_vacation_hours")
	private int q1FebVacationHours;
	
	@Column(name = "q2_feb_admin_hours")
	private int q1FebAdminHours;
	
	@Column(name = "q2_mar_vacation_hours")
	private int q1MarchVacationHours;
	
	@Column(name = "q2_mar_admin_hours")
	private int q1MarchAdminHours;
	
	@Column(name = "q3_apr_vacation_hours")
	private int q1AprilVacationHours;
	
	@Column(name = "q3_apr_admin_hours")
	private int q1AprildminHours;
	
	@Column(name = "q3_may_vacation_hours")
	private int q1MayVacationHours;
	
	@Column(name = "q3_may_admin_hours")
	private int q1MaydminHours;
	
	@Column(name = "q3_june_vacation_hours")
	private int q1JuneVacationHours;
	
	@Column(name = "q3_june_admin_hours")
	private int q1JunedminHours;
	
	@Column(name = "q4_july_vacation_hours")
	private int q1JulyVacationHours;
	
	@Column(name = "q4_july_admin_hours")
	private int q1JulydminHours;
	
	@Column(name = "q4_aug_vacation_hours")
	private int q1AugVacationHours;
	
	@Column(name = "q4_aug_admin_hours")
	private int q1AugdminHours;
	
	@Column(name = "q4_sep_vacation_hours")
	private int q1SepVacationHours;
	
	@Column(name = "q4_sep_admin_hours")
	private int q1SepdminHours;
	
	public int getPsaId() {
		return psaId;
	}

	public void setPsaId(int psaId) {
		this.psaId = psaId;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getQ1OctVacationHours() {
		return q1OctVacationHours;
	}

	public void setQ1OctVacationHours(int q1OctVacationHours) {
		this.q1OctVacationHours = q1OctVacationHours;
	}

	public int getQ1OctAdminHours() {
		return q1OctAdminHours;
	}

	public void setQ1OctAdminHours(int q1OctAdminHours) {
		this.q1OctAdminHours = q1OctAdminHours;
	}

	public int getQ1NovVacationHours() {
		return q1NovVacationHours;
	}

	public void setQ1NovVacationHours(int q1NovVacationHours) {
		this.q1NovVacationHours = q1NovVacationHours;
	}

	public int getQ1NovAdminHours() {
		return q1NovAdminHours;
	}

	public void setQ1NovAdminHours(int q1NovAdminHours) {
		this.q1NovAdminHours = q1NovAdminHours;
	}

	public int getQ1DecVacationHours() {
		return q1DecVacationHours;
	}

	public void setQ1DecVacationHours(int q1DecVacationHours) {
		this.q1DecVacationHours = q1DecVacationHours;
	}

	public int getQ1DecAdminHours() {
		return q1DecAdminHours;
	}

	public void setQ1DecAdminHours(int q1DecAdminHours) {
		this.q1DecAdminHours = q1DecAdminHours;
	}

	public int getQ1JanVacationHours() {
		return q1JanVacationHours;
	}

	public void setQ1JanVacationHours(int q1JanVacationHours) {
		this.q1JanVacationHours = q1JanVacationHours;
	}

	public int getQ1JanAdminHours() {
		return q1JanAdminHours;
	}

	public void setQ1JanAdminHours(int q1JanAdminHours) {
		this.q1JanAdminHours = q1JanAdminHours;
	}

	public int getQ1FebVacationHours() {
		return q1FebVacationHours;
	}

	public void setQ1FebVacationHours(int q1FebVacationHours) {
		this.q1FebVacationHours = q1FebVacationHours;
	}

	public int getQ1FebAdminHours() {
		return q1FebAdminHours;
	}

	public void setQ1FebAdminHours(int q1FebAdminHours) {
		this.q1FebAdminHours = q1FebAdminHours;
	}

	public int getQ1MarchVacationHours() {
		return q1MarchVacationHours;
	}

	public void setQ1MarchVacationHours(int q1MarchVacationHours) {
		this.q1MarchVacationHours = q1MarchVacationHours;
	}

	public int getQ1MarchAdminHours() {
		return q1MarchAdminHours;
	}

	public void setQ1MarchAdminHours(int q1MarchAdminHours) {
		this.q1MarchAdminHours = q1MarchAdminHours;
	}

	public int getQ1AprilVacationHours() {
		return q1AprilVacationHours;
	}

	public void setQ1AprilVacationHours(int q1AprilVacationHours) {
		this.q1AprilVacationHours = q1AprilVacationHours;
	}

	public int getQ1AprildminHours() {
		return q1AprildminHours;
	}

	public void setQ1AprildminHours(int q1AprildminHours) {
		this.q1AprildminHours = q1AprildminHours;
	}

	public int getQ1MayVacationHours() {
		return q1MayVacationHours;
	}

	public void setQ1MayVacationHours(int q1MayVacationHours) {
		this.q1MayVacationHours = q1MayVacationHours;
	}

	public int getQ1MaydminHours() {
		return q1MaydminHours;
	}

	public void setQ1MaydminHours(int q1MaydminHours) {
		this.q1MaydminHours = q1MaydminHours;
	}

	public int getQ1JuneVacationHours() {
		return q1JuneVacationHours;
	}

	public void setQ1JuneVacationHours(int q1JuneVacationHours) {
		this.q1JuneVacationHours = q1JuneVacationHours;
	}

	public int getQ1JunedminHours() {
		return q1JunedminHours;
	}

	public void setQ1JunedminHours(int q1JunedminHours) {
		this.q1JunedminHours = q1JunedminHours;
	}

	public int getQ1JulyVacationHours() {
		return q1JulyVacationHours;
	}

	public void setQ1JulyVacationHours(int q1JulyVacationHours) {
		this.q1JulyVacationHours = q1JulyVacationHours;
	}

	public int getQ1JulydminHours() {
		return q1JulydminHours;
	}

	public void setQ1JulydminHours(int q1JulydminHours) {
		this.q1JulydminHours = q1JulydminHours;
	}

	public int getQ1AugVacationHours() {
		return q1AugVacationHours;
	}

	public void setQ1AugVacationHours(int q1AugVacationHours) {
		this.q1AugVacationHours = q1AugVacationHours;
	}

	public int getQ1AugdminHours() {
		return q1AugdminHours;
	}

	public void setQ1AugdminHours(int q1AugdminHours) {
		this.q1AugdminHours = q1AugdminHours;
	}

	public int getQ1SepVacationHours() {
		return q1SepVacationHours;
	}

	public void setQ1SepVacationHours(int q1SepVacationHours) {
		this.q1SepVacationHours = q1SepVacationHours;
	}

	public int getQ1SepdminHours() {
		return q1SepdminHours;
	}

	public void setQ1SepdminHours(int q1SepdminHours) {
		this.q1SepdminHours = q1SepdminHours;
	}



}
