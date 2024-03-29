/**
 * Global Filings API
 * The Filings API provides a comprehensive set of functionalities for searching and retrieving filing documents from various sources.  This API is designed to expose document search and document retrieval functionality. A document search will allow a request to query FactSet’s document databases based on certain search criteria specified in the request.  In addition, a document count request will provide information on the number of stories available for a particular security.  Helper endpoint will provide dynamic information on the parameters of a document request. .
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
 * The InvestmentResearchMetaPagination model module.
 * @module model/InvestmentResearchMetaPagination
 */
class InvestmentResearchMetaPagination {
    /**
     * Constructs a new <code>InvestmentResearchMetaPagination</code>.
     * Pagination Object
     * @alias module:model/InvestmentResearchMetaPagination
     */
    constructor() { 
        
        InvestmentResearchMetaPagination.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InvestmentResearchMetaPagination</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InvestmentResearchMetaPagination} obj Optional instance to populate.
     * @return {module:model/InvestmentResearchMetaPagination} The populated <code>InvestmentResearchMetaPagination</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InvestmentResearchMetaPagination();

            if (data.hasOwnProperty('isEstimatedTotal')) {
                obj['isEstimatedTotal'] = ApiClient.convertToType(data['isEstimatedTotal'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * This field acts as a flag for the exact count of results and is defaulted to false as the API should always return the exact count of results.
 * @member {Boolean} isEstimatedTotal
 */
InvestmentResearchMetaPagination.prototype['isEstimatedTotal'] = undefined;






export default InvestmentResearchMetaPagination;

