/**
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.9.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The FIBankLoans model module.
 * @module model/FIBankLoans
 */
class FIBankLoans {
    /**
     * Constructs a new <code>FIBankLoans</code>.
     * @alias module:model/FIBankLoans
     */
    constructor() { 
        
        FIBankLoans.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FIBankLoans</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FIBankLoans} obj Optional instance to populate.
     * @return {module:model/FIBankLoans} The populated <code>FIBankLoans</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FIBankLoans();

            if (data.hasOwnProperty('ignoreSinkingFund')) {
                obj['ignoreSinkingFund'] = ApiClient.convertToType(data['ignoreSinkingFund'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * Ignore Sinking Fund
 * @member {Boolean} ignoreSinkingFund
 */
FIBankLoans.prototype['ignoreSinkingFund'] = undefined;






export default FIBankLoans;
