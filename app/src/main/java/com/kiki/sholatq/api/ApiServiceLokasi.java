package com.kiki.sholatq.api;

import com.kiki.sholatq.model.ApimodelLokasi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServiceLokasi {

    //
    @GET("/?token=2d8abdfc8dd985")
    Call<ApimodelLokasi> getLokasi();

//
}
