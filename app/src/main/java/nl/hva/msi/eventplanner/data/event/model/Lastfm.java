package nl.hva.msi.eventplanner.data.event.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Lastfm {

    @SerializedName("url")
    @Expose
    private String url;
}