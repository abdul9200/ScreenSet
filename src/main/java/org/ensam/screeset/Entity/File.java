package org.ensam.screeset.Entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
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
	@ManyToOne
	@JoinColumn(name="screenId")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Screen screen;
	

}
