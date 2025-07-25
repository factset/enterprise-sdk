/**
 * FactSet Benchmarks API
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.10.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ReturnType from './ReturnType';

/**
 * The IndexSnapshotRequest model module.
 * @module model/IndexSnapshotRequest
 */
class IndexSnapshotRequest {
    /**
     * Constructs a new <code>IndexSnapshotRequest</code>.
     * @alias module:model/IndexSnapshotRequest
     * @param ids {Array.<String>} Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers.
     */
    constructor(ids) { 
        
        IndexSnapshotRequest.initialize(this, ids);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ids) { 
        obj['ids'] = ids;
    }

    /**
     * Constructs a <code>IndexSnapshotRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/IndexSnapshotRequest} obj Optional instance to populate.
     * @return {module:model/IndexSnapshotRequest} The populated <code>IndexSnapshotRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new IndexSnapshotRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'String');
            }
            if (data.hasOwnProperty('returnType')) {
                obj['returnType'] = ReturnType.constructFromObject(data['returnType']);
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('calendar')) {
                obj['calendar'] = ApiClient.convertToType(data['calendar'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers.
 * @member {Array.<String>} ids
 */
IndexSnapshotRequest.prototype['ids'] = undefined;

/**
 * Date of holding expressed in YYYY-MM-DD format.
 * @member {String} date
 */
IndexSnapshotRequest.prototype['date'] = undefined;

/**
 * @member {module:model/ReturnType} returnType
 */
IndexSnapshotRequest.prototype['returnType'] = undefined;

/**
 * Currency for response.
 * @member {String} currency
 */
IndexSnapshotRequest.prototype['currency'] = undefined;

/**
 * Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays.
 * @member {String} calendar
 * @default 'FIVEDAY'
 */
IndexSnapshotRequest.prototype['calendar'] = 'FIVEDAY';






export default IndexSnapshotRequest;

