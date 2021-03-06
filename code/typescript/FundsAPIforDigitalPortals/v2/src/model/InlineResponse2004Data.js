/**
 * Funds API For Digital Portals
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse2004Currency from './InlineResponse2004Currency';
import InlineResponse2004Fsym from './InlineResponse2004Fsym';
import InlineResponse2004Fund from './InlineResponse2004Fund';
import InlineResponse2004Instrument from './InlineResponse2004Instrument';
import InlineResponse2004Market from './InlineResponse2004Market';
import InlineResponse2004Nsin from './InlineResponse2004Nsin';
import InlineResponse2004Performance from './InlineResponse2004Performance';
import InlineResponse2004ShareClass from './InlineResponse2004ShareClass';

/**
 * The InlineResponse2004Data model module.
 * @module model/InlineResponse2004Data
 */
class InlineResponse2004Data {
    /**
     * Constructs a new <code>InlineResponse2004Data</code>.
     * @alias module:model/InlineResponse2004Data
     */
    constructor() { 
        
        InlineResponse2004Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004Data} The populated <code>InlineResponse2004Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = InlineResponse2004Currency.constructFromObject(data['currency']);
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = InlineResponse2004Market.constructFromObject(data['market']);
            }
            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
            if (data.hasOwnProperty('nsin')) {
                obj['nsin'] = InlineResponse2004Nsin.constructFromObject(data['nsin']);
            }
            if (data.hasOwnProperty('fsym')) {
                obj['fsym'] = InlineResponse2004Fsym.constructFromObject(data['fsym']);
            }
            if (data.hasOwnProperty('instrument')) {
                obj['instrument'] = InlineResponse2004Instrument.constructFromObject(data['instrument']);
            }
            if (data.hasOwnProperty('fund')) {
                obj['fund'] = InlineResponse2004Fund.constructFromObject(data['fund']);
            }
            if (data.hasOwnProperty('shareClass')) {
                obj['shareClass'] = InlineResponse2004ShareClass.constructFromObject(data['shareClass']);
            }
            if (data.hasOwnProperty('performance')) {
                obj['performance'] = InlineResponse2004Performance.constructFromObject(data['performance']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the notation.
 * @member {String} id
 */
InlineResponse2004Data.prototype['id'] = undefined;

/**
 * @member {module:model/InlineResponse2004Currency} currency
 */
InlineResponse2004Data.prototype['currency'] = undefined;

/**
 * @member {module:model/InlineResponse2004Market} market
 */
InlineResponse2004Data.prototype['market'] = undefined;

/**
 * The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.
 * @member {String} symbol
 */
InlineResponse2004Data.prototype['symbol'] = undefined;

/**
 * @member {module:model/InlineResponse2004Nsin} nsin
 */
InlineResponse2004Data.prototype['nsin'] = undefined;

/**
 * @member {module:model/InlineResponse2004Fsym} fsym
 */
InlineResponse2004Data.prototype['fsym'] = undefined;

/**
 * @member {module:model/InlineResponse2004Instrument} instrument
 */
InlineResponse2004Data.prototype['instrument'] = undefined;

/**
 * @member {module:model/InlineResponse2004Fund} fund
 */
InlineResponse2004Data.prototype['fund'] = undefined;

/**
 * @member {module:model/InlineResponse2004ShareClass} shareClass
 */
InlineResponse2004Data.prototype['shareClass'] = undefined;

/**
 * @member {module:model/InlineResponse2004Performance} performance
 */
InlineResponse2004Data.prototype['performance'] = undefined;






export default InlineResponse2004Data;

