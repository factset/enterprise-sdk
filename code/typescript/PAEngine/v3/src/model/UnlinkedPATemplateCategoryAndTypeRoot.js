/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.16.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import UnlinkedPATemplateCategoryAndType from './UnlinkedPATemplateCategoryAndType';

/**
 * The UnlinkedPATemplateCategoryAndTypeRoot model module.
 * @module model/UnlinkedPATemplateCategoryAndTypeRoot
 */
class UnlinkedPATemplateCategoryAndTypeRoot {
    /**
     * Constructs a new <code>UnlinkedPATemplateCategoryAndTypeRoot</code>.
     * @alias module:model/UnlinkedPATemplateCategoryAndTypeRoot
     * @param data {Object.<String, module:model/UnlinkedPATemplateCategoryAndType>} 
     */
    constructor(data) { 
        
        UnlinkedPATemplateCategoryAndTypeRoot.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>UnlinkedPATemplateCategoryAndTypeRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UnlinkedPATemplateCategoryAndTypeRoot} obj Optional instance to populate.
     * @return {module:model/UnlinkedPATemplateCategoryAndTypeRoot} The populated <code>UnlinkedPATemplateCategoryAndTypeRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UnlinkedPATemplateCategoryAndTypeRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], {'String': UnlinkedPATemplateCategoryAndType});
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object.<String, module:model/UnlinkedPATemplateCategoryAndType>} data
 */
UnlinkedPATemplateCategoryAndTypeRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
UnlinkedPATemplateCategoryAndTypeRoot.prototype['meta'] = undefined;






export default UnlinkedPATemplateCategoryAndTypeRoot;

