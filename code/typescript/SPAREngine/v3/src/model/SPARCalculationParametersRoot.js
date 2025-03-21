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
import CalculationMeta from './CalculationMeta';
import SPARCalculationParameters from './SPARCalculationParameters';

/**
 * The SPARCalculationParametersRoot model module.
 * @module model/SPARCalculationParametersRoot
 */
class SPARCalculationParametersRoot {
    /**
     * Constructs a new <code>SPARCalculationParametersRoot</code>.
     * @alias module:model/SPARCalculationParametersRoot
     */
    constructor() { 
        
        SPARCalculationParametersRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SPARCalculationParametersRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SPARCalculationParametersRoot} obj Optional instance to populate.
     * @return {module:model/SPARCalculationParametersRoot} The populated <code>SPARCalculationParametersRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SPARCalculationParametersRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], {'String': SPARCalculationParameters});
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = CalculationMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * List of calculation parameters.
 * @member {Object.<String, module:model/SPARCalculationParameters>} data
 */
SPARCalculationParametersRoot.prototype['data'] = undefined;

/**
 * @member {module:model/CalculationMeta} meta
 */
SPARCalculationParametersRoot.prototype['meta'] = undefined;






export default SPARCalculationParametersRoot;

