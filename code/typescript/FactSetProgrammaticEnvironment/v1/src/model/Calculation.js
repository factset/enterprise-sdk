/**
 * FPE API
 * FactSet Programmatic Environment (FPE) API is an API for users to interact with FPE programmatically, streamlining path from research to production.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Calculation model module.
 * @module model/Calculation
 */
class Calculation {
    /**
     * Constructs a new <code>Calculation</code>.
     * @alias module:model/Calculation
     */
    constructor() { 
        
        Calculation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Calculation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Calculation} obj Optional instance to populate.
     * @return {module:model/Calculation} The populated <code>Calculation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Calculation();

            if (data.hasOwnProperty('script')) {
                obj['script'] = ApiClient.convertToType(data['script'], 'String');
            }
            if (data.hasOwnProperty('notebook')) {
                obj['notebook'] = ApiClient.convertToType(data['notebook'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The python script that will be executed
 * @member {String} script
 */
Calculation.prototype['script'] = undefined;

/**
 * Notebook file to be executed. Only notebooks in the Client directory are currently supported.
 * @member {String} notebook
 */
Calculation.prototype['notebook'] = undefined;






export default Calculation;

