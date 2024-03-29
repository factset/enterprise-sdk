/**
 * S&P Global Fixed Income Evaluated Prices & Analytics API
 * Gain access to evaluated pricing and analytics data for Corporate Bonds, Municipal Bonds and Asset Backed Securities provided by S&P Global (formerly IHS Markit) .  Data returned through multiple endpoints like prices, spread, yield, yield curve, sensitivity, coupon information, securities metadata and details specific to the Asset Backed Securities. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Calendar from './Calendar';
import Frequency from './Frequency';

/**
 * The BondMetaRequest model module.
 * @module model/BondMetaRequest
 */
class BondMetaRequest {
    /**
     * Constructs a new <code>BondMetaRequest</code>.
     * Bond Meta request body elements
     * @alias module:model/BondMetaRequest
     * @param ids {Array.<String>} Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, ISIN and SEDOL are accepted input. 
     */
    constructor(ids) { 
        
        BondMetaRequest.initialize(this, ids);
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
     * Constructs a <code>BondMetaRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BondMetaRequest} obj Optional instance to populate.
     * @return {module:model/BondMetaRequest} The populated <code>BondMetaRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BondMetaRequest();

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
        }
        return obj;
    }


}

/**
 * Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, ISIN and SEDOL are accepted input. 
 * @member {Array.<String>} ids
 */
BondMetaRequest.prototype['ids'] = undefined;

/**
 * The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
 * @member {String} startDate
 */
BondMetaRequest.prototype['startDate'] = undefined;

/**
 * The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
 * @member {String} endDate
 */
BondMetaRequest.prototype['endDate'] = undefined;

/**
 * @member {module:model/Frequency} frequency
 */
BondMetaRequest.prototype['frequency'] = undefined;

/**
 * @member {module:model/Calendar} calendar
 */
BondMetaRequest.prototype['calendar'] = undefined;






export default BondMetaRequest;

