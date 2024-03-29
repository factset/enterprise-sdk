/**
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import TransactionTypeTransactionType from './TransactionTypeTransactionType';

/**
 * The TransactionType model module.
 * @module model/TransactionType
 */
class TransactionType {
    /**
     * Constructs a new <code>TransactionType</code>.
     * @alias module:model/TransactionType
     */
    constructor() { 
        
        TransactionType.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TransactionType</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TransactionType} obj Optional instance to populate.
     * @return {module:model/TransactionType} The populated <code>TransactionType</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TransactionType();

            if (data.hasOwnProperty('transactionType')) {
                obj['transactionType'] = TransactionTypeTransactionType.constructFromObject(data['transactionType']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TransactionTypeTransactionType} transactionType
 */
TransactionType.prototype['transactionType'] = undefined;






export default TransactionType;

