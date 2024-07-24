/**
 * Universal Screening API
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 2.0.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ScreenCalcParametersData from './ScreenCalcParametersData';

/**
 * The ScreenCalcParameters model module.
 * @module model/ScreenCalcParameters
 */
class ScreenCalcParameters {
    /**
     * Constructs a new <code>ScreenCalcParameters</code>.
     * Request body to calculate a screen.
     * @alias module:model/ScreenCalcParameters
     * @param data {module:model/ScreenCalcParametersData} 
     */
    constructor(data) { 
        
        ScreenCalcParameters.initialize(this, data);
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
     * Constructs a <code>ScreenCalcParameters</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ScreenCalcParameters} obj Optional instance to populate.
     * @return {module:model/ScreenCalcParameters} The populated <code>ScreenCalcParameters</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ScreenCalcParameters();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ScreenCalcParametersData.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ScreenCalcParametersData} data
 */
ScreenCalcParameters.prototype['data'] = undefined;






export default ScreenCalcParameters;

