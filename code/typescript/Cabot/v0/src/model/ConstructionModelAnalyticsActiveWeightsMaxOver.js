/**
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ConstructionModelAnalyticsActiveWeightsMaxOver model module.
 * @module model/ConstructionModelAnalyticsActiveWeightsMaxOver
 */
class ConstructionModelAnalyticsActiveWeightsMaxOver {
    /**
     * Constructs a new <code>ConstructionModelAnalyticsActiveWeightsMaxOver</code>.
     * The greatest observed difference between the portfolio weight and benchmark weight.
     * @alias module:model/ConstructionModelAnalyticsActiveWeightsMaxOver
     */
    constructor() { 
        
        ConstructionModelAnalyticsActiveWeightsMaxOver.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ConstructionModelAnalyticsActiveWeightsMaxOver</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ConstructionModelAnalyticsActiveWeightsMaxOver} obj Optional instance to populate.
     * @return {module:model/ConstructionModelAnalyticsActiveWeightsMaxOver} The populated <code>ConstructionModelAnalyticsActiveWeightsMaxOver</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConstructionModelAnalyticsActiveWeightsMaxOver();

            if (data.hasOwnProperty('large')) {
                obj['large'] = ApiClient.convertToType(data['large'], 'Number');
            }
            if (data.hasOwnProperty('medium')) {
                obj['medium'] = ApiClient.convertToType(data['medium'], 'Number');
            }
            if (data.hasOwnProperty('small')) {
                obj['small'] = ApiClient.convertToType(data['small'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} large
 */
ConstructionModelAnalyticsActiveWeightsMaxOver.prototype['large'] = undefined;

/**
 * @member {Number} medium
 */
ConstructionModelAnalyticsActiveWeightsMaxOver.prototype['medium'] = undefined;

/**
 * @member {Number} small
 */
ConstructionModelAnalyticsActiveWeightsMaxOver.prototype['small'] = undefined;






export default ConstructionModelAnalyticsActiveWeightsMaxOver;

