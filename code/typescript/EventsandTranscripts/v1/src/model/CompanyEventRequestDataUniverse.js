/**
 * EVENTS AND TRANSCRIPTS API
 * <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>  
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CompanyEventRequestDataUniverse model module.
 * @module model/CompanyEventRequestDataUniverse
 */
class CompanyEventRequestDataUniverse {
    /**
     * Constructs a new <code>CompanyEventRequestDataUniverse</code>.
     * @alias module:model/CompanyEventRequestDataUniverse
     * @param symbols {Array.<String>} Companies to return in the response.   - Only Tickers type can support multiple entries. 
     * @param type {module:model/CompanyEventRequestDataUniverse.TypeEnum} NOTE:  - SEDOLs and ISINs are supported with the type tickers.  - Etf: Requires additionl access to get the data.   - AllCompanies: While using this, we should not pass any symbols in the symbols field. 
     */
    constructor(symbols, type) { 
        
        CompanyEventRequestDataUniverse.initialize(this, symbols, type);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, symbols, type) { 
        obj['symbols'] = symbols;
        obj['type'] = type;
    }

    /**
     * Constructs a <code>CompanyEventRequestDataUniverse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CompanyEventRequestDataUniverse} obj Optional instance to populate.
     * @return {module:model/CompanyEventRequestDataUniverse} The populated <code>CompanyEventRequestDataUniverse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CompanyEventRequestDataUniverse();

            if (data.hasOwnProperty('symbols')) {
                obj['symbols'] = ApiClient.convertToType(data['symbols'], ['String']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Companies to return in the response.   - Only Tickers type can support multiple entries. 
 * @member {Array.<String>} symbols
 */
CompanyEventRequestDataUniverse.prototype['symbols'] = undefined;

/**
 * NOTE:  - SEDOLs and ISINs are supported with the type tickers.  - Etf: Requires additionl access to get the data.   - AllCompanies: While using this, we should not pass any symbols in the symbols field. 
 * @member {module:model/CompanyEventRequestDataUniverse.TypeEnum} type
 */
CompanyEventRequestDataUniverse.prototype['type'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
CompanyEventRequestDataUniverse['TypeEnum'] = {

    /**
     * value: "Tickers"
     * @const
     */
    "Tickers": "Tickers",

    /**
     * value: "Index"
     * @const
     */
    "Index": "Index",

    /**
     * value: "Etf"
     * @const
     */
    "Etf": "Etf",

    /**
     * value: "AllCompanies"
     * @const
     */
    "AllCompanies": "AllCompanies"
};



export default CompanyEventRequestDataUniverse;

