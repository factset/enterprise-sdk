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
import InlineResponse2004ShareClassFee12b from './InlineResponse2004ShareClassFee12b';
import InlineResponse2004ShareClassFeeAdministration from './InlineResponse2004ShareClassFeeAdministration';
import InlineResponse2004ShareClassFeeAllIn from './InlineResponse2004ShareClassFeeAllIn';
import InlineResponse2004ShareClassFeeCustodianBank from './InlineResponse2004ShareClassFeeCustodianBank';
import InlineResponse2004ShareClassFeeDistribution from './InlineResponse2004ShareClassFeeDistribution';
import InlineResponse2004ShareClassFeeHandling from './InlineResponse2004ShareClassFeeHandling';
import InlineResponse2004ShareClassFeeInitial from './InlineResponse2004ShareClassFeeInitial';
import InlineResponse2004ShareClassFeeManagement from './InlineResponse2004ShareClassFeeManagement';
import InlineResponse2004ShareClassFeeOngoing from './InlineResponse2004ShareClassFeeOngoing';
import InlineResponse2004ShareClassFeePerformance from './InlineResponse2004ShareClassFeePerformance';
import InlineResponse2004ShareClassFeeRedemption from './InlineResponse2004ShareClassFeeRedemption';
import InlineResponse2004ShareClassFeeSwitching from './InlineResponse2004ShareClassFeeSwitching';

/**
 * The InlineResponse2004ShareClassFee model module.
 * @module model/InlineResponse2004ShareClassFee
 */
class InlineResponse2004ShareClassFee {
    /**
     * Constructs a new <code>InlineResponse2004ShareClassFee</code>.
     * Fees of the share class.
     * @alias module:model/InlineResponse2004ShareClassFee
     */
    constructor() { 
        
        InlineResponse2004ShareClassFee.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004ShareClassFee</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004ShareClassFee} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004ShareClassFee} The populated <code>InlineResponse2004ShareClassFee</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004ShareClassFee();

            if (data.hasOwnProperty('ongoing')) {
                obj['ongoing'] = InlineResponse2004ShareClassFeeOngoing.constructFromObject(data['ongoing']);
            }
            if (data.hasOwnProperty('allIn')) {
                obj['allIn'] = InlineResponse2004ShareClassFeeAllIn.constructFromObject(data['allIn']);
            }
            if (data.hasOwnProperty('performance')) {
                obj['performance'] = InlineResponse2004ShareClassFeePerformance.constructFromObject(data['performance']);
            }
            if (data.hasOwnProperty('management')) {
                obj['management'] = InlineResponse2004ShareClassFeeManagement.constructFromObject(data['management']);
            }
            if (data.hasOwnProperty('initial')) {
                obj['initial'] = InlineResponse2004ShareClassFeeInitial.constructFromObject(data['initial']);
            }
            if (data.hasOwnProperty('distribution')) {
                obj['distribution'] = InlineResponse2004ShareClassFeeDistribution.constructFromObject(data['distribution']);
            }
            if (data.hasOwnProperty('administration')) {
                obj['administration'] = InlineResponse2004ShareClassFeeAdministration.constructFromObject(data['administration']);
            }
            if (data.hasOwnProperty('handling')) {
                obj['handling'] = InlineResponse2004ShareClassFeeHandling.constructFromObject(data['handling']);
            }
            if (data.hasOwnProperty('redemption')) {
                obj['redemption'] = InlineResponse2004ShareClassFeeRedemption.constructFromObject(data['redemption']);
            }
            if (data.hasOwnProperty('custodianBank')) {
                obj['custodianBank'] = InlineResponse2004ShareClassFeeCustodianBank.constructFromObject(data['custodianBank']);
            }
            if (data.hasOwnProperty('12b')) {
                obj['12b'] = InlineResponse2004ShareClassFee12b.constructFromObject(data['12b']);
            }
            if (data.hasOwnProperty('switching')) {
                obj['switching'] = InlineResponse2004ShareClassFeeSwitching.constructFromObject(data['switching']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2004ShareClassFeeOngoing} ongoing
 */
InlineResponse2004ShareClassFee.prototype['ongoing'] = undefined;

/**
 * @member {module:model/InlineResponse2004ShareClassFeeAllIn} allIn
 */
InlineResponse2004ShareClassFee.prototype['allIn'] = undefined;

/**
 * @member {module:model/InlineResponse2004ShareClassFeePerformance} performance
 */
InlineResponse2004ShareClassFee.prototype['performance'] = undefined;

/**
 * @member {module:model/InlineResponse2004ShareClassFeeManagement} management
 */
InlineResponse2004ShareClassFee.prototype['management'] = undefined;

/**
 * @member {module:model/InlineResponse2004ShareClassFeeInitial} initial
 */
InlineResponse2004ShareClassFee.prototype['initial'] = undefined;

/**
 * @member {module:model/InlineResponse2004ShareClassFeeDistribution} distribution
 */
InlineResponse2004ShareClassFee.prototype['distribution'] = undefined;

/**
 * @member {module:model/InlineResponse2004ShareClassFeeAdministration} administration
 */
InlineResponse2004ShareClassFee.prototype['administration'] = undefined;

/**
 * @member {module:model/InlineResponse2004ShareClassFeeHandling} handling
 */
InlineResponse2004ShareClassFee.prototype['handling'] = undefined;

/**
 * @member {module:model/InlineResponse2004ShareClassFeeRedemption} redemption
 */
InlineResponse2004ShareClassFee.prototype['redemption'] = undefined;

/**
 * @member {module:model/InlineResponse2004ShareClassFeeCustodianBank} custodianBank
 */
InlineResponse2004ShareClassFee.prototype['custodianBank'] = undefined;

/**
 * @member {module:model/InlineResponse2004ShareClassFee12b} 12b
 */
InlineResponse2004ShareClassFee.prototype['12b'] = undefined;

/**
 * @member {module:model/InlineResponse2004ShareClassFeeSwitching} switching
 */
InlineResponse2004ShareClassFee.prototype['switching'] = undefined;






export default InlineResponse2004ShareClassFee;

