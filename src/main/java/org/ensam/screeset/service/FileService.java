package org.ensam.screeset.service;

import java.util.List;

import org.ensam.screeset.Entity.File;

public interface FileService {
	File addFile(File file);
	void removeFile(File file);
	File updateFile(File file);
	File getFileById(long id);
	List<File> listFile();
}
