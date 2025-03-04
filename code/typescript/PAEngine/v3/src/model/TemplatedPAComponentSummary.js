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

/**
 * The TemplatedPAComponentSummary model module.
 * @module model/TemplatedPAComponentSummary
 */
class TemplatedPAComponentSummary {
    /**
     * Constructs a new <code>TemplatedPAComponentSummary</code>.
     * @alias module:model/TemplatedPAComponentSummary
     */
    constructor() { 
        
        TemplatedPAComponentSummary.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TemplatedPAComponentSummary</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TemplatedPAComponentSummary} obj Optional instance to populate.
     * @return {module:model/TemplatedPAComponentSummary} The populated <code>TemplatedPAComponentSummary</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TemplatedPAComponentSummary();

            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('parentTemplateId')) {
                obj['parentTemplateId'] = ApiClient.convertToType(data['parentTemplateId'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} description
 */
TemplatedPAComponentSummary.prototype['description'] = undefined;

/**
 * @member {String} name
 */
TemplatedPAComponentSummary.prototype['name'] = undefined;

/**
 * @member {String} parentTemplateId
 */
TemplatedPAComponentSummary.prototype['parentTemplateId'] = undefined;

/**
 * @member {String} type
 */
TemplatedPAComponentSummary.prototype['type'] = undefined;






export default TemplatedPAComponentSummary;

