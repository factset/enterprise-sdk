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
import JobDetailsResponseData from './JobDetailsResponseData';

/**
 * The JobDetailsResponse model module.
 * @module model/JobDetailsResponse
 */
class JobDetailsResponse {
    /**
     * Constructs a new <code>JobDetailsResponse</code>.
     * Provides the requested details for the specified job and if no attributes are provided, full details will be given
     * @alias module:model/JobDetailsResponse
     */
    constructor() { 
        
        JobDetailsResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>JobDetailsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/JobDetailsResponse} obj Optional instance to populate.
     * @return {module:model/JobDetailsResponse} The populated <code>JobDetailsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new JobDetailsResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = JobDetailsResponseData.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/JobDetailsResponseData} data
 */
JobDetailsResponse.prototype['data'] = undefined;






export default JobDetailsResponse;

