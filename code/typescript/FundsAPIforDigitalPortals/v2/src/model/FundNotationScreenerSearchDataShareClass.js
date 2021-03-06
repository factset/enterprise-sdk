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
import FundNotationScreenerSearchDataShareClassAssetsUnderManagement from './FundNotationScreenerSearchDataShareClassAssetsUnderManagement';
import FundNotationScreenerSearchDataShareClassCompliance from './FundNotationScreenerSearchDataShareClassCompliance';
import FundNotationScreenerSearchDataShareClassCurrency from './FundNotationScreenerSearchDataShareClassCurrency';
import FundNotationScreenerSearchDataShareClassFee from './FundNotationScreenerSearchDataShareClassFee';
import FundNotationScreenerSearchDataShareClassLifeCycle from './FundNotationScreenerSearchDataShareClassLifeCycle';
import FundNotationScreenerSearchDataShareClassMinimumInvestment from './FundNotationScreenerSearchDataShareClassMinimumInvestment';
import FundNotationScreenerSearchDataShareClassRegistrationCountry from './FundNotationScreenerSearchDataShareClassRegistrationCountry';

/**
 * The FundNotationScreenerSearchDataShareClass model module.
 * @module model/FundNotationScreenerSearchDataShareClass
 */
class FundNotationScreenerSearchDataShareClass {
    /**
     * Constructs a new <code>FundNotationScreenerSearchDataShareClass</code>.
     * Parameters related to share classes.
     * @alias module:model/FundNotationScreenerSearchDataShareClass
     */
    constructor() { 
        
        FundNotationScreenerSearchDataShareClass.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FundNotationScreenerSearchDataShareClass</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FundNotationScreenerSearchDataShareClass} obj Optional instance to populate.
     * @return {module:model/FundNotationScreenerSearchDataShareClass} The populated <code>FundNotationScreenerSearchDataShareClass</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FundNotationScreenerSearchDataShareClass();

            if (data.hasOwnProperty('currency')) {
                obj['currency'] = FundNotationScreenerSearchDataShareClassCurrency.constructFromObject(data['currency']);
            }
            if (data.hasOwnProperty('distributing')) {
                obj['distributing'] = ApiClient.convertToType(data['distributing'], 'String');
            }
            if (data.hasOwnProperty('registrationCountry')) {
                obj['registrationCountry'] = FundNotationScreenerSearchDataShareClassRegistrationCountry.constructFromObject(data['registrationCountry']);
            }
            if (data.hasOwnProperty('lifeCycle')) {
                obj['lifeCycle'] = FundNotationScreenerSearchDataShareClassLifeCycle.constructFromObject(data['lifeCycle']);
            }
            if (data.hasOwnProperty('minimumInvestment')) {
                obj['minimumInvestment'] = FundNotationScreenerSearchDataShareClassMinimumInvestment.constructFromObject(data['minimumInvestment']);
            }
            if (data.hasOwnProperty('assetsUnderManagement')) {
                obj['assetsUnderManagement'] = FundNotationScreenerSearchDataShareClassAssetsUnderManagement.constructFromObject(data['assetsUnderManagement']);
            }
            if (data.hasOwnProperty('compliance')) {
                obj['compliance'] = FundNotationScreenerSearchDataShareClassCompliance.constructFromObject(data['compliance']);
            }
            if (data.hasOwnProperty('fee')) {
                obj['fee'] = FundNotationScreenerSearchDataShareClassFee.constructFromObject(data['fee']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/FundNotationScreenerSearchDataShareClassCurrency} currency
 */
FundNotationScreenerSearchDataShareClass.prototype['currency'] = undefined;

/**
 * Defines whether or not distributing share classes are included in the result. A share class may distribute (pay out) the earnings to the investors or may reinvest them.
 * @member {module:model/FundNotationScreenerSearchDataShareClass.DistributingEnum} distributing
 * @default 'include'
 */
FundNotationScreenerSearchDataShareClass.prototype['distributing'] = 'include';

/**
 * @member {module:model/FundNotationScreenerSearchDataShareClassRegistrationCountry} registrationCountry
 */
FundNotationScreenerSearchDataShareClass.prototype['registrationCountry'] = undefined;

/**
 * @member {module:model/FundNotationScreenerSearchDataShareClassLifeCycle} lifeCycle
 */
FundNotationScreenerSearchDataShareClass.prototype['lifeCycle'] = undefined;

/**
 * @member {module:model/FundNotationScreenerSearchDataShareClassMinimumInvestment} minimumInvestment
 */
FundNotationScreenerSearchDataShareClass.prototype['minimumInvestment'] = undefined;

/**
 * @member {module:model/FundNotationScreenerSearchDataShareClassAssetsUnderManagement} assetsUnderManagement
 */
FundNotationScreenerSearchDataShareClass.prototype['assetsUnderManagement'] = undefined;

/**
 * @member {module:model/FundNotationScreenerSearchDataShareClassCompliance} compliance
 */
FundNotationScreenerSearchDataShareClass.prototype['compliance'] = undefined;

/**
 * @member {module:model/FundNotationScreenerSearchDataShareClassFee} fee
 */
FundNotationScreenerSearchDataShareClass.prototype['fee'] = undefined;





/**
 * Allowed values for the <code>distributing</code> property.
 * @enum {String}
 * @readonly
 */
FundNotationScreenerSearchDataShareClass['DistributingEnum'] = {

    /**
     * value: "only"
     * @const
     */
    "only": "only",

    /**
     * value: "include"
     * @const
     */
    "include": "include",

    /**
     * value: "exclude"
     * @const
     */
    "exclude": "exclude"
};



export default FundNotationScreenerSearchDataShareClass;

