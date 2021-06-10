package com.websystique.springmvc.model;

import java.sql.Time;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="tbdtpf01")
public class FotoDoc {
	@Id
	@Column(name="PHOTO_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int photoId;
	
	@ManyToOne
	@JoinColumn(name="NOTICE")
	private Application NOTICE;
	
	@Column(name = "FOTO_TYP",nullable = true)
	private String fotoTyp;
	
	@Column(name = "FOTO",nullable = true)
	private String fotoPath;
	
}
