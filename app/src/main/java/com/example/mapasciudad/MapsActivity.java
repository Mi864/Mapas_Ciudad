package com.example.mapasciudad;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        //LatLng popayan = new LatLng(2.433, -76.617);
        //mMap.addMarker(new MarkerOptions().position(popayan).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(popayan));

        Bundle parametro = getIntent().getExtras();
        String Lugar = parametro.getString("Lugar");

        switch (Lugar) {

            case "parque":
                LatLng parque = new LatLng(2.441870, -76.606278);
                mMap.addMarker(new MarkerOptions().position(parque).title("Parque"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(parque));
                break;

            case "pueblitopatojo":
                LatLng pueblitopatojo = new LatLng(2.443796, -76.599713);
                mMap.addMarker(new MarkerOptions().position(pueblitopatojo).title("Pueblito Patojo"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(pueblitopatojo));
                break;

            case "museo":
                LatLng museo = new LatLng(2.443074, -76.605317);
                mMap.addMarker(new MarkerOptions().position(museo).title("Museo Guillermo León Valencia"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(museo));
                break;

            case "unicauca":
                LatLng unicauca = new LatLng(2.447179, -76.598313);
                mMap.addMarker(new MarkerOptions().position(unicauca).title("Universidad del Cauca"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(unicauca));
                break;


        }
    }
}