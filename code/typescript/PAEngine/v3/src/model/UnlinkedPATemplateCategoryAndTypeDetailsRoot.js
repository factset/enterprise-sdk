/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.15.6
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import UnlinkedPATemplateCategoryAndTypeDetails from './UnlinkedPATemplateCategoryAndTypeDetails';

/**
 * The UnlinkedPATemplateCategoryAndTypeDetailsRoot model module.
 * @module model/UnlinkedPATemplateCategoryAndTypeDetailsRoot
 */
class UnlinkedPATemplateCategoryAndTypeDetailsRoot {
    /**
     * Constructs a new <code>UnlinkedPATemplateCategoryAndTypeDetailsRoot</code>.
     * @alias module:model/UnlinkedPATemplateCategoryAndTypeDetailsRoot
     * @param data {module:model/UnlinkedPATemplateCategoryAndTypeDetails} 
     */
    constructor(data) { 
        
        UnlinkedPATemplateCategoryAndTypeDetailsRoot.initialize(this, data);
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
     * Constructs a <code>UnlinkedPATemplateCategoryAndTypeDetailsRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UnlinkedPATemplateCategoryAndTypeDetailsRoot} obj Optional instance to populate.
     * @return {module:model/UnlinkedPATemplateCategoryAndTypeDetailsRoot} The populated <code>UnlinkedPATemplateCategoryAndTypeDetailsRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UnlinkedPATemplateCategoryAndTypeDetailsRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = UnlinkedPATemplateCategoryAndTypeDetails.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/UnlinkedPATemplateCategoryAndTypeDetails} data
 */
UnlinkedPATemplateCategoryAndTypeDetailsRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
UnlinkedPATemplateCategoryAndTypeDetailsRoot.prototype['meta'] = undefined;






export default UnlinkedPATemplateCategoryAndTypeDetailsRoot;

