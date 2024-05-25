import com.google.gson.annotations.SerializedName;

public record TasasConversion(@SerializedName("USD") double usd, @SerializedName("PEN") double pen, @SerializedName("EUR") double eur, @SerializedName("VES") double ves, @SerializedName("ARS") double ars) {
}
