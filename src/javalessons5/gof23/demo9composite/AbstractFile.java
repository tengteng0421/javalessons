package javalessons5.gof23.demo9composite;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {
	void killVirus();
}

class ImageFile implements AbstractFile {

	private String name;

	public ImageFile(String name) {
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("kill image file " + name);

	}
}

class Folder implements AbstractFile {

	private String name;
	private List<AbstractFile> list = new ArrayList<>();

	public Folder(String name) {
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("kill files " + name);
		for (AbstractFile abstractFile : list) {
			abstractFile.killVirus();
		}

	}

	public void add(AbstractFile file) {
		list.add(file);
	}

	public void remove(AbstractFile file) {
		list.remove(file);
	}

	public AbstractFile getChild(int index) {
		return list.get(index);
	}

}
