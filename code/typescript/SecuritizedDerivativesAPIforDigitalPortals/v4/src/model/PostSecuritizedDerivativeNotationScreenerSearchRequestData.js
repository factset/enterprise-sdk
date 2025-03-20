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
import PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer from './PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer';
import PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems from './PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems';
import PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItems from './PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItems';
import PostSecuritizedDerivativeNotationScreenerSearchRequestDataCapitalProtection from './PostSecuritizedDerivativeNotationScreenerSearchRequestDataCapitalProtection';
import PostSecuritizedDerivativeNotationScreenerSearchRequestDataCashFlowCurrency from './PostSecuritizedDerivativeNotationScreenerSearchRequestDataCashFlowCurrency';
import PostSecuritizedDerivativeNotationScreenerSearchRequestDataCategory from './PostSecuritizedDerivativeNotationScreenerSearchRequestDataCategory';
import PostSecuritizedDerivativeNotationScreenerSearchRequestDataCurrentInterestRate from './PostSecuritizedDerivativeNotationScreenerSearchRequestDataCurrentInterestRate';
import PostSecuritizedDerivativeNotationScreenerSearchRequestDataExercise from './PostSecuritizedDerivativeNotationScreenerSearchRequestDataExercise';
import PostSecuritizedDerivativeNotationScreenerSearchRequestDataFactorCertificates from './PostSecuritizedDerivativeNotationScreenerSearchRequestDataFactorCertificates';
import PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFigures from './PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFigures';
import PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycle from './PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycle';
import PostSecuritizedDerivativeNotationScreenerSearchRequestDataNominalCurrency from './PostSecuritizedDerivativeNotationScreenerSearchRequestDataNominalCurrency';
import PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformance from './PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformance';
import PostSecuritizedDerivativeNotationScreenerSearchRequestDataRegistrationCountry from './PostSecuritizedDerivativeNotationScreenerSearchRequestDataRegistrationCountry';
import PostSecuritizedDerivativeNotationScreenerSearchRequestDataUnderlying from './PostSecuritizedDerivativeNotationScreenerSearchRequestDataUnderlying';
import PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation from './PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation';
import PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatility from './PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatility';

/**
 * The PostSecuritizedDerivativeNotationScreenerSearchRequestData model module.
 * @module model/PostSecuritizedDerivativeNotationScreenerSearchRequestData
 */
class PostSecuritizedDerivativeNotationScreenerSearchRequestData {
    /**
     * Constructs a new <code>PostSecuritizedDerivativeNotationScreenerSearchRequestData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestData
     */
    constructor() { 
        
        PostSecuritizedDerivativeNotationScreenerSearchRequestData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostSecuritizedDerivativeNotationScreenerSearchRequestData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestData} obj Optional instance to populate.
     * @return {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestData} The populated <code>PostSecuritizedDerivativeNotationScreenerSearchRequestData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostSecuritizedDerivativeNotationScreenerSearchRequestData();

