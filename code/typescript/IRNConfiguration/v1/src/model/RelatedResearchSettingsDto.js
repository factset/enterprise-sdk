/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The RelatedResearchSettingsDto model module.
 * @module model/RelatedResearchSettingsDto
 */
class RelatedResearchSettingsDto {
    /**
     * Constructs a new <code>RelatedResearchSettingsDto</code>.
     * @alias module:model/RelatedResearchSettingsDto
     */
    constructor() { 
        
        RelatedResearchSettingsDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RelatedResearchSettingsDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RelatedResearchSettingsDto} obj Optional instance to populate.
     * @return {module:model/RelatedResearchSettingsDto} The populated <code>RelatedResearchSettingsDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RelatedResearchSettingsDto();

            if (data.hasOwnProperty('IsHidden')) {
                obj['IsHidden'] = ApiClient.convertToType(data['IsHidden'], 'Boolean');
            }
            if (data.hasOwnProperty('IsMandatory')) {
                obj['IsMandatory'] = ApiClient.convertToType(data['IsMandatory'], 'Boolean');
            }
            if (data.hasOwnProperty('UsePrevious')) {
                obj['UsePrevious'] = ApiClient.convertToType(data['UsePrevious'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {Boolean} IsHidden
 */
RelatedResearchSettingsDto.prototype['IsHidden'] = undefined;

/**
 * @member {Boolean} IsMandatory
 */
RelatedResearchSettingsDto.prototype['IsMandatory'] = undefined;

/**
 * @member {Boolean} UsePrevious
 */
RelatedResearchSettingsDto.prototype['UsePrevious'] = undefined;






export default RelatedResearchSettingsDto;

