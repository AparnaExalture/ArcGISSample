package com.customnativemodule;

import java.util.ArrayList;

public class Config {
    static final String[] baseMaps = {"cien", "hipso"};
    static final int spatialReference = 2180;
    static final String API_KEY = "AAPK7270f493e93c46ab9c7a5f79ef22c7cbCZq6hR1BL7qR5FpxNYviexn9CUnMo9RvZuW1Bo2ZIPjlEBtdYMTaI-6K5Quvkix7";
    static final String BASE_MAP_URL = "https://services.arcgisonline.com/arcgis/rest/services/World_Topo_Map/MapServer";
    Layers layers;

    ArrayList<Layers> layerList = new ArrayList<Layers>();

    public void inputLayer() {
        layers = new Layers("cien", "http://mapy.geoportal.gov.pl/wss/service/imgurl/guest/CIEN/MapServer",
                "tiled", "Rzeźba terenu (cieniowanie)");
        layerList.add(layers);
        layers = new Layers("hipso", "http://mapy.geoportal.gov.pl/wss/service/imgurl/guest/HIPSO/MapServer",
                "tiled", "Rzeźba terenu (hipsometria)");
        layerList.add(layers);
        layers = new Layers("osnowa", "http://mapy.geoportal.gov.pl/wss/service/puburl/guest/G2_SKOROWIDZE_OSNOWA/MapServer",
                "dynamic", "Osnowa");
        layerList.add(layers);
        layers = new Layers("kiip", "http://mapy.geoportal.gov.pl/mwms/mwms/EwidencjaKIIP",
                "dynamic", "Dane ewidencyjne (KIIP)");
        layerList.add(layers);


    }
}
