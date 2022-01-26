package org.ensam.screeset.Entity;

import java.util.*;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
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
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Supervisor supervisor;
	@OneToMany(mappedBy="screen",cascade = CascadeType.ALL)
	private Collection<File> files=new ArrayList<>();
	
	
	

}
