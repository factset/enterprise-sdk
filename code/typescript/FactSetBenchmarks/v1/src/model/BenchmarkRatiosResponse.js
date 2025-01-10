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
import BenchmarkRatios from './BenchmarkRatios';

/**
 * The BenchmarkRatiosResponse model module.
 * @module model/BenchmarkRatiosResponse
 */
class BenchmarkRatiosResponse {
    /**
     * Constructs a new <code>BenchmarkRatiosResponse</code>.
     * @alias module:model/BenchmarkRatiosResponse
     */
    constructor() { 
        
        BenchmarkRatiosResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BenchmarkRatiosResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BenchmarkRatiosResponse} obj Optional instance to populate.
     * @return {module:model/BenchmarkRatiosResponse} The populated <code>BenchmarkRatiosResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BenchmarkRatiosResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [BenchmarkRatios]);
            }
        }
        return obj;
    }


}

/**
 * Array of Index History response objects. 
 * @member {Array.<module:model/BenchmarkRatios>} data
 */
BenchmarkRatiosResponse.prototype['data'] = undefined;






export default BenchmarkRatiosResponse;

