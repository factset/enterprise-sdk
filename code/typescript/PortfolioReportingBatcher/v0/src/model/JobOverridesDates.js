/**
 * Portfolio Reporting Batcher
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application.
 *
 * The version of the OpenAPI document: 0.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The JobOverridesDates model module.
 * @module model/JobOverridesDates
 */
class JobOverridesDates {
    /**
     * Constructs a new <code>JobOverridesDates</code>.
     * Used only for jobs where type is ADF. If using dates override, please provide both start date and end date.
     * @alias module:model/JobOverridesDates
     */
    constructor() { 
        
        JobOverridesDates.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>JobOverridesDates</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/JobOverridesDates} obj Optional instance to populate.
     * @return {module:model/JobOverridesDates} The populated <code>JobOverridesDates</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new JobOverridesDates();

            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'Date');
            }
            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * The end date in format YYYY-MM-DD
 * @member {Date} end
 */
JobOverridesDates.prototype['end'] = undefined;

/**
 * The start date in format YYYY-MM-DD
 * @member {Date} start
 */
JobOverridesDates.prototype['start'] = undefined;






export default JobOverridesDates;

