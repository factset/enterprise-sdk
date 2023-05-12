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
 * The BiomarkersFiles model module.
 * @module model/BiomarkersFiles
 */
class BiomarkersFiles {
    /**
     * Constructs a new <code>BiomarkersFiles</code>.
     * Returns Biomarkers Response
     * @alias module:model/BiomarkersFiles
     */
    constructor() { 
        
        BiomarkersFiles.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BiomarkersFiles</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BiomarkersFiles} obj Optional instance to populate.
     * @return {module:model/BiomarkersFiles} The populated <code>BiomarkersFiles</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BiomarkersFiles();

            if (data.hasOwnProperty('organ')) {
                obj['organ'] = ApiClient.convertToType(data['organ'], 'String');
            }
            if (data.hasOwnProperty('fileName')) {
                obj['fileName'] = ApiClient.convertToType(data['fileName'], 'String');
            }
            if (data.hasOwnProperty('clinicalTrialId')) {
                obj['clinicalTrialId'] = ApiClient.convertToType(data['clinicalTrialId'], 'String');
            }
            if (data.hasOwnProperty('biomarkerName')) {
                obj['biomarkerName'] = ApiClient.convertToType(data['biomarkerName'], 'String');
            }
            if (data.hasOwnProperty('biomarkerFullName')) {
                obj['biomarkerFullName'] = ApiClient.convertToType(data['biomarkerFullName'], 'String');
            }
            if (data.hasOwnProperty('biomarkerType')) {
                obj['biomarkerType'] = ApiClient.convertToType(data['biomarkerType'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Related organ where applicable.
 * @member {String} organ
 */
BiomarkersFiles.prototype['organ'] = undefined;

/**
 * The filename of the trial data.
 * @member {String} fileName
 */
BiomarkersFiles.prototype['fileName'] = undefined;

/**
 * Specifies Ozmosi unique ID for each historical version of a trial.
 * @member {String} clinicalTrialId
 */
BiomarkersFiles.prototype['clinicalTrialId'] = undefined;

/**
 * Abbreviated name of any patient biomarkers being targeted for research in the trial.
 * @member {String} biomarkerName
 */
BiomarkersFiles.prototype['biomarkerName'] = undefined;

/**
 * Full name of the biomarker.
 * @member {String} biomarkerFullName
 */
BiomarkersFiles.prototype['biomarkerFullName'] = undefined;

/**
 * Defines the Biomarker type.
 * @member {String} biomarkerType
 */
BiomarkersFiles.prototype['biomarkerType'] = undefined;

/**
 * Download link for the clinical trials provided by the Ozmosi feed.
 * @member {String} url
 */
BiomarkersFiles.prototype['url'] = undefined;






export default BiomarkersFiles;
