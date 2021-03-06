/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse200DataIssuer model module.
 * @module model/InlineResponse200DataIssuer
 */
class InlineResponse200DataIssuer {
    /**
     * Constructs a new <code>InlineResponse200DataIssuer</code>.
     * Issuer.
     * @alias module:model/InlineResponse200DataIssuer
     */
    constructor() { 
        
        InlineResponse200DataIssuer.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse200DataIssuer</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse200DataIssuer} obj Optional instance to populate.
     * @return {module:model/InlineResponse200DataIssuer} The populated <code>InlineResponse200DataIssuer</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse200DataIssuer();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Name of the issuer of the ETP. This data is available for all the regions.
 * @member {String} name
 */
InlineResponse200DataIssuer.prototype['name'] = undefined;






export default InlineResponse200DataIssuer;

