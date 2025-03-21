/**
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and LEIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs.</p><p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 3.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import GetInputSymbolType from './GetInputSymbolType';

/**
 * The IdentifierResolutionRequest model module.
 * @module model/IdentifierResolutionRequest
 */
class IdentifierResolutionRequest {
    /**
     * Constructs a new <code>IdentifierResolutionRequest</code>.
     * Request object for Identifier Resolution endpoint.
     * @alias module:model/IdentifierResolutionRequest
     * @param ids {Array.<String>} Requested market securities or entities. All requested identifiers must be of the same type. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'.
     * @param inputSymbolType {module:model/GetInputSymbolType} 
     * @param outputSymbolTypes {Array.<module:model/IdentifierResolutionRequest.OutputSymbolTypesEnum>} Requested identifiers to be returned. Multiple identifier types can be requested with each request.
     */
    constructor(ids, inputSymbolType, outputSymbolTypes) { 
        
        IdentifierResolutionRequest.initialize(this, ids, inputSymbolType, outputSymbolTypes);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ids, inputSymbolType, outputSymbolTypes) { 
        obj['ids'] = ids;
        obj['inputSymbolType'] = inputSymbolType;
        obj['outputSymbolTypes'] = outputSymbolTypes;
    }

    /**
     * Constructs a <code>IdentifierResolutionRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/IdentifierResolutionRequest} obj Optional instance to populate.
     * @return {module:model/IdentifierResolutionRequest} The populated <code>IdentifierResolutionRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new IdentifierResolutionRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('inputSymbolType')) {
                obj['inputSymbolType'] = GetInputSymbolType.constructFromObject(data['inputSymbolType']);
            }
            if (data.hasOwnProperty('outputSymbolTypes')) {
                obj['outputSymbolTypes'] = ApiClient.convertToType(data['outputSymbolTypes'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * Requested market securities or entities. All requested identifiers must be of the same type. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'.
 * @member {Array.<String>} ids
 */
IdentifierResolutionRequest.prototype['ids'] = undefined;

/**
 * @member {module:model/GetInputSymbolType} inputSymbolType
 */
IdentifierResolutionRequest.prototype['inputSymbolType'] = undefined;

/**
 * Requested identifiers to be returned. Multiple identifier types can be requested with each request.
 * @member {Array.<module:model/IdentifierResolutionRequest.OutputSymbolTypesEnum>} outputSymbolTypes
 */
IdentifierResolutionRequest.prototype['outputSymbolTypes'] = undefined;





/**
 * Allowed values for the <code>outputSymbolTypes</code> property.
 * @enum {String}
 * @readonly
 */
IdentifierResolutionRequest['OutputSymbolTypesEnum'] = {

    /**
     * value: "BIC"
     * @const
     */
    "BIC": "BIC",

    /**
     * value: "CIK"
     * @const
     */
    "CIK": "CIK",

    /**
     * value: "CRD"
     * @const
     */
    "CRD": "CRD",

    /**
     * value: "EIN"
     * @const
     */
    "EIN": "EIN",

    /**
     * value: "FITCH"
     * @const
     */
    "FITCH": "FITCH",

    /**
     * value: "LEI"
     * @const
     */
    "LEI": "LEI",

    /**
     * value: "MD"
     * @const
     */
    "MD": "MD",

    /**
     * value: "SPR"
     * @const
     */
    "SPR": "SPR",

    /**
     * value: "WKN"
     * @const
     */
    "WKN": "WKN",

    /**
     * value: "UKCH"
     * @const
     */
    "UKCH": "UKCH",

    /**
     * value: "RSSD"
     * @const
     */
    "RSSD": "RSSD",

    /**
     * value: "SEDOL"
     * @const
     */
    "SEDOL": "SEDOL",

    /**
     * value: "CUSIP"
     * @const
     */
    "CUSIP": "CUSIP",

    /**
     * value: "fsymEntityId"
     * @const
     */
    "fsymEntityId": "fsymEntityId",

    /**
     * value: "fsymSecurityId"
     * @const
     */
    "fsymSecurityId": "fsymSecurityId",

    /**
     * value: "fsymRegionalId"
     * @const
     */
    "fsymRegionalId": "fsymRegionalId",

    /**
     * value: "fsymListingId"
     * @const
     */
    "fsymListingId": "fsymListingId",

    /**
     * value: "ISIN"
     * @const
     */
    "ISIN": "ISIN",

    /**
     * value: "tickerExchange"
     * @const
     */
    "tickerExchange": "tickerExchange",

    /**
     * value: "tickerRegion"
     * @const
     */
    "tickerRegion": "tickerRegion",

    /**
     * value: "JCN"
     * @const
     */
    "JCN": "JCN",

    /**
     * value: "bloombergListingTicker"
     * @const
     */
    "bloombergListingTicker": "bloombergListingTicker",

    /**
     * value: "bloombergRegionalTicker"
     * @const
     */
    "bloombergRegionalTicker": "bloombergRegionalTicker",

    /**
     * value: "bloombergFigiListing"
     * @const
     */
    "bloombergFigiListing": "bloombergFigiListing",

    /**
     * value: "bloombergFigiRegional"
     * @const
     */
    "bloombergFigiRegional": "bloombergFigiRegional",

    /**
     * value: "bloombergFigiSecurity"
     * @const
     */
    "bloombergFigiSecurity": "bloombergFigiSecurity"
};



export default IdentifierResolutionRequest;

