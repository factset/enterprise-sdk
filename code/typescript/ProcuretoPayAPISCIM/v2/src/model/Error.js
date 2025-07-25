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
 * The Error model module.
 * @module model/Error
 */
class Error {
    /**
     * Constructs a new <code>Error</code>.
     * @alias module:model/Error
     */
    constructor() { 
        
        Error.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Error</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Error} obj Optional instance to populate.
     * @return {module:model/Error} The populated <code>Error</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Error();

            if (data.hasOwnProperty('schemas')) {
                obj['schemas'] = ApiClient.convertToType(data['schemas'], ['String']);
            }
            if (data.hasOwnProperty('scimType')) {
                obj['scimType'] = ApiClient.convertToType(data['scimType'], 'String');
            }
            if (data.hasOwnProperty('detail')) {
                obj['detail'] = ApiClient.convertToType(data['detail'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
        }
        return obj;
    }


}

/**
 * An array containing the standard schema URI used for identifying an error. See RFC 7644 section 3.12.
 * @member {Array.<module:model/Error.SchemasEnum>} schemas
 */
Error.prototype['schemas'] = undefined;

/**
 * @member {module:model/Error.ScimTypeEnum} scimType
 */
Error.prototype['scimType'] = undefined;

/**
 * A detailed human-readable message.
 * @member {String} detail
 */
Error.prototype['detail'] = undefined;

/**
 * HTTP status code.
 * @member {module:model/Error.StatusEnum} status
 */
Error.prototype['status'] = undefined;





/**
 * Allowed values for the <code>schemas</code> property.
 * @enum {String}
 * @readonly
 */
Error['SchemasEnum'] = {

    /**
     * value: "urn:ietf:params:scim:api:messages:2.0:Error"
     * @const
     */
    "urn:ietf:params:scim:api:messages:2.0:Error": "urn:ietf:params:scim:api:messages:2.0:Error"
};


/**
 * Allowed values for the <code>scimType</code> property.
 * @enum {String}
 * @readonly
 */
Error['ScimTypeEnum'] = {

    /**
     * value: "invalidFilter"
     * @const
     */
    "invalidFilter": "invalidFilter",

    /**
     * value: "tooMany"
     * @const
     */
    "tooMany": "tooMany",

    /**
     * value: "uniqueness"
     * @const
     */
    "uniqueness": "uniqueness",

    /**
     * value: "mutability"
     * @const
     */
    "mutability": "mutability",

    /**
     * value: "invalidSyntax"
     * @const
     */
    "invalidSyntax": "invalidSyntax",

    /**
     * value: "invalidPath"
     * @const
     */
    "invalidPath": "invalidPath",

    /**
     * value: "noTarget"
     * @const
     */
    "noTarget": "noTarget",

    /**
     * value: "invalidValue"
     * @const
     */
    "invalidValue": "invalidValue",

    /**
     * value: "invalidVers"
     * @const
     */
    "invalidVers": "invalidVers",

    /**
     * value: "sensitive"
     * @const
     */
    "sensitive": "sensitive"
};


/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
Error['StatusEnum'] = {

    /**
     * value: "307"
     * @const
     */
    "307": "307",

    /**
     * value: "308"
     * @const
     */
    "308": "308",

    /**
     * value: "400"
     * @const
     */
    "400": "400",

    /**
     * value: "401"
     * @const
     */
    "401": "401",

    /**
     * value: "403"
     * @const
     */
    "403": "403",

    /**
     * value: "404"
     * @const
     */
    "404": "404",

    /**
     * value: "409"
     * @const
     */
    "409": "409",

    /**
     * value: "412"
     * @const
     */
    "412": "412",

    /**
     * value: "413"
     * @const
     */
    "413": "413",

    /**
     * value: "500"
     * @const
     */
    "500": "500",

    /**
     * value: "501"
     * @const
     */
    "501": "501"
};



export default Error;

