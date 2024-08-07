/**
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.13.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import FIDiscountCurveInfo from './FIDiscountCurveInfo';

/**
 * The FIDiscountCurveInfoRoot model module.
 * @module model/FIDiscountCurveInfoRoot
 */
class FIDiscountCurveInfoRoot {
    /**
     * Constructs a new <code>FIDiscountCurveInfoRoot</code>.
     * @alias module:model/FIDiscountCurveInfoRoot
     * @param data {Object.<String, module:model/FIDiscountCurveInfo>} 
     */
    constructor(data) { 
        
        FIDiscountCurveInfoRoot.initialize(this, data);
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
     * Constructs a <code>FIDiscountCurveInfoRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FIDiscountCurveInfoRoot} obj Optional instance to populate.
     * @return {module:model/FIDiscountCurveInfoRoot} The populated <code>FIDiscountCurveInfoRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FIDiscountCurveInfoRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], {'String': FIDiscountCurveInfo});
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object.<String, module:model/FIDiscountCurveInfo>} data
 */
FIDiscountCurveInfoRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
FIDiscountCurveInfoRoot.prototype['meta'] = undefined;






export default FIDiscountCurveInfoRoot;

