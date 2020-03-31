package id.putraprima.retrofit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiError {
    @SerializedName("error")
    @Expose
    private Error error;
    @SerializedName("Status_code")
    @Expose
    private Integer status_code;

    public Error getError() {return error;}

    public void setError(Error error) {
        this.error = error;
    }

    public Integer getStatus_code() {
        return status_code;
    }

    public void setStatus_code(Integer status_code) {
        this.status_code = status_code;
    }
}
