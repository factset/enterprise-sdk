/**
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.12.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The FICashflows model module.
 * @module model/FICashflows
 */
class FICashflows {
    /**
     * Constructs a new <code>FICashflows</code>.
     * @alias module:model/FICashflows
     */
    constructor() { 
        
        FICashflows.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FICashflows</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FICashflows} obj Optional instance to populate.
     * @return {module:model/FICashflows} The populated <code>FICashflows</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FICashflows();

            if (data.hasOwnProperty('optionalRedemptionCallWhenUnits')) {
                obj['optionalRedemptionCallWhenUnits'] = ApiClient.convertToType(data['optionalRedemptionCallWhenUnits'], 'String');
            }
            if (data.hasOwnProperty('optionalRedemptionCallWhen')) {
                obj['optionalRedemptionCallWhen'] = ApiClient.convertToType(data['optionalRedemptionCallWhen'], 'Number');
            }
            if (data.hasOwnProperty('recoveryLag')) {
                obj['recoveryLag'] = ApiClient.convertToType(data['recoveryLag'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * OptionalRedemptionCallWhenUnits
 * @member {module:model/FICashflows.OptionalRedemptionCallWhenUnitsEnum} optionalRedemptionCallWhenUnits
 */
FICashflows.prototype['optionalRedemptionCallWhenUnits'] = undefined;

/**
 * OptionalRedemptionCallWhen
 * @member {Number} optionalRedemptionCallWhen
 */
FICashflows.prototype['optionalRedemptionCallWhen'] = undefined;

/**
 * RecoveryLag
 * @member {Number} recoveryLag
 */
FICashflows.prototype['recoveryLag'] = undefined;





/**
 * Allowed values for the <code>optionalRedemptionCallWhenUnits</code> property.
 * @enum {String}
 * @readonly
 */
FICashflows['OptionalRedemptionCallWhenUnitsEnum'] = {

    /**
     * value: "Manual"
     * @const
     */
    "Manual": "Manual",

    /**
     * value: "Never"
     * @const
     */
    "Never": "Never",

    /**
     * value: "ASAP"
     * @const
     */
    "ASAP": "ASAP",

    /**
     * value: "Date"
     * @const
     */
    "Date": "Date",

    /**
     * value: "Deal Closing"
     * @const
     */
    "Deal Closing": "Deal Closing",

    /**
     * value: "Settle Date"
     * @const
     */
    "Settle Date": "Settle Date"
};



export default FICashflows;

