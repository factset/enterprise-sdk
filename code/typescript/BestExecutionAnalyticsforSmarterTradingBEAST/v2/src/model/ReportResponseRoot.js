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
import ReportResponse from './ReportResponse';

/**
 * The ReportResponseRoot model module.
 * @module model/ReportResponseRoot
 */
class ReportResponseRoot {
    /**
     * Constructs a new <code>ReportResponseRoot</code>.
     * The response root object
     * @alias module:model/ReportResponseRoot
     * @param data {module:model/ReportResponse} 
     */
    constructor(data) { 
        
        ReportResponseRoot.initialize(this, data);
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
     * Constructs a <code>ReportResponseRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ReportResponseRoot} obj Optional instance to populate.
     * @return {module:model/ReportResponseRoot} The populated <code>ReportResponseRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ReportResponseRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ReportResponse.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ReportResponse} data
 */
ReportResponseRoot.prototype['data'] = undefined;






export default ReportResponseRoot;

