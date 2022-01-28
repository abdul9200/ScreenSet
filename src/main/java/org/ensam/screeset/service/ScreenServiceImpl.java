package org.ensam.screeset.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.ensam.screeset.Entity.File;
import org.ensam.screeset.Entity.Screen;
import org.ensam.screeset.dto.DataScreenRequestDTO;
import org.ensam.screeset.repository.FileRepository;
import org.ensam.screeset.repository.ScreenRepository;

import lombok.AllArgsConstructor;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class ScreenServiceImpl implements ScreenService{
	
	private ScreenRepository rep;
	private FileRepository repF;
	/*private ModelMapper modelMapper;*/


	@Override
	public Screen addScreen(Screen screen) {
		return rep.save(screen);
	}

	@Override
	public Screen addFileToScreen(long idScreen, long IdFile) {
		Screen screen = rep.findById(idScreen).get();
		File file = repF.findById(IdFile).get();
		file.setScreen(screen);
		screen.getFiles().add(file);
		repF.save(file);
		return rep.save(screen);
	}

	@Override
	public void removeScreen(Screen screen) {
		rep.delete(screen);
	}

	@Override
	public Screen updateScreen(Screen screen) {

		return rep.save(screen);
	}

	@Override
	public Screen getScreenById(long id) {
		return rep.findById(id).get();
	}

	@Override
	public List<Screen> listScreen() {
		return rep.findAll();
	}
	/*public DataScreenRequestDTO convertEntityToDto(Screen screen){
		modelMapper.getConfiguration()
				.setMatchingStrategy(MatchingStrategies.LOOSE);
		DataScreenRequestDTO dataScreenRequestDTO = new DataScreenRequestDTO();
		dataScreenRequestDTO = modelMapper.map(screen, DataScreenRequestDTO.class);
		return dataScreenRequestDTO;
	}

	public Screen convertDtoToEntity(DataScreenRequestDTO dataScreenRequestDTO){
		modelMapper.getConfiguration()
				.setMatchingStrategy(MatchingStrategies.LOOSE);
		Screen screen = new Screen();
		screen = modelMapper.map(dataScreenRequestDTO, Screen.class);
		return screen;
	}
	*/

}
