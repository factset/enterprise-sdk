/**
 * Signals API
 * Collection of endpoints for providing Signal Events, Definitions and Metadata
 *
 * The version of the OpenAPI document: 2.6.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import SignalMetaDataData from './SignalMetaDataData';

/**
 * The SignalMetaData model module.
 * @module model/SignalMetaData
 */
class SignalMetaData {
    /**
     * Constructs a new <code>SignalMetaData</code>.
     * Metadata about a signal
     * @alias module:model/SignalMetaData
     * @param data {Array.<module:model/SignalMetaDataData>} 
     */
    constructor(data) { 
        
        SignalMetaData.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>SignalMetaData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SignalMetaData} obj Optional instance to populate.
     * @return {module:model/SignalMetaData} The populated <code>SignalMetaData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SignalMetaData();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [SignalMetaDataData]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/SignalMetaDataData>} data
 */
SignalMetaData.prototype['data'] = undefined;






export default SignalMetaData;

