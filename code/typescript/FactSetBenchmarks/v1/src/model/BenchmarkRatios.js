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

/**
 * The BenchmarkRatios model module.
 * @module model/BenchmarkRatios
 */
class BenchmarkRatios {
    /**
     * Constructs a new <code>BenchmarkRatios</code>.
     * @alias module:model/BenchmarkRatios
     */
    constructor() { 
        
        BenchmarkRatios.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BenchmarkRatios</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BenchmarkRatios} obj Optional instance to populate.
     * @return {module:model/BenchmarkRatios} The populated <code>BenchmarkRatios</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BenchmarkRatios();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('metric')) {
                obj['metric'] = ApiClient.convertToType(data['metric'], 'String');
            }
            if (data.hasOwnProperty('periodicity')) {
                obj['periodicity'] = ApiClient.convertToType(data['periodicity'], 'String');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet.
 * @member {String} fsymId
 */
BenchmarkRatios.prototype['fsymId'] = undefined;

/**
 * The respective date for values as of the date requested in YYYY-MM-DD format.
 * @member {Date} date
 */
BenchmarkRatios.prototype['date'] = undefined;

/**
 * Proper Name of Index.
 * @member {String} name
 */
BenchmarkRatios.prototype['name'] = undefined;

/**
 * Benchmark Identifier specified in the request.
 * @member {String} requestId
 */
BenchmarkRatios.prototype['requestId'] = undefined;

/**
 * Metric requested
 * @member {String} metric
 */
BenchmarkRatios.prototype['metric'] = undefined;

/**
 * The periodicity submitted in the request.
 * @member {String} periodicity
 */
BenchmarkRatios.prototype['periodicity'] = undefined;

/**
 * The currency submitted in the request.
 * @member {String} currency
 */
BenchmarkRatios.prototype['currency'] = undefined;

/**
 * Ratio value based on the metric requested.
 * @member {Number} value
 */
BenchmarkRatios.prototype['value'] = undefined;






export default BenchmarkRatios;

