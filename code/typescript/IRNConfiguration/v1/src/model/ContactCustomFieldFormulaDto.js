/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ContactCustomFieldFormulaDto model module.
 * @module model/ContactCustomFieldFormulaDto
 */
class ContactCustomFieldFormulaDto {
    /**
     * Constructs a new <code>ContactCustomFieldFormulaDto</code>.
     * @alias module:model/ContactCustomFieldFormulaDto
     */
    constructor() { 
        
        ContactCustomFieldFormulaDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ContactCustomFieldFormulaDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ContactCustomFieldFormulaDto} obj Optional instance to populate.
     * @return {module:model/ContactCustomFieldFormulaDto} The populated <code>ContactCustomFieldFormulaDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ContactCustomFieldFormulaDto();

            if (data.hasOwnProperty('formula')) {
                obj['formula'] = ApiClient.convertToType(data['formula'], 'String');
            }
            if (data.hasOwnProperty('isScreening')) {
                obj['isScreening'] = ApiClient.convertToType(data['isScreening'], 'Boolean');
            }
            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} formula
 */
ContactCustomFieldFormulaDto.prototype['formula'] = undefined;

/**
 * @member {Boolean} isScreening
 * @default false
 */
ContactCustomFieldFormulaDto.prototype['isScreening'] = false;

/**
 * @member {String} symbol
 */
ContactCustomFieldFormulaDto.prototype['symbol'] = undefined;






export default ContactCustomFieldFormulaDto;

