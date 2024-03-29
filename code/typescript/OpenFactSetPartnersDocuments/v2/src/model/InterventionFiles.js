/**
 * Open:FactSet - Partners
 * This service provides the capability to search and download unstructured content provided by <a href=\"https://open.factset.com/catalog/en-us\">Open:FactSet Partners</a>.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InterventionFiles model module.
 * @module model/InterventionFiles
 */
class InterventionFiles {
    /**
     * Constructs a new <code>InterventionFiles</code>.
     * Returns Intervention Response
     * @alias module:model/InterventionFiles
     */
    constructor() { 
        
        InterventionFiles.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InterventionFiles</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InterventionFiles} obj Optional instance to populate.
     * @return {module:model/InterventionFiles} The populated <code>InterventionFiles</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InterventionFiles();

            if (data.hasOwnProperty('fileName')) {
                obj['fileName'] = ApiClient.convertToType(data['fileName'], 'String');
            }
            if (data.hasOwnProperty('clinicalTrialId')) {
                obj['clinicalTrialId'] = ApiClient.convertToType(data['clinicalTrialId'], 'String');
            }
            if (data.hasOwnProperty('beamInterventionType')) {
                obj['beamInterventionType'] = ApiClient.convertToType(data['beamInterventionType'], 'String');
            }
            if (data.hasOwnProperty('beamInterventionName')) {
                obj['beamInterventionName'] = ApiClient.convertToType(data['beamInterventionName'], 'String');
            }
            if (data.hasOwnProperty('beamInterventionDesc')) {
                obj['beamInterventionDesc'] = ApiClient.convertToType(data['beamInterventionDesc'], 'String');
            }
            if (data.hasOwnProperty('beamOtherName')) {
                obj['beamOtherName'] = ApiClient.convertToType(data['beamOtherName'], 'String');
            }
            if (data.hasOwnProperty('beamArmGroupLabel')) {
                obj['beamArmGroupLabel'] = ApiClient.convertToType(data['beamArmGroupLabel'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The filename of the trial data
 * @member {String} fileName
 */
InterventionFiles.prototype['fileName'] = undefined;

/**
 * Specifies Ozmosi unique ID for each historical version of a trial
 * @member {String} clinicalTrialId
 */
InterventionFiles.prototype['clinicalTrialId'] = undefined;

/**
 * Identifies intervention type such as Drug, Biological, or Device
 * @member {String} beamInterventionType
 */
InterventionFiles.prototype['beamInterventionType'] = undefined;

/**
 * Specifies the name of intervention applied
 * @member {String} beamInterventionName
 */
InterventionFiles.prototype['beamInterventionName'] = undefined;

/**
 * Specifies the description of intervention applied
 * @member {String} beamInterventionDesc
 */
InterventionFiles.prototype['beamInterventionDesc'] = undefined;

/**
 * Other names listed for intervention
 * @member {String} beamOtherName
 */
InterventionFiles.prototype['beamOtherName'] = undefined;

/**
 * Name of the arm or group that this intervention is used in
 * @member {String} beamArmGroupLabel
 */
InterventionFiles.prototype['beamArmGroupLabel'] = undefined;

/**
 * Download link for the clinical trials provided by the Ozmosi feed
 * @member {String} url
 */
InterventionFiles.prototype['url'] = undefined;






export default InterventionFiles;

