package org.ensam.screeset.service;

import java.util.List;

import org.ensam.screeset.Entity.Screen;


public interface ScreenService {
	Screen addScreen(Screen screen);
	void removeScreen(Screen screen);
	Screen updateScreen(Screen screen);
	List<Screen> listScreen();
}
