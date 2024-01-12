/**
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Company Filters, Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.  **StreetAccount Historical Stories:**  These endpoints provide access to historical StreetAccount (SA) news. The API delivers SA stories in XML format based on user-specified date input parameters. Output files are securely available to users through a URL. This API has three endpoints: Request Files, Check Status, and Get Files.  Please note that this API only supports adhoc requests for historical files and does not support real-time files. If real-time push is required, consider using other methods such as SFTP, QNT account, or Azure Storage. Both historical and real-time Street Account news can be delivered via SFTP, QNT account, or Azure Storage.  The files delivered contain both metadata and content body, eliminating the need for multiple requests through multiple services to retrieve all the information.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The SaHeadlinesRequestMetaPagination model module.
 * @module model/SaHeadlinesRequestMetaPagination
 */
class SaHeadlinesRequestMetaPagination {
    /**
     * Constructs a new <code>SaHeadlinesRequestMetaPagination</code>.
     * Object defining pagination for the results pageable attribute. Offset-based strategy is used for Pagination.
     * @alias module:model/SaHeadlinesRequestMetaPagination
     */
    constructor() { 
        
        SaHeadlinesRequestMetaPagination.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SaHeadlinesRequestMetaPagination</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SaHeadlinesRequestMetaPagination} obj Optional instance to populate.
     * @return {module:model/SaHeadlinesRequestMetaPagination} The populated <code>SaHeadlinesRequestMetaPagination</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SaHeadlinesRequestMetaPagination();

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
 * Non-negative maximum number of entries to return.
 * @member {Number} limit
 * @default 500
 */
SaHeadlinesRequestMetaPagination.prototype['limit'] = 500;

/**
 * Non-negative number of entries to skip.
 * @member {Number} offset
 * @default 0
 */
SaHeadlinesRequestMetaPagination.prototype['offset'] = 0;






export default SaHeadlinesRequestMetaPagination;

