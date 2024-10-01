/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.16.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import AccountDirectories from './AccountDirectories';

/**
 * The AccountDirectoriesRoot model module.
 * @module model/AccountDirectoriesRoot
 */
class AccountDirectoriesRoot {
    /**
     * Constructs a new <code>AccountDirectoriesRoot</code>.
     * @alias module:model/AccountDirectoriesRoot
     * @param data {module:model/AccountDirectories} 
     */
    constructor(data) { 
        
        AccountDirectoriesRoot.initialize(this, data);
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
     * Constructs a <code>AccountDirectoriesRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AccountDirectoriesRoot} obj Optional instance to populate.
     * @return {module:model/AccountDirectoriesRoot} The populated <code>AccountDirectoriesRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AccountDirectoriesRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = AccountDirectories.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/AccountDirectories} data
 */
AccountDirectoriesRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
AccountDirectoriesRoot.prototype['meta'] = undefined;






export default AccountDirectoriesRoot;

