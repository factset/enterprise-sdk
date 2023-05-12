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
 * The LinkupFiles model module.
 * @module model/LinkupFiles
 */
class LinkupFiles {
    /**
     * Constructs a new <code>LinkupFiles</code>.
     *  Returns LinkUp Response.
     * @alias module:model/LinkupFiles
     */
    constructor() { 
        
        LinkupFiles.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>LinkupFiles</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LinkupFiles} obj Optional instance to populate.
     * @return {module:model/LinkupFiles} The populated <code>LinkupFiles</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LinkupFiles();

            if (data.hasOwnProperty('filename')) {
                obj['filename'] = ApiClient.convertToType(data['filename'], 'String');
            }
            if (data.hasOwnProperty('fileTimestamp')) {
                obj['fileTimestamp'] = ApiClient.convertToType(data['fileTimestamp'], 'Date');
            }
            if (data.hasOwnProperty('updateTimestamp')) {
                obj['updateTimestamp'] = ApiClient.convertToType(data['updateTimestamp'], 'Date');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The filename of the daily LinkUp file.
 * @member {String} filename
 */
LinkupFiles.prototype['filename'] = undefined;

/**
 * The timestamp when LinkUp provided the file to FactSet.
 * @member {Date} fileTimestamp
 */
LinkupFiles.prototype['fileTimestamp'] = undefined;

/**
 * The timestamp when the file is last updated.
 * @member {Date} updateTimestamp
 */
LinkupFiles.prototype['updateTimestamp'] = undefined;

/**
 * Used to provide the full job descriptions when value - full is used for this parameter.
 * @member {String} type
 */
LinkupFiles.prototype['type'] = undefined;

/**
 * Download link for daily file from LinkUp on various job postings.
 * @member {String} url
 */
LinkupFiles.prototype['url'] = undefined;






export default LinkupFiles;
