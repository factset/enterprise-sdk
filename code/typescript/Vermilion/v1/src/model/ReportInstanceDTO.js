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
import ReportRevisionDTO from './ReportRevisionDTO';

/**
 * The ReportInstanceDTO model module.
 * @module model/ReportInstanceDTO
 */
class ReportInstanceDTO {
    /**
     * Constructs a new <code>ReportInstanceDTO</code>.
     * Details of the Report instance.
     * @alias module:model/ReportInstanceDTO
     */
    constructor() { 
        
        ReportInstanceDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ReportInstanceDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ReportInstanceDTO} obj Optional instance to populate.
     * @return {module:model/ReportInstanceDTO} The populated <code>ReportInstanceDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ReportInstanceDTO();

            if (data.hasOwnProperty('reportInstanceId')) {
                obj['reportInstanceId'] = ApiClient.convertToType(data['reportInstanceId'], 'Number');
            }
            if (data.hasOwnProperty('reportDefinitionId')) {
                obj['reportDefinitionId'] = ApiClient.convertToType(data['reportDefinitionId'], 'Number');
            }
            if (data.hasOwnProperty('reportDefinitionName')) {
                obj['reportDefinitionName'] = ApiClient.convertToType(data['reportDefinitionName'], 'String');
            }
            if (data.hasOwnProperty('reportName')) {
                obj['reportName'] = ApiClient.convertToType(data['reportName'], 'String');
            }
            if (data.hasOwnProperty('userFriendlyReportName')) {
                obj['userFriendlyReportName'] = ApiClient.convertToType(data['userFriendlyReportName'], 'String');
            }
            if (data.hasOwnProperty('extension')) {
                obj['extension'] = ApiClient.convertToType(data['extension'], 'String');
            }
            if (data.hasOwnProperty('reportRevision')) {
                obj['reportRevision'] = ReportRevisionDTO.constructFromObject(data['reportRevision']);
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Unique Identifier of the Report instance.
 * @member {Number} reportInstanceId
 */
ReportInstanceDTO.prototype['reportInstanceId'] = undefined;

/**
 * Unique Identifier for the associated Report definition.
 * @member {Number} reportDefinitionId
 */
ReportInstanceDTO.prototype['reportDefinitionId'] = undefined;

/**
 * Name of the Report definition.
 * @member {String} reportDefinitionName
 */
ReportInstanceDTO.prototype['reportDefinitionName'] = undefined;

/**
 * Name of the generated Report.
 * @member {String} reportName
 */
ReportInstanceDTO.prototype['reportName'] = undefined;

/**
 * A user-friendly display name for the generated report file.
 * @member {String} userFriendlyReportName
 */
ReportInstanceDTO.prototype['userFriendlyReportName'] = undefined;

/**
 * File extension for the report output.
 * @member {String} extension
 */
ReportInstanceDTO.prototype['extension'] = undefined;

/**
 * @member {module:model/ReportRevisionDTO} reportRevision
 */
ReportInstanceDTO.prototype['reportRevision'] = undefined;

/**
 * Display name for the generated report file.
 * @member {String} name
 */
ReportInstanceDTO.prototype['name'] = undefined;






export default ReportInstanceDTO;

