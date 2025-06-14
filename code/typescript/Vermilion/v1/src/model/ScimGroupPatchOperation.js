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
import ScimGroupPatchOperationValue from './ScimGroupPatchOperationValue';

/**
 * The ScimGroupPatchOperation model module.
 * @module model/ScimGroupPatchOperation
 */
class ScimGroupPatchOperation {
    /**
     * Constructs a new <code>ScimGroupPatchOperation</code>.
     * Patch operation to modify a group&#39;s attributes. It defines the action to take, the attribute to modify, and the new value.
     * @alias module:model/ScimGroupPatchOperation
     */
    constructor() { 
        
        ScimGroupPatchOperation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ScimGroupPatchOperation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ScimGroupPatchOperation} obj Optional instance to populate.
     * @return {module:model/ScimGroupPatchOperation} The populated <code>ScimGroupPatchOperation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ScimGroupPatchOperation();

            if (data.hasOwnProperty('op')) {
                obj['op'] = ApiClient.convertToType(data['op'], 'String');
            }
            if (data.hasOwnProperty('path')) {
                obj['path'] = ApiClient.convertToType(data['path'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ScimGroupPatchOperationValue.constructFromObject(data['value']);
            }
        }
        return obj;
    }


}

/**
 * Action to perform on the group attribute.
 * @member {String} op
 */
ScimGroupPatchOperation.prototype['op'] = undefined;

/**
 * The group/role attribute path to modify.
 * @member {String} path
 */
ScimGroupPatchOperation.prototype['path'] = undefined;

/**
 * @member {module:model/ScimGroupPatchOperationValue} value
 */
ScimGroupPatchOperation.prototype['value'] = undefined;






export default ScimGroupPatchOperation;

