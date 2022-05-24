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
import InlineResponse2004ShareClassRegistrationCountry from './InlineResponse2004ShareClassRegistrationCountry';
import InlineResponse2006DataPropertiesShareClassMinimumInvestment from './InlineResponse2006DataPropertiesShareClassMinimumInvestment';
import InlineResponse2006DataPropertiesShareClassSavingsPlan from './InlineResponse2006DataPropertiesShareClassSavingsPlan';

/**
 * The InlineResponse2006DataPropertiesShareClass model module.
 * @module model/InlineResponse2006DataPropertiesShareClass
 * @version 0.10.0
 */
class InlineResponse2006DataPropertiesShareClass {
    /**
     * Constructs a new <code>InlineResponse2006DataPropertiesShareClass</code>.
     * Share class properties.
     * @alias module:model/InlineResponse2006DataPropertiesShareClass
     */
    constructor() { 
        
        InlineResponse2006DataPropertiesShareClass.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2006DataPropertiesShareClass</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2006DataPropertiesShareClass} obj Optional instance to populate.
     * @return {module:model/InlineResponse2006DataPropertiesShareClass} The populated <code>InlineResponse2006DataPropertiesShareClass</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2006DataPropertiesShareClass();

            if (data.hasOwnProperty('isMaster')) {
                obj['isMaster'] = ApiClient.convertToType(data['isMaster'], 'Boolean');
            }
            if (data.hasOwnProperty('countryRegistration')) {
                obj['countryRegistration'] = ApiClient.convertToType(data['countryRegistration'], [InlineResponse2004ShareClassRegistrationCountry]);
            }
            if (data.hasOwnProperty('minimumInvestment')) {
                obj['minimumInvestment'] = InlineResponse2006DataPropertiesShareClassMinimumInvestment.constructFromObject(data['minimumInvestment']);
            }
            if (data.hasOwnProperty('savingsPlan')) {
                obj['savingsPlan'] = ApiClient.convertToType(data['savingsPlan'], [InlineResponse2006DataPropertiesShareClassSavingsPlan]);
            }
        }
        return obj;
    }


}

/**
 * If true, the share class is the master share class of the fund. That is, the one that has been created first.
 * @member {Boolean} isMaster
 */
InlineResponse2006DataPropertiesShareClass.prototype['isMaster'] = undefined;

/**
 * List of countries where the share class is registered for trading on a regulated market.
 * @member {Array.<module:model/InlineResponse2004ShareClassRegistrationCountry>} countryRegistration
 */
InlineResponse2006DataPropertiesShareClass.prototype['countryRegistration'] = undefined;

/**
 * @member {module:model/InlineResponse2006DataPropertiesShareClassMinimumInvestment} minimumInvestment
 */
InlineResponse2006DataPropertiesShareClass.prototype['minimumInvestment'] = undefined;

/**
 * Savings plan availability and frequency per country.
 * @member {Array.<module:model/InlineResponse2006DataPropertiesShareClassSavingsPlan>} savingsPlan
 */
InlineResponse2006DataPropertiesShareClass.prototype['savingsPlan'] = undefined;






export default InlineResponse2006DataPropertiesShareClass;
