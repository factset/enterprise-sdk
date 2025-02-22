/**
 * AFI Optimizer API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CalculationInfo from './CalculationInfo';

/**
 * The CalculationInfoRoot model module.
 * @module model/CalculationInfoRoot
 */
class CalculationInfoRoot {
    /**
     * Constructs a new <code>CalculationInfoRoot</code>.
     * @alias module:model/CalculationInfoRoot
     * @param data {module:model/CalculationInfo} 
     */
    constructor(data) { 
        
        CalculationInfoRoot.initialize(this, data);
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
     * Constructs a <code>CalculationInfoRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CalculationInfoRoot} obj Optional instance to populate.
     * @return {module:model/CalculationInfoRoot} The populated <code>CalculationInfoRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CalculationInfoRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = CalculationInfo.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/CalculationInfo} data
 */
CalculationInfoRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
CalculationInfoRoot.prototype['meta'] = undefined;






export default CalculationInfoRoot;

