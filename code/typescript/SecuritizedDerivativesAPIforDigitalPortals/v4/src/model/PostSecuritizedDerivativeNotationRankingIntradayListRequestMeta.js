/**
 * Securitized Derivatives API For Digital Portals
 * Search for securitized derivative instruments, using a criteria-based screener. The API provides also fundamental data, notation-based key figures, list of barrier types, and details regarding the underlyings, their respective barriers and related cash flows, coupon lists and derived basic interest rate information.  The screener is based on securitized derivatives-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. All identifier types used as parameters must be valid and application must have permissions for them.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * life cycle: important dates in and features of the life cycle of the securitized derivatives instruments * filter by issuer, country of registration of the securitized derivatives * underlying and related barriers, including level and distance, and resulting cash flows * coupon data: where applicable, occurrence and frequency of coupon payments, current interest rate range * performance and volatility * product-specific ask-based key figures (not all key figures are available for all product types):     * bonus yield, sideways yield, maximum yield based on the ask price     * agio, discount     * spread     * break even, outperformance point, parity     * delta, weekly theta, vega, implied volatility     * leverage, omega     * intrinsic value, time value         Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term *level* is used instead of *price*, e.g. underlying level instead of underlying price. The endpoint does not support the search for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are returned in the result.  The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for equity and fixed income instruments: See the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals) and the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) for details.  
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import PostSecuritizedDerivativeNotationRankingIntradayListRequestMetaPagination from './PostSecuritizedDerivativeNotationRankingIntradayListRequestMetaPagination';

/**
 * The PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta model module.
 * @module model/PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta
 */
class PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta {
    /**
     * Constructs a new <code>PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta</code>.
     * The meta member contains the meta information of the request.
     * @alias module:model/PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta
     */
    constructor() { 
        
        PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta} obj Optional instance to populate.
     * @return {module:model/PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta} The populated <code>PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta();

            if (data.hasOwnProperty('attributes')) {
                obj['attributes'] = ApiClient.convertToType(data['attributes'], ['String']);
            }
            if (data.hasOwnProperty('language')) {
                obj['language'] = ApiClient.convertToType(data['language'], 'String');
            }
            if (data.hasOwnProperty('sort')) {
                obj['sort'] = ApiClient.convertToType(data['sort'], ['String']);
            }
            if (data.hasOwnProperty('pagination')) {
                obj['pagination'] = PostSecuritizedDerivativeNotationRankingIntradayListRequestMetaPagination.constructFromObject(data['pagination']);
            }
        }
        return obj;
    }


}

/**
 * Limit the attributes returned in the response to the specified set.
 * @member {Array.<String>} attributes
 */
PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta.prototype['attributes'] = undefined;

/**
 * ISO 639-1 code of the language.
 * @member {String} language
 */
PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta.prototype['language'] = undefined;

/**
 * Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 5 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | trade.performance.absolute | | -trade.performance.absolute | | trade.performance.relative | | -trade.performance.relative | | accumulated.numberTrades | | -accumulated.numberTrades | | accumulated.tradingVolume | | -accumulated.tradingVolume | | accumulated.tradingValue | | -accumulated.tradingValue |  
 * @member {Array.<module:model/PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta.SortEnum>} sort
 */
PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta.prototype['sort'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationRankingIntradayListRequestMetaPagination} pagination
 */
PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta.prototype['pagination'] = undefined;





/**
 * Allowed values for the <code>sort</code> property.
 * @enum {String}
 * @readonly
 */
PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta['SortEnum'] = {

    /**
     * value: "trade.performance.absolute"
     * @const
     */
    "trade.performance.absolute": "trade.performance.absolute",

    /**
     * value: "-trade.performance.absolute"
     * @const
     */
    "-trade.performance.absolute": "-trade.performance.absolute",

    /**
     * value: "trade.performance.relative"
     * @const
     */
    "trade.performance.relative": "trade.performance.relative",

    /**
     * value: "-trade.performance.relative"
     * @const
     */
    "-trade.performance.relative": "-trade.performance.relative",

    /**
     * value: "accumulated.numberTrades"
     * @const
     */
    "accumulated.numberTrades": "accumulated.numberTrades",

    /**
     * value: "-accumulated.numberTrades"
     * @const
     */
    "-accumulated.numberTrades": "-accumulated.numberTrades",

    /**
     * value: "accumulated.tradingVolume"
     * @const
     */
    "accumulated.tradingVolume": "accumulated.tradingVolume",

    /**
     * value: "-accumulated.tradingVolume"
     * @const
     */
    "-accumulated.tradingVolume": "-accumulated.tradingVolume",

    /**
     * value: "accumulated.tradingValue"
     * @const
     */
    "accumulated.tradingValue": "accumulated.tradingValue",

    /**
     * value: "-accumulated.tradingValue"
     * @const
     */
    "-accumulated.tradingValue": "-accumulated.tradingValue"
};



export default PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta;

