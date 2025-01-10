/**
 * FactSet Benchmarks API
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.9.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import FixedIncomeBenchmarkConstituent from './FixedIncomeBenchmarkConstituent';

/**
 * The FixedIncomeBenchmarkConstituentsResponse model module.
 * @module model/FixedIncomeBenchmarkConstituentsResponse
 */
class FixedIncomeBenchmarkConstituentsResponse {
    /**
     * Constructs a new <code>FixedIncomeBenchmarkConstituentsResponse</code>.
     * @alias module:model/FixedIncomeBenchmarkConstituentsResponse
     */
    constructor() { 
        
        FixedIncomeBenchmarkConstituentsResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FixedIncomeBenchmarkConstituentsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FixedIncomeBenchmarkConstituentsResponse} obj Optional instance to populate.
     * @return {module:model/FixedIncomeBenchmarkConstituentsResponse} The populated <code>FixedIncomeBenchmarkConstituentsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FixedIncomeBenchmarkConstituentsResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [FixedIncomeBenchmarkConstituent]);
            }
        }
        return obj;
    }


}

/**
 * Array of metric objects representing the metrics that can be requested from the estimates APIs. 
 * @member {Array.<module:model/FixedIncomeBenchmarkConstituent>} data
 */
FixedIncomeBenchmarkConstituentsResponse.prototype['data'] = undefined;






export default FixedIncomeBenchmarkConstituentsResponse;

