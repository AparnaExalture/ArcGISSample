package com.customnativemodule;

public class Layers {
    String mapId;
    String serviceUrl;
    String mapType;
    String layerLabel;

    public Layers(String mapId, String serviceUrl, String mapType, String layerLabel) {
        this.mapId = mapId;
        this.serviceUrl = serviceUrl;
        this.mapType = mapType;
        this.layerLabel = layerLabel;
    }

    public String getMapId() {
        return mapId;
    }

    public void setMapId(String mapId) {
        this.mapId = mapId;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getMapType() {
        return mapType;
    }

    public void setMapType(String mapType) {
        this.mapType = mapType;
    }

    public String getLayerLabel() {
        return layerLabel;
    }

    public void setLayerLabel(String layerLabel) {
        this.layerLabel = layerLabel;
    }
}
