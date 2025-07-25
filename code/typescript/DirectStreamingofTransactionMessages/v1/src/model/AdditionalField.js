/**
 * dsotm API
 * Allow clients to send transactions data to FactSet.
 *
 * The version of the OpenAPI document: 1.9.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The AdditionalField model module.
 * @module model/AdditionalField
 */
class AdditionalField {
    /**
     * Constructs a new <code>AdditionalField</code>.
     * Defines an ofdb field and value to be persisted
     * @alias module:model/AdditionalField
     * @param name {String} Name of the ofdb field
     * @param type {module:model/AdditionalField.TypeEnum} Data type of the ofdb field
     */
    constructor(name, type) { 
        
        AdditionalField.initialize(this, name, type);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, type) { 
        obj['name'] = name;
        obj['type'] = type;
    }

    /**
     * Constructs a <code>AdditionalField</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AdditionalField} obj Optional instance to populate.
     * @return {module:model/AdditionalField} The populated <code>AdditionalField</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AdditionalField();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Name of the ofdb field
 * @member {String} name
 */
AdditionalField.prototype['name'] = undefined;

/**
 * Data type of the ofdb field
 * @member {module:model/AdditionalField.TypeEnum} type
 */
AdditionalField.prototype['type'] = undefined;

/**
 * Value of the ofdb field
 * @member {String} value
 */
AdditionalField.prototype['value'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
AdditionalField['TypeEnum'] = {

    /**
     * value: "string"
     * @const
     */
    "string": "string",

    /**
     * value: "double"
     * @const
     */
    "double": "double",

    /**
     * value: "int"
     * @const
     */
    "int": "int"
};



export default AdditionalField;