            if (data.hasOwnProperty('validation')) {
                obj['validation'] = PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation.constructFromObject(data['validation']);
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = PostSecuritizedDerivativeNotationScreenerSearchRequestDataCategory.constructFromObject(data['category']);
            }
            if (data.hasOwnProperty('registrationCountry')) {
                obj['registrationCountry'] = PostSecuritizedDerivativeNotationScreenerSearchRequestDataRegistrationCountry.constructFromObject(data['registrationCountry']);
            }
            if (data.hasOwnProperty('lifeCycle')) {
                obj['lifeCycle'] = PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycle.constructFromObject(data['lifeCycle']);
            }
            if (data.hasOwnProperty('issuer')) {
                obj['issuer'] = PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer.constructFromObject(data['issuer']);
            }
            if (data.hasOwnProperty('exercise')) {
                obj['exercise'] = PostSecuritizedDerivativeNotationScreenerSearchRequestDataExercise.constructFromObject(data['exercise']);
            }
            if (data.hasOwnProperty('settlement')) {
                obj['settlement'] = ApiClient.convertToType(data['settlement'], 'String');
            }
            if (data.hasOwnProperty('collateralized')) {
                obj['collateralized'] = ApiClient.convertToType(data['collateralized'], 'Boolean');
            }
            if (data.hasOwnProperty('quanto')) {
                obj['quanto'] = ApiClient.convertToType(data['quanto'], 'Boolean');
            }
            if (data.hasOwnProperty('capitalProtection')) {
                obj['capitalProtection'] = PostSecuritizedDerivativeNotationScreenerSearchRequestDataCapitalProtection.constructFromObject(data['capitalProtection']);
            }
            if (data.hasOwnProperty('underlying')) {
                obj['underlying'] = PostSecuritizedDerivativeNotationScreenerSearchRequestDataUnderlying.constructFromObject(data['underlying']);
            }
            if (data.hasOwnProperty('cashFlowCurrency')) {
                obj['cashFlowCurrency'] = PostSecuritizedDerivativeNotationScreenerSearchRequestDataCashFlowCurrency.constructFromObject(data['cashFlowCurrency']);
            }
            if (data.hasOwnProperty('singleBarriers')) {
                obj['singleBarriers'] = ApiClient.convertToType(data['singleBarriers'], [PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItems]);
            }
            if (data.hasOwnProperty('rangeBarriers')) {
                obj['rangeBarriers'] = ApiClient.convertToType(data['rangeBarriers'], [PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems]);
            }
            if (data.hasOwnProperty('factorCertificates')) {
                obj['factorCertificates'] = PostSecuritizedDerivativeNotationScreenerSearchRequestDataFactorCertificates.constructFromObject(data['factorCertificates']);
            }
            if (data.hasOwnProperty('nominalCurrency')) {
                obj['nominalCurrency'] = PostSecuritizedDerivativeNotationScreenerSearchRequestDataNominalCurrency.constructFromObject(data['nominalCurrency']);
            }
            if (data.hasOwnProperty('currentInterestRate')) {
                obj['currentInterestRate'] = PostSecuritizedDerivativeNotationScreenerSearchRequestDataCurrentInterestRate.constructFromObject(data['currentInterestRate']);
            }
            if (data.hasOwnProperty('keyFigures')) {
                obj['keyFigures'] = PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFigures.constructFromObject(data['keyFigures']);
            }
            if (data.hasOwnProperty('performance')) {
                obj['performance'] = PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformance.constructFromObject(data['performance']);
            }
            if (data.hasOwnProperty('volatility')) {
                obj['volatility'] = PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatility.constructFromObject(data['volatility']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation} validation
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['validation'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestDataCategory} category
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['category'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestDataRegistrationCountry} registrationCountry
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['registrationCountry'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycle} lifeCycle
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['lifeCycle'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer} issuer
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['issuer'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestDataExercise} exercise
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['exercise'] = undefined;

/**
 * Settlement of the securitized derivative. It concerns the fulfillment of the issuer's contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | Value | Description | | --- | --- | | cash | Transfer of a cash amount | | physical | Phyiscal delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |  
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestData.SettlementEnum} settlement
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['settlement'] = undefined;

/**
 * Restricts the result to securitized derivatives that are collateralized (`true`) or are  not collateralized (`false`). A collateralized securitized derivative is protected against an  issuer default by collateral.
 * @member {Boolean} collateralized
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['collateralized'] = undefined;

/**
 * Restricts the result to securitized derivatives that are hedged (`true`) or are not hedged (`false`) against fluctuations of the foreign exchange rate between the value unit of the underlying and the value unit of the cash flows.
 * @member {Boolean} quanto
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['quanto'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestDataCapitalProtection} capitalProtection
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['capitalProtection'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestDataUnderlying} underlying
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['underlying'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestDataCashFlowCurrency} cashFlowCurrency
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['cashFlowCurrency'] = undefined;

/**
 * Single barriers. Barriers of this kind represent either a lower or an upper bound derived from the exercise right of the securitized derivative. Multiple barrier types may be used in one request.
 * @member {Array.<module:model/PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItems>} singleBarriers
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['singleBarriers'] = undefined;

/**
 * Range barriers. Barriers of this kind represent a range with a lower and an upper bound.
 * @member {Array.<module:model/PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems>} rangeBarriers
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['rangeBarriers'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestDataFactorCertificates} factorCertificates
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['factorCertificates'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestDataNominalCurrency} nominalCurrency
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['nominalCurrency'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestDataCurrentInterestRate} currentInterestRate
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['currentInterestRate'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFigures} keyFigures
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['keyFigures'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformance} performance
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['performance'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatility} volatility
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData.prototype['volatility'] = undefined;





/**
 * Allowed values for the <code>settlement</code> property.
 * @enum {String}
 * @readonly
 */
PostSecuritizedDerivativeNotationScreenerSearchRequestData['SettlementEnum'] = {

    /**
     * value: "cash"
     * @const
     */
    "cash": "cash",

    /**
     * value: "physical"
     * @const
     */
    "physical": "physical",

    /**
     * value: "either"
     * @const
     */
    "either": "either"
};



export default PostSecuritizedDerivativeNotationScreenerSearchRequestData;

