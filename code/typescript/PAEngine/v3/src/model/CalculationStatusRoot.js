/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.15.6
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CalculationStatus from './CalculationStatus';
import CalculationStatusMeta from './CalculationStatusMeta';

/**
 * The CalculationStatusRoot model module.
 * @module model/CalculationStatusRoot
 */
class CalculationStatusRoot {
    /**
     * Constructs a new <code>CalculationStatusRoot</code>.
     * @alias module:model/CalculationStatusRoot
     * @param data {module:model/CalculationStatus} 
     */
    constructor(data) { 
        
        CalculationStatusRoot.initialize(this, data);
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
     * Constructs a <code>CalculationStatusRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CalculationStatusRoot} obj Optional instance to populate.
     * @return {module:model/CalculationStatusRoot} The populated <code>CalculationStatusRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CalculationStatusRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = CalculationStatus.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = CalculationStatusMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/CalculationStatus} data
 */
CalculationStatusRoot.prototype['data'] = undefined;

/**
 * @member {module:model/CalculationStatusMeta} meta
 */
CalculationStatusRoot.prototype['meta'] = undefined;






export default CalculationStatusRoot;

