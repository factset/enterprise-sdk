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
import PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated from './PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated';
import PostSecuritizedDerivativeNotationRankingIntradayListDataItemsCategorization from './PostSecuritizedDerivativeNotationRankingIntradayListDataItemsCategorization';
import PostSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise from './PostSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise';
import PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsym from './PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsym';
import PostSecuritizedDerivativeNotationRankingIntradayListDataItemsInstrument from './PostSecuritizedDerivativeNotationRankingIntradayListDataItemsInstrument';
import PostSecuritizedDerivativeNotationRankingIntradayListDataItemsIssuer from './PostSecuritizedDerivativeNotationRankingIntradayListDataItemsIssuer';
import PostSecuritizedDerivativeNotationRankingIntradayListDataItemsLifeCycle from './PostSecuritizedDerivativeNotationRankingIntradayListDataItemsLifeCycle';
import PostSecuritizedDerivativeNotationRankingIntradayListDataItemsMarket from './PostSecuritizedDerivativeNotationRankingIntradayListDataItemsMarket';
import PostSecuritizedDerivativeNotationRankingIntradayListDataItemsTrade from './PostSecuritizedDerivativeNotationRankingIntradayListDataItemsTrade';
import PostSecuritizedDerivativeNotationRankingIntradayListDataItemsUnderlying from './PostSecuritizedDerivativeNotationRankingIntradayListDataItemsUnderlying';
import PostSecuritizedDerivativeNotationRankingIntradayListDataItemsValueUnit from './PostSecuritizedDerivativeNotationRankingIntradayListDataItemsValueUnit';

/**
 * The PostSecuritizedDerivativeNotationRankingIntradayListDataItems model module.
 * @module model/PostSecuritizedDerivativeNotationRankingIntradayListDataItems
 */
