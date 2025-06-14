/**
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
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
import EntityDTO from './EntityDTO';

/**
 * The ReportDefinitionDTO model module.
 * @module model/ReportDefinitionDTO
 */
class ReportDefinitionDTO {
    /**
     * Constructs a new <code>ReportDefinitionDTO</code>.
     * Defines the details of the Report definition.
     * @alias module:model/ReportDefinitionDTO
     */
    constructor() { 
        
        ReportDefinitionDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ReportDefinitionDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ReportDefinitionDTO} obj Optional instance to populate.
     * @return {module:model/ReportDefinitionDTO} The populated <code>ReportDefinitionDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ReportDefinitionDTO();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('releaseTag')) {
                obj['releaseTag'] = ApiClient.convertToType(data['releaseTag'], 'String');
            }
            if (data.hasOwnProperty('entities')) {
                obj['entities'] = ApiClient.convertToType(data['entities'], [EntityDTO]);
            }
        }
        return obj;
    }


}

/**
 * Name of the Report definition.
 * @member {String} name
 */
ReportDefinitionDTO.prototype['name'] = undefined;

/**
 * Code of the Report definition.
 * @member {String} code
 */
ReportDefinitionDTO.prototype['code'] = undefined;

/**
 * Release tag associated with the Report definition.
 * @member {String} releaseTag
 */
ReportDefinitionDTO.prototype['releaseTag'] = undefined;

/**
 * A list of entities associated with the Report definition.
 * @member {Array.<module:model/EntityDTO>} entities
 */
ReportDefinitionDTO.prototype['entities'] = undefined;






export default ReportDefinitionDTO;

