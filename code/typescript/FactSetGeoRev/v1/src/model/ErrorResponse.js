/**
 * FactSet GeoRev API
 * FactSet Revere Geographic Revenue (\"GeoRev\") Exposure data provides a highly structured and normalized display of companies' revenues by geography. Using a four level taxonomy structure, understand the companies' Super-Region-->Region-->Area-->Country revenue breakdowns. Quickly understand a company's revenue exposure in countries impacted by geopolitical, macroeconomic, and market risk. Understand the geographic footprint of a company based on sources of revenue versus country of domicile, and analyze global revenue exposures at the company, index, or portfolio level.<p> Geographic revenue has historically been difficult to analyze due to companies' non-standard and incomplete reporting. Investors relying solely on this as-reported data are limited in their ability to compare, aggregate or screen exposures across a universe or portfolio of companies. To achieve normalization, FactSet GeoRev captures data through a proprietary four-level geographic classification structure. An estimation algorithm based on GDP weighting and accounting logic is then applied to solve for any non-explicit disclosures. The result is a consistent, accurate, and flexible dataset that can take a company's revenues and break them down into any geographic country or region categories.</p><p>As markets become more integrated and companies expand operations beyond their domestic markets, GeoRev provides a new and valuable country factor to help investors discover alpha, model risk exposure, optimize portfolio weighting, and improve fund administration and reporting.</p><p>Data Frequency -  Annual; Update Frequency - Daily. 49,000+ Publically Listed Companies. All Russell 3000 and MSCI ACWI Index Consituents. U.S. Data is available from 2003, with Non-US data from 2007. For more details, visit [OA 17555](https://my.apps.factset.com/oa/pages/17555)</p><p><b>Rate limit is set to 10 requests per second</b>.</p> 
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ErrorResponseSubErrors from './ErrorResponseSubErrors';

/**
 * The ErrorResponse model module.
 * @module model/ErrorResponse
 */
class ErrorResponse {
    /**
     * Constructs a new <code>ErrorResponse</code>.
     * @alias module:model/ErrorResponse
     */
    constructor() { 
        
        ErrorResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ErrorResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ErrorResponse} obj Optional instance to populate.
     * @return {module:model/ErrorResponse} The populated <code>ErrorResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ErrorResponse();

            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'Date');
            }
            if (data.hasOwnProperty('path')) {
                obj['path'] = ApiClient.convertToType(data['path'], 'String');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
            if (data.hasOwnProperty('subErrors')) {
                obj['subErrors'] = ErrorResponseSubErrors.constructFromObject(data['subErrors']);
            }
        }
        return obj;
    }


}

/**
 * status
 * @member {String} status
 */
ErrorResponse.prototype['status'] = undefined;

/**
 * timestamp in YYYY-MM-DD HH:MM:SS.SSS
 * @member {Date} timestamp
 */
ErrorResponse.prototype['timestamp'] = undefined;

/**
 * The Endpoint path {package}/version/{endpoint}
 * @member {String} path
 */
ErrorResponse.prototype['path'] = undefined;

/**
 * The plain text error message
 * @member {String} message
 */
ErrorResponse.prototype['message'] = undefined;

/**
 * @member {module:model/ErrorResponseSubErrors} subErrors
 */
ErrorResponse.prototype['subErrors'] = undefined;






export default ErrorResponse;

