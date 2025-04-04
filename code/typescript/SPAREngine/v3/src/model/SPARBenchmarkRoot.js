/**
 * Style Performance and Risk Analysis (SPAR) Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import SPARBenchmark from './SPARBenchmark';

/**
 * The SPARBenchmarkRoot model module.
 * @module model/SPARBenchmarkRoot
 */
class SPARBenchmarkRoot {
    /**
     * Constructs a new <code>SPARBenchmarkRoot</code>.
     * @alias module:model/SPARBenchmarkRoot
     * @param data {module:model/SPARBenchmark} 
     */
    constructor(data) { 
        
        SPARBenchmarkRoot.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>SPARBenchmarkRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SPARBenchmarkRoot} obj Optional instance to populate.
     * @return {module:model/SPARBenchmarkRoot} The populated <code>SPARBenchmarkRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SPARBenchmarkRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = SPARBenchmark.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SPARBenchmark} data
 */
SPARBenchmarkRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
SPARBenchmarkRoot.prototype['meta'] = undefined;






export default SPARBenchmarkRoot;

