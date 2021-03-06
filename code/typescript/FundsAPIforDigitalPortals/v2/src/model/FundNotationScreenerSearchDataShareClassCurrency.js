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
import FundNotationScreenerSearchDataShareClassCurrencyExclude from './FundNotationScreenerSearchDataShareClassCurrencyExclude';
import FundNotationScreenerSearchDataShareClassCurrencyRestrict from './FundNotationScreenerSearchDataShareClassCurrencyRestrict';

/**
 * The FundNotationScreenerSearchDataShareClassCurrency model module.
 * @module model/FundNotationScreenerSearchDataShareClassCurrency
 */
class FundNotationScreenerSearchDataShareClassCurrency {
    /**
     * Constructs a new <code>FundNotationScreenerSearchDataShareClassCurrency</code>.
     * Main currency of the share class. The parameter ensures the consistency and comparability of parameters expressed in the currency of the share class. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for valid values. 
     * @alias module:model/FundNotationScreenerSearchDataShareClassCurrency
     */
    constructor() { 
        
        FundNotationScreenerSearchDataShareClassCurrency.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FundNotationScreenerSearchDataShareClassCurrency</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FundNotationScreenerSearchDataShareClassCurrency} obj Optional instance to populate.
     * @return {module:model/FundNotationScreenerSearchDataShareClassCurrency} The populated <code>FundNotationScreenerSearchDataShareClassCurrency</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FundNotationScreenerSearchDataShareClassCurrency();

            if (data.hasOwnProperty('restrict')) {
                obj['restrict'] = FundNotationScreenerSearchDataShareClassCurrencyRestrict.constructFromObject(data['restrict']);
            }
            if (data.hasOwnProperty('exclude')) {
                obj['exclude'] = FundNotationScreenerSearchDataShareClassCurrencyExclude.constructFromObject(data['exclude']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/FundNotationScreenerSearchDataShareClassCurrencyRestrict} restrict
 */
FundNotationScreenerSearchDataShareClassCurrency.prototype['restrict'] = undefined;

/**
 * @member {module:model/FundNotationScreenerSearchDataShareClassCurrencyExclude} exclude
 */
FundNotationScreenerSearchDataShareClassCurrency.prototype['exclude'] = undefined;






export default FundNotationScreenerSearchDataShareClassCurrency;

