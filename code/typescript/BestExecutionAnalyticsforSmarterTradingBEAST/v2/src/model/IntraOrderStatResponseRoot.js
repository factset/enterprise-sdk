/**
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import IntraOrderStatResponse from './IntraOrderStatResponse';

/**
 * The IntraOrderStatResponseRoot model module.
 * @module model/IntraOrderStatResponseRoot
 */
class IntraOrderStatResponseRoot {
    /**
     * Constructs a new <code>IntraOrderStatResponseRoot</code>.
     * The response root object
     * @alias module:model/IntraOrderStatResponseRoot
     * @param data {module:model/IntraOrderStatResponse} 
     */
    constructor(data) { 
        
        IntraOrderStatResponseRoot.initialize(this, data);
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
     * Constructs a <code>IntraOrderStatResponseRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/IntraOrderStatResponseRoot} obj Optional instance to populate.
     * @return {module:model/IntraOrderStatResponseRoot} The populated <code>IntraOrderStatResponseRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new IntraOrderStatResponseRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = IntraOrderStatResponse.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/IntraOrderStatResponse} data
 */
IntraOrderStatResponseRoot.prototype['data'] = undefined;






export default IntraOrderStatResponseRoot;

