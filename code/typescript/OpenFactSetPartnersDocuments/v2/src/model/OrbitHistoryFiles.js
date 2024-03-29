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
 * The OrbitHistoryFiles model module.
 * @module model/OrbitHistoryFiles
 */
class OrbitHistoryFiles {
    /**
     * Constructs a new <code>OrbitHistoryFiles</code>.
     * Returns History Response
     * @alias module:model/OrbitHistoryFiles
     */
    constructor() { 
        
        OrbitHistoryFiles.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrbitHistoryFiles</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrbitHistoryFiles} obj Optional instance to populate.
     * @return {module:model/OrbitHistoryFiles} The populated <code>OrbitHistoryFiles</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrbitHistoryFiles();

            if (data.hasOwnProperty('fileSize')) {
                obj['fileSize'] = ApiClient.convertToType(data['fileSize'], 'Number');
            }
            if (data.hasOwnProperty('fileName')) {
                obj['fileName'] = ApiClient.convertToType(data['fileName'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Defines the size of the file.
 * @member {Number} fileSize
 */
OrbitHistoryFiles.prototype['fileSize'] = undefined;

/**
 * The filename of the folder.
 * @member {String} fileName
 */
OrbitHistoryFiles.prototype['fileName'] = undefined;

/**
 * Download link for the transcripts provided by the Orbit feed.
 * @member {String} url
 */
OrbitHistoryFiles.prototype['url'] = undefined;






export default OrbitHistoryFiles;

