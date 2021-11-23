package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Folder extends FileComponent {
	List<FileComponent> fileComponentList = new ArrayList<>();
	
	
	public Folder(String fileComponentName) {
		this.fileComponentName = fileComponentName;
	}
	
	
	@Override
	public void displayComponent() {
		System.out.println(String.format("File component type is folder, name is: %s", fileComponentName));
		System.out.println("Folder has following items: ");
		Iterator<FileComponent> iter = fileComponentList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().fileComponentName);
		}
	}


	@Override
	public void addChildFileComponent(FileComponent fileComponent) {
		fileComponent.parentComponent = this;
		fileComponentList.add(fileComponent);
	}

}
