/**
 * Company Logo API For Digital Portals
 * Consume FactSet-collected company logos through an API that seamlessly integrates with company fundamentals and estimates data (listed equities data available via the stocks API), quotes, time series, and other Functional APIs.
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
 * The OffsetBasedPaginationOutputObjectWithoutTotal model module.
 * @module model/OffsetBasedPaginationOutputObjectWithoutTotal
 */
class OffsetBasedPaginationOutputObjectWithoutTotal {
    /**
     * Constructs a new <code>OffsetBasedPaginationOutputObjectWithoutTotal</code>.
     * Pagination attributes for the offset-based pagination strategy; a total element count is not supported.
     * @alias module:model/OffsetBasedPaginationOutputObjectWithoutTotal
     * @param hasNext {Boolean} Flag indicating that a subsequent request with the same parameters, except that the parameter `pagination.offset` is incremented by `pagination.limit`, would yield additional results.
     */
    constructor(hasNext) { 
        
        OffsetBasedPaginationOutputObjectWithoutTotal.initialize(this, hasNext);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, hasNext) { 
        obj['hasNext'] = hasNext;
    }

    /**
     * Constructs a <code>OffsetBasedPaginationOutputObjectWithoutTotal</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OffsetBasedPaginationOutputObjectWithoutTotal} obj Optional instance to populate.
     * @return {module:model/OffsetBasedPaginationOutputObjectWithoutTotal} The populated <code>OffsetBasedPaginationOutputObjectWithoutTotal</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OffsetBasedPaginationOutputObjectWithoutTotal();

            if (data.hasOwnProperty('hasNext')) {
                obj['hasNext'] = ApiClient.convertToType(data['hasNext'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * Flag indicating that a subsequent request with the same parameters, except that the parameter `pagination.offset` is incremented by `pagination.limit`, would yield additional results.
 * @member {Boolean} hasNext
 */
OffsetBasedPaginationOutputObjectWithoutTotal.prototype['hasNext'] = undefined;






export default OffsetBasedPaginationOutputObjectWithoutTotal;

