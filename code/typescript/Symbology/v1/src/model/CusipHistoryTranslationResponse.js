/**
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types. various market symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN,  SEDOL, Tickers, and Bloomberg FIGIs.   Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly  harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time. Additionally, the Symbology API provides  translation of market ids into Bloomberg FIGI. 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CusipHistoryTranslation from './CusipHistoryTranslation';

/**
 * The CusipHistoryTranslationResponse model module.
 * @module model/CusipHistoryTranslationResponse
 */
class CusipHistoryTranslationResponse {
    /**
     * Constructs a new <code>CusipHistoryTranslationResponse</code>.
     * Response object for CUISP Translation endpoint.
     * @alias module:model/CusipHistoryTranslationResponse
     */
    constructor() { 
        
        CusipHistoryTranslationResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CusipHistoryTranslationResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CusipHistoryTranslationResponse} obj Optional instance to populate.
     * @return {module:model/CusipHistoryTranslationResponse} The populated <code>CusipHistoryTranslationResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CusipHistoryTranslationResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [CusipHistoryTranslation]);
            }
        }
        return obj;
    }


}

/**
 * Array of symbol translation objects.
 * @member {Array.<module:model/CusipHistoryTranslation>} data
 */
CusipHistoryTranslationResponse.prototype['data'] = undefined;






export default CusipHistoryTranslationResponse;

