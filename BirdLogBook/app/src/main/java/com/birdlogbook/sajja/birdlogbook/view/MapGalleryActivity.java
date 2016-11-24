package com.birdlogbook.sajja.birdlogbook.view;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.birdlogbook.sajja.birdlogbook.R;
import com.birdlogbook.sajja.birdlogbook.controller.ImageController;
import com.birdlogbook.sajja.birdlogbook.model.Image;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapGalleryActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ImageController ic=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_gallery);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        ic=new ImageController(this);
        MarkerOptions markerOptions=new MarkerOptions();
       // ArrayList<LatLng> allPositions = ic.getAllPositions();
        ArrayList<LatLng> allPositions=new ArrayList<>();
        allPositions.add(new LatLng(8,79));
        allPositions.add(new LatLng(7.5,78.5));
        allPositions.add(new LatLng(7.4,79.45));
        allPositions.add(new LatLng(7.26,78));

       for(LatLng latLng: allPositions){

            markerOptions.position(latLng);
            markerOptions.title("someTitle");
            mMap.addMarker(markerOptions);
        }

       LatLng lastPosition = ic.getLastPosition();
        mMap.addMarker(new MarkerOptions().position(lastPosition).title("Marker in wwww"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lastPosition));

       /* for (int i = 1; i < 10; i++) {


            mMap.addMarker(new MarkerOptions().position(new LatLng(i*10,i*10)));
        }*/

        //Add a marker in Sydney and move the camera
      /* LatLng sydney = new LatLng(10, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        LatLng sydney2 = new LatLng(-1, 151);
        mMap.addMarker(new MarkerOptions().position(sydney2).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        LatLng sydney3 = new LatLng(-67, 151);
        mMap.addMarker(new MarkerOptions().position(sydney3).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/
    }
}
