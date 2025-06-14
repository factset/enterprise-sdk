/**
 * FactSet Entity API
 * Using an entity centric data model, FactSet's Entity API provides access to FactSet's complete security and entity level symbology, comprehensive entity reference data, and all of the necessary relationships and connections to create a foundation that tightly correlates disparate sources of information to a master entity identifier. Use this API to quickly understand the full entity structure and related securities.<p><b>Rate limit is set to 10 requests per second</b>.</p> 
 *
 * The version of the OpenAPI document: 1.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import EntityReference from './EntityReference';

/**
 * The EntityReferenceResponse model module.
 * @module model/EntityReferenceResponse
 */
class EntityReferenceResponse {
    /**
     * Constructs a new <code>EntityReferenceResponse</code>.
     * @alias module:model/EntityReferenceResponse
     */
    constructor() { 
        
        EntityReferenceResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EntityReferenceResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EntityReferenceResponse} obj Optional instance to populate.
     * @return {module:model/EntityReferenceResponse} The populated <code>EntityReferenceResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EntityReferenceResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [EntityReference]);
            }
        }
        return obj;
    }


}

/**
 * Array of Entity Reference objects.
 * @member {Array.<module:model/EntityReference>} data
 */
EntityReferenceResponse.prototype['data'] = undefined;






export default EntityReferenceResponse;

