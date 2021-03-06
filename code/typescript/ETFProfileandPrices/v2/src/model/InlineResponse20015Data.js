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
import InlineResponse20015DataCategory from './InlineResponse20015DataCategory';
import InlineResponse20015DataGeography from './InlineResponse20015DataGeography';

/**
 * The InlineResponse20015Data model module.
 * @module model/InlineResponse20015Data
 */
class InlineResponse20015Data {
    /**
     * Constructs a new <code>InlineResponse20015Data</code>.
     * Class information of given ETP.
     * @alias module:model/InlineResponse20015Data
     */
    constructor() { 
        
        InlineResponse20015Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20015Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20015Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20015Data} The populated <code>InlineResponse20015Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20015Data();

            if (data.hasOwnProperty('asset')) {
                obj['asset'] = ApiClient.convertToType(data['asset'], 'String');
            }
            if (data.hasOwnProperty('economicDevelopment')) {
                obj['economicDevelopment'] = ApiClient.convertToType(data['economicDevelopment'], 'String');
            }
            if (data.hasOwnProperty('geography')) {
                obj['geography'] = InlineResponse20015DataGeography.constructFromObject(data['geography']);
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = InlineResponse20015DataCategory.constructFromObject(data['category']);
            }
        }
        return obj;
    }


}

/**
 * Asset class of ETP holdings (Equity, Fixed Income, Currency, Commodities, Asset Allocation, or Alternatives), text and standardized value available. This data is available for all the regions.
 * @member {module:model/InlineResponse20015Data.AssetEnum} asset
 */
InlineResponse20015Data.prototype['asset'] = undefined;

/**
 * The country development level of the ETP's holdings (Developed, Emerging, Frontier, or Blended), text and standardized value available. This data is available for all the regions.
 * @member {module:model/InlineResponse20015Data.EconomicDevelopmentEnum} economicDevelopment
 */
InlineResponse20015Data.prototype['economicDevelopment'] = undefined;

/**
 * @member {module:model/InlineResponse20015DataGeography} geography
 */
InlineResponse20015Data.prototype['geography'] = undefined;

/**
 * @member {module:model/InlineResponse20015DataCategory} category
 */
InlineResponse20015Data.prototype['category'] = undefined;





/**
 * Allowed values for the <code>asset</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20015Data['AssetEnum'] = {

    /**
     * value: "Equity"
     * @const
     */
    "Equity": "Equity",

    /**
     * value: "Alternatives"
     * @const
     */
    "Alternatives": "Alternatives",

    /**
     * value: "Fixed Income"
     * @const
     */
    "Fixed Income": "Fixed Income",

    /**
     * value: "Commodities"
     * @const
     */
    "Commodities": "Commodities",

    /**
     * value: "Currency"
     * @const
     */
    "Currency": "Currency",

    /**
     * value: "Asset Allocation"
     * @const
     */
    "Asset Allocation": "Asset Allocation"
};


/**
 * Allowed values for the <code>economicDevelopment</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20015Data['EconomicDevelopmentEnum'] = {

    /**
     * value: "Developed Markets"
     * @const
     */
    "Developed Markets": "Developed Markets",

    /**
     * value: "Blended Development"
     * @const
     */
    "Blended Development": "Blended Development",

    /**
     * value: "Emerging Markets"
     * @const
     */
    "Emerging Markets": "Emerging Markets",

    /**
     * value: "Frontier Markets"
     * @const
     */
    "Frontier Markets": "Frontier Markets"
};



export default InlineResponse20015Data;

