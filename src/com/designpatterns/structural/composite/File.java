package com.designpatterns.structural.composite;

public class File extends FileComponent {

	@Override
	public void displayComponent() {
		System.out.println(String.format("File component type is file, name is: %s", fileComponentName));
	}

	
	public File(String fileComponentName) {
		this.fileComponentName = fileComponentName;
	}
	
	@Override
	public void addChildFileComponent(FileComponent fileComponent) {
		System.out.println("Can not insert child to file!");
	}

}
