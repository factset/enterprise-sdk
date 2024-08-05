/**
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.26.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import GenerateIdMappingRequestData from './GenerateIdMappingRequestData';

/**
 * The GenerateIdMappingRequestBody model module.
 * @module model/GenerateIdMappingRequestBody
 */
class GenerateIdMappingRequestBody {
    /**
     * Constructs a new <code>GenerateIdMappingRequestBody</code>.
     * Body for requests to generate ID mapping
     * @alias module:model/GenerateIdMappingRequestBody
     * @param data {module:model/GenerateIdMappingRequestData} 
     */
    constructor(data) { 
        
        GenerateIdMappingRequestBody.initialize(this, data);
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
     * Constructs a <code>GenerateIdMappingRequestBody</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GenerateIdMappingRequestBody} obj Optional instance to populate.
     * @return {module:model/GenerateIdMappingRequestBody} The populated <code>GenerateIdMappingRequestBody</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GenerateIdMappingRequestBody();

            if (data.hasOwnProperty('data')) {
                obj['data'] = GenerateIdMappingRequestData.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/GenerateIdMappingRequestData} data
 */
GenerateIdMappingRequestBody.prototype['data'] = undefined;






export default GenerateIdMappingRequestBody;

