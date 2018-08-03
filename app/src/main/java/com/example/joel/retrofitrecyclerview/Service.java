package com.example.joel.retrofitrecyclerview;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("/search/users?q=language:java+location:accra")
    Call<ItemResponse> getItems();
}
