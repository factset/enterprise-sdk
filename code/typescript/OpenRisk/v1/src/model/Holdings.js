/**
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.24.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Holding from './Holding';

/**
 * The Holdings model module.
 * @module model/Holdings
 */
class Holdings {
    /**
     * Constructs a new <code>Holdings</code>.
     * All security holdings which can include a &#39;portfolio&#39;, a &#39;benchmark&#39;, and a total &#39;market&#39; portfolio.
     * @alias module:model/Holdings
     * @param portfolio {module:model/Holding} 
     */
    constructor(portfolio) { 
        
        Holdings.initialize(this, portfolio);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, portfolio) { 
        obj['portfolio'] = portfolio;
    }

    /**
     * Constructs a <code>Holdings</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Holdings} obj Optional instance to populate.
     * @return {module:model/Holdings} The populated <code>Holdings</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Holdings();

            if (data.hasOwnProperty('portfolio')) {
                obj['portfolio'] = Holding.constructFromObject(data['portfolio']);
            }
            if (data.hasOwnProperty('benchmark')) {
                obj['benchmark'] = Holding.constructFromObject(data['benchmark']);
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = Holding.constructFromObject(data['market']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/Holding} portfolio
 */
Holdings.prototype['portfolio'] = undefined;

/**
 * @member {module:model/Holding} benchmark
 */
Holdings.prototype['benchmark'] = undefined;

/**
 * @member {module:model/Holding} market
 */
Holdings.prototype['market'] = undefined;






export default Holdings;

