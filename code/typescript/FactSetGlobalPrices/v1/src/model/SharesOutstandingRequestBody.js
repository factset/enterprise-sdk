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
import Calendar from './Calendar';
import Frequency from './Frequency';

/**
 * The SharesOutstandingRequestBody model module.
 * @module model/SharesOutstandingRequestBody
 */
class SharesOutstandingRequestBody {
    /**
     * Constructs a new <code>SharesOutstandingRequestBody</code>.
     * Shares Outstanding Request Body
     * @alias module:model/SharesOutstandingRequestBody
     * @param ids {Array.<String>} The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. Requests are limited to 50 IDs. 
     */
    constructor(ids) { 
        
        SharesOutstandingRequestBody.initialize(this, ids);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ids) { 
        obj['ids'] = ids;
    }

    /**
     * Constructs a <code>SharesOutstandingRequestBody</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SharesOutstandingRequestBody} obj Optional instance to populate.
     * @return {module:model/SharesOutstandingRequestBody} The populated <code>SharesOutstandingRequestBody</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SharesOutstandingRequestBody();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('startDate')) {
                obj['startDate'] = ApiClient.convertToType(data['startDate'], 'String');
            }
            if (data.hasOwnProperty('endDate')) {
                obj['endDate'] = ApiClient.convertToType(data['endDate'], 'String');
            }
            if (data.hasOwnProperty('frequency')) {
                obj['frequency'] = Frequency.constructFromObject(data['frequency']);
            }
            if (data.hasOwnProperty('calendar')) {
                obj['calendar'] = Calendar.constructFromObject(data['calendar']);
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
SharesOutstandingRequestBody.prototype['ids'] = undefined;

/**
 * The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
 * @member {String} startDate
 */
SharesOutstandingRequestBody.prototype['startDate'] = undefined;

/**
 * The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
 * @member {String} endDate
 */
SharesOutstandingRequestBody.prototype['endDate'] = undefined;

/**
 * @member {module:model/Frequency} frequency
 */
SharesOutstandingRequestBody.prototype['frequency'] = undefined;

/**
 * @member {module:model/Calendar} calendar
 */
SharesOutstandingRequestBody.prototype['calendar'] = undefined;

/**
 * @member {module:model/Batch} batch
 */
SharesOutstandingRequestBody.prototype['batch'] = undefined;






export default SharesOutstandingRequestBody;

