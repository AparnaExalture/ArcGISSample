package com.customnativemodule;

import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.esri.arcgisruntime.ArcGISRuntimeEnvironment;
import com.esri.arcgisruntime.layers.ArcGISMapImageLayer;
import com.esri.arcgisruntime.layers.ArcGISTiledLayer;
import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.BasemapStyle;
import com.esri.arcgisruntime.mapping.LayerList;
import com.esri.arcgisruntime.mapping.view.MapView;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;

public class CustomModule extends SimpleViewManager<MapView> {
    ReactApplicationContext context;
    ArcGISMap arcGISMap;
    MapView mapView;
    LayerList mOperationalLayers;
    ArcGISMapImageLayer imageLayerElevation;
    ArcGISMapImageLayer imageLayerCensus;
    ArcGISTiledLayer tiledLayerMap;
    Config config;

    @NonNull
    @Override
    public String getName() {
        return "CustomModule";
    }

    @NonNull
    @Override
    protected MapView createViewInstance(@NonNull ThemedReactContext reactContext) {
        mapView = new MapView(reactContext);
        return mapView;
    }

    @ReactProp(name = "url")
    public void setBaseMap(MapView mapView, String urlPath) {
        ArcGISRuntimeEnvironment.setApiKey(Config.API_KEY);
        //ArcGISMap map = new ArcGISMap(SpatialReference.create(2180));
        arcGISMap = new ArcGISMap(BasemapStyle.ARCGIS_TOPOGRAPHIC_BASE);
        ArcGISTiledLayer tiledLayerBaseMap = new ArcGISTiledLayer(urlPath);
        Basemap basemap = new Basemap(tiledLayerBaseMap);
        arcGISMap.setBasemap(basemap);
        mOperationalLayers = arcGISMap.getOperationalLayers();
        mapView.setMap(arcGISMap);


    }

    @ReactProp(name = "imageLayerUrl")
    public void performImageLayer(MapView mapView, String urlPath) {
        setBaseMap(mapView, Config.BASE_MAP_URL);
        imageLayerElevation = new ArcGISMapImageLayer(urlPath);
        mOperationalLayers.add(imageLayerElevation);
//            imageLayerElevation.addDoneLoadingListener(new Runnable() {
//                @Override
//                public void run() {
//                   // Toast.makeText(context,"loaded image",Toast.LENGTH_LONG).show();
//                }
//            });
//        }

    }
}


