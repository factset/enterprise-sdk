/**
 * CTS Data Dictionary API
 * An API for interacting with CTS Data Dictionary.
 *
 * The version of the OpenAPI document: 0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The TableCodeInfo model module.
 * @module model/TableCodeInfo
 */
class TableCodeInfo {
    /**
     * Constructs a new <code>TableCodeInfo</code>.
     * @alias module:model/TableCodeInfo
     */
    constructor() { 
        
        TableCodeInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TableCodeInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TableCodeInfo} obj Optional instance to populate.
     * @return {module:model/TableCodeInfo} The populated <code>TableCodeInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TableCodeInfo();

            if (data.hasOwnProperty('dataItemIsCode')) {
                obj['dataItemIsCode'] = ApiClient.convertToType(data['dataItemIsCode'], 'Boolean');
            }
            if (data.hasOwnProperty('codeFieldId')) {
                obj['codeFieldId'] = ApiClient.convertToType(data['codeFieldId'], 'String');
            }
            if (data.hasOwnProperty('codeString')) {
                obj['codeString'] = ApiClient.convertToType(data['codeString'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Flag indicating if the field is represented as a code in Standard DataFeeds
 * @member {Boolean} dataItemIsCode
 */
TableCodeInfo.prototype['dataItemIsCode'] = undefined;

/**
 * Unique identifier for the code
 * @member {String} codeFieldId
 */
TableCodeInfo.prototype['codeFieldId'] = undefined;

/**
 * String value for the code as it appears in Standard DataFeeds
 * @member {String} codeString
 */
TableCodeInfo.prototype['codeString'] = undefined;






export default TableCodeInfo;
