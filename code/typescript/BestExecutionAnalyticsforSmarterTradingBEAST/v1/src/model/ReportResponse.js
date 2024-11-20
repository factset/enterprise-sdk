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
import ReportRecord from './ReportRecord';

/**
 * The ReportResponse model module.
 * @module model/ReportResponse
 */
class ReportResponse {
    /**
     * Constructs a new <code>ReportResponse</code>.
     * The Report Response object
     * @alias module:model/ReportResponse
     */
    constructor() { 
        
        ReportResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ReportResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ReportResponse} obj Optional instance to populate.
     * @return {module:model/ReportResponse} The populated <code>ReportResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ReportResponse();

            if (data.hasOwnProperty('analysis')) {
                obj['analysis'] = ApiClient.convertToType(data['analysis'], [ReportRecord]);
            }
        }
        return obj;
    }


}

/**
 * Report Analysis Records
 * @member {Array.<module:model/ReportRecord>} analysis
 */
ReportResponse.prototype['analysis'] = undefined;






export default ReportResponse;

