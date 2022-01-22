package org.ensam.screeset.Entity;

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
public class Supervisor {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSupervisor;
	private String nom;
	private String prenom;
	private String mail;
	@OneToMany(mappedBy="supervisor")
	private Set<Screen> screens;

}
