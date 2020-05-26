/**
 * 
 */
/*
 * package com.seasia.movie.model;
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.JoinColumn; import javax.persistence.ManyToOne; import
 * javax.persistence.Table;
 * 
 *//**
	 * @author puriSidharth
	 * @since May 26, 2020
	 * @version 1.0
	 */
/*
 * 
 * @Entity
 * 
 * @Table(name="Rating") public class Rating {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
 * 
 * private Double rating;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name="movie_id", nullable=true) private Movie movie;
 * 
 *//**
	 * @return the id
	 */
/*
 * public Long getId() { return id; }
 * 
 *//**
	 * @param id the id to set
	 */
/*
 * public void setId(Long id) { this.id = id; }
 * 
 *//**
	 * @return the rating
	 */
/*
 * public Double getRating() { return rating; }
 * 
 *//**
	 * @param rating the rating to set
	 */
/*
 * public void setRating(Double rating) { this.rating = rating; }
 * 
 *//**
	 * @return the movie
	 */
/*
 * public Movie getMovie() { return movie; }
 * 
 *//**
	 * @param movie the movie to set
	 *//*
		 * public void setMovie(Movie movie) { this.movie = movie; }
		 * 
		 * 
		 * }
		 */