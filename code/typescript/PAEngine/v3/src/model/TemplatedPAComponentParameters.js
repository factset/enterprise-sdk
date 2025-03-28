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
 * The TemplatedPAComponentParameters model module.
 * @module model/TemplatedPAComponentParameters
 */
class TemplatedPAComponentParameters {
    /**
     * Constructs a new <code>TemplatedPAComponentParameters</code>.
     * @alias module:model/TemplatedPAComponentParameters
     * @param directory {String} Directory to create templated components
     * @param parentTemplateId {String} Parent template id
     */
    constructor(directory, parentTemplateId) { 
        
        TemplatedPAComponentParameters.initialize(this, directory, parentTemplateId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, directory, parentTemplateId) { 
        obj['directory'] = directory;
        obj['parentTemplateId'] = parentTemplateId;
    }

    /**
     * Constructs a <code>TemplatedPAComponentParameters</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TemplatedPAComponentParameters} obj Optional instance to populate.
     * @return {module:model/TemplatedPAComponentParameters} The populated <code>TemplatedPAComponentParameters</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TemplatedPAComponentParameters();

            if (data.hasOwnProperty('directory')) {
                obj['directory'] = ApiClient.convertToType(data['directory'], 'String');
            }
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
 * Directory to create templated components
 * @member {String} directory
 */
TemplatedPAComponentParameters.prototype['directory'] = undefined;

/**
 * Parent template id
 * @member {String} parentTemplateId
 */
TemplatedPAComponentParameters.prototype['parentTemplateId'] = undefined;

/**
 * Component description.
 * @member {String} description
 */
TemplatedPAComponentParameters.prototype['description'] = undefined;

/**
 * @member {module:model/PAComponentData} componentData
 */
TemplatedPAComponentParameters.prototype['componentData'] = undefined;






export default TemplatedPAComponentParameters;

