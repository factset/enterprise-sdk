/**
 * Style Performance and Risk Analysis (SPAR) Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.13.4
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ComponentSummary from './ComponentSummary';

/**
 * The ComponentSummaryRoot model module.
 * @module model/ComponentSummaryRoot
 */
class ComponentSummaryRoot {
    /**
     * Constructs a new <code>ComponentSummaryRoot</code>.
     * @alias module:model/ComponentSummaryRoot
     * @param data {Object.<String, module:model/ComponentSummary>} 
     */
    constructor(data) { 
        
        ComponentSummaryRoot.initialize(this, data);
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
     * Constructs a <code>ComponentSummaryRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComponentSummaryRoot} obj Optional instance to populate.
     * @return {module:model/ComponentSummaryRoot} The populated <code>ComponentSummaryRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComponentSummaryRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], {'String': ComponentSummary});
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object.<String, module:model/ComponentSummary>} data
 */
ComponentSummaryRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
ComponentSummaryRoot.prototype['meta'] = undefined;






export default ComponentSummaryRoot;

