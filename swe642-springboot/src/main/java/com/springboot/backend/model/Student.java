/*
 * Name: Manankumar Thakkar
 * Getters and Setter method for the Database 
 */
package com.springboot.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String fname;
    private String lname;
    private String studentid;
    private String email;
    private String streetaddress;
    private String city;
    private String state;
    private String zipcode;
    private String telephone;
    private String url;
    private String surveydate;
    private String likemost;
    private String interestInUniversity;
    private String comments;
    private String recommend;
    private String api_data;
    @Column(nullable = false, updatable = false)
    private String studentCode;

    public Student() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreetaddress() {
		return streetaddress;
	}

	public void setStreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSurveydate() {
		return surveydate;
	}

	public void setSurveydate(String surveydate) {
		this.surveydate = surveydate;
	}

	public String getLikemost() {
		return likemost;
	}

	public void setLikemost(String likemost) {
		this.likemost = likemost;
	}

	public String getInterestInUniversity() {
		return interestInUniversity;
	}

	public void setInterestInUniversity(String interestInUniversity) {
		this.interestInUniversity = interestInUniversity;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getApi_data() {
		return api_data;
	}

	public void setApi_data(String api_data) {
		this.api_data = api_data;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", studentid='" + studentid + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +

                '}';
}
}