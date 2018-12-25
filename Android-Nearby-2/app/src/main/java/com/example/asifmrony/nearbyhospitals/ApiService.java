package com.example.asifmrony.nearbyhospitals;

import com.example.asifmrony.nearbyhospitals.Nearby.NearbyResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiService {

    @GET()
    Call<NearbyResponse> getNearby(@Url String url);
}
