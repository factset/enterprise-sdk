/**
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The SchemaSubAttribute model module.
 * @module model/SchemaSubAttribute
 */
class SchemaSubAttribute {
    /**
     * Constructs a new <code>SchemaSubAttribute</code>.
     * @alias module:model/SchemaSubAttribute
     * @param name {String} The attribute's name.
     * @param type {module:model/SchemaSubAttribute.TypeEnum} The attribute's data type.
     * @param multiValued {Boolean} A Boolean value indicating an attribute's plurality.
     */
    constructor(name, type, multiValued) { 
        
        SchemaSubAttribute.initialize(this, name, type, multiValued);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, type, multiValued) { 
        obj['name'] = name;
        obj['type'] = type;
        obj['multiValued'] = multiValued;
    }

    /**
     * Constructs a <code>SchemaSubAttribute</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SchemaSubAttribute} obj Optional instance to populate.
     * @return {module:model/SchemaSubAttribute} The populated <code>SchemaSubAttribute</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SchemaSubAttribute();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('multiValued')) {
                obj['multiValued'] = ApiClient.convertToType(data['multiValued'], 'Boolean');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('required')) {
                obj['required'] = ApiClient.convertToType(data['required'], 'Boolean');
            }
            if (data.hasOwnProperty('canonicalValues')) {
                obj['canonicalValues'] = ApiClient.convertToType(data['canonicalValues'], ['String']);
            }
            if (data.hasOwnProperty('caseExact')) {
                obj['caseExact'] = ApiClient.convertToType(data['caseExact'], 'Boolean');
            }
            if (data.hasOwnProperty('mutability')) {
                obj['mutability'] = ApiClient.convertToType(data['mutability'], 'String');
            }
            if (data.hasOwnProperty('returned')) {
                obj['returned'] = ApiClient.convertToType(data['returned'], 'String');
            }
            if (data.hasOwnProperty('uniqueness')) {
                obj['uniqueness'] = ApiClient.convertToType(data['uniqueness'], 'String');
            }
            if (data.hasOwnProperty('referenceTypes')) {
                obj['referenceTypes'] = ApiClient.convertToType(data['referenceTypes'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * The attribute's name.
 * @member {String} name
 */
SchemaSubAttribute.prototype['name'] = undefined;

/**
 * The attribute's data type.
 * @member {module:model/SchemaSubAttribute.TypeEnum} type
 */
SchemaSubAttribute.prototype['type'] = undefined;

/**
 * A Boolean value indicating an attribute's plurality.
 * @member {Boolean} multiValued
 */
SchemaSubAttribute.prototype['multiValued'] = undefined;

/**
 * A human-readable description of the attribute.
 * @member {String} description
 */
SchemaSubAttribute.prototype['description'] = undefined;

/**
 * A boolean value indicating whether or not the attribute is required.
 * @member {Boolean} required
 */
SchemaSubAttribute.prototype['required'] = undefined;

/**
 * A collection of canonical values.  When applicable, service providers MUST specify the canonical types, e.g.,  'work', 'home'.
 * @member {Array.<String>} canonicalValues
 */
SchemaSubAttribute.prototype['canonicalValues'] = undefined;

/**
 * A Boolean value indicating whether or not a string attribute is case sensitive.
 * @member {Boolean} caseExact
 */
SchemaSubAttribute.prototype['caseExact'] = undefined;

/**
 * Indicates whether or not an attribute is modifiable.
 * @member {module:model/SchemaSubAttribute.MutabilityEnum} mutability
 */
SchemaSubAttribute.prototype['mutability'] = undefined;

/**
 * Indicates when an attribute is returned in a response (e.g., to a query).
 * @member {module:model/SchemaSubAttribute.ReturnedEnum} returned
 */
SchemaSubAttribute.prototype['returned'] = undefined;

/**
 * Indicates how unique a value must be.
 * @member {module:model/SchemaSubAttribute.UniquenessEnum} uniqueness
 */
SchemaSubAttribute.prototype['uniqueness'] = undefined;

/**
 * Used only with an attribute of type 'reference'.  Specifies a SCIM resourceType that a reference attribute MAY refer to, e.g., 'User'.
 * @member {Array.<String>} referenceTypes
 */
SchemaSubAttribute.prototype['referenceTypes'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
SchemaSubAttribute['TypeEnum'] = {

    /**
     * value: "string"
     * @const
     */
    "string": "string",

    /**
     * value: "boolean"
     * @const
     */
    "boolean": "boolean",

    /**
     * value: "decimal"
     * @const
     */
    "decimal": "decimal",

    /**
     * value: "integer"
     * @const
     */
    "integer": "integer",

    /**
     * value: "dateTime"
     * @const
     */
    "dateTime": "dateTime",

    /**
     * value: "binary"
     * @const
     */
    "binary": "binary",

    /**
     * value: "reference"
     * @const
     */
    "reference": "reference",

    /**
     * value: "complex"
     * @const
     */
    "complex": "complex"
};


/**
 * Allowed values for the <code>mutability</code> property.
 * @enum {String}
 * @readonly
 */
SchemaSubAttribute['MutabilityEnum'] = {

    /**
     * value: "readOnly"
     * @const
     */
    "readOnly": "readOnly",

    /**
     * value: "readWrite"
     * @const
     */
    "readWrite": "readWrite",

    /**
     * value: "immutable"
     * @const
     */
    "immutable": "immutable",

    /**
     * value: "writeOnly"
     * @const
     */
    "writeOnly": "writeOnly"
};


/**
 * Allowed values for the <code>returned</code> property.
 * @enum {String}
 * @readonly
 */
SchemaSubAttribute['ReturnedEnum'] = {

    /**
     * value: "always"
     * @const
     */
    "always": "always",

    /**
     * value: "never"
     * @const
     */
    "never": "never",

    /**
     * value: "default"
     * @const
     */
    "default": "default",

    /**
     * value: "request"
     * @const
     */
    "request": "request"
};


/**
 * Allowed values for the <code>uniqueness</code> property.
 * @enum {String}
 * @readonly
 */
SchemaSubAttribute['UniquenessEnum'] = {

    /**
     * value: "none"
     * @const
     */
    "none": "none",

    /**
     * value: "server"
     * @const
     */
    "server": "server",

    /**
     * value: "global"
     * @const
     */
    "global": "global"
};



export default SchemaSubAttribute;

