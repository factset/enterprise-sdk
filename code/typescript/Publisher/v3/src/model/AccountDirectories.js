/**
 * Publisher API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.12.6
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The AccountDirectories model module.
 * @module model/AccountDirectories
 */
class AccountDirectories {
    /**
     * Constructs a new <code>AccountDirectories</code>.
     * @alias module:model/AccountDirectories
     */
    constructor() { 
        
        AccountDirectories.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AccountDirectories</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AccountDirectories} obj Optional instance to populate.
     * @return {module:model/AccountDirectories} The populated <code>AccountDirectories</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AccountDirectories();

            if (data.hasOwnProperty('accounts')) {
                obj['accounts'] = ApiClient.convertToType(data['accounts'], ['String']);
            }
            if (data.hasOwnProperty('directories')) {
                obj['directories'] = ApiClient.convertToType(data['directories'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * List of account and composite files.
 * @member {Array.<String>} accounts
 */
AccountDirectories.prototype['accounts'] = undefined;

/**
 * List of directories.
 * @member {Array.<String>} directories
 */
AccountDirectories.prototype['directories'] = undefined;






export default AccountDirectories;

