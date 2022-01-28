package org.ensam.screeset.service;

import java.util.List;

import org.ensam.screeset.Entity.File;
import org.ensam.screeset.Entity.Screen;
import org.ensam.screeset.dto.DataScreenRequestDTO;


public interface ScreenService {
	Screen addScreen(Screen screen);
	Screen addFileToScreen(long idScreen, long IdFile);
	void removeScreen(Screen screen);
	Screen updateScreen(Screen screen);
	Screen getScreenById(long id);
	List<Screen> listScreen();
	/*Screen convertDtoToEntity(DataScreenRequestDTO dataScreenRequestDTO);
	DataScreenRequestDTO convertEntityToDto(Screen screen);*/
}