class PostSecuritizedDerivativeNotationRankingIntradayListDataItems {
    /**
     * Constructs a new <code>PostSecuritizedDerivativeNotationRankingIntradayListDataItems</code>.
     * A list of objects. For semantical context see the description of the parent array.
     * @alias module:model/PostSecuritizedDerivativeNotationRankingIntradayListDataItems
     */
    constructor() { 
        
        PostSecuritizedDerivativeNotationRankingIntradayListDataItems.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostSecuritizedDerivativeNotationRankingIntradayListDataItems</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostSecuritizedDerivativeNotationRankingIntradayListDataItems} obj Optional instance to populate.
     * @return {module:model/PostSecuritizedDerivativeNotationRankingIntradayListDataItems} The populated <code>PostSecuritizedDerivativeNotationRankingIntradayListDataItems</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostSecuritizedDerivativeNotationRankingIntradayListDataItems();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
            if (data.hasOwnProperty('fsym')) {
                obj['fsym'] = PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsym.constructFromObject(data['fsym']);
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = PostSecuritizedDerivativeNotationRankingIntradayListDataItemsMarket.constructFromObject(data['market']);
            }
            if (data.hasOwnProperty('valueUnit')) {
                obj['valueUnit'] = PostSecuritizedDerivativeNotationRankingIntradayListDataItemsValueUnit.constructFromObject(data['valueUnit']);
            }
            if (data.hasOwnProperty('trade')) {
                obj['trade'] = PostSecuritizedDerivativeNotationRankingIntradayListDataItemsTrade.constructFromObject(data['trade']);
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('accumulated')) {
                obj['accumulated'] = PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated.constructFromObject(data['accumulated']);
            }
            if (data.hasOwnProperty('instrument')) {
                obj['instrument'] = PostSecuritizedDerivativeNotationRankingIntradayListDataItemsInstrument.constructFromObject(data['instrument']);
            }
            if (data.hasOwnProperty('categorization')) {
                obj['categorization'] = PostSecuritizedDerivativeNotationRankingIntradayListDataItemsCategorization.constructFromObject(data['categorization']);
            }
            if (data.hasOwnProperty('lifeCycle')) {
                obj['lifeCycle'] = PostSecuritizedDerivativeNotationRankingIntradayListDataItemsLifeCycle.constructFromObject(data['lifeCycle']);
            }
            if (data.hasOwnProperty('issuer')) {
                obj['issuer'] = PostSecuritizedDerivativeNotationRankingIntradayListDataItemsIssuer.constructFromObject(data['issuer']);
            }
            if (data.hasOwnProperty('exercise')) {
                obj['exercise'] = PostSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise.constructFromObject(data['exercise']);
            }
            if (data.hasOwnProperty('participation')) {
                obj['participation'] = ApiClient.convertToType(data['participation'], 'String');
            }
            if (data.hasOwnProperty('underlying')) {
                obj['underlying'] = PostSecuritizedDerivativeNotationRankingIntradayListDataItemsUnderlying.constructFromObject(data['underlying']);
            }
            if (data.hasOwnProperty('knockedOut')) {
                obj['knockedOut'] = ApiClient.convertToType(data['knockedOut'], 'Boolean');
            }
            if (data.hasOwnProperty('knockedIn')) {
                obj['knockedIn'] = ApiClient.convertToType(data['knockedIn'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * Identifier of a notation.
 * @member {String} id
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['id'] = undefined;

/**
 * The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.
 * @member {String} symbol
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['symbol'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsym} fsym
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['fsym'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationRankingIntradayListDataItemsMarket} market
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['market'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationRankingIntradayListDataItemsValueUnit} valueUnit
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['valueUnit'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationRankingIntradayListDataItemsTrade} trade
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['trade'] = undefined;

/**
 * Quality of the trade-related attributes, see attributes `trade` and `accumulated`. | Value | Description | | --- | --- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. |  
 * @member {module:model/PostSecuritizedDerivativeNotationRankingIntradayListDataItems.QualityEnum} quality
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['quality'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated} accumulated
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['accumulated'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationRankingIntradayListDataItemsInstrument} instrument
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['instrument'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationRankingIntradayListDataItemsCategorization} categorization
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['categorization'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationRankingIntradayListDataItemsLifeCycle} lifeCycle
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['lifeCycle'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationRankingIntradayListDataItemsIssuer} issuer
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['issuer'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise} exercise
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['exercise'] = undefined;

/**
 * Participation direction of a factor certificate at the level movement of its effective underlying. | Value | Description | | --- | --- | | long | The factor certificate participates positively with rising levels of its effective underlying. | | short | The factor certificate participates negatively with rising levels of its effective underlying. |  
 * @member {module:model/PostSecuritizedDerivativeNotationRankingIntradayListDataItems.ParticipationEnum} participation
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['participation'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationRankingIntradayListDataItemsUnderlying} underlying
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['underlying'] = undefined;

/**
 * Indicates whether the securitized derivative is knocked-out (`true`) or not (`false`). Particularly relevant for knock-out certificates.
 * @member {Boolean} knockedOut
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['knockedOut'] = undefined;

/**
 * Indicates whether the securitized derivative is knocked-in (`true`) or not (`false`). Particularly relevant for bonus certificates but also for securitized derivatives that might have additional protection such as reverse convertible bonds, discount certificates, and capital-protection certificates.
 * @member {Boolean} knockedIn
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems.prototype['knockedIn'] = undefined;





/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems['QualityEnum'] = {

    /**
     * value: "RLT"
     * @const
     */
    "RLT": "RLT",

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY"
};


/**
 * Allowed values for the <code>participation</code> property.
 * @enum {String}
 * @readonly
 */
PostSecuritizedDerivativeNotationRankingIntradayListDataItems['ParticipationEnum'] = {

    /**
     * value: "long"
     * @const
     */
    "long": "long",

    /**
     * value: "short"
     * @const
     */
    "short": "short"
};



export default PostSecuritizedDerivativeNotationRankingIntradayListDataItems;

