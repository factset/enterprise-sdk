/**
 * FactSet Funds API
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Returns model module.
 * @module model/Returns
 */
class Returns {
    /**
     * Constructs a new <code>Returns</code>.
     * @alias module:model/Returns
     */
    constructor() { 
        
        Returns.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Returns</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Returns} obj Optional instance to populate.
     * @return {module:model/Returns} The populated <code>Returns</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Returns();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('return')) {
                obj['return'] = ApiClient.convertToType(data['return'], 'Number');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.
 * @member {String} fsymId
 */
Returns.prototype['fsymId'] = undefined;

/**
 * The Return for the requested id and date. Adjusting the frequency of the time-series does not adjust the return calculation, and simply controls the display frequency. The return type is determined by including or excluding dividends through the dividendAdjust parameter.
 * @member {Number} return
 */
Returns.prototype['return'] = undefined;

/**
 * The date of the return in YYYY-MM-DD format.
 * @member {Date} date
 */
Returns.prototype['date'] = undefined;

/**
 * ISO3 Currency
 * @member {String} currency
 */
Returns.prototype['currency'] = undefined;

/**
 * The requested Id sent as input.
 * @member {String} requestId
 */
Returns.prototype['requestId'] = undefined;






export default Returns;

