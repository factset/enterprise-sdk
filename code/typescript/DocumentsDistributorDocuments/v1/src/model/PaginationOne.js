/**
 * Documents Distributor - Documents API
 * Documents APIs that provide filings such as Global Filings and XML files such as StreetAccount    Global Filings API provides the capability to search and download filings documents from various exchanges around the world. This API will provide access to the full history and the ability to search by date and dataset(source). It does not provide real-time updates to the filings documents. Filings providers currently include EDGAR       Note: The real-time updates to the filing documents will be available within week to ten days and per request able to query up to 8 days of data               StreetAccount XML API provides access to historical StreetAccount (SA) news. SA provides a summary for various corporate and market news written by journalist with background in financial markets.    The API delivers SA stories in XML format based on user-specified date input parameters. When the API request is completed, output files will be made available back to the users through a secure URL. This API has three endpoints (1) Request Files (2) Check Status (3) Get Files.      This API only supports adhoc requests to retrieve historical files and does not support real-time files and if require real-time push should consider the other three methods (pushed via SFTP, to QNT account, or users Azure Storage)   Both historical and real-time Street Account news is also delivered via SFTP, to users QNT account, or users Azure Storage.  Files delivered contain both metadata and content body in each file. This eliminates the need to make multiple requests through multiple services to get all the information.  News API provides access to historical news. This provides a summary for various corporate and market news written by journalist with background in financial markets.  The API delivers  stories in different format based on user-specified date input parameters. When the API request is completed, output files will be made available back to the users through a secure URL. This API has three endpoints (1) Request Files (2) Check Status (3) Get Files    
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PaginationOne model module.
 * @module model/PaginationOne
 */
class PaginationOne {
    /**
     * Constructs a new <code>PaginationOne</code>.
     * List of pagination objects
     * @alias module:model/PaginationOne
     */
    constructor() { 
        
        PaginationOne.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PaginationOne</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PaginationOne} obj Optional instance to populate.
     * @return {module:model/PaginationOne} The populated <code>PaginationOne</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PaginationOne();

            if (data.hasOwnProperty('total')) {
                obj['total'] = ApiClient.convertToType(data['total'], 'Number');
            }
            if (data.hasOwnProperty('isEstimatedTotal')) {
                obj['isEstimatedTotal'] = ApiClient.convertToType(data['isEstimatedTotal'], 'Boolean');
            }
            if (data.hasOwnProperty('limit')) {
                obj['limit'] = ApiClient.convertToType(data['limit'], 'Number');
            }
            if (data.hasOwnProperty('offset')) {
                obj['offset'] = ApiClient.convertToType(data['offset'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Total number of files the API returns for a particular query
 * @member {Number} total
 */
PaginationOne.prototype['total'] = undefined;

/**
 * Boolean value that represents whether the total count of files returned is exact or an estimate. This is defaulted to “False” as the API should always return the exact count
 * @member {Boolean} isEstimatedTotal
 */
PaginationOne.prototype['isEstimatedTotal'] = undefined;

/**
 * Number of results returned per page
 * @member {Number} limit
 */
PaginationOne.prototype['limit'] = undefined;

/**
 * The flag indicating the position in the results array if additional results are available beyond the default value or the value in paginationLimit parameter (if used). This value is passed in the _paginationOffset parameter to retreieve subsequent results
 * @member {Number} offset
 */
PaginationOne.prototype['offset'] = undefined;






export default PaginationOne;

