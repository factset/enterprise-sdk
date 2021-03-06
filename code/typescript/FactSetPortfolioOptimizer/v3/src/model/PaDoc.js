/**
 * FPO API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PaDoc model module.
 * @module model/PaDoc
 */
class PaDoc {
    /**
     * Constructs a new <code>PaDoc</code>.
     * @alias module:model/PaDoc
     * @param id {String} PA document path
     */
    constructor(id) { 
        
        PaDoc.initialize(this, id);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id) { 
        obj['id'] = id;
    }

    /**
     * Constructs a <code>PaDoc</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PaDoc} obj Optional instance to populate.
     * @return {module:model/PaDoc} The populated <code>PaDoc</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PaDoc();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
        }
        return obj;
    }


}

/**
 * PA document path
 * @member {String} id
 */
PaDoc.prototype['id'] = undefined;






export default PaDoc;

