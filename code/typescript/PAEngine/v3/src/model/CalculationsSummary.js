/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.15.6
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CalculationsSummary model module.
 * @module model/CalculationsSummary
 */
class CalculationsSummary {
    /**
     * Constructs a new <code>CalculationsSummary</code>.
     * @alias module:model/CalculationsSummary
     */
    constructor() { 
        
        CalculationsSummary.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CalculationsSummary</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CalculationsSummary} obj Optional instance to populate.
     * @return {module:model/CalculationsSummary} The populated <code>CalculationsSummary</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CalculationsSummary();

            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
            if (data.hasOwnProperty('units')) {
                obj['units'] = ApiClient.convertToType(data['units'], 'Number');
            }
            if (data.hasOwnProperty('requestTime')) {
                obj['requestTime'] = ApiClient.convertToType(data['requestTime'], 'Date');
            }
            if (data.hasOwnProperty('lastPollTime')) {
                obj['lastPollTime'] = ApiClient.convertToType(data['lastPollTime'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * Last poll status of the calculation.
 * @member {module:model/CalculationsSummary.StatusEnum} status
 */
CalculationsSummary.prototype['status'] = undefined;

/**
 * Number of calculation units in batch.
 * @member {Number} units
 */
CalculationsSummary.prototype['units'] = undefined;

/**
 * Request time of calculation.
 * @member {Date} requestTime
 */
CalculationsSummary.prototype['requestTime'] = undefined;

/**
 * Last poll time of calculation.
 * @member {Date} lastPollTime
 */
CalculationsSummary.prototype['lastPollTime'] = undefined;





/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
CalculationsSummary['StatusEnum'] = {

    /**
     * value: "Queued"
     * @const
     */
    "Queued": "Queued",

    /**
     * value: "Executing"
     * @const
     */
    "Executing": "Executing",

    /**
     * value: "Completed"
     * @const
     */
    "Completed": "Completed",

    /**
     * value: "Cancelled"
     * @const
     */
    "Cancelled": "Cancelled"
};



export default CalculationsSummary;

