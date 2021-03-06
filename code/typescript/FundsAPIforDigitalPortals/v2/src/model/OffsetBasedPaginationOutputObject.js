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

/**
 * The OffsetBasedPaginationOutputObject model module.
 * @module model/OffsetBasedPaginationOutputObject
 */
class OffsetBasedPaginationOutputObject {
    /**
     * Constructs a new <code>OffsetBasedPaginationOutputObject</code>.
     * Pagination attributes for the offset-based pagination strategy.
     * @alias module:model/OffsetBasedPaginationOutputObject
     * @param total {Number} Total number of entries in the result set.
     * @param isEstimatedTotal {Boolean} Flag indicating that the value of \"total\" is estimated.
     */
    constructor(total, isEstimatedTotal) { 
        
        OffsetBasedPaginationOutputObject.initialize(this, total, isEstimatedTotal);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, total, isEstimatedTotal) { 
        obj['total'] = total;
        obj['isEstimatedTotal'] = isEstimatedTotal;
    }

    /**
     * Constructs a <code>OffsetBasedPaginationOutputObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OffsetBasedPaginationOutputObject} obj Optional instance to populate.
     * @return {module:model/OffsetBasedPaginationOutputObject} The populated <code>OffsetBasedPaginationOutputObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OffsetBasedPaginationOutputObject();

            if (data.hasOwnProperty('total')) {
                obj['total'] = ApiClient.convertToType(data['total'], 'Number');
            }
            if (data.hasOwnProperty('isEstimatedTotal')) {
                obj['isEstimatedTotal'] = ApiClient.convertToType(data['isEstimatedTotal'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * Total number of entries in the result set.
 * @member {Number} total
 */
OffsetBasedPaginationOutputObject.prototype['total'] = undefined;

/**
 * Flag indicating that the value of \"total\" is estimated.
 * @member {Boolean} isEstimatedTotal
 */
OffsetBasedPaginationOutputObject.prototype['isEstimatedTotal'] = undefined;






export default OffsetBasedPaginationOutputObject;

