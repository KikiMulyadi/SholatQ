package com.kiki.sholatq.api;

import com.kiki.sholatq.model.ApimodelQuotes;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServiceQuotes {

    @GET("/api/data/quotes")
    Call<ApimodelQuotes> getQuotes();
}
