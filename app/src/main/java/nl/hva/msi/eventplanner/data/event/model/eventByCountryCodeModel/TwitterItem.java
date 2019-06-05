package nl.hva.msi.eventplanner.data.event.model.eventByCountryCodeModel;

import com.google.gson.annotations.SerializedName;

public class TwitterItem{

	@SerializedName("url")
	private String url;

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"TwitterItem{" + 
			"url = '" + url + '\'' + 
			"}";
		}
}