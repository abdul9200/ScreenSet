package org.ensam.screeset.Entity;

import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supervisor {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSupervisor;
	private String nom;
	private String prenom;
	private String mail;
	@OneToMany(mappedBy="supervisor",cascade = CascadeType.ALL)
	private Set<Screen> screens;


}
