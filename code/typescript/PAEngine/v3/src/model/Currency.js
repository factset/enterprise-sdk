/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.16.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Currency model module.
 * @module model/Currency
 */
class Currency {
    /**
     * Constructs a new <code>Currency</code>.
     * @alias module:model/Currency
     */
    constructor() { 
        
        Currency.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Currency</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Currency} obj Optional instance to populate.
     * @return {module:model/Currency} The populated <code>Currency</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Currency();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Name of currency.
 * @member {String} name
 */
Currency.prototype['name'] = undefined;






export default Currency;

