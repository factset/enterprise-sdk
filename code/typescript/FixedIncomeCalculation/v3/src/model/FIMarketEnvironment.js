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

/**
 * The FIMarketEnvironment model module.
 * @module model/FIMarketEnvironment
 */
class FIMarketEnvironment {
    /**
     * Constructs a new <code>FIMarketEnvironment</code>.
     * @alias module:model/FIMarketEnvironment
     */
    constructor() { 
        
        FIMarketEnvironment.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FIMarketEnvironment</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FIMarketEnvironment} obj Optional instance to populate.
     * @return {module:model/FIMarketEnvironment} The populated <code>FIMarketEnvironment</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FIMarketEnvironment();

            if (data.hasOwnProperty('ratePath')) {
                obj['ratePath'] = ApiClient.convertToType(data['ratePath'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Rate Path
 * @member {module:model/FIMarketEnvironment.RatePathEnum} ratePath
 * @default 'FLAT & FORWARD'
 */
FIMarketEnvironment.prototype['ratePath'] = 'FLAT & FORWARD';





/**
 * Allowed values for the <code>ratePath</code> property.
 * @enum {String}
 * @readonly
 */
FIMarketEnvironment['RatePathEnum'] = {

    /**
     * value: "FLAT"
     * @const
     */
    "FLAT": "FLAT",

    /**
     * value: "FORWARD"
     * @const
     */
    "FORWARD": "FORWARD",

    /**
     * value: "FLAT & FORWARD"
     * @const
     */
    "FLAT &amp; FORWARD": "FLAT & FORWARD"
};



export default FIMarketEnvironment;

