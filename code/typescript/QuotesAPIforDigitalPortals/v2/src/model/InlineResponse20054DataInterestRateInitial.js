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

/**
 * The InlineResponse20054DataInterestRateInitial model module.
 * @module model/InlineResponse20054DataInterestRateInitial
 */
class InlineResponse20054DataInterestRateInitial {
    /**
     * Constructs a new <code>InlineResponse20054DataInterestRateInitial</code>.
     * Details of the first coupon period.
     * @alias module:model/InlineResponse20054DataInterestRateInitial
     */
    constructor() { 
        
        InlineResponse20054DataInterestRateInitial.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20054DataInterestRateInitial</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20054DataInterestRateInitial} obj Optional instance to populate.
     * @return {module:model/InlineResponse20054DataInterestRateInitial} The populated <code>InlineResponse20054DataInterestRateInitial</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20054DataInterestRateInitial();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
            if (data.hasOwnProperty('startAccrual')) {
                obj['startAccrual'] = ApiClient.convertToType(data['startAccrual'], 'Date');
            }
            if (data.hasOwnProperty('periodEnd')) {
                obj['periodEnd'] = ApiClient.convertToType(data['periodEnd'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * Value of the interest rate.
 * @member {Number} value
 */
InlineResponse20054DataInterestRateInitial.prototype['value'] = undefined;

/**
 * Date as of which interest starts accruing.
 * @member {Date} startAccrual
 */
InlineResponse20054DataInterestRateInitial.prototype['startAccrual'] = undefined;

/**
 * Ending date (inclusive).
 * @member {Date} periodEnd
 */
InlineResponse20054DataInterestRateInitial.prototype['periodEnd'] = undefined;






export default InlineResponse20054DataInterestRateInitial;

