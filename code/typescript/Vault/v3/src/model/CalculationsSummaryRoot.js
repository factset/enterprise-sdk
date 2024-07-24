/**
 * Vault API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.6
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CalculationsSummary from './CalculationsSummary';
import PaginationMeta from './PaginationMeta';

/**
 * The CalculationsSummaryRoot model module.
 * @module model/CalculationsSummaryRoot
 */
class CalculationsSummaryRoot {
    /**
     * Constructs a new <code>CalculationsSummaryRoot</code>.
     * @alias module:model/CalculationsSummaryRoot
     * @param data {Object.<String, module:model/CalculationsSummary>} 
     */
    constructor(data) { 
        
        CalculationsSummaryRoot.initialize(this, data);
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
     * Constructs a <code>CalculationsSummaryRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CalculationsSummaryRoot} obj Optional instance to populate.
     * @return {module:model/CalculationsSummaryRoot} The populated <code>CalculationsSummaryRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CalculationsSummaryRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], {'String': CalculationsSummary});
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = PaginationMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {Object.<String, module:model/CalculationsSummary>} data
 */
CalculationsSummaryRoot.prototype['data'] = undefined;

/**
 * @member {module:model/PaginationMeta} meta
 */
CalculationsSummaryRoot.prototype['meta'] = undefined;






export default CalculationsSummaryRoot;

