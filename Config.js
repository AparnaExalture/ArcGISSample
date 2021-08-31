export const config = {
    spatialReference: 2180,
    basemap: ['cien', 'hipso'],
    layers: [
        {
            mapid: 'cien',
            service:
                'https://services.arcgisonline.com/arcgis/rest/services/World_Topo_Map/MapServer',
            type: 'tiled',
            label: 'Rzeźba terenu (cieniowanie)',
        },
        {
            mapid: 'hipso',
            service: 'https://sampleserver5.arcgisonline.com/arcgis/rest/services/Elevation/WorldElevations/MapServer',
            type: 'tiled',
            label: 'Rzeźba terenu (hipsometria)'
        },
        {
            mapid: 'osnowa',
            service: 'https://sampleserver5.arcgisonline.com/arcgis/rest/services/Census/MapServer',
            type: 'dynamic',
            label: 'Osnowa',
        },
        {
            mapid: 'kiip',
            service: 'http://mapy.geoportal.gov.pl/mwms/mwms/EwidencjaKIIP',
            type: 'dynamic',
            label: 'Dane ewidencyjne (KIIP)',
        }
    ]
};

