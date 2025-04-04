/**
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Batch from './Batch';
import DividendAdjust from './DividendAdjust';
import Frequency from './Frequency';

/**
 * The ReturnsRequest model module.
 * @module model/ReturnsRequest
 */
class ReturnsRequest {
    /**
     * Constructs a new <code>ReturnsRequest</code>.
     * Returns Request Body
     * @alias module:model/ReturnsRequest
     * @param ids {Array.<String>} The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. Requests are limited to 50 IDs. 
     * @param startDate {String} The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
     */
    constructor(ids, startDate) { 
        
        ReturnsRequest.initialize(this, ids, startDate);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ids, startDate) { 
        obj['ids'] = ids;
        obj['startDate'] = startDate;
    }

    /**
     * Constructs a <code>ReturnsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ReturnsRequest} obj Optional instance to populate.
     * @return {module:model/ReturnsRequest} The populated <code>ReturnsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ReturnsRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('startDate')) {
                obj['startDate'] = ApiClient.convertToType(data['startDate'], 'String');
            }
            if (data.hasOwnProperty('endDate')) {
                obj['endDate'] = ApiClient.convertToType(data['endDate'], 'String');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('frequency')) {
                obj['frequency'] = Frequency.constructFromObject(data['frequency']);
            }
            if (data.hasOwnProperty('dividendAdjust')) {
                obj['dividendAdjust'] = DividendAdjust.constructFromObject(data['dividendAdjust']);
            }
            if (data.hasOwnProperty('batch')) {
                obj['batch'] = Batch.constructFromObject(data['batch']);
            }
        }
        return obj;
    }


}

/**
 * The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. Requests are limited to 50 IDs. 
 * @member {Array.<String>} ids
 */
ReturnsRequest.prototype['ids'] = undefined;

/**
 * The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
 * @member {String} startDate
 */
ReturnsRequest.prototype['startDate'] = undefined;

/**
 * The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
 * @member {String} endDate
 */
ReturnsRequest.prototype['endDate'] = undefined;

/**
 * Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
 * @member {String} currency
 */
ReturnsRequest.prototype['currency'] = undefined;

/**
 * @member {module:model/Frequency} frequency
 */
ReturnsRequest.prototype['frequency'] = undefined;

/**
 * @member {module:model/DividendAdjust} dividendAdjust
 */
ReturnsRequest.prototype['dividendAdjust'] = undefined;

/**
 * @member {module:model/Batch} batch
 */
ReturnsRequest.prototype['batch'] = undefined;






export default ReturnsRequest;

