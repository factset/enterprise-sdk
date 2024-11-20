/**
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
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
import QuoteInsideSizeResponse from './QuoteInsideSizeResponse';

/**
 * The QuoteInsideSizeResponseRoot model module.
 * @module model/QuoteInsideSizeResponseRoot
 */
class QuoteInsideSizeResponseRoot {
    /**
     * Constructs a new <code>QuoteInsideSizeResponseRoot</code>.
     * The response root object
     * @alias module:model/QuoteInsideSizeResponseRoot
     * @param data {module:model/QuoteInsideSizeResponse} 
     */
    constructor(data) { 
        
        QuoteInsideSizeResponseRoot.initialize(this, data);
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
     * Constructs a <code>QuoteInsideSizeResponseRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/QuoteInsideSizeResponseRoot} obj Optional instance to populate.
     * @return {module:model/QuoteInsideSizeResponseRoot} The populated <code>QuoteInsideSizeResponseRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QuoteInsideSizeResponseRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = QuoteInsideSizeResponse.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/QuoteInsideSizeResponse} data
 */
QuoteInsideSizeResponseRoot.prototype['data'] = undefined;






export default QuoteInsideSizeResponseRoot;

