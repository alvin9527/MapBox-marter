package xy.com.mapboxdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.style.layers.Layer;

import static com.mapbox.mapboxsdk.style.layers.PropertyFactory.textField;

public class MainActivity extends AppCompatActivity {

    private MapView mapView;
    private MapboxMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        mapView = (MapView) findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);

        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                map = mapboxMap;
                Layer mapText = map.getLayer("country-label-lg");
                Layer mapText1 = map.getLayer("place-city-lg-n");
                Layer mapText11 = map.getLayer("place-city-lg-s");
                Layer mapText111 = map.getLayer("place-city-md-n");
                Layer mapText1111 = map.getLayer("place-city-md-s");
                Layer mapText2 = map.getLayer("road-label-large");
                Layer mapText3 = map.getLayer("rail-label");
                Layer mapText4 = map.getLayer("place-city-sm");
                Layer mapText5 = map.getLayer("place-hamlet");
                Layer mapText6 = map.getLayer("place-suburb");
                mapText.setProperties(textField("{name_zh}"));
                mapText1.setProperties(textField("{name_zh}"));
                mapText11.setProperties(textField("{name_zh}"));
                mapText111.setProperties(textField("{name_zh}"));
                mapText1111.setProperties(textField("{name_zh}"));
                mapText2.setProperties(textField("{name_zh}"));
                mapText3.setProperties(textField("{name_zh}"));
                mapText4.setProperties(textField("{name_zh}"));
                mapText5.setProperties(textField("{name_zh}"));
                mapText6.setProperties(textField("{name_zh}"));
            }
        });

    }


    @Override
    public void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }


}
