/**
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import SchemaSubAttributes from './SchemaSubAttributes';

/**
 * The SchemaAttributes model module.
 * @module model/SchemaAttributes
 */
class SchemaAttributes {
    /**
     * Constructs a new <code>SchemaAttributes</code>.
     * @alias module:model/SchemaAttributes
     * @param name {String} The attribute's name.
     * @param type {String} The attribute's data type. Valid values include 'string', 'complex', 'boolean', 'decimal', 'integer', 'dateTime', 'reference'.
     * @param multiValued {Boolean} A Boolean value indicating an attribute's plurality.
     */
    constructor(name, type, multiValued) { 
        
        SchemaAttributes.initialize(this, name, type, multiValued);
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
     * Constructs a <code>SchemaAttributes</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SchemaAttributes} obj Optional instance to populate.
     * @return {module:model/SchemaAttributes} The populated <code>SchemaAttributes</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SchemaAttributes();

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
            if (data.hasOwnProperty('subAttributes')) {
                obj['subAttributes'] = ApiClient.convertToType(data['subAttributes'], [SchemaSubAttributes]);
            }
        }
        return obj;
    }


}

/**
 * The attribute's name.
 * @member {String} name
 */
SchemaAttributes.prototype['name'] = undefined;

/**
 * The attribute's data type. Valid values include 'string', 'complex', 'boolean', 'decimal', 'integer', 'dateTime', 'reference'.
 * @member {String} type
 */
SchemaAttributes.prototype['type'] = undefined;

/**
 * A Boolean value indicating an attribute's plurality.
 * @member {Boolean} multiValued
 */
SchemaAttributes.prototype['multiValued'] = undefined;

/**
 * A human-readable description of the attribute.
 * @member {String} description
 */
SchemaAttributes.prototype['description'] = undefined;

/**
 * A boolean value indicating whether or not the attribute is required.
 * @member {Boolean} required
 */
SchemaAttributes.prototype['required'] = undefined;

/**
 * A collection of canonical values.  When applicable, service providers MUST specify the canonical types, e.g.,  'work', 'home'.
 * @member {Array.<String>} canonicalValues
 */
SchemaAttributes.prototype['canonicalValues'] = undefined;

/**
 * A Boolean value indicating whether or not a string attribute is case sensitive.
 * @member {Boolean} caseExact
 */
SchemaAttributes.prototype['caseExact'] = undefined;

/**
 * Indicates whether or not an attribute is modifiable.
 * @member {String} mutability
 */
SchemaAttributes.prototype['mutability'] = undefined;

/**
 * Indicates when an attribute is returned in a response (e.g., to a query).
 * @member {String} returned
 */
SchemaAttributes.prototype['returned'] = undefined;

/**
 * Indicates how unique a value must be.
 * @member {String} uniqueness
 */
SchemaAttributes.prototype['uniqueness'] = undefined;

/**
 * Used only with an attribute of type 'reference'.  Specifies a SCIM resourceType that a reference attribute MAY refer to, e.g., 'User'.
 * @member {Array.<String>} referenceTypes
 */
SchemaAttributes.prototype['referenceTypes'] = undefined;

/**
 * Used to define the sub-attributes of a complex attribute.
 * @member {Array.<module:model/SchemaSubAttributes>} subAttributes
 */
SchemaAttributes.prototype['subAttributes'] = undefined;






export default SchemaAttributes;

