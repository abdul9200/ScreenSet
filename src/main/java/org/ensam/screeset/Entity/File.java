package org.ensam.screeset.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class File {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFile;
	private String type;
	private String name;
	private String path;
	private Long duration;
	private Screen screen;
	

}
