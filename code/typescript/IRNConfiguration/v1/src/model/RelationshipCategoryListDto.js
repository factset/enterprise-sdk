/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
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

/**
 * The RelationshipCategoryListDto model module.
 * @module model/RelationshipCategoryListDto
 */
class RelationshipCategoryListDto {
    /**
     * Constructs a new <code>RelationshipCategoryListDto</code>.
     * @alias module:model/RelationshipCategoryListDto
     * @param ids {Array.<String>} 
     */
    constructor(ids) { 
        
        RelationshipCategoryListDto.initialize(this, ids);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ids) { 
        obj['ids'] = ids;
    }

    /**
     * Constructs a <code>RelationshipCategoryListDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RelationshipCategoryListDto} obj Optional instance to populate.
     * @return {module:model/RelationshipCategoryListDto} The populated <code>RelationshipCategoryListDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RelationshipCategoryListDto();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<String>} ids
 */
RelationshipCategoryListDto.prototype['ids'] = undefined;






export default RelationshipCategoryListDto;

