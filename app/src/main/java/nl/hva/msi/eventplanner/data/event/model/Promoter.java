package nl.hva.msi.eventplanner.data.event.model;

import com.google.gson.annotations.SerializedName;

public class Promoter{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Promoter{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}