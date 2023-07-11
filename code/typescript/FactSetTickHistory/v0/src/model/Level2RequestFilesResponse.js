/**
 * Tick History Level 2 (Beta)
 * Tick History **Level 2** provides dynamic access to the historical tick data up to 10 levels of depth for a specific security for specific dates or date range. The API generates output files with data based on client-specified input parameters. The input parameters include universe specification and date ranges for which the data will be generated. When the API request with specified input parameters has been completed, the output files will be made available back to the users through a secure URL to the location where the files are stored. Therefore, this API has two APIs (i) Request files API (ii) Get Files API.
 *
 * The version of the OpenAPI document: 0.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Level2RequestFilesResponse model module.
 * @module model/Level2RequestFilesResponse
 */
class Level2RequestFilesResponse {
    /**
     * Constructs a new <code>Level2RequestFilesResponse</code>.
     * request-files
     * @alias module:model/Level2RequestFilesResponse
     */
    constructor() { 
        
        Level2RequestFilesResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Level2RequestFilesResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Level2RequestFilesResponse} obj Optional instance to populate.
     * @return {module:model/Level2RequestFilesResponse} The populated <code>Level2RequestFilesResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Level2RequestFilesResponse();

            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
        }
        return obj;
    }


}

/**
 * a unique identification for the query requested
 * @member {String} requestId
 */
Level2RequestFilesResponse.prototype['requestId'] = undefined;

/**
 * The status of the query
 * @member {String} status
 */
Level2RequestFilesResponse.prototype['status'] = undefined;






export default Level2RequestFilesResponse;

