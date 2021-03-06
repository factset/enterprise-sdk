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
import InlineResponse20024Exchange from './InlineResponse20024Exchange';

/**
 * The InlineResponse20024Data model module.
 * @module model/InlineResponse20024Data
 */
class InlineResponse20024Data {
    /**
     * Constructs a new <code>InlineResponse20024Data</code>.
     * @alias module:model/InlineResponse20024Data
     */
    constructor() { 
        
        InlineResponse20024Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20024Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20024Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20024Data} The populated <code>InlineResponse20024Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20024Data();

            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('securityType')) {
                obj['securityType'] = ApiClient.convertToType(data['securityType'], 'String');
            }
            if (data.hasOwnProperty('exchange')) {
                obj['exchange'] = InlineResponse20024Exchange.constructFromObject(data['exchange']);
            }
            if (data.hasOwnProperty('reportDate')) {
                obj['reportDate'] = ApiClient.convertToType(data['reportDate'], 'Date');
            }
            if (data.hasOwnProperty('shares')) {
                obj['shares'] = ApiClient.convertToType(data['shares'], 'Number');
            }
            if (data.hasOwnProperty('marketValue')) {
                obj['marketValue'] = ApiClient.convertToType(data['marketValue'], 'Number');
            }
            if (data.hasOwnProperty('currencyCode')) {
                obj['currencyCode'] = ApiClient.convertToType(data['currencyCode'], 'String');
            }
            if (data.hasOwnProperty('weight')) {
                obj['weight'] = ApiClient.convertToType(data['weight'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the holding. (when available).
 * @member {String} symbol
 */
InlineResponse20024Data.prototype['symbol'] = undefined;

/**
 * Name of the holding.
 * @member {String} name
 */
InlineResponse20024Data.prototype['name'] = undefined;

/**
 * Financial instrument type of the holding.
 * @member {String} securityType
 */
InlineResponse20024Data.prototype['securityType'] = undefined;

/**
 * @member {module:model/InlineResponse20024Exchange} exchange
 */
InlineResponse20024Data.prototype['exchange'] = undefined;

/**
 * Reporting date of the holding.
 * @member {Date} reportDate
 */
InlineResponse20024Data.prototype['reportDate'] = undefined;

/**
 * Number of shares held, unadjusted for corporate actions.
 * @member {Number} shares
 */
InlineResponse20024Data.prototype['shares'] = undefined;

/**
 * Market value of the holding, unadjusted for corporate actions.
 * @member {Number} marketValue
 */
InlineResponse20024Data.prototype['marketValue'] = undefined;

/**
 * Code representing the currency of the holding and  it's in format ISO 4217
 * @member {String} currencyCode
 */
InlineResponse20024Data.prototype['currencyCode'] = undefined;

/**
 * Weight of the holding within the ETP.
 * @member {Number} weight
 */
InlineResponse20024Data.prototype['weight'] = undefined;






export default InlineResponse20024Data;

