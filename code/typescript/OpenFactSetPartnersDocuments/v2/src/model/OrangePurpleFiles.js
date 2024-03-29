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
 * The OrangePurpleFiles model module.
 * @module model/OrangePurpleFiles
 */
class OrangePurpleFiles {
    /**
     * Constructs a new <code>OrangePurpleFiles</code>.
     * Returns OrangePurple Response
     * @alias module:model/OrangePurpleFiles
     */
    constructor() { 
        
        OrangePurpleFiles.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrangePurpleFiles</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrangePurpleFiles} obj Optional instance to populate.
     * @return {module:model/OrangePurpleFiles} The populated <code>OrangePurpleFiles</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrangePurpleFiles();

            if (data.hasOwnProperty('fileName')) {
                obj['fileName'] = ApiClient.convertToType(data['fileName'], 'String');
            }
            if (data.hasOwnProperty('clinicalTrialId')) {
                obj['clinicalTrialId'] = ApiClient.convertToType(data['clinicalTrialId'], 'String');
            }
            if (data.hasOwnProperty('beamOpNovelDrug')) {
                obj['beamOpNovelDrug'] = ApiClient.convertToType(data['beamOpNovelDrug'], 'String');
            }
            if (data.hasOwnProperty('beamOpNovelTarget')) {
                obj['beamOpNovelTarget'] = ApiClient.convertToType(data['beamOpNovelTarget'], 'String');
            }
            if (data.hasOwnProperty('beamOpNovelDrugList')) {
                obj['beamOpNovelDrugList'] = ApiClient.convertToType(data['beamOpNovelDrugList'], 'String');
            }
            if (data.hasOwnProperty('beamOpNovelTargetList')) {
                obj['beamOpNovelTargetList'] = ApiClient.convertToType(data['beamOpNovelTargetList'], 'String');
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
OrangePurpleFiles.prototype['fileName'] = undefined;

/**
 * Specifies Ozmosi unique ID for each historical version of a trial
 * @member {String} clinicalTrialId
 */
OrangePurpleFiles.prototype['clinicalTrialId'] = undefined;

/**
 * Identifies if the trial includes a drug that is not approved by the FDA
 * @member {String} beamOpNovelDrug
 */
OrangePurpleFiles.prototype['beamOpNovelDrug'] = undefined;

/**
 * It lists the unapproved drug
 * @member {String} beamOpNovelTarget
 */
OrangePurpleFiles.prototype['beamOpNovelTarget'] = undefined;

/**
 * Identifies if there is an MOA or target that has not yet been approved by the FDA
 * @member {String} beamOpNovelDrugList
 */
OrangePurpleFiles.prototype['beamOpNovelDrugList'] = undefined;

/**
 * Lists the unapproved targets
 * @member {String} beamOpNovelTargetList
 */
OrangePurpleFiles.prototype['beamOpNovelTargetList'] = undefined;

/**
 * Download link for the clinical trials provided by the Ozmosi feed
 * @member {String} url
 */
OrangePurpleFiles.prototype['url'] = undefined;






export default OrangePurpleFiles;

