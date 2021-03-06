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
import InlineResponse20025DataAverageLife from './InlineResponse20025DataAverageLife';
import InlineResponse20025DataOptionAdjustedSpread from './InlineResponse20025DataOptionAdjustedSpread';

/**
 * The InlineResponse20025Data model module.
 * @module model/InlineResponse20025Data
 */
class InlineResponse20025Data {
    /**
     * Constructs a new <code>InlineResponse20025Data</code>.
     * Market Aggregates
     * @alias module:model/InlineResponse20025Data
     */
    constructor() { 
        
        InlineResponse20025Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20025Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20025Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20025Data} The populated <code>InlineResponse20025Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20025Data();

            if (data.hasOwnProperty('asOfDate')) {
                obj['asOfDate'] = ApiClient.convertToType(data['asOfDate'], 'Date');
            }
            if (data.hasOwnProperty('optionAdjustedSpread')) {
                obj['optionAdjustedSpread'] = InlineResponse20025DataOptionAdjustedSpread.constructFromObject(data['optionAdjustedSpread']);
            }
            if (data.hasOwnProperty('averageLife')) {
                obj['averageLife'] = InlineResponse20025DataAverageLife.constructFromObject(data['averageLife']);
            }
        }
        return obj;
    }


}

/**
 * Date the analytics data was published. Available for the regions: US, Europe,and Canada.
 * @member {Date} asOfDate
 */
InlineResponse20025Data.prototype['asOfDate'] = undefined;

/**
 * @member {module:model/InlineResponse20025DataOptionAdjustedSpread} optionAdjustedSpread
 */
InlineResponse20025Data.prototype['optionAdjustedSpread'] = undefined;

/**
 * @member {module:model/InlineResponse20025DataAverageLife} averageLife
 */
InlineResponse20025Data.prototype['averageLife'] = undefined;






export default InlineResponse20025Data;

