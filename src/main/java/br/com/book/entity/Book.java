package br.com.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "book")
@Entity(name = "book")
@NoArgsConstructor
@Data
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@Column(name = "name")
	private String name;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;

	public Book(String name, Author author) {
		this.name = name;
		this.author = author;
	}
}
