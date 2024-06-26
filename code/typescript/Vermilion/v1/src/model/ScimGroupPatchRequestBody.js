/**
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
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
import ScimGroupPatchOperation from './ScimGroupPatchOperation';

/**
 * The ScimGroupPatchRequestBody model module.
 * @module model/ScimGroupPatchRequestBody
 */
class ScimGroupPatchRequestBody {
    /**
     * Constructs a new <code>ScimGroupPatchRequestBody</code>.
     * @alias module:model/ScimGroupPatchRequestBody
     */
    constructor() { 
        
        ScimGroupPatchRequestBody.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ScimGroupPatchRequestBody</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ScimGroupPatchRequestBody} obj Optional instance to populate.
     * @return {module:model/ScimGroupPatchRequestBody} The populated <code>ScimGroupPatchRequestBody</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ScimGroupPatchRequestBody();

            if (data.hasOwnProperty('schemas')) {
                obj['schemas'] = ApiClient.convertToType(data['schemas'], ['String']);
            }
            if (data.hasOwnProperty('Operations')) {
                obj['Operations'] = ApiClient.convertToType(data['Operations'], [ScimGroupPatchOperation]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<String>} schemas
 */
ScimGroupPatchRequestBody.prototype['schemas'] = undefined;

/**
 * @member {Array.<module:model/ScimGroupPatchOperation>} Operations
 */
ScimGroupPatchRequestBody.prototype['Operations'] = undefined;






export default ScimGroupPatchRequestBody;

