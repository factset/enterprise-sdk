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
import PAComponentData from './PAComponentData';

/**
 * The TemplatedPAComponentUpdateParameters model module.
 * @module model/TemplatedPAComponentUpdateParameters
 */
class TemplatedPAComponentUpdateParameters {
    /**
     * Constructs a new <code>TemplatedPAComponentUpdateParameters</code>.
     * @alias module:model/TemplatedPAComponentUpdateParameters
     */
    constructor() { 
        
        TemplatedPAComponentUpdateParameters.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TemplatedPAComponentUpdateParameters</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TemplatedPAComponentUpdateParameters} obj Optional instance to populate.
     * @return {module:model/TemplatedPAComponentUpdateParameters} The populated <code>TemplatedPAComponentUpdateParameters</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TemplatedPAComponentUpdateParameters();

            if (data.hasOwnProperty('parentTemplateId')) {
                obj['parentTemplateId'] = ApiClient.convertToType(data['parentTemplateId'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('componentData')) {
                obj['componentData'] = PAComponentData.constructFromObject(data['componentData']);
            }
        }
        return obj;
    }


}

/**
 * Parent template id
 * @member {String} parentTemplateId
 */
TemplatedPAComponentUpdateParameters.prototype['parentTemplateId'] = undefined;

/**
 * Component description.
 * @member {String} description
 */
TemplatedPAComponentUpdateParameters.prototype['description'] = undefined;

/**
 * @member {module:model/PAComponentData} componentData
 */
TemplatedPAComponentUpdateParameters.prototype['componentData'] = undefined;






export default TemplatedPAComponentUpdateParameters;

