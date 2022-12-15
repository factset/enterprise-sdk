/**
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse20042DataNsin model module.
 * @module model/InlineResponse20042DataNsin
 */
class InlineResponse20042DataNsin {
    /**
     * Constructs a new <code>InlineResponse20042DataNsin</code>.
     * NSIN data of the instrument.
     * @alias module:model/InlineResponse20042DataNsin
     */
    constructor() { 
        
        InlineResponse20042DataNsin.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20042DataNsin</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20042DataNsin} obj Optional instance to populate.
     * @return {module:model/InlineResponse20042DataNsin} The populated <code>InlineResponse20042DataNsin</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20042DataNsin();

            if (data.hasOwnProperty('wkn')) {
                obj['wkn'] = ApiClient.convertToType(data['wkn'], 'String');
            }
            if (data.hasOwnProperty('valor')) {
                obj['valor'] = ApiClient.convertToType(data['valor'], 'String');
            }
            if (data.hasOwnProperty('cusip')) {
                obj['cusip'] = ApiClient.convertToType(data['cusip'], 'String');
            }
            if (data.hasOwnProperty('sedol')) {
                obj['sedol'] = ApiClient.convertToType(data['sedol'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The WKN (Wertpapierkennnummer, German for Securities Identification Number) of the instrument. The WKN is a 6-character code of digits and upper-case letters that uniquely identifies an instrument.
 * @member {String} wkn
 */
InlineResponse20042DataNsin.prototype['wkn'] = undefined;

/**
 * The Valor number (German: Valorennummer) of the instrument. The Valor number is an integer number that uniquely identifies an instrument.
 * @member {String} valor
 */
InlineResponse20042DataNsin.prototype['valor'] = undefined;

/**
 * The CUSIP (Committee on Uniform Security Identification Procedures) or CINS (CUSIP International Numbering System) identifier of the instrument. These numbers are 9-character codes of digits and upper-case letters that uniquely identify an instrument.
 * @member {String} cusip
 */
InlineResponse20042DataNsin.prototype['cusip'] = undefined;

/**
 * The SEDOL or IDII for the instrument.
 * @member {String} sedol
 */
InlineResponse20042DataNsin.prototype['sedol'] = undefined;






export default InlineResponse20042DataNsin;

