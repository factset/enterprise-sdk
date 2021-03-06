/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse20072DataLow model module.
 * @module model/InlineResponse20072DataLow
 */
class InlineResponse20072DataLow {
    /**
     * Constructs a new <code>InlineResponse20072DataLow</code>.
     * Minimum value of the notation&#39;s price in the given time range.
     * @alias module:model/InlineResponse20072DataLow
     */
    constructor() { 
        
        InlineResponse20072DataLow.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20072DataLow</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20072DataLow} obj Optional instance to populate.
     * @return {module:model/InlineResponse20072DataLow} The populated <code>InlineResponse20072DataLow</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20072DataLow();

            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * Minimum value.
 * @member {Number} price
 */
InlineResponse20072DataLow.prototype['price'] = undefined;

/**
 * Date of the minimum value.
 * @member {Date} date
 */
InlineResponse20072DataLow.prototype['date'] = undefined;






export default InlineResponse20072DataLow;

