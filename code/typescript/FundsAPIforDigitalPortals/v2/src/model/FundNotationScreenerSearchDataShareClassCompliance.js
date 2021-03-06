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
import FundNotationScreenerSearchDataFundComplianceOr from './FundNotationScreenerSearchDataFundComplianceOr';

/**
 * The FundNotationScreenerSearchDataShareClassCompliance model module.
 * @module model/FundNotationScreenerSearchDataShareClassCompliance
 */
class FundNotationScreenerSearchDataShareClassCompliance {
    /**
     * Constructs a new <code>FundNotationScreenerSearchDataShareClassCompliance</code>.
     * Compliance properties related to share classes. See endpoint &#x60;/instrument/complianceProperty/list&#x60; for the full list of compliance properties associated with instruments (across all asset classes).
     * @alias module:model/FundNotationScreenerSearchDataShareClassCompliance
     */
    constructor() { 
        
        FundNotationScreenerSearchDataShareClassCompliance.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FundNotationScreenerSearchDataShareClassCompliance</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FundNotationScreenerSearchDataShareClassCompliance} obj Optional instance to populate.
     * @return {module:model/FundNotationScreenerSearchDataShareClassCompliance} The populated <code>FundNotationScreenerSearchDataShareClassCompliance</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FundNotationScreenerSearchDataShareClassCompliance();

            if (data.hasOwnProperty('or')) {
                obj['or'] = ApiClient.convertToType(data['or'], [FundNotationScreenerSearchDataFundComplianceOr]);
            }
        }
        return obj;
    }


}

/**
 * List of conditions representing a combination of compliance properties joined by a logical OR operator.
 * @member {Array.<module:model/FundNotationScreenerSearchDataFundComplianceOr>} or
 */
FundNotationScreenerSearchDataShareClassCompliance.prototype['or'] = undefined;






export default FundNotationScreenerSearchDataShareClassCompliance;

