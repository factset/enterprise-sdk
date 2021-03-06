/**
 * PA Engine API
 * Allow clients to fetch PA Engine Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ComponentAccount model module.
 * @module model/ComponentAccount
 */
class ComponentAccount {
    /**
     * Constructs a new <code>ComponentAccount</code>.
     * @alias module:model/ComponentAccount
     */
    constructor() { 
        
        ComponentAccount.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComponentAccount</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComponentAccount} obj Optional instance to populate.
     * @return {module:model/ComponentAccount} The populated <code>ComponentAccount</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComponentAccount();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('holdingsmode')) {
                obj['holdingsmode'] = ApiClient.convertToType(data['holdingsmode'], 'String');
            }
        }
        return obj;
    }


}

/**
 * User's FactSet account path OR a benchmark id.
 * @member {String} id
 */
ComponentAccount.prototype['id'] = undefined;

/**
 * User's FactSet account path OR a benchmark name.
 * @member {String} name
 */
ComponentAccount.prototype['name'] = undefined;

/**
 * Holdings Mode.
 * @member {String} holdingsmode
 */
ComponentAccount.prototype['holdingsmode'] = undefined;






export default ComponentAccount;

