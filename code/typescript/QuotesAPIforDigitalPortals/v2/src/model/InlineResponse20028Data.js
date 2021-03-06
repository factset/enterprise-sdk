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
import InlineResponse20028DataMainCurrency from './InlineResponse20028DataMainCurrency';

/**
 * The InlineResponse20028Data model module.
 * @module model/InlineResponse20028Data
 */
class InlineResponse20028Data {
    /**
     * Constructs a new <code>InlineResponse20028Data</code>.
     * Details of a fractional currency.
     * @alias module:model/InlineResponse20028Data
     */
    constructor() { 
        
        InlineResponse20028Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20028Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20028Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20028Data} The populated <code>InlineResponse20028Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20028Data();

            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('factor')) {
                obj['factor'] = ApiClient.convertToType(data['factor'], 'Number');
            }
            if (data.hasOwnProperty('mainCurrency')) {
                obj['mainCurrency'] = InlineResponse20028DataMainCurrency.constructFromObject(data['mainCurrency']);
            }
        }
        return obj;
    }


}

/**
 * Code of the fractional currency such as GBp (for British pence), USc (for U.S. cents), EUc for (Euro cent).
 * @member {String} code
 */
InlineResponse20028Data.prototype['code'] = undefined;

/**
 * Name of the fractional currency.
 * @member {String} name
 */
InlineResponse20028Data.prototype['name'] = undefined;

/**
 * Conversion factor between the fractional and its main currency. For example, the value 100 indicates that 100 US cents are equivalent to one US dollar.
 * @member {Number} factor
 */
InlineResponse20028Data.prototype['factor'] = undefined;

/**
 * @member {module:model/InlineResponse20028DataMainCurrency} mainCurrency
 */
InlineResponse20028Data.prototype['mainCurrency'] = undefined;






export default InlineResponse20028Data;

