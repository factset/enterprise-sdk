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
 * The InlineResponse20054DataInterestRateCurrentType model module.
 * @module model/InlineResponse20054DataInterestRateCurrentType
 */
class InlineResponse20054DataInterestRateCurrentType {
    /**
     * Constructs a new <code>InlineResponse20054DataInterestRateCurrentType</code>.
     * Type of the interest rate, see endpoint &#x60;/instrument/coupon/interestRate/type/list&#x60; for possible values.
     * @alias module:model/InlineResponse20054DataInterestRateCurrentType
     */
    constructor() { 
        
        InlineResponse20054DataInterestRateCurrentType.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20054DataInterestRateCurrentType</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20054DataInterestRateCurrentType} obj Optional instance to populate.
     * @return {module:model/InlineResponse20054DataInterestRateCurrentType} The populated <code>InlineResponse20054DataInterestRateCurrentType</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20054DataInterestRateCurrentType();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the interest rate type.
 * @member {Number} id
 */
InlineResponse20054DataInterestRateCurrentType.prototype['id'] = undefined;

/**
 * Name of the interest rate type.
 * @member {String} name
 */
InlineResponse20054DataInterestRateCurrentType.prototype['name'] = undefined;






export default InlineResponse20054DataInterestRateCurrentType;

