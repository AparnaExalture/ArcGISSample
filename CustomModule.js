// import {NativeModules} from 'react-native';
// module.exports = NativeModules.CustomModule;
//export default NativeModules.CustomModule;
import PropTypes from 'prop-types';
import {requireNativeComponent, ViewPropTypes} from 'react-native';
var viewProps = {
  name: 'CustomModule',
  propTypes: {
    url: PropTypes.string,
    imageLayerUrl: PropTypes.string,
    baseLayerUrl:PropTypes.string,
    ...ViewPropTypes,
   }
}
module.exports = requireNativeComponent('CustomModule',viewProps);
