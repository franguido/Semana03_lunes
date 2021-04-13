package com.example.semana03_lunes.api;
import com.example.semana03_lunes.entity.User;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceApi {


    @GET("users")
    public abstract Call<List<User>>listaUsuario();
}
