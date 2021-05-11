package com.moviekioskicrm.controller;

public class MoviesRented {

private Integer id;
private String title;
private Double preco;
private char release_date ;
private char poster_path ;
private char movie_status ;

public MoviesRented() {
	
	
}
public MoviesRented(Integer id, String title, Double preco, char release_date, char poster_path, char movie_status) {
	super();
	this.id = id;
	this.title = title;
	this.preco = preco;
	this.release_date = release_date;
	this.poster_path = poster_path;
	this.movie_status = movie_status;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Double getPreco() {
	return preco;
}
public void setPreco(Double preco) {
	this.preco = preco;
}
public char getRelease_date() {
	return release_date;
}
public void setRelease_date(char release_date) {
	this.release_date = release_date;
}
public char getPoster_path() {
	return poster_path;
}
public void setPoster_path(char poster_path) {
	this.poster_path = poster_path;
}
public char getMovie_status() {
	return movie_status;
}
public void setMovie_status(char movie_status) {
	this.movie_status = movie_status;
}


}
