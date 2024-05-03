/**
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.12.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CalculationMeta from './CalculationMeta';
import FICalculationParameters from './FICalculationParameters';

/**
 * The FICalculationParametersRoot model module.
 * @module model/FICalculationParametersRoot
 */
class FICalculationParametersRoot {
    /**
     * Constructs a new <code>FICalculationParametersRoot</code>.
     * @alias module:model/FICalculationParametersRoot
     */
    constructor() { 
        
        FICalculationParametersRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FICalculationParametersRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FICalculationParametersRoot} obj Optional instance to populate.
     * @return {module:model/FICalculationParametersRoot} The populated <code>FICalculationParametersRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FICalculationParametersRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = FICalculationParameters.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = CalculationMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/FICalculationParameters} data
 */
FICalculationParametersRoot.prototype['data'] = undefined;

/**
 * @member {module:model/CalculationMeta} meta
 */
FICalculationParametersRoot.prototype['meta'] = undefined;






export default FICalculationParametersRoot;

