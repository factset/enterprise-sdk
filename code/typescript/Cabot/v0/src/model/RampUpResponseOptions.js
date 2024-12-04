/**
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import HoldingsResponseOptions from './HoldingsResponseOptions';
import RampUpModelAnalytics from './RampUpModelAnalytics';

/**
 * The RampUpResponseOptions model module.
 * @module model/RampUpResponseOptions
 */
class RampUpResponseOptions {
    /**
     * Constructs a new <code>RampUpResponseOptions</code>.
     * @alias module:model/RampUpResponseOptions
     */
    constructor() { 
        
        RampUpResponseOptions.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RampUpResponseOptions</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RampUpResponseOptions} obj Optional instance to populate.
     * @return {module:model/RampUpResponseOptions} The populated <code>RampUpResponseOptions</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RampUpResponseOptions();

            if (data.hasOwnProperty('attribute')) {
                obj['attribute'] = ApiClient.convertToType(data['attribute'], 'String');
            }
            if (data.hasOwnProperty('highRampUpValues')) {
                obj['highRampUpValues'] = ApiClient.convertToType(data['highRampUpValues'], [RampUpModelAnalytics]);
            }
            if (data.hasOwnProperty('holdingsData')) {
                obj['holdingsData'] = HoldingsResponseOptions.constructFromObject(data['holdingsData']);
            }
            if (data.hasOwnProperty('lowRampUpValues')) {
                obj['lowRampUpValues'] = ApiClient.convertToType(data['lowRampUpValues'], [RampUpModelAnalytics]);
            }
            if (data.hasOwnProperty('rampUpValues')) {
                obj['rampUpValues'] = ApiClient.convertToType(data['rampUpValues'], [RampUpModelAnalytics]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} attribute
 */
RampUpResponseOptions.prototype['attribute'] = undefined;

/**
 * @member {Array.<module:model/RampUpModelAnalytics>} highRampUpValues
 */
RampUpResponseOptions.prototype['highRampUpValues'] = undefined;

/**
 * @member {module:model/HoldingsResponseOptions} holdingsData
 */
RampUpResponseOptions.prototype['holdingsData'] = undefined;

/**
 * @member {Array.<module:model/RampUpModelAnalytics>} lowRampUpValues
 */
RampUpResponseOptions.prototype['lowRampUpValues'] = undefined;

/**
 * @member {Array.<module:model/RampUpModelAnalytics>} rampUpValues
 */
RampUpResponseOptions.prototype['rampUpValues'] = undefined;






export default RampUpResponseOptions;

