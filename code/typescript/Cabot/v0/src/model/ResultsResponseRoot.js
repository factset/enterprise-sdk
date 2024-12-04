/**
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ResultsResponseOptions from './ResultsResponseOptions';

/**
 * The ResultsResponseRoot model module.
 * @module model/ResultsResponseRoot
 */
class ResultsResponseRoot {
    /**
     * Constructs a new <code>ResultsResponseRoot</code>.
     * @alias module:model/ResultsResponseRoot
     */
    constructor() { 
        
        ResultsResponseRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ResultsResponseRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ResultsResponseRoot} obj Optional instance to populate.
     * @return {module:model/ResultsResponseRoot} The populated <code>ResultsResponseRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ResultsResponseRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ResultsResponseOptions.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ResultsResponseOptions} data
 */
ResultsResponseRoot.prototype['data'] = undefined;






export default ResultsResponseRoot;

