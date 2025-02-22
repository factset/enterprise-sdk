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
import JobTypes from './JobTypes';
import Status from './Status';

/**
 * The StartJobRunResponseData model module.
 * @module model/StartJobRunResponseData
 */
class StartJobRunResponseData {
    /**
     * Constructs a new <code>StartJobRunResponseData</code>.
     * The main object within the StartJobRunResponse schema
     * @alias module:model/StartJobRunResponseData
     * @param id {String} The run ID for the job that has been triggered which is used in the /runs/{id}/status endpoint
     * @param jobName {String} Name of the job
     * @param status {module:model/Status} 
     * @param jobType {module:model/JobTypes} 
     */
    constructor(id, jobName, status, jobType) { 
        
        StartJobRunResponseData.initialize(this, id, jobName, status, jobType);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, jobName, status, jobType) { 
        obj['id'] = id;
        obj['jobName'] = jobName;
        obj['status'] = status;
        obj['jobType'] = jobType;
    }

    /**
     * Constructs a <code>StartJobRunResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StartJobRunResponseData} obj Optional instance to populate.
     * @return {module:model/StartJobRunResponseData} The populated <code>StartJobRunResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StartJobRunResponseData();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('jobName')) {
                obj['jobName'] = ApiClient.convertToType(data['jobName'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = Status.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('jobType')) {
                obj['jobType'] = JobTypes.constructFromObject(data['jobType']);
            }
        }
        return obj;
    }


}

/**
 * The run ID for the job that has been triggered which is used in the /runs/{id}/status endpoint
 * @member {String} id
 */
StartJobRunResponseData.prototype['id'] = undefined;

/**
 * Name of the job
 * @member {String} jobName
 */
StartJobRunResponseData.prototype['jobName'] = undefined;

/**
 * @member {module:model/Status} status
 */
StartJobRunResponseData.prototype['status'] = undefined;

/**
 * @member {module:model/JobTypes} jobType
 */
StartJobRunResponseData.prototype['jobType'] = undefined;






export default StartJobRunResponseData;

