
package nl.hva.msi.eventplanner.data.event.model.eventByIdModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
@SuppressWarnings("unused")
public class Dma {

    @SerializedName("DmaId")
    @Expose
    private long id;

}