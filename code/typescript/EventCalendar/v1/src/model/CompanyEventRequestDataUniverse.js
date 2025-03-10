/**
 * Event Calendar API
 * Retrieves events for companies
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CompanyEventRequestDataUniverse model module.
 * @module model/CompanyEventRequestDataUniverse
 */
class CompanyEventRequestDataUniverse {
    /**
     * Constructs a new <code>CompanyEventRequestDataUniverse</code>.
     * @alias module:model/CompanyEventRequestDataUniverse
     */
    constructor() { 
        
        CompanyEventRequestDataUniverse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CompanyEventRequestDataUniverse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CompanyEventRequestDataUniverse} obj Optional instance to populate.
     * @return {module:model/CompanyEventRequestDataUniverse} The populated <code>CompanyEventRequestDataUniverse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CompanyEventRequestDataUniverse();

            if (data.hasOwnProperty('symbols')) {
                obj['symbols'] = ApiClient.convertToType(data['symbols'], ['String']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Companies to return in the response
 * @member {Array.<String>} symbols
 */
CompanyEventRequestDataUniverse.prototype['symbols'] = undefined;

/**
 * @member {module:model/CompanyEventRequestDataUniverse.TypeEnum} type
 */
CompanyEventRequestDataUniverse.prototype['type'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
CompanyEventRequestDataUniverse['TypeEnum'] = {

    /**
     * value: "Tickers"
     * @const
     */
    "Tickers": "Tickers",

    /**
     * value: "Index"
     * @const
     */
    "Index": "Index",

    /**
     * value: "Etf"
     * @const
     */
    "Etf": "Etf",

    /**
     * value: "AllCompanies"
     * @const
     */
    "AllCompanies": "AllCompanies"
};



export default CompanyEventRequestDataUniverse;

