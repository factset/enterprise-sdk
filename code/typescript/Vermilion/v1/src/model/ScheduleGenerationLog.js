/**
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
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

/**
 * The ScheduleGenerationLog model module.
 * @module model/ScheduleGenerationLog
 */
class ScheduleGenerationLog {
    /**
     * Constructs a new <code>ScheduleGenerationLog</code>.
     * Details of an individual task generation log.
     * @alias module:model/ScheduleGenerationLog
     */
    constructor() { 
        
        ScheduleGenerationLog.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ScheduleGenerationLog</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ScheduleGenerationLog} obj Optional instance to populate.
     * @return {module:model/ScheduleGenerationLog} The populated <code>ScheduleGenerationLog</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ScheduleGenerationLog();

            if (data.hasOwnProperty('sequenceNumber')) {
                obj['sequenceNumber'] = ApiClient.convertToType(data['sequenceNumber'], 'Number');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('logSet')) {
                obj['logSet'] = ApiClient.convertToType(data['logSet'], 'Number');
            }
            if (data.hasOwnProperty('lastUpdated')) {
                obj['lastUpdated'] = ApiClient.convertToType(data['lastUpdated'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The sequence number of the log entry.
 * @member {Number} sequenceNumber
 */
ScheduleGenerationLog.prototype['sequenceNumber'] = undefined;

/**
 * A detailed message describing the log event or error.
 * @member {String} message
 */
ScheduleGenerationLog.prototype['message'] = undefined;

/**
 * Type of log entry.
 * @member {module:model/ScheduleGenerationLog.TypeEnum} type
 */
ScheduleGenerationLog.prototype['type'] = undefined;

/**
 * Identifier for the set of logs this entry belongs to.
 * @member {Number} logSet
 */
ScheduleGenerationLog.prototype['logSet'] = undefined;

/**
 * The timestamp of the most recent update in epoch format for a specific Task Generation log
 * @member {String} lastUpdated
 */
ScheduleGenerationLog.prototype['lastUpdated'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
ScheduleGenerationLog['TypeEnum'] = {

    /**
     * value: "INFO"
     * @const
     */
    "INFO": "INFO",

    /**
     * value: "WARN"
     * @const
     */
    "WARN": "WARN",

    /**
     * value: "ERROR"
     * @const
     */
    "ERROR": "ERROR",

    /**
     * value: "DEBUG"
     * @const
     */
    "DEBUG": "DEBUG"
};



export default ScheduleGenerationLog;

