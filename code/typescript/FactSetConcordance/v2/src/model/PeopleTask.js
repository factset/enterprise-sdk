/**
 * FactSet Concordance API
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request. With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p><p><b>Rate limit is set to 10 requests per second</b>.</p>    Methodology Guide link:   [https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d](https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d)    
 *
 * The version of the OpenAPI document: 2.10.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PeopleTask model module.
 * @module model/PeopleTask
 */
class PeopleTask {
    /**
     * Constructs a new <code>PeopleTask</code>.
     * Concordance People Task object. Shows the settings and status of a taskId and some statistics on the matches. 
     * @alias module:model/PeopleTask
     */
    constructor() { 
        
        PeopleTask.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PeopleTask</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PeopleTask} obj Optional instance to populate.
     * @return {module:model/PeopleTask} The populated <code>PeopleTask</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PeopleTask();

            if (data.hasOwnProperty('clientIdColumn')) {
                obj['clientIdColumn'] = ApiClient.convertToType(data['clientIdColumn'], 'String');
            }
            if (data.hasOwnProperty('personNameColumn')) {
                obj['personNameColumn'] = ApiClient.convertToType(data['personNameColumn'], 'String');
            }
            if (data.hasOwnProperty('firstNameColumn')) {
                obj['firstNameColumn'] = ApiClient.convertToType(data['firstNameColumn'], 'String');
            }
            if (data.hasOwnProperty('lastNameColumn')) {
                obj['lastNameColumn'] = ApiClient.convertToType(data['lastNameColumn'], 'String');
            }
            if (data.hasOwnProperty('middleNameColumn')) {
                obj['middleNameColumn'] = ApiClient.convertToType(data['middleNameColumn'], 'String');
            }
            if (data.hasOwnProperty('priorityColumn')) {
                obj['priorityColumn'] = ApiClient.convertToType(data['priorityColumn'], 'String');
            }
            if (data.hasOwnProperty('salutationColumn')) {
                obj['salutationColumn'] = ApiClient.convertToType(data['salutationColumn'], 'String');
            }
            if (data.hasOwnProperty('additionalContextColumns')) {
                obj['additionalContextColumns'] = ApiClient.convertToType(data['additionalContextColumns'], ['String']);
            }
            if (data.hasOwnProperty('hasResult')) {
                obj['hasResult'] = ApiClient.convertToType(data['hasResult'], 'Boolean');
            }
            if (data.hasOwnProperty('taskAction')) {
                obj['taskAction'] = ApiClient.convertToType(data['taskAction'], 'String');
            }
            if (data.hasOwnProperty('inputFile')) {
                obj['inputFile'] = ApiClient.convertToType(data['inputFile'], 'String');
            }
            if (data.hasOwnProperty('entityColumn')) {
                obj['entityColumn'] = ApiClient.convertToType(data['entityColumn'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
            if (data.hasOwnProperty('suffixColumn')) {
                obj['suffixColumn'] = ApiClient.convertToType(data['suffixColumn'], 'String');
            }
            if (data.hasOwnProperty('taskSubmitTime')) {
                obj['taskSubmitTime'] = ApiClient.convertToType(data['taskSubmitTime'], 'Date');
            }
            if (data.hasOwnProperty('unmappedCount')) {
                obj['unmappedCount'] = ApiClient.convertToType(data['unmappedCount'], 'Number');
            }
            if (data.hasOwnProperty('tryCount')) {
                obj['tryCount'] = ApiClient.convertToType(data['tryCount'], 'Number');
            }
            if (data.hasOwnProperty('decisionRate')) {
                obj['decisionRate'] = ApiClient.convertToType(data['decisionRate'], 'Number');
            }
            if (data.hasOwnProperty('processStartTime')) {
                obj['processStartTime'] = ApiClient.convertToType(data['processStartTime'], 'Date');
            }
            if (data.hasOwnProperty('processDuration')) {
                obj['processDuration'] = ApiClient.convertToType(data['processDuration'], 'Number');
            }
            if (data.hasOwnProperty('mappedCount')) {
                obj['mappedCount'] = ApiClient.convertToType(data['mappedCount'], 'Number');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = ApiClient.convertToType(data['error'], 'String');
            }
            if (data.hasOwnProperty('errorTitle')) {
                obj['errorTitle'] = ApiClient.convertToType(data['errorTitle'], 'String');
            }
            if (data.hasOwnProperty('inputCount')) {
                obj['inputCount'] = ApiClient.convertToType(data['inputCount'], 'Number');
            }
            if (data.hasOwnProperty('indeterminateCount')) {
                obj['indeterminateCount'] = ApiClient.convertToType(data['indeterminateCount'], 'Number');
            }
            if (data.hasOwnProperty('taskId')) {
                obj['taskId'] = ApiClient.convertToType(data['taskId'], 'Number');
            }
            if (data.hasOwnProperty('taskName')) {
                obj['taskName'] = ApiClient.convertToType(data['taskName'], 'String');
            }
            if (data.hasOwnProperty('universeId')) {
                obj['universeId'] = ApiClient.convertToType(data['universeId'], 'Number');
            }
            if (data.hasOwnProperty('universeName')) {
                obj['universeName'] = ApiClient.convertToType(data['universeName'], 'String');
            }
            if (data.hasOwnProperty('userFullName')) {
                obj['userFullName'] = ApiClient.convertToType(data['userFullName'], 'String');
            }
            if (data.hasOwnProperty('userSerial')) {
                obj['userSerial'] = ApiClient.convertToType(data['userSerial'], 'String');
            }
            if (data.hasOwnProperty('autoRemap')) {
                obj['autoRemap'] = ApiClient.convertToType(data['autoRemap'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * The number of columns of client. 
 * @member {String} clientIdColumn
 */
PeopleTask.prototype['clientIdColumn'] = undefined;

/**
 * The person name as provided in request.
 * @member {String} personNameColumn
 */
PeopleTask.prototype['personNameColumn'] = undefined;

/**
 * The first name of the client.
 * @member {String} firstNameColumn
 */
PeopleTask.prototype['firstNameColumn'] = undefined;

/**
 * The last name of the person.
 * @member {String} lastNameColumn
 */
PeopleTask.prototype['lastNameColumn'] = undefined;

/**
 * The middle name of the client.
 * @member {String} middleNameColumn
 */
PeopleTask.prototype['middleNameColumn'] = undefined;

/**
 * The middle name of the client.
 * @member {String} priorityColumn
 */
PeopleTask.prototype['priorityColumn'] = undefined;

/**
 * The salutation of the person.
 * @member {String} salutationColumn
 */
PeopleTask.prototype['salutationColumn'] = undefined;

/**
 * Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records. 
 * @member {Array.<String>} additionalContextColumns
 */
PeopleTask.prototype['additionalContextColumns'] = undefined;

/**
 * Whether the result is available.
 * @member {Boolean} hasResult
 */
PeopleTask.prototype['hasResult'] = undefined;

/**
 * Action status for the Concordance Task process.
 * @member {String} taskAction
 */
PeopleTask.prototype['taskAction'] = undefined;

/**
 * The input file is posted as a file object in the form. 
 * @member {String} inputFile
 */
PeopleTask.prototype['inputFile'] = undefined;

/**
 * Full name corresponding to the matched entity.
 * @member {String} entityColumn
 */
PeopleTask.prototype['entityColumn'] = undefined;

/**
 * Status of the Concordance Task. If the value is \"SUCCESS\", you can move to the subsequent /entity-decisions endpoint to retrieve the results.
 * @member {module:model/PeopleTask.StatusEnum} status
 */
PeopleTask.prototype['status'] = undefined;

/**
 * Name of the column in the input file that contains the person's suffix. 
 * @member {String} suffixColumn
 */
PeopleTask.prototype['suffixColumn'] = undefined;

/**
 * Time the Task was submitted in UTC.
 * @member {Date} taskSubmitTime
 */
PeopleTask.prototype['taskSubmitTime'] = undefined;

/**
 * Number of records with status of UNMAPPED the Input File.
 * @member {Number} unmappedCount
 */
PeopleTask.prototype['unmappedCount'] = undefined;

/**
 * Number of tries made so far for the request.
 * @member {Number} tryCount
 */
PeopleTask.prototype['tryCount'] = undefined;

/**
 * Percentage of mapped entities in the Input File.
 * @member {Number} decisionRate
 */
PeopleTask.prototype['decisionRate'] = undefined;

/**
 * Process start time in UTC.
 * @member {Date} processStartTime
 */
PeopleTask.prototype['processStartTime'] = undefined;

/**
 * Process duration in seconds.
 * @member {Number} processDuration
 */
PeopleTask.prototype['processDuration'] = undefined;

/**
 * Number of records with status of MAPPED the Input File.
 * @member {Number} mappedCount
 */
PeopleTask.prototype['mappedCount'] = undefined;

/**
 * Textual message for the status.
 * @member {String} message
 */
PeopleTask.prototype['message'] = undefined;

/**
 * @member {String} error
 */
PeopleTask.prototype['error'] = undefined;

/**
 * @member {String} errorTitle
 */
PeopleTask.prototype['errorTitle'] = undefined;

/**
 * Number of records in the Input File.
 * @member {Number} inputCount
 */
PeopleTask.prototype['inputCount'] = undefined;

/**
 * Number of records with status of INDETERMINATE the Input File.
 * @member {Number} indeterminateCount
 */
PeopleTask.prototype['indeterminateCount'] = undefined;

/**
 * The task identifier
 * @member {Number} taskId
 */
PeopleTask.prototype['taskId'] = undefined;

/**
 * The task name
 * @member {String} taskName
 */
PeopleTask.prototype['taskName'] = undefined;

/**
 * The universe identifier
 * @member {Number} universeId
 */
PeopleTask.prototype['universeId'] = undefined;

/**
 * Full name of the person associated with the `userSerial`. 
 * @member {String} universeName
 */
PeopleTask.prototype['universeName'] = undefined;

/**
 * Full name of the person associated with the `userSerial`. 
 * @member {String} userFullName
 */
PeopleTask.prototype['userFullName'] = undefined;

/**
 * user-serial of the person who initiated the people task 
 * @member {String} userSerial
 */
PeopleTask.prototype['userSerial'] = undefined;

/**
 * When `true`, automatically re-evaluates and overwrites existing mappings using updated metadata submitted in this task. Applicable when the specified universe has auto-remap set to true. **Caution: Mapping updates cannot be undone.** 
 * @member {Boolean} autoRemap
 */
PeopleTask.prototype['autoRemap'] = undefined;





/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
PeopleTask['StatusEnum'] = {

    /**
     * value: "PENDING"
     * @const
     */
    "PENDING": "PENDING",

    /**
     * value: "IN_PROGRESS"
     * @const
     */
    "IN_PROGRESS": "IN_PROGRESS",

    /**
     * value: "SUCCESS"
     * @const
     */
    "SUCCESS": "SUCCESS",

    /**
     * value: "FAILURE"
     * @const
     */
    "FAILURE": "FAILURE",

    /**
     * value: "BAD_REQUEST"
     * @const
     */
    "BAD_REQUEST": "BAD_REQUEST",

    /**
     * value: "ABORTED"
     * @const
     */
    "ABORTED": "ABORTED"
};



export default PeopleTask;

