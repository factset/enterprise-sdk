/**
 * Portfolio Reporting Batcher
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application. With the initial release, clients can - trigger existing jobs - check status of running jobs - get various details of existing jobs
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import StartJobRunResponseData from './StartJobRunResponseData';

/**
 * The StartJobRunResponse model module.
 * @module model/StartJobRunResponse
 */
class StartJobRunResponse {
    /**
     * Constructs a new <code>StartJobRunResponse</code>.
     * Gives details about the run which was requested wrapped in a data object
     * @alias module:model/StartJobRunResponse
     * @param data {module:model/StartJobRunResponseData} 
     */
    constructor(data) { 
        
        StartJobRunResponse.initialize(this, data);
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
     * Constructs a <code>StartJobRunResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StartJobRunResponse} obj Optional instance to populate.
     * @return {module:model/StartJobRunResponse} The populated <code>StartJobRunResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StartJobRunResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = StartJobRunResponseData.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StartJobRunResponseData} data
 */
StartJobRunResponse.prototype['data'] = undefined;






export default StartJobRunResponse;

