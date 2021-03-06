/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse20014DataGearingLeverage from './InlineResponse20014DataGearingLeverage';

/**
 * The InlineResponse20014DataGearing model module.
 * @module model/InlineResponse20014DataGearing
 */
class InlineResponse20014DataGearing {
    /**
     * Constructs a new <code>InlineResponse20014DataGearing</code>.
     * Gearing.
     * @alias module:model/InlineResponse20014DataGearing
     */
    constructor() { 
        
        InlineResponse20014DataGearing.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20014DataGearing</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20014DataGearing} obj Optional instance to populate.
     * @return {module:model/InlineResponse20014DataGearing} The populated <code>InlineResponse20014DataGearing</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20014DataGearing();

            if (data.hasOwnProperty('isInverseFund')) {
                obj['isInverseFund'] = ApiClient.convertToType(data['isInverseFund'], 'Boolean');
            }
            if (data.hasOwnProperty('leverage')) {
                obj['leverage'] = InlineResponse20014DataGearingLeverage.constructFromObject(data['leverage']);
            }
            if (data.hasOwnProperty('exposureResetPeriod')) {
                obj['exposureResetPeriod'] = ApiClient.convertToType(data['exposureResetPeriod'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Flags ETPs that deliver short exposure to an index, including leveraged short exposure. This data is available for all the regions.
 * @member {Boolean} isInverseFund
 */
InlineResponse20014DataGearing.prototype['isInverseFund'] = undefined;

/**
 * @member {module:model/InlineResponse20014DataGearingLeverage} leverage
 */
InlineResponse20014DataGearing.prototype['leverage'] = undefined;

/**
 * Exposure reset frequency of leveraged and inverse ETPs, text and standardized value available. This data is available for all the regions.
 * @member {module:model/InlineResponse20014DataGearing.ExposureResetPeriodEnum} exposureResetPeriod
 */
InlineResponse20014DataGearing.prototype['exposureResetPeriod'] = undefined;





/**
 * Allowed values for the <code>exposureResetPeriod</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20014DataGearing['ExposureResetPeriodEnum'] = {

    /**
     * value: "Daily"
     * @const
     */
    "Daily": "Daily",

    /**
     * value: "Variable"
     * @const
     */
    "Variable": "Variable",

    /**
     * value: "None"
     * @const
     */
    "None": "None",

    /**
     * value: "Monthly"
     * @const
     */
    "Monthly": "Monthly",

    /**
     * value: "Quarterly"
     * @const
     */
    "Quarterly": "Quarterly"
};



export default InlineResponse20014DataGearing;

