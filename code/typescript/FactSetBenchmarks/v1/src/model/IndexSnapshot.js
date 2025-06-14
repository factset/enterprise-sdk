/**
 * FactSet Benchmarks API
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.10.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The IndexSnapshot model module.
 * @module model/IndexSnapshot
 */
class IndexSnapshot {
    /**
     * Constructs a new <code>IndexSnapshot</code>.
     * @alias module:model/IndexSnapshot
     */
    constructor() { 
        
        IndexSnapshot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>IndexSnapshot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/IndexSnapshot} obj Optional instance to populate.
     * @return {module:model/IndexSnapshot} The populated <code>IndexSnapshot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new IndexSnapshot();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('inceptionDate')) {
                obj['inceptionDate'] = ApiClient.convertToType(data['inceptionDate'], 'Date');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('constituentNumber')) {
                obj['constituentNumber'] = ApiClient.convertToType(data['constituentNumber'], 'Number');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('marketValue')) {
                obj['marketValue'] = ApiClient.convertToType(data['marketValue'], 'Number');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('priceReturnPercent1D')) {
                obj['priceReturnPercent1D'] = ApiClient.convertToType(data['priceReturnPercent1D'], 'Number');
            }
            if (data.hasOwnProperty('priceReturnPercentQTD')) {
                obj['priceReturnPercentQTD'] = ApiClient.convertToType(data['priceReturnPercentQTD'], 'Number');
            }
            if (data.hasOwnProperty('priceReturnPercentYTD')) {
                obj['priceReturnPercentYTD'] = ApiClient.convertToType(data['priceReturnPercentYTD'], 'Number');
            }
            if (data.hasOwnProperty('totalReturnLevel')) {
                obj['totalReturnLevel'] = ApiClient.convertToType(data['totalReturnLevel'], 'Number');
            }
            if (data.hasOwnProperty('totalReturnPercent1D')) {
                obj['totalReturnPercent1D'] = ApiClient.convertToType(data['totalReturnPercent1D'], 'Number');
            }
            if (data.hasOwnProperty('totalReturnPercentQTD')) {
                obj['totalReturnPercentQTD'] = ApiClient.convertToType(data['totalReturnPercentQTD'], 'Number');
            }
            if (data.hasOwnProperty('totalReturnPercentYTD')) {
                obj['totalReturnPercentYTD'] = ApiClient.convertToType(data['totalReturnPercentYTD'], 'Number');
            }
            if (data.hasOwnProperty('returnType')) {
                obj['returnType'] = ApiClient.convertToType(data['returnType'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet.
 * @member {String} fsymId
 */
IndexSnapshot.prototype['fsymId'] = undefined;

/**
 * The respective date for values as of the date requested in YYYY-MM-DD format.
 * @member {Date} date
 */
IndexSnapshot.prototype['date'] = undefined;

/**
 * The inception date of the requested index in YYYY-MM-DD format.
 * @member {Date} inceptionDate
 */
IndexSnapshot.prototype['inceptionDate'] = undefined;

/**
 * Proper Name of Index.
 * @member {String} name
 */
IndexSnapshot.prototype['name'] = undefined;

/**
 * The total number of constituents as of the date requested.
 * @member {Number} constituentNumber
 */
IndexSnapshot.prototype['constituentNumber'] = undefined;

/**
 * Currency Code used in adjustments. If no Currency was requested, the service will default to the local Calendar.
 * @member {String} currency
 */
IndexSnapshot.prototype['currency'] = undefined;

/**
 * Index Level Market Capitalization as of the date requested expressed in millions.
 * @member {Number} marketValue
 */
IndexSnapshot.prototype['marketValue'] = undefined;

/**
 * Index Level Price
 * @member {Number} price
 */
IndexSnapshot.prototype['price'] = undefined;

/**
 * Index Level Price - 1 Day percent change
 * @member {Number} priceReturnPercent1D
 */
IndexSnapshot.prototype['priceReturnPercent1D'] = undefined;

/**
 * Index Level Price - Quarter-to-Date percent change
 * @member {Number} priceReturnPercentQTD
 */
IndexSnapshot.prototype['priceReturnPercentQTD'] = undefined;

/**
 * Index Level Price - Year-to-Date percent change
 * @member {Number} priceReturnPercentYTD
 */
IndexSnapshot.prototype['priceReturnPercentYTD'] = undefined;

/**
 * Index Level Total Return Amount. (Gross or Net depends on requested returnType)
 * @member {Number} totalReturnLevel
 */
IndexSnapshot.prototype['totalReturnLevel'] = undefined;

/**
 * Index Level Total Return - 1 Day percent change. (Gross or Net depends on requested returnType)
 * @member {Number} totalReturnPercent1D
 */
IndexSnapshot.prototype['totalReturnPercent1D'] = undefined;

/**
 * Index Level Total Return - Quarter-to-Date percent change. (Gross or Net depends on requested returnType)
 * @member {Number} totalReturnPercentQTD
 */
IndexSnapshot.prototype['totalReturnPercentQTD'] = undefined;

/**
 * Index Level Total Return - Year-to-Date percent change. (Gross or Net depends on requested returnType)
 * @member {Number} totalReturnPercentYTD
 */
IndexSnapshot.prototype['totalReturnPercentYTD'] = undefined;

/**
 * The requested Return Type - GROSS or NET
 * @member {String} returnType
 */
IndexSnapshot.prototype['returnType'] = undefined;

/**
 * Benchmark Identifier specified in the request
 * @member {String} requestId
 */
IndexSnapshot.prototype['requestId'] = undefined;






export default IndexSnapshot;

