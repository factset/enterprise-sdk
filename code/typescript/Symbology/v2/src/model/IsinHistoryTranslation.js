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

/**
 * The IsinHistoryTranslation model module.
 * @module model/IsinHistoryTranslation
 */
class IsinHistoryTranslation {
    /**
     * Constructs a new <code>IsinHistoryTranslation</code>.
     * ISIN History Translation data object.
     * @alias module:model/IsinHistoryTranslation
     */
    constructor() { 
        
        IsinHistoryTranslation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>IsinHistoryTranslation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/IsinHistoryTranslation} obj Optional instance to populate.
     * @return {module:model/IsinHistoryTranslation} The populated <code>IsinHistoryTranslation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new IsinHistoryTranslation();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('isin')) {
                obj['isin'] = ApiClient.convertToType(data['isin'], 'String');
            }
            if (data.hasOwnProperty('isinEffectiveStartDate')) {
                obj['isinEffectiveStartDate'] = ApiClient.convertToType(data['isinEffectiveStartDate'], 'Date');
            }
            if (data.hasOwnProperty('isinEffectiveEndDate')) {
                obj['isinEffectiveEndDate'] = ApiClient.convertToType(data['isinEffectiveEndDate'], 'Date');
            }
            if (data.hasOwnProperty('asOfDate')) {
                obj['asOfDate'] = ApiClient.convertToType(data['asOfDate'], 'Date');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * FactSet Default Permanent Identifier. Regional and Composite (-USA) request `ids` will use a Regional ID '-R', Listing specific ids '-NYS' will use Listing ids '-L', Entities will use '-E', and FI will use security '-S' ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
 * @member {String} fsymId
 */
IsinHistoryTranslation.prototype['fsymId'] = undefined;

/**
 * Proper Name of company or issuer.
 * @member {String} name
 */
IsinHistoryTranslation.prototype['name'] = undefined;

/**
 * ISIN
 * @member {String} isin
 */
IsinHistoryTranslation.prototype['isin'] = undefined;

/**
 * ISIN effective start date in YYYY-MM-DD format.
 * @member {Date} isinEffectiveStartDate
 */
IsinHistoryTranslation.prototype['isinEffectiveStartDate'] = undefined;

/**
 * ISIN effective end date in YYYY-MM-DD format. Null if still active.
 * @member {Date} isinEffectiveEndDate
 */
IsinHistoryTranslation.prototype['isinEffectiveEndDate'] = undefined;

/**
 * As of Date in YYYY-MM-DD format.
 * @member {Date} asOfDate
 */
IsinHistoryTranslation.prototype['asOfDate'] = undefined;

/**
 * Identifier specified in the request
 * @member {String} requestId
 */
IsinHistoryTranslation.prototype['requestId'] = undefined;






export default IsinHistoryTranslation;

