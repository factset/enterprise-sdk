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
import SPARAccounts from './SPARAccounts';

/**
 * The SPARAccountsRoot model module.
 * @module model/SPARAccountsRoot
 */
class SPARAccountsRoot {
    /**
     * Constructs a new <code>SPARAccountsRoot</code>.
     * @alias module:model/SPARAccountsRoot
     * @param data {module:model/SPARAccounts} 
     */
    constructor(data) { 
        
        SPARAccountsRoot.initialize(this, data);
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
     * Constructs a <code>SPARAccountsRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SPARAccountsRoot} obj Optional instance to populate.
     * @return {module:model/SPARAccountsRoot} The populated <code>SPARAccountsRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SPARAccountsRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = SPARAccounts.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SPARAccounts} data
 */
SPARAccountsRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
SPARAccountsRoot.prototype['meta'] = undefined;






export default SPARAccountsRoot;

