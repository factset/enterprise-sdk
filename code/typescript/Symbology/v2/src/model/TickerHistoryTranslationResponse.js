/**
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and Bloomberg FIGIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as of a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time.</p> 
 *
 * The version of the OpenAPI document: 2.1.3
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import TickerHistoryTranslation from './TickerHistoryTranslation';

/**
 * The TickerHistoryTranslationResponse model module.
 * @module model/TickerHistoryTranslationResponse
 */
class TickerHistoryTranslationResponse {
    /**
     * Constructs a new <code>TickerHistoryTranslationResponse</code>.
     * Response object for Ticker History endpoint.
     * @alias module:model/TickerHistoryTranslationResponse
     */
    constructor() { 
        
        TickerHistoryTranslationResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TickerHistoryTranslationResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TickerHistoryTranslationResponse} obj Optional instance to populate.
     * @return {module:model/TickerHistoryTranslationResponse} The populated <code>TickerHistoryTranslationResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TickerHistoryTranslationResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [TickerHistoryTranslation]);
            }
        }
        return obj;
    }


}

/**
 * Array of symbol translation objects.
 * @member {Array.<module:model/TickerHistoryTranslation>} data
 */
TickerHistoryTranslationResponse.prototype['data'] = undefined;






export default TickerHistoryTranslationResponse;

