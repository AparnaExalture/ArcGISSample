/* eslint-disable react-native/no-inline-styles */
/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 *
 */
import 'react-native-gesture-handler';
import React from 'react';
import {createDrawerNavigator} from '@react-navigation/drawer';
import {NavigationContainer} from '@react-navigation/native';
import CustomModule from './CustomModule';
import {config} from './Config';
const Drawer = createDrawerNavigator();
const BaseMap = () => {
  return (
    <CustomModule
      style={{
        flex: 1,
        position: 'absolute',
        justifyContent: 'center',
        alignItems: 'stretch',
        left: 0,
        right: 0,
        bottom: 0,
        top: 0,
      }}
      url={config.layers[0].service}
    />
  );
};
const ImageLayer = () => {
  return (
    <CustomModule
      style={{flex: 1, justifyContent: 'center', alignItems: 'center'}}
      imageLayerUrl={config['layers'][1].service}
    />
  );
};
const ImageCensorLayer = () => {
  return (
    <CustomModule
      style={{flex: 1, justifyContent: 'center', alignItems: 'center'}}
      imageLayerUrl={config['layers'][2].service}
    />
  );
};

const App = () => {
  return (
    <>
      <NavigationContainer>
        <Drawer.Navigator>
          <Drawer.Screen name="BaseMap" component={BaseMap} />
          <Drawer.Screen name="ImageLayer" component={ImageLayer} />
          <Drawer.Screen name="ImageCensorLayer" component={ImageCensorLayer} />
        </Drawer.Navigator>
      </NavigationContainer>
    </>
  );
};

export default App;
