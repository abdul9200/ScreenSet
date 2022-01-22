package org.ensam.screeset.Entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Screen {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idScreen;
	private String ip;
	private String mac;
	private String identity;
	private Date lastmodifcation;
	private Date datecreation;
	private String motdepasse;
	private String etat;
	private Supervisor supervisor;
	@OneToMany(mappedBy="sreen")
	private Set<File> files;
	
	
	

}
