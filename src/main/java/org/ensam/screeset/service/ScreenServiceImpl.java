package org.ensam.screeset.service;

import java.util.List;

import org.ensam.screeset.Entity.Screen;
import org.ensam.screeset.repository.ScreenRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ScreenServiceImpl implements ScreenService {
	
	private ScreenRepository rep;
	

	@Override
	public Screen addScreen(Screen screen) {
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
	public List<Screen> listScreen() {
		return rep.findAll();
	}

	

}
