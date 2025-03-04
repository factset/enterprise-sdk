/**
 * Portfolio Reporting Batcher
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application.
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
import JobListResponseMetaPagination from './JobListResponseMetaPagination';

/**
 * The JobListResponseMeta model module.
 * @module model/JobListResponseMeta
 */
class JobListResponseMeta {
    /**
     * Constructs a new <code>JobListResponseMeta</code>.
     * Contains meta information, e.g. about pagination
     * @alias module:model/JobListResponseMeta
     */
    constructor() { 
        
        JobListResponseMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>JobListResponseMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/JobListResponseMeta} obj Optional instance to populate.
     * @return {module:model/JobListResponseMeta} The populated <code>JobListResponseMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new JobListResponseMeta();

            if (data.hasOwnProperty('pagination')) {
                obj['pagination'] = JobListResponseMetaPagination.constructFromObject(data['pagination']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/JobListResponseMetaPagination} pagination
 */
JobListResponseMeta.prototype['pagination'] = undefined;






export default JobListResponseMeta;

