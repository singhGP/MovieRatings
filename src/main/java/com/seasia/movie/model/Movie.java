/**
 * 
 */
package com.seasia.movie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
* @author puriSidharth
* @since May 26, 2020
* @version 1.0
*/

@Entity
@Table(name="Movie")
public class Movie {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	@ManyToOne
	@JoinColumn(name="cat_id")
	private Category category;
	
	private Double rating;
	public Movie() {
	}

	/**
	 * @param i
	 * @param string
	 * @param string2
	 * @param string3
	 */
	public Movie( String title, Category category, Double rating) {
		this.title = title;
		this.category =category;
		this.rating = rating;
		
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	

	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * @return the rating
	 */
	public Double getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(Double rating) {
		this.rating = rating;
	}

	
		

}
