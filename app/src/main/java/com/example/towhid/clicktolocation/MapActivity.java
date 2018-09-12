package com.example.towhid.clicktolocation;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {


    Marker marker;
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map_fragment);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        makeMarkers(mMap);

    }
    public void makeMarkers(GoogleMap map){

        LatLng latLang = new LatLng(23.813566,90.424339);

        MarkerOptions markerOption=new MarkerOptions().position(latLang).title("সোনিয়ার বাসা");
        Marker m = mMap.addMarker(markerOption);
        m.showInfoWindow();

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLang,15));
    }
}
