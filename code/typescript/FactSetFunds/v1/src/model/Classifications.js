/**
 * FactSet Funds API
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Classifications model module.
 * @module model/Classifications
 */
class Classifications {
    /**
     * Constructs a new <code>Classifications</code>.
     * @alias module:model/Classifications
     */
    constructor() { 
        
        Classifications.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Classifications</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Classifications} obj Optional instance to populate.
     * @return {module:model/Classifications} The populated <code>Classifications</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Classifications();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('assetClass')) {
                obj['assetClass'] = ApiClient.convertToType(data['assetClass'], 'String');
            }
            if (data.hasOwnProperty('categoryClass')) {
                obj['categoryClass'] = ApiClient.convertToType(data['categoryClass'], 'String');
            }
            if (data.hasOwnProperty('economicDevelopmentClass')) {
                obj['economicDevelopmentClass'] = ApiClient.convertToType(data['economicDevelopmentClass'], 'String');
            }
            if (data.hasOwnProperty('focusClass')) {
                obj['focusClass'] = ApiClient.convertToType(data['focusClass'], 'String');
            }
            if (data.hasOwnProperty('geographicClass')) {
                obj['geographicClass'] = ApiClient.convertToType(data['geographicClass'], 'String');
            }
            if (data.hasOwnProperty('nicheClass')) {
                obj['nicheClass'] = ApiClient.convertToType(data['nicheClass'], 'String');
            }
            if (data.hasOwnProperty('regionClass')) {
                obj['regionClass'] = ApiClient.convertToType(data['regionClass'], 'String');
            }
        }
        return obj;
    }


}

/**
 * FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.
 * @member {String} fsymId
 */
Classifications.prototype['fsymId'] = undefined;

/**
 * The requested Id sent as input.
 * @member {String} requestId
 */
Classifications.prototype['requestId'] = undefined;

/**
 * Returns the asset class description from FactSet's fund classification system. Asset class designates the fund's underlying holding type, e.g. equity, fixed-income, etc.
 * @member {String} assetClass
 */
Classifications.prototype['assetClass'] = undefined;

/**
 * Returns the asset class category description from FactSet's fund classification system. The asset class category is the first-tier subcategory within the fund's asset class, e.g. size & style, sector, precious metals, etc.
 * @member {String} categoryClass
 */
Classifications.prototype['categoryClass'] = undefined;

/**
 * Returns the fund's economic development description from FactSet's fund classification system. This description refers to the development level for the fund's geographic region of focus, e.g. developed, emerging, etc.
 * @member {String} economicDevelopmentClass
 */
Classifications.prototype['economicDevelopmentClass'] = undefined;

/**
 * Returns the fund's focus description from FactSet's fund classification system. The fund's focus is the second-tier subcategory within the fund's asset class, e.g. small cap, energy, etc.
 * @member {String} focusClass
 */
Classifications.prototype['focusClass'] = undefined;

/**
 * Returns the fund's specific geography description from FactSet's fund classification system. Specific geography refers to the fund's particular geographic focus within the region, e.g. Chile, BRICs, etc.
 * @member {String} geographicClass
 */
Classifications.prototype['geographicClass'] = undefined;

/**
 * Returns the fund's niche description from FactSet's fund classification system. The fund's niche is the third-tier subcategory with the fund's asset class, e.g. growth, coal, etc.
 * @member {String} nicheClass
 */
Classifications.prototype['nicheClass'] = undefined;

/**
 * Returns the fund's region description from FactSet's fund classification system. Refers to the broad regional exposure of the fund's holdings, e.g. Latin America, Asia-Pacific, etc.
 * @member {String} regionClass
 */
Classifications.prototype['regionClass'] = undefined;






export default Classifications;

