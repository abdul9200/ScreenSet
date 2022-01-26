package org.ensam.screeset.service;

import java.util.List;

import org.ensam.screeset.Entity.File;
import org.ensam.screeset.repository.FileRepository;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl implements FileService {

	private FileRepository rep;
	
	public FileServiceImpl(FileRepository r) {
		rep = r;
	}
	
	
	@Override
	public File addFile(File file) {
		return rep.save(file);
	}

	@Override
	public void removeFile(File file) {
		rep.delete(file);
	}

	@Override
	public File updateFile(File file) {
		return rep.save(file);
	}

	@Override
	public File getFileById(long id) {
		return rep.findById(id).get();
	}

	@Override
	public List<File> listFile() {
		return rep.findAll();
	}

}
