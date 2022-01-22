package org.ensam.screeset.Entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

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
	@ManyToOne
	@JoinColumn(name="supervisorId")
	private Supervisor supervisor;
	@OneToMany(mappedBy="screen",cascade = CascadeType.ALL)
	private Set<File> files;
	
	
	

}
