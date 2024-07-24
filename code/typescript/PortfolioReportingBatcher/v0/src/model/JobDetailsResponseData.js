/**
 * Portfolio Reporting Batcher
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application.
 *
 * The version of the OpenAPI document: 0.6.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import AccountsForJobAddProp from './AccountsForJobAddProp';
import RunsForJob from './RunsForJob';

/**
 * The JobDetailsResponseData model module.
 * @module model/JobDetailsResponseData
 */
class JobDetailsResponseData {
    /**
     * Constructs a new <code>JobDetailsResponseData</code>.
     * The main object in the jobDetailsResponse schema
     * @alias module:model/JobDetailsResponseData
     */
    constructor() { 
        
        JobDetailsResponseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>JobDetailsResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/JobDetailsResponseData} obj Optional instance to populate.
     * @return {module:model/JobDetailsResponseData} The populated <code>JobDetailsResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new JobDetailsResponseData();

            if (data.hasOwnProperty('accounts')) {
                obj['accounts'] = ApiClient.convertToType(data['accounts'], {'String': [AccountsForJobAddProp]});
            }
            if (data.hasOwnProperty('documents')) {
                obj['documents'] = ApiClient.convertToType(data['documents'], {'String': ['String']});
            }
            if (data.hasOwnProperty('runs')) {
                obj['runs'] = ApiClient.convertToType(data['runs'], [RunsForJob]);
            }
            if (data.hasOwnProperty('tasks')) {
                obj['tasks'] = ApiClient.convertToType(data['tasks'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * Please note for PI jobs you will only see portfolioId
 * @member {Object.<String, Array.<module:model/AccountsForJobAddProp>>} accounts
 */
JobDetailsResponseData.prototype['accounts'] = undefined;

/**
 * Shows the documents for each job where relevant with a collection of tasks under each document
 * @member {Object.<String, Array.<String>>} documents
 */
JobDetailsResponseData.prototype['documents'] = undefined;

/**
 * An array of information for each run
 * @member {Array.<module:model/RunsForJob>} runs
 */
JobDetailsResponseData.prototype['runs'] = undefined;

/**
 * A list of tasks for the given job
 * @member {Array.<String>} tasks
 */
JobDetailsResponseData.prototype['tasks'] = undefined;






export default JobDetailsResponseData;

